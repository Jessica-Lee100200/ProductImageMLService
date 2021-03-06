/*
 * Product Image Classification API
 * The model for this service was obtained by retraining the Image Classifier on approx. 50k Icecat images. There are 29 categories available: antivirus_security_software, computer_monitors_slash_workstations, digital_cameras, external_hard_drives, graphics_cards, internal_hard_drives, keyboards, LED_TVs, memory_modules, mice, mobile_device_chargers, motherboards, mounting_kits, network_switches, networking_cables, networking_cards, notebooks_and_accessories, other, power_adapters, power_cables, printers_and_accessories, processors, projection_screens, rechargeable_batteries, servers, smartphones, tablets, uninterruptible_power_supplies, USB_flash_drives_and_accessories.
 *
 * OpenAPI spec version: Alpha
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk.product_image_classification_api.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.sap.apibhub.sdk.product_image_classification_api.model.Predictions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * View model of a generic response
 */
@ApiModel(description = "View model of a generic response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-14T07:11:38.840Z")
public class Response {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("request")
  private Request request = null;
  
  @SerializedName("processed_time")
  private String processedtime = null;

  @SerializedName("predictions")
  private List<Predictions> predictions = new ArrayList<Predictions>();

  /**
   * Indicator of success and failure respectively
   */
  public enum StatusEnum {
    @SerializedName("QUEUED")
    QUEUED("QUEUED"),
    
    @SerializedName("DONE")
    DONE("DONE"),
    
    @SerializedName("FAILED")
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("tenantName")
  private String tenantName = null;

  @SerializedName("error_description")
  private String errorDescription = null;

  public Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Job Id
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "Job Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Response error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Error message
   * @return error
  **/
  @ApiModelProperty(example = "null", value = "Error message")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public Response request(Request request) {
    this.request = request;
    return this;
  }

   /**
   * A copy of the request
   * @return request
  **/
  @ApiModelProperty(example = "null", required = true, value = "A copy of the request")
  public Request getRequest() {
    return request;
  }

  public void setRequest(Request request) {
    this.request = request;
  }

  public Response predictions(List<Predictions> predictions) {
    this.predictions = predictions;
    return this;
  }

  public Response addPredictionsItem(Predictions predictionsItem) {
    this.predictions.add(predictionsItem);
    return this;
  }

   /**
   * Inference results
   * @return predictions
  **/
  @ApiModelProperty(example = "null", value = "Inference results")
  public List<Predictions> getPredictions() {
    return predictions;
  }

  public void setPredictions(List<Predictions> predictions) {
    this.predictions = predictions;
  }

  public Response status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Indicator of success and failure respectively
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "Indicator of success and failure respectively")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Response tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

   /**
   * Tenant name used on the request
   * @return tenantName
  **/
  @ApiModelProperty(example = "null", value = "Tenant name used on the request")
  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public Response errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * Additional information in case of errors
   * @return errorDescription
  **/
  @ApiModelProperty(example = "null", value = "Additional information in case of errors")
  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.id, response.id) &&
        Objects.equals(this.error, response.error) &&
        Objects.equals(this.request, response.request) &&
        Objects.equals(this.predictions, response.predictions) &&
        Objects.equals(this.status, response.status) &&
        Objects.equals(this.tenantName, response.tenantName) &&
        Objects.equals(this.errorDescription, response.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, error, request, predictions, status, tenantName, errorDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    predictions: ").append(toIndentedString(predictions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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

