package com.example.demo.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 製造元情報
 */

@Schema(name = "Item_manufacturer", description = "製造元情報")
@JsonTypeName("Item_manufacturer")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.6.0")
public class ItemManufacturer {

  private String makerName;

  private String countryMadeBy;

  private String countryMadeState;

  private Integer warrantyPeriodMonth;

  private Integer receiptId;

  public ItemManufacturer makerName(String makerName) {
    this.makerName = makerName;
    return this;
  }

  /**
   * メーカー名
   * @return makerName
  */
  
  @Schema(name = "makerName", example = "新進気鋭のメーカーさん", description = "メーカー名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("makerName")
  public String getMakerName() {
    return makerName;
  }

  public void setMakerName(String makerName) {
    this.makerName = makerName;
  }

  public ItemManufacturer countryMadeBy(String countryMadeBy) {
    this.countryMadeBy = countryMadeBy;
    return this;
  }

  /**
   * 製造国
   * @return countryMadeBy
  */
  
  @Schema(name = "countryMadeBy", example = "日本", description = "製造国", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countryMadeBy")
  public String getCountryMadeBy() {
    return countryMadeBy;
  }

  public void setCountryMadeBy(String countryMadeBy) {
    this.countryMadeBy = countryMadeBy;
  }

  public ItemManufacturer countryMadeState(String countryMadeState) {
    this.countryMadeState = countryMadeState;
    return this;
  }

  /**
   * 製造州
   * @return countryMadeState
  */
  
  @Schema(name = "countryMadeState", example = "日本", description = "製造州", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countryMadeState")
  public String getCountryMadeState() {
    return countryMadeState;
  }

  public void setCountryMadeState(String countryMadeState) {
    this.countryMadeState = countryMadeState;
  }

  public ItemManufacturer warrantyPeriodMonth(Integer warrantyPeriodMonth) {
    this.warrantyPeriodMonth = warrantyPeriodMonth;
    return this;
  }

  /**
   * 保障期間
   * @return warrantyPeriodMonth
  */
  
  @Schema(name = "warrantyPeriodMonth", description = "保障期間", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warrantyPeriodMonth")
  public Integer getWarrantyPeriodMonth() {
    return warrantyPeriodMonth;
  }

  public void setWarrantyPeriodMonth(Integer warrantyPeriodMonth) {
    this.warrantyPeriodMonth = warrantyPeriodMonth;
  }

  public ItemManufacturer receiptId(Integer receiptId) {
    this.receiptId = receiptId;
    return this;
  }

  /**
   * 領収書ID
   * @return receiptId
  */
  
  @Schema(name = "receiptId", example = "1", description = "領収書ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("receiptId")
  public Integer getReceiptId() {
    return receiptId;
  }

  public void setReceiptId(Integer receiptId) {
    this.receiptId = receiptId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemManufacturer itemManufacturer = (ItemManufacturer) o;
    return Objects.equals(this.makerName, itemManufacturer.makerName) &&
        Objects.equals(this.countryMadeBy, itemManufacturer.countryMadeBy) &&
        Objects.equals(this.countryMadeState, itemManufacturer.countryMadeState) &&
        Objects.equals(this.warrantyPeriodMonth, itemManufacturer.warrantyPeriodMonth) &&
        Objects.equals(this.receiptId, itemManufacturer.receiptId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(makerName, countryMadeBy, countryMadeState, warrantyPeriodMonth, receiptId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemManufacturer {\n");
    sb.append("    makerName: ").append(toIndentedString(makerName)).append("\n");
    sb.append("    countryMadeBy: ").append(toIndentedString(countryMadeBy)).append("\n");
    sb.append("    countryMadeState: ").append(toIndentedString(countryMadeState)).append("\n");
    sb.append("    warrantyPeriodMonth: ").append(toIndentedString(warrantyPeriodMonth)).append("\n");
    sb.append("    receiptId: ").append(toIndentedString(receiptId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

