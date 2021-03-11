package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of Entity Ids
 */
@ApiModel(description = "List of Entity Ids")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class EntityIdList   {
  @JsonProperty("idList")
  @Valid
  private List<String> idList = null;

  public EntityIdList idList(List<String> idList) {
    this.idList = idList;
    return this;
  }

  public EntityIdList addIdListItem(String idListItem) {
    if (this.idList == null) {
      this.idList = new ArrayList<>();
    }
    this.idList.add(idListItem);
    return this;
  }

  /**
   * List of Entity Ids
   * @return idList
  */
  @ApiModelProperty(value = "List of Entity Ids")


  public List<String> getIdList() {
    return idList;
  }

  public void setIdList(List<String> idList) {
    this.idList = idList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityIdList entityIdList = (EntityIdList) o;
    return Objects.equals(this.idList, entityIdList.idList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityIdList {\n");
    
    sb.append("    idList: ").append(toIndentedString(idList)).append("\n");
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

