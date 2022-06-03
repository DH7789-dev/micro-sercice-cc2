package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PaymentStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-03T12:08:44.079Z[GMT]")


public class PaymentResponse   {
  @JsonProperty("payment_status")
  private PaymentStatus paymentStatus = null;

  @JsonProperty("checkout_id")
  private Integer checkoutId = null;

  public PaymentResponse paymentStatus(PaymentStatus paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

  /**
   * Get paymentStatus
   * @return paymentStatus
   **/
  @Schema(description = "")
  
    @Valid
    public PaymentStatus getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(PaymentStatus paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public PaymentResponse checkoutId(Integer checkoutId) {
    this.checkoutId = checkoutId;
    return this;
  }

  /**
   * Get checkoutId
   * @return checkoutId
   **/
  @Schema(description = "")
  
    public Integer getCheckoutId() {
    return checkoutId;
  }

  public void setCheckoutId(Integer checkoutId) {
    this.checkoutId = checkoutId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentResponse paymentResponse = (PaymentResponse) o;
    return Objects.equals(this.paymentStatus, paymentResponse.paymentStatus) &&
        Objects.equals(this.checkoutId, paymentResponse.checkoutId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentStatus, checkoutId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentResponse {\n");
    
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    checkoutId: ").append(toIndentedString(checkoutId)).append("\n");
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
