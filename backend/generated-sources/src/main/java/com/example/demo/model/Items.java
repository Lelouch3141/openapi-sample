package com.example.demo.model;

import java.net.URI;
import java.util.Objects;
import com.example.demo.model.Item;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 商品リスト
 */

@Schema(name = "Items", description = "商品リスト")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-04T10:01:04.741371500+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class Items {

  private Integer totalCount;

  @Valid
  private List<@Valid Item> items = new ArrayList<>();

  public Items() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Items(Integer totalCount, List<@Valid Item> items) {
    this.totalCount = totalCount;
    this.items = items;
  }

  public Items totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * 総商品数
   * @return totalCount
  */
  @NotNull 
  @Schema(name = "totalCount", example = "2", description = "総商品数", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalCount")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public Items items(List<@Valid Item> items) {
    this.items = items;
    return this;
  }

  public Items addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * 商品一覧
   * @return items
  */
  @NotNull @Valid 
  @Schema(name = "items", description = "商品一覧", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid Item> getItems() {
    return items;
  }

  public void setItems(List<@Valid Item> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Items items = (Items) o;
    return Objects.equals(this.totalCount, items.totalCount) &&
        Objects.equals(this.items, items.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Items {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

