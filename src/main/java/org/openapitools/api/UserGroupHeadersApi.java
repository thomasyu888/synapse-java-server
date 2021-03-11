/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.AliasList;
import org.openapitools.model.UserGroupHeaderResponse;
import org.openapitools.model.UserGroupHeaderResponsePage;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
@Validated
@Api(value = "userGroupHeaders", description = "the userGroupHeaders API")
public interface UserGroupHeadersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /userGroupHeaders/aliases : Get Users and Groups that match the given list of aliases.
     * Get Users and Groups that match the given list of aliases.
     *
     * @param aliasList The list of principal aliases to lookup. Each alias must be either a user name or team name. The maximum number of aliases per request is 100.  (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Get Users and Groups that match the given list of aliases.", nickname = "getUserGroupHeadersByAliases", notes = "Get Users and Groups that match the given list of aliases.", response = UserGroupHeaderResponse.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "User Profile Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserGroupHeaderResponse.class) })
    @PostMapping(
        value = "/userGroupHeaders/aliases",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserGroupHeaderResponse> getUserGroupHeadersByAliases(@ApiParam(value = "The list of principal aliases to lookup. Each alias must be either a user name or team name. The maximum number of aliases per request is 100. "  )  @Valid @RequestBody(required = false) AliasList aliasList) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"list\" : [ { \"displayName\" : \"...\", \"email\" : \"...\", \"firstName\" : \"...\", \"isIndividual\" : true, \"lastName\" : \"...\", \"ownerId\" : \"...\", \"userName\" : \"...\" }, { \"displayName\" : \"...\", \"email\" : \"...\", \"firstName\" : \"...\", \"isIndividual\" : true, \"lastName\" : \"...\", \"ownerId\" : \"...\", \"userName\" : \"...\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /userGroupHeaders/batch : Batch get UserGroupHeaders.
     * Batch get UserGroupHeaders. This fetches information about a collection of users or groups, specified by Synapse IDs. 
     *
     * @param ids IDs are specified as request parameters at the end of the URL, separated by commas. For example: ids&#x3D;1001,819  (required)
     * @param body Batch get UserGroupHeaders. This fetches information about a collection of users or groups, specified by Synapse IDs.  (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Batch get UserGroupHeaders.", nickname = "getUserGroupHeadersByIds", notes = "Batch get UserGroupHeaders. This fetches information about a collection of users or groups, specified by Synapse IDs. ", response = UserGroupHeaderResponsePage.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "User Profile Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserGroupHeaderResponsePage.class) })
    @GetMapping(
        value = "/userGroupHeaders/batch",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserGroupHeaderResponsePage> getUserGroupHeadersByIds(@NotNull @ApiParam(value = "IDs are specified as request parameters at the end of the URL, separated by commas. For example: ids=1001,819 ", required = true) @Valid @RequestParam(value = "ids", required = true) String ids,@ApiParam(value = "Batch get UserGroupHeaders. This fetches information about a collection of users or groups, specified by Synapse IDs. "  )  @Valid @RequestBody(required = false) Object body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"children\" : [ { \"displayName\" : \"...\", \"email\" : \"...\", \"firstName\" : \"...\", \"isIndividual\" : true, \"lastName\" : \"...\", \"ownerId\" : \"...\", \"userName\" : \"...\" }, { \"displayName\" : \"...\", \"email\" : \"...\", \"firstName\" : \"...\", \"isIndividual\" : true, \"lastName\" : \"...\", \"ownerId\" : \"...\", \"userName\" : \"...\" } ], \"prefixFilter\" : \"...\", \"totalNumberOfResults\" : 12345 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /userGroupHeaders : Get Users and Groups that match the given prefix.
     * Get Users and Groups that match the given prefix.
     *
     * @param limit Limits the number of items that will be fetched for this page.  (optional, default to 10)
     * @param offset The offset index determines where this page will start from. An index of 0 is the first item.  (optional, default to 0)
     * @param prefix The name to search for. (optional)
     * @param typeFilter Restrict the results to a type of principal. Available options: &lt;a href&#x3D;\&quot;${org.sagebionetworks.repo.model.principal.TypeFilter}\&quot;&gt;TypeFilter&lt;/a&gt;.&#39;  (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Get Users and Groups that match the given prefix.", nickname = "getUserGroupHeadersByPrefix", notes = "Get Users and Groups that match the given prefix.", response = UserGroupHeaderResponsePage.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "User Profile Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserGroupHeaderResponsePage.class) })
    @GetMapping(
        value = "/userGroupHeaders",
        produces = { "application/json" }
    )
    default ResponseEntity<UserGroupHeaderResponsePage> getUserGroupHeadersByPrefix(@ApiParam(value = "Limits the number of items that will be fetched for this page. ", defaultValue = "10") @Valid @RequestParam(value = "limit", required = false, defaultValue="10") Integer limit,@Min(10)@ApiParam(value = "The offset index determines where this page will start from. An index of 0 is the first item. ", defaultValue = "0") @Valid @RequestParam(value = "offset", required = false, defaultValue="0") Integer offset,@ApiParam(value = "The name to search for.") @Valid @RequestParam(value = "prefix", required = false) String prefix,@ApiParam(value = "Restrict the results to a type of principal. Available options: <a href=\"${org.sagebionetworks.repo.model.principal.TypeFilter}\">TypeFilter</a>.' ", allowableValues = "ALL, TEAMS_ONLY, USERS_ONLY") @Valid @RequestParam(value = "typeFilter", required = false) String typeFilter) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"children\" : [ { \"displayName\" : \"...\", \"email\" : \"...\", \"firstName\" : \"...\", \"isIndividual\" : true, \"lastName\" : \"...\", \"ownerId\" : \"...\", \"userName\" : \"...\" }, { \"displayName\" : \"...\", \"email\" : \"...\", \"firstName\" : \"...\", \"isIndividual\" : true, \"lastName\" : \"...\", \"ownerId\" : \"...\", \"userName\" : \"...\" } ], \"prefixFilter\" : \"...\", \"totalNumberOfResults\" : 12345 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
