/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.JoinTeamSignedToken;
import org.openapitools.model.ResponseMessage;
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
@Api(value = "teamMember", description = "the teamMember API")
public interface TeamMemberApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PUT /teamMember : Add a member to the Team.
     * Add a member to the Team.  Note: The request is authenticated by a hash message authentication code in the request body, generated by Synapse.  The intended use of this service is by the portal, completing a round trip with a &#39;one-click join-team&#39; link provided to the user by Synapse via email. If both teamEndpoint and notificationUnsubscribeEndpoint are provided, notification email(s) will be sent to the appropriate parties. 
     *
     * @param notificationUnsubscribeEndpoint notification unsubscribe endpoint (optional)
     * @param teamEndpoint Team end point (optional)
     * @param joinTeamSignedToken  (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Add a member to the Team.", nickname = "addTeamMemberViaSignedToken", notes = "Add a member to the Team.  Note: The request is authenticated by a hash message authentication code in the request body, generated by Synapse.  The intended use of this service is by the portal, completing a round trip with a 'one-click join-team' link provided to the user by Synapse via email. If both teamEndpoint and notificationUnsubscribeEndpoint are provided, notification email(s) will be sent to the appropriate parties. ", response = ResponseMessage.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Team Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ResponseMessage.class) })
    @PutMapping(
        value = "/teamMember",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ResponseMessage> addTeamMemberViaSignedToken(@ApiParam(value = "notification unsubscribe endpoint") @Valid @RequestParam(value = "notificationUnsubscribeEndpoint", required = false) String notificationUnsubscribeEndpoint,@ApiParam(value = "Team end point") @Valid @RequestParam(value = "teamEndpoint", required = false) String teamEndpoint,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) JoinTeamSignedToken joinTeamSignedToken) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"...\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
