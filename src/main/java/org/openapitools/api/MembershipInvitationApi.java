/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Count;
import org.openapitools.model.InviteeVerificationSignedToken;
import org.openapitools.model.MembershipInvitation;
import org.openapitools.model.MembershipInvtnSignedToken;
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
@Api(value = "membershipInvitation", description = "the membershipInvitation API")
public interface MembershipInvitationApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /membershipInvitation : Create membership invitation
     * Create a membership invitation and send an email notification to the invitee. The team must be specified.  Also, either an inviteeId or an inviteeEmail must be specified. Optionally, the creator may include an invitation message and/or expiration date for the invitation. If no expiration date is specified then the invitation never expires.  Note: The client must be an team manager of the specified Team to make this request. 
     *
     * @param acceptInvitationEndpoint The portal endpoint prefix for one-click acceptance of the membership invitation.  A signed, serialized token is appended to create the complete URL: JoinTeamSignedToken if an inviteeId is specified, or MembershipInvtnSignedToken if an inviteeEmail is specified. In normal operation, this parameter should be omitted.  (optional)
     * @param notificationUnsubscribeEndpoint The portal endpoint prefix for one-click email unsubscription. A signed, serialized token is appended to create the complete URL: NotificationSettingsSignedToken  In normal operation, this parameter should be omitted.  (optional, default to &quot;https://www.synapse.org/#!SignedToken:Settings/&quot;)
     * @param membershipInvitation  (optional)
     * @return Success (status code 201)
     */
    @ApiOperation(value = "Create membership invitation", nickname = "createInvitation", notes = "Create a membership invitation and send an email notification to the invitee. The team must be specified.  Also, either an inviteeId or an inviteeEmail must be specified. Optionally, the creator may include an invitation message and/or expiration date for the invitation. If no expiration date is specified then the invitation never expires.  Note: The client must be an team manager of the specified Team to make this request. ", response = MembershipInvitation.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Membership Invitation Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Success", response = MembershipInvitation.class) })
    @PostMapping(
        value = "/membershipInvitation",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<MembershipInvitation> createInvitation(@ApiParam(value = "The portal endpoint prefix for one-click acceptance of the membership invitation.  A signed, serialized token is appended to create the complete URL: JoinTeamSignedToken if an inviteeId is specified, or MembershipInvtnSignedToken if an inviteeEmail is specified. In normal operation, this parameter should be omitted. ") @Valid @RequestParam(value = "acceptInvitationEndpoint", required = false) String acceptInvitationEndpoint,@ApiParam(value = "The portal endpoint prefix for one-click email unsubscription. A signed, serialized token is appended to create the complete URL: NotificationSettingsSignedToken  In normal operation, this parameter should be omitted. ", defaultValue = "https://www.synapse.org/#!SignedToken:Settings/") @Valid @RequestParam(value = "notificationUnsubscribeEndpoint", required = false, defaultValue="https://www.synapse.org/#!SignedToken:Settings/") String notificationUnsubscribeEndpoint,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) MembershipInvitation membershipInvitation) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"expiresOn\" : \"...\", \"id\" : \"...\", \"inviteeEmail\" : \"...\", \"inviteeId\" : \"...\", \"message\" : \"...\", \"teamId\" : \"...\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /membershipInvitation/{id} : Delete an invitation
     * Delete an invitation  Note:  The client must be an administrator of the Team referenced by the invitation or the invitee to make this request. 
     *
     * @param id the ID of the invitation. (required)
     * @return The resource was deleted (status code 204)
     */
    @ApiOperation(value = "Delete an invitation", nickname = "deleteInvitation", notes = "Delete an invitation  Note:  The client must be an administrator of the Team referenced by the invitation or the invitee to make this request. ", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Membership Invitation Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The resource was deleted") })
    @DeleteMapping(
        value = "/membershipInvitation/{id}"
    )
    default ResponseEntity<Void> deleteInvitation(@ApiParam(value = "the ID of the invitation.",required=true) @PathVariable("id") String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /membershipInvitation/{id} : Retrieve an invitation by ID.
     * Retrieve an invitation by ID  Note:  The client must be an administrator of the Team referenced by the invitation or the invitee to make this request. 
     *
     * @param id the ID of the invitation. (required)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Retrieve an invitation by ID.", nickname = "getInvitation", notes = "Retrieve an invitation by ID  Note:  The client must be an administrator of the Team referenced by the invitation or the invitee to make this request. ", response = MembershipInvitation.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Membership Invitation Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = MembershipInvitation.class) })
    @GetMapping(
        value = "/membershipInvitation/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<MembershipInvitation> getInvitation(@ApiParam(value = "the ID of the invitation.",required=true) @PathVariable("id") String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"expiresOn\" : \"...\", \"id\" : \"...\", \"inviteeEmail\" : \"...\", \"inviteeId\" : \"...\", \"message\" : \"...\", \"teamId\" : \"...\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /membershipInvitation/{id} : Retrieve an invitation by ID using a MembershipInvtnSignedToken.
     * Retrieve an invitation by ID using a MembershipInvtnSignedToken for authorization 
     *
     * @param id the ID of the invitation. (required)
     * @param membershipInvtnSignedToken  (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Retrieve an invitation by ID using a MembershipInvtnSignedToken.", nickname = "getInvitationByToken", notes = "Retrieve an invitation by ID using a MembershipInvtnSignedToken for authorization ", response = MembershipInvitation.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Membership Invitation Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = MembershipInvitation.class) })
    @PostMapping(
        value = "/membershipInvitation/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<MembershipInvitation> getInvitationByToken(@ApiParam(value = "the ID of the invitation.",required=true) @PathVariable("id") String id,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) MembershipInvtnSignedToken membershipInvtnSignedToken) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"expiresOn\" : \"...\", \"id\" : \"...\", \"inviteeEmail\" : \"...\", \"inviteeId\" : \"...\", \"message\" : \"...\", \"teamId\" : \"...\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /membershipInvitation/{id}/inviteeVerificationSignedToken : Verify whether the inviteeEmail of the indicated MembershipInvitation is associated with the authenticated user. 
     * Verify whether the inviteeEmail of the indicated MembershipInvitation is associated with the authenticated user.  If it is, the response body will contain an InviteeVerificationSignedToken. If it is not, a response status 403 Forbidden will be returned. InviteeVerificationSignedTokens generated by this service expire 24 hours from creation.  See https://sagebionetworks.jira.com/wiki/spaces/PLFM/pages/143628166/Invite+a+new+user+to+join+a+team for more information. 
     *
     * @param id the ID of the invitation. (required)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Verify whether the inviteeEmail of the indicated MembershipInvitation is associated with the authenticated user. ", nickname = "getInviteeVerificationSignedToken", notes = "Verify whether the inviteeEmail of the indicated MembershipInvitation is associated with the authenticated user.  If it is, the response body will contain an InviteeVerificationSignedToken. If it is not, a response status 403 Forbidden will be returned. InviteeVerificationSignedTokens generated by this service expire 24 hours from creation.  See https://sagebionetworks.jira.com/wiki/spaces/PLFM/pages/143628166/Invite+a+new+user+to+join+a+team for more information. ", response = InviteeVerificationSignedToken.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Membership Invitation Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = InviteeVerificationSignedToken.class) })
    @GetMapping(
        value = "/membershipInvitation/{id}/inviteeVerificationSignedToken",
        produces = { "application/json" }
    )
    default ResponseEntity<InviteeVerificationSignedToken> getInviteeVerificationSignedToken(@ApiParam(value = "the ID of the invitation.",required=true) @PathVariable("id") String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"concreteType\" : \"...\", \"createdOn\" : \"...\", \"expiresOn\" : \"...\", \"hmac\" : \"...\", \"inviteeId\" : \"...\", \"membershipInvitationId\" : \"...\", \"version\" : 12345 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /membershipInvitation/openInvitationCount : Retrieve the number of pending Membership Invitations.
     * Retrieve the number of pending Membership Invitations
     *
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Retrieve the number of pending Membership Invitations.", nickname = "getOpenInvitationCount", notes = "Retrieve the number of pending Membership Invitations", response = Count.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Membership Invitation Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Count.class) })
    @GetMapping(
        value = "/membershipInvitation/openInvitationCount",
        produces = { "application/json" }
    )
    default ResponseEntity<Count> getOpenInvitationCount() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"count\" : 12345 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /membershipInvitation/{id}/inviteeId : Set the inviteeId of a MembershipInvitation.
     * Set the inviteeId of a MembershipInvitation.  A valid InviteeVerificationSignedToken must have an inviteeId equal to the id of the authenticated user and a membershipInvitationId equal to the id in the URI. This call will only succeed if the indicated MembershipInvitation has a null inviteeId and a non null inviteeEmail.  See https://sagebionetworks.jira.com/wiki/spaces/PLFM/pages/143628166/Invite+a+new+user+to+join+a+team for more information. 
     *
     * @param id the ID of the invitation. (required)
     * @param inviteeVerificationSignedToken  (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Set the inviteeId of a MembershipInvitation.", nickname = "updateInviteeId", notes = "Set the inviteeId of a MembershipInvitation.  A valid InviteeVerificationSignedToken must have an inviteeId equal to the id of the authenticated user and a membershipInvitationId equal to the id in the URI. This call will only succeed if the indicated MembershipInvitation has a null inviteeId and a non null inviteeEmail.  See https://sagebionetworks.jira.com/wiki/spaces/PLFM/pages/143628166/Invite+a+new+user+to+join+a+team for more information. ", response = String.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Membership Invitation Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = String.class) })
    @PutMapping(
        value = "/membershipInvitation/{id}/inviteeId",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<String> updateInviteeId(@ApiParam(value = "the ID of the invitation.",required=true) @PathVariable("id") String id,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) InviteeVerificationSignedToken inviteeVerificationSignedToken) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
