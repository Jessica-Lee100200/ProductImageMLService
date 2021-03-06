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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassificationResults
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-14T07:11:38.840Z")
public class ClassificationResults {
  @SerializedName("label")
  private String label = null;

  @SerializedName("score")
  private Float score = null;

  public ClassificationResults label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The classification label for the image
   * @return label
  **/
  @ApiModelProperty(example = "null", required = true, value = "The classification label for the image")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ClassificationResults score(Float score) {
    this.score = score;
    return this;
  }

   /**
   * The score calculated for the classification label
   * @return score
  **/
  @ApiModelProperty(example = "null", required = true, value = "The score calculated for the classification label")
  public Float getScore() {
    return score;
  }

  public void setScore(Float score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationResults classificationResults = (ClassificationResults) o;
    return Objects.equals(this.label, classificationResults.label) &&
        Objects.equals(this.score, classificationResults.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, score);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationResults {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

