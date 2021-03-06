package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The column type determines the type of data that can be stored in a column. Switching between types (using a transaction with TableUpdateTransactionRequest in the \"changes\" list) is generally allowed except for switching to \"_LIST\" suffixed types. In such cases, a new column must be created and data must be copied over manually  <table border=\"1\">  <tr>  <th>name</th>  <th>description</th>  </tr>  <tr>  <td>STRING</td>  <td>The STRING data type is a small text strings with between 1 and 1,000 characters. Each STRING column will have a declared maximum size between 1 and 1,000 characters (with 50 characters as the default when maximumSize = null). The maximum STRING size is applied to the budget of the maximum table width, therefore it is best to use the smallest possible maximum size for the data. For strings larger than 250 characters, consider using the LARGETEXT column type for improved performance. Each STRING column counts as maxSize*4 (4 bytes per character) towards the total width of a table.</td>  </tr>  <tr>  <td>DOUBLE</td>  <td>The DOUBLE data type is a double-precision 64-bit IEEE 754 floating point. Its range of values is approximately +/-1.79769313486231570E+308 (15 significant decimal digits). Each DOUBLE column counts as 23 bytes towards the total width of a table.</td>  </tr>  <tr>  <td>INTEGER</td>  <td>The INTEGER data type is a 64-bit two's complement integer. The signed integer has a minimum value of -2^63 and a maximum value of 2^63-1. Each INTEGER column counts as 20 bytes towards the total width of a table.</td>  </tr>  <tr>  <td>BOOLEAN</td>  <td>The BOOLEAN data type has only two possible values: 'true' and 'false'. Each BOOLEAN column counts as 5 bytes towards the total width of a table.</td>  </tr>  <tr>  <td>DATE</td>  <td>The DATE data type represent the specified number of milliseconds since the standard base time known as 'the epoch', namely January 1, 1970, 00:00:00 GM. Each DATE column counts as 20 bytes towards the total width of a table.</td>  </tr>  <tr>  <td>FILEHANDLEID</td>  <td>The FILEHANDLEID data type represents a file stored within a table. To store a file in a table, first use the 'File Services' to upload a file to generate a new FileHandle, then apply the fileHandle.id as the value for this column. Note: This column type works best for files that are binary (non-text) or text files that are 1 MB or larger. For text files that are smaller than 1 MB consider using the LARGETEXT column type to improve download performance. Each FILEHANDLEID column counts as 20 bytes towards the total width of a table.</td>  </tr>  <tr>  <td>ENTITYID</td>  <td>The ENTITYID type represents a reference to a Synapse Entity. Values will include the 'syn' prefix, such as 'syn123'. Each ENTITYID column counts as 44 bytes towards the total width of a table.</td>  </tr>  <tr>  <td>SUBMISSIONID</td>  <td>The SUBMISSIONID type represents a reference to an evaluation submission. The value should be the ID of the referenced submission. Each SUBMISSIONID column counts as 20 bytes towards the total width of a table.</td>  </tr>  <tr>  <td>EVALUATIONID</td>  <td>The EVALUATIONID type represents a reference to an evaluation. The value should be the ID of the referenced evaluation. Each EVALUATIONID column counts as 20 bytes towards the total width of a table.</td>  </tr>  <tr>  <td>LINK</td>  <td>The LINK data type represents any URL with 1,000 characters or less. Each LINK column counts as maxSize*4 (4 bytes per character) towards the total width of a table.</td>  </tr>  <tr>  <td>LARGETEXT</td>  <td>The LARGETEXT data type represents a string that is greater than 250 characters but less than 524,288 characters (2 MB of UTF-8 4 byte chars). For smaller strings consider using the STRING column type. For larger strings, consider using the FILEHANDELID column type. Each LARGE_TEXT column counts as 2133 bytes towards the total width of a table.</td>  </tr>  <tr>  <td>USERID</td>  <td>The USERID data type represents a reference to a Synapse User. The value should be the ID of the referenced User. Each USERID column counts as 20 bytes towards the total width of a table.</td>  </tr>  <tr>  <td>STRING_LIST</td>  <td>Multiple values of STRING</td>  </tr>  <tr>  <td>INTEGER_LIST</td>  <td>Multiple values of INTEGER.</td>  </tr>  <tr>  <td>BOOLEAN_LIST</td>  <td>Multiple values of BOOLEAN.</td>  </tr>  <tr>  <td>DOUBLE</td>  <td></td>  </tr> <tr>  <td>DATE_LIST</td>  <td>Multiple values of DATE.</td>  </tr>  <tr>  <td>ENTITYID_LIST</td>  <td>Multiple values of ENTITYID.</td>  </tr>  <tr>  <td>USERID_LIST</td>  <td>Multiple values of USERID.</td>  </tr>  </table> 
 */
public enum ColumnType {
  
  STRING("STRING"),
  
  DOUBLE("DOUBLE"),
  
  INTEGER("INTEGER"),
  
  BOOLEAN("BOOLEAN"),
  
  DATE("DATE"),
  
  FILEHANDLEID("FILEHANDLEID"),
  
  ENTITYID("ENTITYID"),
  
  SUBMISSIONID("SUBMISSIONID"),
  
  EVALUATIONID("EVALUATIONID"),
  
  LINK("LINK"),
  
  LARGETEXT("LARGETEXT"),
  
  USERID("USERID"),
  
  STRING_LIST("STRING_LIST"),
  
  INTEGER_LIST("INTEGER_LIST"),
  
  BOOLEAN_LIST("BOOLEAN_LIST"),
  
  DATE_LIST("DATE_LIST"),
  
  ENTITYID_LIST("ENTITYID_LIST"),
  
  USERID_LIST("USERID_LIST");

  private String value;

  ColumnType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ColumnType fromValue(String value) {
    for (ColumnType b : ColumnType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

