package io.swagger.web.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import io.swagger.model.BuyerInfo;

/**
 * Payment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-03T12:08:44.079Z[GMT]")


public class Payment   {
  @JsonProperty("buyer_info")
  private io.swagger.model.BuyerInfo buyerInfo = null;

  @JsonProperty("checkout_id")
  private Integer checkoutId = null;

  @JsonProperty("credit_card_info")
  private String creditCardInfo = null;

  @JsonProperty("payment_orders")
  @Valid
  private List<io.swagger.model.PaymentOrder> paymentOrders = null;

  public Payment buyerInfo(BuyerInfo buyerInfo) {
    this.buyerInfo = buyerInfo;
    return this;
  }

  /**
   * Get buyerInfo
   * @return buyerInfo
   **/
  @Schema(description = "")
  
    @Valid
    public BuyerInfo getBuyerInfo() {
    return buyerInfo;
  }

  public void setBuyerInfo(BuyerInfo buyerInfo) {
    this.buyerInfo = buyerInfo;
  }

  public Payment checkoutId(Integer checkoutId) {
    this.checkoutId = checkoutId;
    return this;
  }

  /**
   * Get checkoutId
   *
   * @return checkoutId
   **/
  @Schema(example = "f8a8c8e7-b8b6-4b8b-8b8b-8b8b8b8b8b8b", description = "")

  public Integer getCheckoutId() {
    return checkoutId;
  }

  public void setCheckoutId(Integer checkoutId) {
    this.checkoutId = checkoutId;
  }

  public Payment creditCardInfo(String creditCardInfo) {
    this.creditCardInfo = creditCardInfo;
    return this;
  }

  /**
   * credit card information.
   * @return creditCardInfo
   **/
  @Schema(description = "credit card information.")
  
    public String getCreditCardInfo() {
    return creditCardInfo;
  }

  public void setCreditCardInfo(String creditCardInfo) {
    this.creditCardInfo = creditCardInfo;
  }

  public Payment paymentOrders(List<io.swagger.model.PaymentOrder> paymentOrders) {
    this.paymentOrders = paymentOrders;
    return this;
  }

  public Payment addPaymentOrdersItem(io.swagger.model.PaymentOrder paymentOrdersItem) {
    if (this.paymentOrders == null) {
      this.paymentOrders = new ArrayList<io.swagger.model.PaymentOrder>();
    }
    this.paymentOrders.add(paymentOrdersItem);
    return this;
  }

  /**
   * Get paymentOrders
   * @return paymentOrders
   **/
  @Schema(description = "")
      @Valid
    public List<io.swagger.model.PaymentOrder> getPaymentOrders() {
    return paymentOrders;
  }

  public void setPaymentOrders(List<io.swagger.model.PaymentOrder> paymentOrders) {
    this.paymentOrders = paymentOrders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.buyerInfo, payment.buyerInfo) &&
        Objects.equals(this.checkoutId, payment.checkoutId) &&
        Objects.equals(this.creditCardInfo, payment.creditCardInfo) &&
        Objects.equals(this.paymentOrders, payment.paymentOrders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyerInfo, checkoutId, creditCardInfo, paymentOrders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    buyerInfo: ").append(toIndentedString(buyerInfo)).append("\n");
    sb.append("    checkoutId: ").append(toIndentedString(checkoutId)).append("\n");
    sb.append("    creditCardInfo: ").append(toIndentedString(creditCardInfo)).append("\n");
    sb.append("    paymentOrders: ").append(toIndentedString(paymentOrders)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
