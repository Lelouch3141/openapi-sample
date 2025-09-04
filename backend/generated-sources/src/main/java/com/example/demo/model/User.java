package com.example.demo.model;

import java.net.URI;
import java.util.Objects;
import com.example.demo.model.Gender;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * User
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-04T10:01:04.741371500+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class User {

  private Integer id;

  private String name;

  private String email;

  private Gender gender;

  private Integer age;

  private String license;

  public User() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public User(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public User id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * ユーザーID
   * minimum: 1
   * @return id
  */
  @Min(1) 
  @Schema(name = "id", example = "1", description = "ユーザーID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 氏名
   * @return name
  */
  @NotNull @Size(min = 3, max = 50) 
  @Schema(name = "name", example = "John Lennon", description = "氏名", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * メールアドレス
   * @return email
  */
  @NotNull @jakarta.validation.constraints.Email 
  @Schema(name = "email", example = "aaa@sample.com", description = "メールアドレス", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User gender(Gender gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @Valid 
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public User age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * 年齢
   * @return age
  */
  
  @Schema(name = "age", example = "20", description = "年齢", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age")
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public User license(String license) {
    this.license = license;
    return this;
  }

  /**
   * 資格
   * @return license
  */
  
  @Schema(name = "license", example = "運転免許", description = "資格", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("license")
  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.gender, user.gender) &&
        Objects.equals(this.age, user.age) &&
        Objects.equals(this.license, user.license);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, gender, age, license);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
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

