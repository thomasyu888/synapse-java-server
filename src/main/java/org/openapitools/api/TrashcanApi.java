/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.PaginatedResultsOfTrashedEntity;
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
@Api(value = "trashcan", description = "the trashcan API")
public interface TrashcanApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PUT /trashcan/purge/{id} : Flags the specified entity for priority purge.
     * Flags the specified entity for priority purge. The entity will be deleted as soon as possible. Once purging is done, the entity will be permanently deleted from the system. 
     *
     * @param id The ID of an entity. (required)
     * @param body  (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Flags the specified entity for priority purge.", nickname = "flagForPurge", notes = "Flags the specified entity for priority purge. The entity will be deleted as soon as possible. Once purging is done, the entity will be permanently deleted from the system. ", response = String.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Trash Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = String.class) })
    @PutMapping(
        value = "/trashcan/purge/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<String> flagForPurge(@ApiParam(value = "The ID of an entity.",required=true) @PathVariable("id") String id,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Object body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /trashcan/trash/{id} : Moves an entity and its descendants to the trash can.
     * Moves an entity and its descendants to the trash can.
     *
     * @param id The ID of an entity. (required)
     * @param body  (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Moves an entity and its descendants to the trash can.", nickname = "moveToTrash", notes = "Moves an entity and its descendants to the trash can.", response = String.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Trash Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = String.class) })
    @PutMapping(
        value = "/trashcan/trash/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<String> moveToTrash(@ApiParam(value = "The ID of an entity.",required=true) @PathVariable("id") String id,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Object body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /trashcan/restore/{id} : Moves an entity and its descendants out of the trash can back to its original parent. 
     * Moves an entity and its descendants out of the trash can back to its original parent. An exception is thrown if the original parent does not exist any more. In that case, please use &lt;a href&#x3D;\&quot;#operation/restoreFromTrash\&quot;&gt;PUT /trashcan/restored/{id}/{parentId}&lt;/a&gt; to restore to a new parent.  In such a case you must be a member of the Synapse Access and Compliance Team. 
     *
     * @param id The ID of an entity. (required)
     * @param body  (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Moves an entity and its descendants out of the trash can back to its original parent. ", nickname = "restoreFromTrash", notes = "Moves an entity and its descendants out of the trash can back to its original parent. An exception is thrown if the original parent does not exist any more. In that case, please use <a href=\"#operation/restoreFromTrash\">PUT /trashcan/restored/{id}/{parentId}</a> to restore to a new parent.  In such a case you must be a member of the Synapse Access and Compliance Team. ", response = String.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Trash Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = String.class) })
    @PutMapping(
        value = "/trashcan/restore/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<String> restoreFromTrash(@ApiParam(value = "The ID of an entity.",required=true) @PathVariable("id") String id,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Object body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /trashcan/restore/{id}/{parentId} : Moves an entity and its descendants out of the trash can to a new parent.
     * Moves an entity and its descendants out of the trash can to a new parent.  NOTE:  This operation cannot be completed if the original parent has been deleted (unless the caller is a member of the Synapse Access and Compliance Team). The service will return a NotFoundException.  This is because of the potential security hole arising from allowing access requirements on folders:  If an entity is in a restricted folder and then deleted, it cannot be restored unless the new parent has the same restriction level as the original one. 
     *
     * @param id The ID of a deleted entity. (required)
     * @param parentId The ID of the new parent entity. (required)
     * @param body  (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Moves an entity and its descendants out of the trash can to a new parent.", nickname = "restoreFromTrashToParent", notes = "Moves an entity and its descendants out of the trash can to a new parent.  NOTE:  This operation cannot be completed if the original parent has been deleted (unless the caller is a member of the Synapse Access and Compliance Team). The service will return a NotFoundException.  This is because of the potential security hole arising from allowing access requirements on folders:  If an entity is in a restricted folder and then deleted, it cannot be restored unless the new parent has the same restriction level as the original one. ", response = String.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Trash Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = String.class) })
    @PutMapping(
        value = "/trashcan/restore/{id}/{parentId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<String> restoreFromTrashToParent(@ApiParam(value = "The ID of a deleted entity.",required=true) @PathVariable("id") String id,@ApiParam(value = "The ID of the new parent entity.",required=true) @PathVariable("parentId") String parentId,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Object body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /trashcan/view : Retrieves the paginated list of trash entities deleted by the current user.
     * Retrieves the paginated list of trash entities deleted by the current user. 
     *
     * @param limit The maximum number of entities to retrieve per page. (optional, default to 10)
     * @param offset Paginated results. Offset to the current page. (optional, default to 0)
     * @param body  (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Retrieves the paginated list of trash entities deleted by the current user.", nickname = "viewTrash", notes = "Retrieves the paginated list of trash entities deleted by the current user. ", response = PaginatedResultsOfTrashedEntity.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Trash Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PaginatedResultsOfTrashedEntity.class) })
    @GetMapping(
        value = "/trashcan/view",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PaginatedResultsOfTrashedEntity> viewTrash(@Min(10) @Max(100) @ApiParam(value = "The maximum number of entities to retrieve per page.", defaultValue = "10") @Valid @RequestParam(value = "limit", required = false, defaultValue="10") Integer limit,@Min(0)@ApiParam(value = "Paginated results. Offset to the current page.", defaultValue = "0") @Valid @RequestParam(value = "offset", required = false, defaultValue="0") Integer offset,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Object body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"effectiveSchema\" : \"...\", \"results\" : [ { \"deletedByPrincipalId\" : \"...\", \"deletedOn\" : \"...\", \"entityId\" : \"...\", \"entityName\" : \"...\", \"originalParentId\" : \"...\" }, { \"deletedByPrincipalId\" : \"...\", \"deletedOn\" : \"...\", \"entityId\" : \"...\", \"entityName\" : \"...\", \"originalParentId\" : \"...\" } ], \"totalNumberOfResults\" : 12345 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
