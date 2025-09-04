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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-04T10:01:04.741371500+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class ItemManufacturer {

  private String name;

  private String country;

  public ItemManufacturer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ItemManufacturer(String name, String country) {
    this.name = name;
    this.country = country;
  }

  public ItemManufacturer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * メーカー名
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "新進気鋭のメーカーさん", description = "メーカー名", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemManufacturer country(String country) {
    this.country = country;
    return this;
  }

  /**
   * 国
   * @return country
  */
  @NotNull 
  @Schema(name = "country", example = "日本", description = "国", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
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
    return Objects.equals(this.name, itemManufacturer.name) &&
        Objects.equals(this.country, itemManufacturer.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemManufacturer {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

