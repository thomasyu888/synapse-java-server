package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.TYPE;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The JSON schema is defined by: json-schema.org, specifically draft-07. Only features listed here are currently supported.
 */
@ApiModel(description = "The JSON schema is defined by: json-schema.org, specifically draft-07. Only features listed here are currently supported.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class JsonSchema   {
  @JsonProperty("$id")
  private String $id;

  @JsonProperty("$ref")
  private String $ref;

  @JsonProperty("$schema")
  private String $schema;

  @JsonProperty("_const")
  private String _const;

  @JsonProperty("_else")
  private Object _else;

  @JsonProperty("_enum")
  @Valid
  private List<String> _enum = null;

  @JsonProperty("_if")
  private Object _if;

  @JsonProperty("allOf")
  @Valid
  private List<Object> allOf = null;

  @JsonProperty("anyOf")
  @Valid
  private List<Object> anyOf = null;

  @JsonProperty("definitions")
  @Valid
  private Map<String, Object> definitions = null;

  @JsonProperty("description")
  private String description;

  @JsonProperty("format")
  private String format;

  @JsonProperty("items")
  private Object items;

  @JsonProperty("maxLength")
  private Integer maxLength;

  @JsonProperty("minLength")
  private Integer minLength;

  @JsonProperty("oneOf")
  @Valid
  private List<Object> oneOf = null;

  @JsonProperty("pattern")
  private String pattern;

  @JsonProperty("properties")
  @Valid
  private Map<String, Object> properties = null;

  @JsonProperty("required")
  @Valid
  private List<String> required = null;

  @JsonProperty("source")
  private String source;

  @JsonProperty("then")
  private Object then;

  @JsonProperty("title")
  private String title;

  @JsonProperty("type")
  private TYPE type;

  public JsonSchema $id(String $id) {
    this.$id = $id;
    return this;
  }

  /**
   * https://json-schema.org/draft/2019-09/json-schema-core.html#rfc.section.8.2.2 
   * @return $id
  */
  @ApiModelProperty(value = "https://json-schema.org/draft/2019-09/json-schema-core.html#rfc.section.8.2.2 ")


  public String get$Id() {
    return $id;
  }

  public void set$Id(String $id) {
    this.$id = $id;
  }

  public JsonSchema $ref(String $ref) {
    this.$ref = $ref;
    return this;
  }

  /**
   * https://json-schema.org/draft/2019-09/json-schema-core.html#rfc.section.8.2.4.1 
   * @return $ref
  */
  @ApiModelProperty(value = "https://json-schema.org/draft/2019-09/json-schema-core.html#rfc.section.8.2.4.1 ")


  public String get$Ref() {
    return $ref;
  }

  public void set$Ref(String $ref) {
    this.$ref = $ref;
  }

  public JsonSchema $schema(String $schema) {
    this.$schema = $schema;
    return this;
  }

  /**
   * https://json-schema.org/draft/2019-09/json-schema-core.html#rfc.section.8.1.1 
   * @return $schema
  */
  @ApiModelProperty(value = "https://json-schema.org/draft/2019-09/json-schema-core.html#rfc.section.8.1.1 ")


  public String get$Schema() {
    return $schema;
  }

  public void set$Schema(String $schema) {
    this.$schema = $schema;
  }

  public JsonSchema _const(String _const) {
    this._const = _const;
    return this;
  }

  /**
   * https://json-schema.org/draft/2019-09/json-schema-validation.html#rfc.section.6.1.3 
   * @return _const
  */
  @ApiModelProperty(value = "https://json-schema.org/draft/2019-09/json-schema-validation.html#rfc.section.6.1.3 ")


  public String getConst() {
    return _const;
  }

  public void setConst(String _const) {
    this._const = _const;
  }

  public JsonSchema _else(Object _else) {
    this._else = _else;
    return this;
  }

  /**
   * Json Object
   * @return _else
  */
  @ApiModelProperty(example = "{}", value = "Json Object")


  public Object getElse() {
    return _else;
  }

  public void setElse(Object _else) {
    this._else = _else;
  }

  public JsonSchema _enum(List<String> _enum) {
    this._enum = _enum;
    return this;
  }

  public JsonSchema addEnumItem(String _enumItem) {
    if (this._enum == null) {
      this._enum = new ArrayList<>();
    }
    this._enum.add(_enumItem);
    return this;
  }

  /**
   * https://json-schema.org/draft/2019-09/json-schema-validation.html#rfc.section.6.1.2 
   * @return _enum
  */
  @ApiModelProperty(value = "https://json-schema.org/draft/2019-09/json-schema-validation.html#rfc.section.6.1.2 ")


  public List<String> getEnum() {
    return _enum;
  }

  public void setEnum(List<String> _enum) {
    this._enum = _enum;
  }

  public JsonSchema _if(Object _if) {
    this._if = _if;
    return this;
  }

  /**
   * Json Object
   * @return _if
  */
  @ApiModelProperty(example = "{}", value = "Json Object")


  public Object getIf() {
    return _if;
  }

  public void setIf(Object _if) {
    this._if = _if;
  }

  public JsonSchema allOf(List<Object> allOf) {
    this.allOf = allOf;
    return this;
  }

  public JsonSchema addAllOfItem(Object allOfItem) {
    if (this.allOf == null) {
      this.allOf = new ArrayList<>();
    }
    this.allOf.add(allOfItem);
    return this;
  }

  /**
   * Use allOf to 'extend' or 'implement' one or more schemas. https://json-schema.org/draft/2019-09/json-schema-core.html#rfc.section.9.2.1.1 
   * @return allOf
  */
  @ApiModelProperty(value = "Use allOf to 'extend' or 'implement' one or more schemas. https://json-schema.org/draft/2019-09/json-schema-core.html#rfc.section.9.2.1.1 ")


  public List<Object> getAllOf() {
    return allOf;
  }

  public void setAllOf(List<Object> allOf) {
    this.allOf = allOf;
  }

  public JsonSchema anyOf(List<Object> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  public JsonSchema addAnyOfItem(Object anyOfItem) {
    if (this.anyOf == null) {
      this.anyOf = new ArrayList<>();
    }
    this.anyOf.add(anyOfItem);
    return this;
  }

  /**
   * https://json-schema.org/draft/2019-09/json-schema-core.html#rfc.section.9.2.1.2 
   * @return anyOf
  */
  @ApiModelProperty(value = "https://json-schema.org/draft/2019-09/json-schema-core.html#rfc.section.9.2.1.2 ")


  public List<Object> getAnyOf() {
    return anyOf;
  }

  public void setAnyOf(List<Object> anyOf) {
    this.anyOf = anyOf;
  }

  public JsonSchema definitions(Map<String, Object> definitions) {
    this.definitions = definitions;
    return this;
  }

  public JsonSchema putDefinitionsItem(String key, Object definitionsItem) {
    if (this.definitions == null) {
      this.definitions = new HashMap<>();
    }
    this.definitions.put(key, definitionsItem);
    return this;
  }

  /**
   * In an effort to support draft-07 implementations, we are using 'definitions' instead of '$defs'. https://json-schema.org/draft/2019-09/json-schema-validation.html#rfc.appendix.A 
   * @return definitions
  */
  @ApiModelProperty(value = "In an effort to support draft-07 implementations, we are using 'definitions' instead of '$defs'. https://json-schema.org/draft/2019-09/json-schema-validation.html#rfc.appendix.A ")


  public Map<String, Object> getDefinitions() {
    return definitions;
  }

  public void setDefinitions(Map<String, Object> definitions) {
    this.definitions = definitions;
  }

  public JsonSchema description(String description) {
    this.description = description;
    return this;
  }

  /**
   * https://json-schema.org/draft/2019-09/json-schema-hypermedia.html#rfc.section.6.5.2' 
   * @return description
  */
  @ApiModelProperty(value = "https://json-schema.org/draft/2019-09/json-schema-hypermedia.html#rfc.section.6.5.2' ")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JsonSchema format(String format) {
    this.format = format;
    return this;
  }

  /**
   * https://json-schema.org/draft/2019-09/json-schema-validation.html#rfc.section.7.3' 
   * @return format
  */
  @ApiModelProperty(value = "https://json-schema.org/draft/2019-09/json-schema-validation.html#rfc.section.7.3' ")


  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public JsonSchema items(Object items) {
    this.items = items;
    return this;
  }

  /**
   * Json Object
   * @return items
  */
  @ApiModelProperty(example = "{}", value = "Json Object")


  public Object getItems() {
    return items;
  }

  public void setItems(Object items) {
    this.items = items;
  }

  public JsonSchema maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * https://tools.ietf.org/html/draft-handrews-json-schema-validation-02#section-6.3.1'
   * @return maxLength
  */
  @ApiModelProperty(value = "https://tools.ietf.org/html/draft-handrews-json-schema-validation-02#section-6.3.1'")


  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public JsonSchema minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * https://tools.ietf.org/html/draft-handrews-json-schema-validation-02#section-6.3.2' 
   * @return minLength
  */
  @ApiModelProperty(value = "https://tools.ietf.org/html/draft-handrews-json-schema-validation-02#section-6.3.2' ")


  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public JsonSchema oneOf(List<Object> oneOf) {
    this.oneOf = oneOf;
    return this;
  }

  public JsonSchema addOneOfItem(Object oneOfItem) {
    if (this.oneOf == null) {
      this.oneOf = new ArrayList<>();
    }
    this.oneOf.add(oneOfItem);
    return this;
  }

  /**
   * https://json-schema.org/draft/2019-09/json-schema-core.html#rfc.section.9.2.1.3' 
   * @return oneOf
  */
  @ApiModelProperty(value = "https://json-schema.org/draft/2019-09/json-schema-core.html#rfc.section.9.2.1.3' ")


  public List<Object> getOneOf() {
    return oneOf;
  }

  public void setOneOf(List<Object> oneOf) {
    this.oneOf = oneOf;
  }

  public JsonSchema pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * https://tools.ietf.org/html/draft-handrews-json-schema-validation-02#section-6.3.3 
   * @return pattern
  */
  @ApiModelProperty(value = "https://tools.ietf.org/html/draft-handrews-json-schema-validation-02#section-6.3.3 ")


  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public JsonSchema properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  public JsonSchema putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * https://json-schema.org/draft/2019-09/json-schema-core.html#rfc.section.9.3.2.1
   * @return properties
  */
  @ApiModelProperty(value = "https://json-schema.org/draft/2019-09/json-schema-core.html#rfc.section.9.3.2.1")


  public Map<String, Object> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  public JsonSchema required(List<String> required) {
    this.required = required;
    return this;
  }

  public JsonSchema addRequiredItem(String requiredItem) {
    if (this.required == null) {
      this.required = new ArrayList<>();
    }
    this.required.add(requiredItem);
    return this;
  }

  /**
   * https://json-schema.org/draft/2019-09/json-schema-validation.html#rfc.section.6.5.3
   * @return required
  */
  @ApiModelProperty(value = "https://json-schema.org/draft/2019-09/json-schema-validation.html#rfc.section.6.5.3")


  public List<String> getRequired() {
    return required;
  }

  public void setRequired(List<String> required) {
    this.required = required;
  }

  public JsonSchema source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Used to indicate that this schema is derived from another object/schema. The value should be a URL reference to the original work. The 'source' is solely descriptive and should have no impact on validation. 
   * @return source
  */
  @ApiModelProperty(value = "Used to indicate that this schema is derived from another object/schema. The value should be a URL reference to the original work. The 'source' is solely descriptive and should have no impact on validation. ")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public JsonSchema then(Object then) {
    this.then = then;
    return this;
  }

  /**
   * Json Object
   * @return then
  */
  @ApiModelProperty(example = "{}", value = "Json Object")


  public Object getThen() {
    return then;
  }

  public void setThen(Object then) {
    this.then = then;
  }

  public JsonSchema title(String title) {
    this.title = title;
    return this;
  }

  /**
   * https://json-schema.org/draft/2019-09/json-schema-hypermedia.html#rfc.section.6.5.1 
   * @return title
  */
  @ApiModelProperty(value = "https://json-schema.org/draft/2019-09/json-schema-hypermedia.html#rfc.section.6.5.1 ")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public JsonSchema type(TYPE type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public TYPE getType() {
    return type;
  }

  public void setType(TYPE type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSchema jsonSchema = (JsonSchema) o;
    return Objects.equals(this.$id, jsonSchema.$id) &&
        Objects.equals(this.$ref, jsonSchema.$ref) &&
        Objects.equals(this.$schema, jsonSchema.$schema) &&
        Objects.equals(this._const, jsonSchema._const) &&
        Objects.equals(this._else, jsonSchema._else) &&
        Objects.equals(this._enum, jsonSchema._enum) &&
        Objects.equals(this._if, jsonSchema._if) &&
        Objects.equals(this.allOf, jsonSchema.allOf) &&
        Objects.equals(this.anyOf, jsonSchema.anyOf) &&
        Objects.equals(this.definitions, jsonSchema.definitions) &&
        Objects.equals(this.description, jsonSchema.description) &&
        Objects.equals(this.format, jsonSchema.format) &&
        Objects.equals(this.items, jsonSchema.items) &&
        Objects.equals(this.maxLength, jsonSchema.maxLength) &&
        Objects.equals(this.minLength, jsonSchema.minLength) &&
        Objects.equals(this.oneOf, jsonSchema.oneOf) &&
        Objects.equals(this.pattern, jsonSchema.pattern) &&
        Objects.equals(this.properties, jsonSchema.properties) &&
        Objects.equals(this.required, jsonSchema.required) &&
        Objects.equals(this.source, jsonSchema.source) &&
        Objects.equals(this.then, jsonSchema.then) &&
        Objects.equals(this.title, jsonSchema.title) &&
        Objects.equals(this.type, jsonSchema.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash($id, $ref, $schema, _const, _else, _enum, _if, allOf, anyOf, definitions, description, format, items, maxLength, minLength, oneOf, pattern, properties, required, source, then, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSchema {\n");
    
    sb.append("    $id: ").append(toIndentedString($id)).append("\n");
    sb.append("    $ref: ").append(toIndentedString($ref)).append("\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");
    sb.append("    _const: ").append(toIndentedString(_const)).append("\n");
    sb.append("    _else: ").append(toIndentedString(_else)).append("\n");
    sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
    sb.append("    _if: ").append(toIndentedString(_if)).append("\n");
    sb.append("    allOf: ").append(toIndentedString(allOf)).append("\n");
    sb.append("    anyOf: ").append(toIndentedString(anyOf)).append("\n");
    sb.append("    definitions: ").append(toIndentedString(definitions)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    oneOf: ").append(toIndentedString(oneOf)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    then: ").append(toIndentedString(then)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

