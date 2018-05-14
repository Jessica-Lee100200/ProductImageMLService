package com.sap.apibhub.sdk.product_image_classification_api.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ApiModel(description = "View model of Request results for each image containing the list of classification labels along with their probability")
public class Request {
	
  @SerializedName("tenantName")
  private String tenantName = null;
  
  @SerializedName("options")
  private  Map<String, String>  options = null;
  
  @SerializedName("texts")
  private List<String> texts = null;

  @SerializedName("files")
  private List<String> files = new ArrayList<String>();

  public Request tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }
  
  public Request options( Map<String, String>  options) {
	    this.options = options;
	    return this;
	  }
  
  public Request texts(List<String> texts) {
	    this.texts = texts;
	    return this;
	  }

   /**
   * Name of the image file
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "Name of the image file")
  public String gettenantName() {
    return tenantName;
  }

  public void settenantName(String name) {
    this.tenantName = name;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the image file")
  public List<String> gettexts() {
    return texts;
  }

  public void settexts(List<String> texts) {
    this.texts = texts;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the image file")
  public Object getoptions() {
    return options;
  }

  public void setoptions( Map<String, String>  options) {
    this.options = options;
  }

  public Request files(List<String> files) {
    this.files = files;
    return this;
  }

  public Request addResultsItem(String resultsItem) {
    this.files.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<String> getfiles() {
    return files;
  }

  public void setfiles(List<String> files) {
    this.files = files;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Request predictions = (Request) o;
    return Objects.equals(this.tenantName, predictions.tenantName) &&
        Objects.equals(this.files, predictions.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantName, files);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Predictions {\n");
    
    sb.append("    name: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    results: ").append(toIndentedString(files)).append("\n");
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

