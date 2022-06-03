package io.swagger.application.command;


import io.swagger.model.PaymentResponse;
import io.swagger.web.model.Payment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import io.swagger.api.PaymentApi;
import redis.clients.jedis.JedisPooled;
import io.swagger.model.PaymentStatus;
import io.swagger.model.PaymentOrder;

import java.util.List;

@Service
public class CommandPayment implements PaymentApi {

    private final JedisPooled jedisPool;

    public CommandPayment(JedisPooled jedisPool) {
        this.jedisPool = jedisPool;
    }

    public PaymentResponse paymentOrder(Payment payment) {
        double totalAmount = payment.getPaymentOrders().stream().mapToDouble(PaymentOrder::getAmount).sum();
        PaymentResponse response = new PaymentResponse();
        response.setCheckoutId(payment.getCheckoutId());

        if (totalAmount < 0) {
            response.setPaymentStatus(PaymentStatus.FAILURE);
        } else {
            response.setPaymentStatus(PaymentStatus.SUCCESS);
            if (!jedisPool.hexists("payment", payment.getCheckoutId().toString())) {
                jedisPool.hset("payment",payment.getCheckoutId().toString(), payment.toString());
            }
        }
        return response;
    }


    @Override
    public ResponseEntity<List<Payment>> getPayments() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<PaymentResponse> paymentCreate(Payment body) {
        PaymentResponse response = paymentOrder(body);
        return new ResponseEntity<>(response,
                response.getPaymentStatus() == PaymentStatus.SUCCESS ?
                        HttpStatus.OK : HttpStatus.BAD_REQUEST
        );
    }
}
