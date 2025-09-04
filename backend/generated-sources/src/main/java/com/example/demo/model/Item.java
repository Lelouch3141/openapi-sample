package com.example.demo.model;

import java.net.URI;
import java.util.Objects;
import com.example.demo.model.ItemManufacturer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 商品
 */

@Schema(name = "Item", description = "商品")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.6.0")
public class Item {

  private Integer id;

  private String name;

  private Integer price;

  private String explanation;

  private ItemManufacturer manufacturer;

  public Item() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Item(Integer id, String name, Integer price, ItemManufacturer manufacturer) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.manufacturer = manufacturer;
  }

  public Item id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * 商品ID
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "101", description = "商品ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Item name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 商品名
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "新世代ゲーム機", description = "商品名", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Item price(Integer price) {
    this.price = price;
    return this;
  }

  /**
   * 価格(円)
   * @return price
  */
  @NotNull 
  @Schema(name = "price", example = "5980", description = "価格(円)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("price")
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Item explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

  /**
   * 説明
   * @return explanation
  */
  
  @Schema(name = "explanation", example = "最強です", description = "説明", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explanation")
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public Item manufacturer(ItemManufacturer manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  /**
   * Get manufacturer
   * @return manufacturer
  */
  @NotNull @Valid 
  @Schema(name = "manufacturer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("manufacturer")
  public ItemManufacturer getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(ItemManufacturer manufacturer) {
    this.manufacturer = manufacturer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.id, item.id) &&
        Objects.equals(this.name, item.name) &&
        Objects.equals(this.price, item.price) &&
        Objects.equals(this.explanation, item.explanation) &&
        Objects.equals(this.manufacturer, item.manufacturer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price, explanation, manufacturer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
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

