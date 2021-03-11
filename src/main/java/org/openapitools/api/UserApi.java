/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.IdList;
import org.openapitools.model.ListWrapperOfTeamMember;
import org.openapitools.model.PaginatedResultsOfMembershipInvitation;
import org.openapitools.model.PaginatedResultsOfMembershipRequest;
import org.openapitools.model.PaginatedResultsOfTeam;
import org.openapitools.model.PaginatedResultsOfUserProfile;
import org.openapitools.model.PaginatedTeamIds;
import org.openapitools.model.PassingRecord;
import org.openapitools.model.UserBundle;
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
@Api(value = "user", description = "the user API")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /user/bundle : Get the user bundle of the caller (my own bundle).
     * Get the user bundle of the caller (my own bundle). &lt;p&gt;&lt;b&gt;Note:&lt;/b&gt; Private fields will be returned.&lt;/p&gt; 
     *
     * @param mask integer flag defining which components to include in the bundle &lt;p&gt; This integer is used as a bit-string of flags to specify which parts to include in the UserBundle. The mask is defined as follows: &lt;ul&gt; &lt;li&gt; UserProfile  &#x3D; 0x1 &lt;/li&gt; &lt;li&gt; ORCID  &#x3D; 0x2 &lt;/li&gt; &lt;li&gt; VerificationSubmission &#x3D; 0x4 &lt;/li&gt; &lt;li&gt; Is Certified &#x3D; 0x8 &lt;/li&gt; &lt;li&gt; Is Verified  &#x3D; 0x10 &lt;/li&gt; &lt;li&gt; Is ACT Member &#x3D; 0x20 &lt;/li&gt; &lt;/ul&gt; &lt;/p&gt;  (required)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Get the user bundle of the caller (my own bundle).", nickname = "getMyOwnUserBundle", notes = "Get the user bundle of the caller (my own bundle). <p><b>Note:</b> Private fields will be returned.</p> ", response = UserBundle.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "User Profile Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserBundle.class) })
    @GetMapping(
        value = "/user/bundle",
        produces = { "application/json" }
    )
    default ResponseEntity<UserBundle> getMyOwnUserBundle(@NotNull @ApiParam(value = "integer flag defining which components to include in the bundle <p> This integer is used as a bit-string of flags to specify which parts to include in the UserBundle. The mask is defined as follows: <ul> <li> UserProfile  = 0x1 </li> <li> ORCID  = 0x2 </li> <li> VerificationSubmission = 0x4 </li> <li> Is Certified = 0x8 </li> <li> Is Verified  = 0x10 </li> <li> Is ACT Member = 0x20 </li> </ul> </p> ", required = true) @Valid @RequestParam(value = "mask", required = true) String mask) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"ORCID\" : \"...\", \"isACTMember\" : true, \"isCertified\" : true, \"isVerified\" : true, \"userId\" : \"...\", \"userProfile\" : { \"RStudioUrl\" : \"...\", \"company\" : \"...\", \"createdOn\" : \"...\", \"displayName\" : \"...\", \"email\" : \"...\", \"emails\" : [ \"...\", \"...\" ], \"etag\" : \"...\", \"firstName\" : \"...\", \"industry\" : \"...\", \"lastName\" : \"...\", \"location\" : \"...\", \"notificationSettings\" : { \"markEmailedMessagesAsRead\" : true, \"sendEmailNotifications\" : true }, \"openIds\" : [ \"...\", \"...\" ], \"ownerId\" : \"...\", \"position\" : \"...\", \"preferences\" : [ { \"concreteType\" : \"...\", \"name\" : \"...\" }, { \"concreteType\" : \"...\", \"name\" : \"...\" } ], \"profilePicureFileHandleId\" : \"...\", \"summary\" : \"...\", \"teamName\" : \"...\", \"url\" : \"...\", \"userName\" : \"...\" }, \"verificationSubmission\" : { \"attachments\" : [ { \"fileName\" : \"...\", \"id\" : \"...\" }, { \"fileName\" : \"...\", \"id\" : \"...\" } ], \"company\" : \"...\", \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"emails\" : [ \"...\", \"...\" ], \"firstName\" : \"...\", \"id\" : \"...\", \"lastName\" : \"...\", \"location\" : \"...\", \"notificationEmail\" : \"...\", \"orcid\" : \"...\", \"stateHistory\" : [ { \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"notes\" : \"...\", \"reason\" : \"...\", \"state\" : \"SUSPENDED\" }, { \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"notes\" : \"...\", \"reason\" : \"...\", \"state\" : \"REJECTED\" } ] } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{id}/openInvitation : Retrieve the open invitations to a user, optionally filtering by the Team of origin. 
     * Retrieve the open invitations to a user, optionally filtering by the Team of origin. An invitation is only open if it has not expired and if the user has not joined the Team. Note: certain fields may be omitted when returned if the field value is null 
     *
     * @param id The ID of the Synapse user. (required)
     * @param limit the maximum number of invitations to return. (optional, default to 10)
     * @param offset the starting index of the returned results. (optional, default to 0)
     * @param teamId the ID of the Team extending the invitations (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Retrieve the open invitations to a user, optionally filtering by the Team of origin. ", nickname = "getOpenInvitationsByUser", notes = "Retrieve the open invitations to a user, optionally filtering by the Team of origin. An invitation is only open if it has not expired and if the user has not joined the Team. Note: certain fields may be omitted when returned if the field value is null ", response = PaginatedResultsOfMembershipInvitation.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Membership Invitation Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PaginatedResultsOfMembershipInvitation.class) })
    @GetMapping(
        value = "/user/{id}/openInvitation",
        produces = { "application/json" }
    )
    default ResponseEntity<PaginatedResultsOfMembershipInvitation> getOpenInvitationsByUser(@ApiParam(value = "The ID of the Synapse user.",required=true) @PathVariable("id") String id,@ApiParam(value = "the maximum number of invitations to return.", defaultValue = "10") @Valid @RequestParam(value = "limit", required = false, defaultValue="10") Integer limit,@ApiParam(value = "the starting index of the returned results.", defaultValue = "0") @Valid @RequestParam(value = "offset", required = false, defaultValue="0") Integer offset,@ApiParam(value = "the ID of the Team extending the invitations") @Valid @RequestParam(value = "teamId", required = false) String teamId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"effectiveSchema\" : \"...\", \"results\" : [ { \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"expiresOn\" : \"...\", \"id\" : \"...\", \"inviteeEmail\" : \"...\", \"inviteeId\" : \"...\", \"message\" : \"...\", \"teamId\" : \"...\" }, { \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"expiresOn\" : \"...\", \"id\" : \"...\", \"inviteeEmail\" : \"...\", \"inviteeId\" : \"...\", \"message\" : \"...\", \"teamId\" : \"...\" } ], \"totalNumberOfResults\" : 12345 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{id}/openRequest : Retrieve the open requests submitted by a user, optionally filtering by the Team. 
     * Retrieve the open requests submitted by a user, optionally filtering by the Team. An request is only open if it has not expired and if the requester has not been added the Team. Note:  The &#39;id&#39; in the URI must be the same ID as that of the authenticated user issuing the request. 
     *
     * @param id The ID of the Synapse user. (required)
     * @param limit the maximum number of requests to return (optional, default to 10)
     * @param offset the starting index of the returned results. (optional, default to 0)
     * @param teamId ID of a Synapse Team. (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Retrieve the open requests submitted by a user, optionally filtering by the Team. ", nickname = "getOpenRequestsByUser", notes = "Retrieve the open requests submitted by a user, optionally filtering by the Team. An request is only open if it has not expired and if the requester has not been added the Team. Note:  The 'id' in the URI must be the same ID as that of the authenticated user issuing the request. ", response = PaginatedResultsOfMembershipRequest.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Membership Request Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PaginatedResultsOfMembershipRequest.class) })
    @GetMapping(
        value = "/user/{id}/openRequest",
        produces = { "application/json" }
    )
    default ResponseEntity<PaginatedResultsOfMembershipRequest> getOpenRequestsByUser(@ApiParam(value = "The ID of the Synapse user.",required=true) @PathVariable("id") String id,@ApiParam(value = "the maximum number of requests to return", defaultValue = "10") @Valid @RequestParam(value = "limit", required = false, defaultValue="10") Integer limit,@Min(0)@ApiParam(value = "the starting index of the returned results.", defaultValue = "0") @Valid @RequestParam(value = "offset", required = false, defaultValue="0") Integer offset,@ApiParam(value = "ID of a Synapse Team.") @Valid @RequestParam(value = "teamId", required = false) String teamId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"effectiveSchema\" : \"...\", \"results\" : [ { \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"expiresOn\" : \"...\", \"id\" : \"...\", \"message\" : \"...\", \"teamId\" : \"...\", \"userId\" : \"...\" }, { \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"expiresOn\" : \"...\", \"id\" : \"...\", \"message\" : \"...\", \"teamId\" : \"...\", \"userId\" : \"...\" } ], \"totalNumberOfResults\" : 12345 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{id}/certifiedUserPassingRecord : Retrieve the Passing Record on the User Certification test for the given user. 
     * Retrieve the Passing Record on the User Certification test for the given user. 
     *
     * @param id The ID of the Synapse user. (required)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Retrieve the Passing Record on the User Certification test for the given user. ", nickname = "getPassingRecord", notes = "Retrieve the Passing Record on the User Certification test for the given user. ", response = PassingRecord.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Certified User Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PassingRecord.class) })
    @GetMapping(
        value = "/user/{id}/certifiedUserPassingRecord",
        produces = { "application/json" }
    )
    default ResponseEntity<PassingRecord> getPassingRecord(@ApiParam(value = "The ID of the Synapse user.",required=true) @PathVariable("id") String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"corrections\" : [ { \"isCorrect\" : true, \"question\" : { \"concreteType\" : \"...\", \"docLink\" : \"...\", \"helpText\" : \"...\", \"prompt\" : \"...\", \"questionIndex\" : 12345, \"reference\" : { } }, \"response\" : { \"concreteType\" : \"...\", \"questionIndex\" : 12345 } }, { \"isCorrect\" : true, \"question\" : { \"concreteType\" : \"...\", \"docLink\" : \"...\", \"helpText\" : \"...\", \"prompt\" : \"...\", \"questionIndex\" : 12345, \"reference\" : { } }, \"response\" : { \"concreteType\" : \"...\", \"questionIndex\" : 12345 } } ], \"passed\" : true, \"passedOn\" : \"...\", \"quizId\" : 12345, \"responseId\" : 12345, \"score\" : 12345, \"userId\" : \"...\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{id}/team/id : Retrieve a paginated list of IDs of Teams to which the given user belongs.
     * Retrieve a paginated list of IDs of Teams to which the given user belongs. If sorting is desired, both sort and ascending must be specified. If they are omitted, results are not sorted. 
     *
     * @param id The ID of the Synapse user. (required)
     * @param ascending the direction of sort: true for ascending, and false for descending (optional)
     * @param nextPageToken controls pagination (optional)
     * @param sort the field to sort the team IDs on. Available options &lt;a href&#x3D;\&quot;${org.sagebionetworks.repo.model.TeamSortOrder}\&quot;&gt;TeamSortOrder&lt;/a&gt;  (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Retrieve a paginated list of IDs of Teams to which the given user belongs.", nickname = "getTeamIdsByMember", notes = "Retrieve a paginated list of IDs of Teams to which the given user belongs. If sorting is desired, both sort and ascending must be specified. If they are omitted, results are not sorted. ", response = PaginatedTeamIds.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Team Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PaginatedTeamIds.class) })
    @GetMapping(
        value = "/user/{id}/team/id",
        produces = { "application/json" }
    )
    default ResponseEntity<PaginatedTeamIds> getTeamIdsByMember(@ApiParam(value = "The ID of the Synapse user.",required=true) @PathVariable("id") String id,@ApiParam(value = "the direction of sort: true for ascending, and false for descending") @Valid @RequestParam(value = "ascending", required = false) Boolean ascending,@ApiParam(value = "controls pagination") @Valid @RequestParam(value = "nextPageToken", required = false) String nextPageToken,@ApiParam(value = "the field to sort the team IDs on. Available options <a href=\"${org.sagebionetworks.repo.model.TeamSortOrder}\">TeamSortOrder</a> ", allowableValues = "TEAM_NAME") @Valid @RequestParam(value = "sort", required = false) String sort) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"nextPageToken\" : \"...\", \"teamIds\" : [ \"...\", \"...\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{id}/team : Retrieve a paginated list of Teams to which the given user belongs.
     * Retrieve a paginated list of Teams to which the given user belongs.
     *
     * @param id The ID of the Synapse user. (required)
     * @param limit the maximum number of Teams to return (default 10) (optional, default to 10)
     * @param offset the starting index of the returned results (default 0) (optional, default to 0)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Retrieve a paginated list of Teams to which the given user belongs.", nickname = "getTeamsByMember", notes = "Retrieve a paginated list of Teams to which the given user belongs.", response = PaginatedResultsOfTeam.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Team Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PaginatedResultsOfTeam.class) })
    @GetMapping(
        value = "/user/{id}/team",
        produces = { "application/json" }
    )
    default ResponseEntity<PaginatedResultsOfTeam> getTeamsByMember(@ApiParam(value = "The ID of the Synapse user.",required=true) @PathVariable("id") String id,@ApiParam(value = "the maximum number of Teams to return (default 10)", defaultValue = "10") @Valid @RequestParam(value = "limit", required = false, defaultValue="10") Integer limit,@Min(0)@ApiParam(value = "the starting index of the returned results (default 0)", defaultValue = "0") @Valid @RequestParam(value = "offset", required = false, defaultValue="0") Integer offset) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"results\" : [ { \"canPublicJoin\" : true, \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"description\" : \"...\", \"etag\" : \"...\", \"icon\" : \"...\", \"id\" : \"...\", \"modifiedBy\" : \"...\", \"modifiedOn\" : \"...\", \"name\" : \"...\" }, { \"canPublicJoin\" : true, \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"description\" : \"...\", \"etag\" : \"...\", \"icon\" : \"...\", \"id\" : \"...\", \"modifiedBy\" : \"...\", \"modifiedOn\" : \"...\", \"name\" : \"...\" } ], \"totalNumberOfResults\" : 12345 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{id}/bundle : Get the user bundle of a specified user.
     * Get the user bundle of a specified user. &lt;p&gt;&lt;b&gt;Note:&lt;/b&gt; Private fields (e.g. \&quot;rStudioUrl\&quot;) are omitted unless the requester is the profile owner or an administrator.&lt;/p&gt; 
     *
     * @param id The ID of the Synapse user. (required)
     * @param mask integer flag defining which components to include in the bundle &lt;p&gt; This integer is used as a bit-string of flags to specify which parts to include in the UserBundle. The mask is defined as follows: &lt;ul&gt; &lt;li&gt; UserProfile  &#x3D; 0x1 &lt;/li&gt; &lt;li&gt; ORCID  &#x3D; 0x2 &lt;/li&gt; &lt;li&gt; VerificationSubmission &#x3D; 0x4 &lt;/li&gt; &lt;li&gt; Is Certified &#x3D; 0x8 &lt;/li&gt; &lt;li&gt; Is Verified  &#x3D; 0x10 &lt;/li&gt; &lt;li&gt; Is ACT Member &#x3D; 0x20 &lt;/li&gt; &lt;/ul&gt; &lt;/p&gt;  (required)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Get the user bundle of a specified user.", nickname = "getUserBundleByOwnerId", notes = "Get the user bundle of a specified user. <p><b>Note:</b> Private fields (e.g. \"rStudioUrl\") are omitted unless the requester is the profile owner or an administrator.</p> ", response = UserBundle.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "User Profile Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserBundle.class) })
    @GetMapping(
        value = "/user/{id}/bundle",
        produces = { "application/json" }
    )
    default ResponseEntity<UserBundle> getUserBundleByOwnerId(@ApiParam(value = "The ID of the Synapse user.",required=true) @PathVariable("id") String id,@NotNull @ApiParam(value = "integer flag defining which components to include in the bundle <p> This integer is used as a bit-string of flags to specify which parts to include in the UserBundle. The mask is defined as follows: <ul> <li> UserProfile  = 0x1 </li> <li> ORCID  = 0x2 </li> <li> VerificationSubmission = 0x4 </li> <li> Is Certified = 0x8 </li> <li> Is Verified  = 0x10 </li> <li> Is ACT Member = 0x20 </li> </ul> </p> ", required = true) @Valid @RequestParam(value = "mask", required = true) String mask) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"ORCID\" : \"...\", \"isACTMember\" : true, \"isCertified\" : true, \"isVerified\" : true, \"userId\" : \"...\", \"userProfile\" : { \"RStudioUrl\" : \"...\", \"company\" : \"...\", \"createdOn\" : \"...\", \"displayName\" : \"...\", \"email\" : \"...\", \"emails\" : [ \"...\", \"...\" ], \"etag\" : \"...\", \"firstName\" : \"...\", \"industry\" : \"...\", \"lastName\" : \"...\", \"location\" : \"...\", \"notificationSettings\" : { \"markEmailedMessagesAsRead\" : true, \"sendEmailNotifications\" : true }, \"openIds\" : [ \"...\", \"...\" ], \"ownerId\" : \"...\", \"position\" : \"...\", \"preferences\" : [ { \"concreteType\" : \"...\", \"name\" : \"...\" }, { \"concreteType\" : \"...\", \"name\" : \"...\" } ], \"profilePicureFileHandleId\" : \"...\", \"summary\" : \"...\", \"teamName\" : \"...\", \"url\" : \"...\", \"userName\" : \"...\" }, \"verificationSubmission\" : { \"attachments\" : [ { \"fileName\" : \"...\", \"id\" : \"...\" }, { \"fileName\" : \"...\", \"id\" : \"...\" } ], \"company\" : \"...\", \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"emails\" : [ \"...\", \"...\" ], \"firstName\" : \"...\", \"id\" : \"...\", \"lastName\" : \"...\", \"location\" : \"...\", \"notificationEmail\" : \"...\", \"orcid\" : \"...\", \"stateHistory\" : [ { \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"notes\" : \"...\", \"reason\" : \"...\", \"state\" : \"SUSPENDED\" }, { \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"notes\" : \"...\", \"reason\" : \"...\", \"state\" : \"REJECTED\" } ] } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user : Get all publicly available.
     * Get all publicly available &lt;a href&#x3D;\&quot;${org.sagebionetworks.repo.model.UserProfile}\&quot;&gt;UserProfile&lt;/a&gt; data in the system 
     *
     * @param ascending Used to indicate whether the sort direction is ascending or not. (optional, default to true)
     * @param limit Limits the number of items that will be fetched for this page  (optional, default to 100)
     * @param offset The offset index determines where this page will start from. An index of 0 is the first item. (optional, default to 0)
     * @param sort Used to indicate upon which field(s) to sort. (optional)
     * @param body Get all publicly available &lt;a href&#x3D;\&quot;${org.sagebionetworks.repo.model.UserProfile}\&quot;&gt;UserProfile&lt;/a&gt; data in the system  (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Get all publicly available.", nickname = "getUserProfilesPaginated", notes = "Get all publicly available <a href=\"${org.sagebionetworks.repo.model.UserProfile}\">UserProfile</a> data in the system ", response = PaginatedResultsOfUserProfile.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "User Profile Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PaginatedResultsOfUserProfile.class) })
    @GetMapping(
        value = "/user",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PaginatedResultsOfUserProfile> getUserProfilesPaginated(@ApiParam(value = "Used to indicate whether the sort direction is ascending or not.", defaultValue = "true") @Valid @RequestParam(value = "ascending", required = false, defaultValue="true") Boolean ascending,@ApiParam(value = "Limits the number of items that will be fetched for this page ", defaultValue = "100") @Valid @RequestParam(value = "limit", required = false, defaultValue="100") Integer limit,@ApiParam(value = "The offset index determines where this page will start from. An index of 0 is the first item.", defaultValue = "0") @Valid @RequestParam(value = "offset", required = false, defaultValue="0") Integer offset,@ApiParam(value = "Used to indicate upon which field(s) to sort.") @Valid @RequestParam(value = "sort", required = false) String sort,@ApiParam(value = "Get all publicly available <a href=\"${org.sagebionetworks.repo.model.UserProfile}\">UserProfile</a> data in the system "  )  @Valid @RequestBody(required = false) Object body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"results\" : [ { \"RStudioUrl\" : \"...\", \"company\" : \"...\", \"createdOn\" : \"...\", \"displayName\" : \"...\", \"email\" : \"...\", \"emails\" : [ \"...\", \"...\" ], \"etag\" : \"...\", \"firstName\" : \"...\", \"industry\" : \"...\", \"lastName\" : \"...\", \"location\" : \"...\", \"notificationSettings\" : { \"markEmailedMessagesAsRead\" : true, \"sendEmailNotifications\" : true }, \"openIds\" : [ \"...\", \"...\" ], \"ownerId\" : \"...\", \"position\" : \"...\", \"preferences\" : [ { \"concreteType\" : \"...\", \"name\" : \"...\" }, { \"concreteType\" : \"...\", \"name\" : \"...\" } ], \"profilePicureFileHandleId\" : \"...\", \"summary\" : \"...\", \"teamName\" : \"...\", \"url\" : \"...\", \"userName\" : \"...\" }, { \"RStudioUrl\" : \"...\", \"company\" : \"...\", \"createdOn\" : \"...\", \"displayName\" : \"...\", \"email\" : \"...\", \"emails\" : [ \"...\", \"...\" ], \"etag\" : \"...\", \"firstName\" : \"...\", \"industry\" : \"...\", \"lastName\" : \"...\", \"location\" : \"...\", \"notificationSettings\" : { \"markEmailedMessagesAsRead\" : true, \"sendEmailNotifications\" : true }, \"openIds\" : [ \"...\", \"...\" ], \"ownerId\" : \"...\", \"position\" : \"...\", \"preferences\" : [ { \"concreteType\" : \"...\", \"name\" : \"...\" }, { \"concreteType\" : \"...\", \"name\" : \"...\" } ], \"profilePicureFileHandleId\" : \"...\", \"summary\" : \"...\", \"teamName\" : \"...\", \"url\" : \"...\", \"userName\" : \"...\" } ], \"totalNumberOfResults\" : 12345 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /user/{id}/memberList : Returns the TeamMember info for a user and a given list of Team IDs.
     * Returns the TeamMember info for a user and a given list of Team IDs. Not Found status is returned if the user ID is invalid, any of the Team IDs are invalid, or the user is not in any of the given teams. 
     *
     * @param id The ID of the Synapse user. (required)
     * @param idList Team IDs (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Returns the TeamMember info for a user and a given list of Team IDs.", nickname = "listTeamMembersGivenUserandTeamList", notes = "Returns the TeamMember info for a user and a given list of Team IDs. Not Found status is returned if the user ID is invalid, any of the Team IDs are invalid, or the user is not in any of the given teams. ", response = ListWrapperOfTeamMember.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Team Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ListWrapperOfTeamMember.class) })
    @PostMapping(
        value = "/user/{id}/memberList",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ListWrapperOfTeamMember> listTeamMembersGivenUserandTeamList(@ApiParam(value = "The ID of the Synapse user.",required=true) @PathVariable("id") String id,@ApiParam(value = "Team IDs"  )  @Valid @RequestBody(required = false) IdList idList) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"list\" : [ { \"isAdmin\" : true, \"member\" : { \"displayName\" : \"...\", \"email\" : \"...\", \"firstName\" : \"...\", \"isIndividual\" : true, \"lastName\" : \"...\", \"ownerId\" : \"...\", \"userName\" : \"...\" }, \"teamId\" : \"...\" }, { \"isAdmin\" : true, \"member\" : { \"displayName\" : \"...\", \"email\" : \"...\", \"firstName\" : \"...\", \"isIndividual\" : true, \"lastName\" : \"...\", \"ownerId\" : \"...\", \"userName\" : \"...\" }, \"teamId\" : \"...\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /user/{id}/certificationStatus : Set certification status
     * Setting certification status.
     *
     * @param id The ID of the Synapse user. (required)
     * @return Success (status code 204)
     *         or Success (status code 410)
     */
    @ApiOperation(value = "Set certification status", nickname = "setUserCertificationStatus", notes = "Setting certification status.", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Certified User Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Success"),
        @ApiResponse(code = 410, message = "Success") })
    @PutMapping(
        value = "/user/{id}/certificationStatus"
    )
    default ResponseEntity<Void> setUserCertificationStatus(@ApiParam(value = "The ID of the Synapse user.",required=true) @PathVariable("id") String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
