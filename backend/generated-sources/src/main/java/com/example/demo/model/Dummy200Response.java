package com.example.demo.model;

import java.net.URI;
import java.util.Objects;
import com.example.demo.model.Greeting;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Dummy200Response
 */

@JsonTypeName("dummy_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.6.0")
public class Dummy200Response {

  private Greeting greeting;

  public Dummy200Response greeting(Greeting greeting) {
    this.greeting = greeting;
    return this;
  }

  /**
   * Get greeting
   * @return greeting
  */
  @Valid 
  @Schema(name = "greeting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("greeting")
  public Greeting getGreeting() {
    return greeting;
  }

  public void setGreeting(Greeting greeting) {
    this.greeting = greeting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dummy200Response dummy200Response = (Dummy200Response) o;
    return Objects.equals(this.greeting, dummy200Response.greeting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(greeting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dummy200Response {\n");
    sb.append("    greeting: ").append(toIndentedString(greeting)).append("\n");
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

