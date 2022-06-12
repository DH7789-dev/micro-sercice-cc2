package io.swagger.web.api;

import io.swagger.web.model.Payment;
import io.swagger.model.PaymentResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.web.model.Payment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-03T12:08:44.079Z[GMT]")
@RestController
public class PaymentApiController implements PaymentApi {

    private static final Logger log = LoggerFactory.getLogger(PaymentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PaymentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

     @Override
    public ResponseEntity<List<Payment>> getPayments() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Payment>>(objectMapper.readValue("[ {\n  \"checkout_id\" : \"f8a8c8e7-b8b6-4b8b-8b8b-8b8b8b8b8b8b\",\n  \"payment_orders\" : [ {\n    \"amount\" : 6.027456183070403,\n    \"currency\" : \"currency\",\n    \"seller_account\" : \"seller_account\",\n    \"payment_order_id\" : 1\n  }, {\n    \"amount\" : 6.027456183070403,\n    \"currency\" : \"currency\",\n    \"seller_account\" : \"seller_account\",\n    \"payment_order_id\" : 1\n  } ],\n  \"buyer_info\" : {\n    \"name\" : \"name\",\n    \"id\" : 0\n  },\n  \"credit_card_info\" : \"credit_card_info\"\n}, {\n  \"checkout_id\" : \"f8a8c8e7-b8b6-4b8b-8b8b-8b8b8b8b8b8b\",\n  \"payment_orders\" : [ {\n    \"amount\" : 6.027456183070403,\n    \"currency\" : \"currency\",\n    \"seller_account\" : \"seller_account\",\n    \"payment_order_id\" : 1\n  }, {\n    \"amount\" : 6.027456183070403,\n    \"currency\" : \"currency\",\n    \"seller_account\" : \"seller_account\",\n    \"payment_order_id\" : 1\n  } ],\n  \"buyer_info\" : {\n    \"name\" : \"name\",\n    \"id\" : 0\n  },\n  \"credit_card_info\" : \"credit_card_info\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Payment>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Payment>>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<PaymentResponse> paymentCreate(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Payment body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentResponse>(objectMapper.readValue("{\n  \"checkout_id\" : 0,\n  \"payment_status\" : \"success\"\n}", PaymentResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
