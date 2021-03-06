/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.MessageRecipientSet;
import org.openapitools.model.MessageStatus;
import org.openapitools.model.MessageToUser;
import org.openapitools.model.PaginatedResultsOfMessageBundle;
import org.openapitools.model.PaginatedResultsOfMessageToUser;
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
@Api(value = "message", description = "the message API")
public interface MessageApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /message : Send a message
     * Sends a message.  The \&quot;fileHandleId\&quot; field should point to a plain text file containing the body of the message. The file should be uploaded prior to this call.  The \&quot;recipients\&quot; field should hold a set of IDs corresponding to the recipients of the message.  All other fields are optional, including the \&quot;subject\&quot; field.  To chain messages together into a conversation, specify the message you are replying to via the \&quot;inReplyTo\&quot; field.  See the MessageToUser, MessageContent, and MessageRecipientSet schema for more information.  In most cases, message delivery is asynchronous to message creation.  i.e. It may take several seconds for a message to appear in a user&#39;s inbox.  Notes:  Unauthorized delivery, such as messaging a team you are not affiliated with, will result in a bounce message being sent to your email.  There are limits on the number of message recipients you can specify (50) and the rate at which you can send messages (10 per minute).  Neither these restrictions, nor the restriction that you can&#39;&#39;t message a Team with which you are unaffiliated, apply if you are a member of the Trusted Message Senders Team. 
     *
     * @param messageToUser  (optional)
     * @return Success (status code 201)
     */
    @ApiOperation(value = "Send a message", nickname = "createMessage", notes = "Sends a message.  The \"fileHandleId\" field should point to a plain text file containing the body of the message. The file should be uploaded prior to this call.  The \"recipients\" field should hold a set of IDs corresponding to the recipients of the message.  All other fields are optional, including the \"subject\" field.  To chain messages together into a conversation, specify the message you are replying to via the \"inReplyTo\" field.  See the MessageToUser, MessageContent, and MessageRecipientSet schema for more information.  In most cases, message delivery is asynchronous to message creation.  i.e. It may take several seconds for a message to appear in a user's inbox.  Notes:  Unauthorized delivery, such as messaging a team you are not affiliated with, will result in a bounce message being sent to your email.  There are limits on the number of message recipients you can specify (50) and the rate at which you can send messages (10 per minute).  Neither these restrictions, nor the restriction that you can''t message a Team with which you are unaffiliated, apply if you are a member of the Trusted Message Senders Team. ", response = MessageToUser.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Message Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Success", response = MessageToUser.class) })
    @PostMapping(
        value = "/message",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<MessageToUser> createMessage(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) MessageToUser messageToUser) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"bcc\" : \"...\", \"cc\" : \"...\", \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"fileHandleId\" : \"...\", \"id\" : \"...\", \"inReplyTo\" : \"...\", \"inReplyToRoot\" : \"...\", \"isNotificationMessage\" : true, \"notificationUnsubscribeEndpoint\" : \"...\", \"recipients\" : [ \"...\", \"...\" ], \"subject\" : \"...\", \"to\" : \"...\", \"userProfileSettingEndpoint\" : \"...\", \"withProfileSettingLink\" : true, \"withUnsubscribeLink\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /message/{messageId}/file : Get the actual URL of the file associated with the message.
     * Get the actual URL of the file associated with the message  Note: This call will result in a HTTP temporary redirect (307), to the actual file URL if the caller meets all of the download requirements. 
     *
     * @param messageId The ID of the message. (required)
     * @param redirect When set to false, the URL will be returned as text/plain instead of redirecting.&#39;  (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Get the actual URL of the file associated with the message.", nickname = "fileRedirectForMessage", notes = "Get the actual URL of the file associated with the message  Note: This call will result in a HTTP temporary redirect (307), to the actual file URL if the caller meets all of the download requirements. ", response = String.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Message Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = String.class) })
    @GetMapping(
        value = "/message/{messageId}/file",
        produces = { "application/json" }
    )
    default ResponseEntity<String> fileRedirectForMessage(@ApiParam(value = "The ID of the message.",required=true) @PathVariable("messageId") String messageId,@ApiParam(value = "When set to false, the URL will be returned as text/plain instead of redirecting.' ") @Valid @RequestParam(value = "redirect", required = false) Boolean redirect) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /message/{messageId}/forward : Forwards a message to the specified set of recipients.
     * Forwards a message to the specified set of recipients.  The authenticated user must be either the sender or receiver of the forwarded message. 
     *
     * @param messageId The ID of the message. (required)
     * @param messageRecipientSet  (optional)
     * @return Success (status code 201)
     */
    @ApiOperation(value = "Forwards a message to the specified set of recipients.", nickname = "forwardMessage", notes = "Forwards a message to the specified set of recipients.  The authenticated user must be either the sender or receiver of the forwarded message. ", response = MessageToUser.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Message Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Success", response = MessageToUser.class) })
    @PostMapping(
        value = "/message/{messageId}/forward",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<MessageToUser> forwardMessage(@ApiParam(value = "The ID of the message.",required=true) @PathVariable("messageId") String messageId,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) MessageRecipientSet messageRecipientSet) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"bcc\" : \"...\", \"cc\" : \"...\", \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"fileHandleId\" : \"...\", \"id\" : \"...\", \"inReplyTo\" : \"...\", \"inReplyToRoot\" : \"...\", \"isNotificationMessage\" : true, \"notificationUnsubscribeEndpoint\" : \"...\", \"recipients\" : [ \"...\", \"...\" ], \"subject\" : \"...\", \"to\" : \"...\", \"userProfileSettingEndpoint\" : \"...\", \"withProfileSettingLink\" : true, \"withUnsubscribeLink\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /message/{messageId}/conversation : Retrieves messages belonging to the same thread as the given message.
     * Retrieves messages belonging to the same thread as the given message.  The current authenticated user will be either the sender or receiver of all returned messages.  By default, the most recent messages are returned first. To flip the ordering, set the \&quot;descending\&quot; parameter to \&quot;false\&quot;. To change the way the messages are ordered, set the \&quot;orderBy\&quot; parameter to either \&quot;SEND_DATE\&quot; or \&quot;SUBJECT\&quot;. 
     *
     * @param messageId The ID of the message. (required)
     * @param descending If true, returns the most recent messages. (optional, default to true)
     * @param limit Limits the number of messages (optional, default to 10)
     * @param offset The offset index determines where this page will start from. (optional, default to 0)
     * @param orderBy Order by (optional, default to SEND_DATE)
     * @param body  (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Retrieves messages belonging to the same thread as the given message.", nickname = "getConversation", notes = "Retrieves messages belonging to the same thread as the given message.  The current authenticated user will be either the sender or receiver of all returned messages.  By default, the most recent messages are returned first. To flip the ordering, set the \"descending\" parameter to \"false\". To change the way the messages are ordered, set the \"orderBy\" parameter to either \"SEND_DATE\" or \"SUBJECT\". ", response = PaginatedResultsOfMessageToUser.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Message Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PaginatedResultsOfMessageToUser.class) })
    @GetMapping(
        value = "/message/{messageId}/conversation",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PaginatedResultsOfMessageToUser> getConversation(@ApiParam(value = "The ID of the message.",required=true) @PathVariable("messageId") String messageId,@ApiParam(value = "If true, returns the most recent messages.", defaultValue = "true") @Valid @RequestParam(value = "descending", required = false, defaultValue="true") Boolean descending,@Min(10)@ApiParam(value = "Limits the number of messages", defaultValue = "10") @Valid @RequestParam(value = "limit", required = false, defaultValue="10") Integer limit,@Min(0)@ApiParam(value = "The offset index determines where this page will start from.", defaultValue = "0") @Valid @RequestParam(value = "offset", required = false, defaultValue="0") Integer offset,@ApiParam(value = "Order by", allowableValues = "SUBJECT, SEND_DATE", defaultValue = "SEND_DATE") @Valid @RequestParam(value = "orderBy", required = false, defaultValue="SEND_DATE") String orderBy,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Object body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"results\" : [ { \"bcc\" : \"...\", \"cc\" : \"...\", \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"fileHandleId\" : \"...\", \"id\" : \"...\", \"inReplyTo\" : \"...\", \"inReplyToRoot\" : \"...\", \"isNotificationMessage\" : true, \"notificationUnsubscribeEndpoint\" : \"...\", \"recipients\" : [ \"...\", \"...\" ], \"subject\" : \"...\", \"to\" : \"...\", \"userProfileSettingEndpoint\" : \"...\", \"withProfileSettingLink\" : true, \"withUnsubscribeLink\" : true }, { \"bcc\" : \"...\", \"cc\" : \"...\", \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"fileHandleId\" : \"...\", \"id\" : \"...\", \"inReplyTo\" : \"...\", \"inReplyToRoot\" : \"...\", \"isNotificationMessage\" : true, \"notificationUnsubscribeEndpoint\" : \"...\", \"recipients\" : [ \"...\", \"...\" ], \"subject\" : \"...\", \"to\" : \"...\", \"userProfileSettingEndpoint\" : \"...\", \"withProfileSettingLink\" : true, \"withUnsubscribeLink\" : true } ], \"totalNumberOfResults\" : 12345 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /message/inbox : Retrieves the current authenticated user&#39;s inbox.
     * Retrieves the current authenticated user&#39;s inbox.  It may take several seconds for a message to appear in the inbox after creation. By default, the most recent unread messages are returned first. To flip the ordering, set the \&quot;descending\&quot; parameter to \&quot;false\&quot;. To change the way the messages are ordered, set the \&quot;orderBy\&quot; parameter to either \&quot;SEND_DATE\&quot; or \&quot;SUBJECT\&quot;.  To retrieve messages that have been read or archived, set the \&quot;inboxFilter\&quot; parameter to a comma-separated list of values defined in the MessageStatusType 
     *
     * @param descending By default, returns most recent unread messages. (optional, default to true)
     * @param inboxFilter Inbox filter (optional, default to &quot;UNREAD&quot;)
     * @param limit Limits the number of messages (optional, default to 10)
     * @param offset The offset index determines where this page will start from. (optional, default to 0)
     * @param orderBy Order by (optional, default to SEND_DATE)
     * @param body  (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Retrieves the current authenticated user's inbox.", nickname = "getInbox", notes = "Retrieves the current authenticated user's inbox.  It may take several seconds for a message to appear in the inbox after creation. By default, the most recent unread messages are returned first. To flip the ordering, set the \"descending\" parameter to \"false\". To change the way the messages are ordered, set the \"orderBy\" parameter to either \"SEND_DATE\" or \"SUBJECT\".  To retrieve messages that have been read or archived, set the \"inboxFilter\" parameter to a comma-separated list of values defined in the MessageStatusType ", response = PaginatedResultsOfMessageBundle.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Message Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PaginatedResultsOfMessageBundle.class) })
    @GetMapping(
        value = "/message/inbox",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PaginatedResultsOfMessageBundle> getInbox(@ApiParam(value = "By default, returns most recent unread messages.", defaultValue = "true") @Valid @RequestParam(value = "descending", required = false, defaultValue="true") Boolean descending,@ApiParam(value = "Inbox filter", defaultValue = "UNREAD") @Valid @RequestParam(value = "inboxFilter", required = false, defaultValue="UNREAD") String inboxFilter,@Min(10)@ApiParam(value = "Limits the number of messages", defaultValue = "10") @Valid @RequestParam(value = "limit", required = false, defaultValue="10") Integer limit,@Min(0)@ApiParam(value = "The offset index determines where this page will start from.", defaultValue = "0") @Valid @RequestParam(value = "offset", required = false, defaultValue="0") Integer offset,@ApiParam(value = "Order by", allowableValues = "SUBJECT, SEND_DATE", defaultValue = "SEND_DATE") @Valid @RequestParam(value = "orderBy", required = false, defaultValue="SEND_DATE") String orderBy,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Object body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"effectiveSchema\" : \"...\", \"results\" : [ { \"message\" : { \"bcc\" : \"...\", \"cc\" : \"...\", \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"fileHandleId\" : \"...\", \"id\" : \"...\", \"inReplyTo\" : \"...\", \"inReplyToRoot\" : \"...\", \"isNotificationMessage\" : true, \"notificationUnsubscribeEndpoint\" : \"...\", \"recipients\" : [ \"...\", \"...\" ], \"subject\" : \"...\", \"to\" : \"...\", \"userProfileSettingEndpoint\" : \"...\", \"withProfileSettingLink\" : true, \"withUnsubscribeLink\" : true }, \"status\" : { \"messageId\" : \"...\", \"recipientId\" : \"...\", \"status\" : \"ARCHIVED\" } }, { \"message\" : { \"bcc\" : \"...\", \"cc\" : \"...\", \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"fileHandleId\" : \"...\", \"id\" : \"...\", \"inReplyTo\" : \"...\", \"inReplyToRoot\" : \"...\", \"isNotificationMessage\" : true, \"notificationUnsubscribeEndpoint\" : \"...\", \"recipients\" : [ \"...\", \"...\" ], \"subject\" : \"...\", \"to\" : \"...\", \"userProfileSettingEndpoint\" : \"...\", \"withProfileSettingLink\" : true, \"withUnsubscribeLink\" : true }, \"status\" : { \"messageId\" : \"...\", \"recipientId\" : \"...\", \"status\" : \"ARCHIVED\" } } ], \"totalNumberOfResults\" : 12345 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /message/{messageId} : Get the specified message.
     * Fetches the specified message.  The authenticated user must be either the sender or receiver of the message. 
     *
     * @param messageId The ID of the message. (required)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Get the specified message.", nickname = "getMessage", notes = "Fetches the specified message.  The authenticated user must be either the sender or receiver of the message. ", response = MessageToUser.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Message Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = MessageToUser.class) })
    @GetMapping(
        value = "/message/{messageId}",
        produces = { "application/json" }
    )
    default ResponseEntity<MessageToUser> getMessage(@ApiParam(value = "The ID of the message.",required=true) @PathVariable("messageId") String messageId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"bcc\" : \"...\", \"cc\" : \"...\", \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"fileHandleId\" : \"...\", \"id\" : \"...\", \"inReplyTo\" : \"...\", \"inReplyToRoot\" : \"...\", \"isNotificationMessage\" : true, \"notificationUnsubscribeEndpoint\" : \"...\", \"recipients\" : [ \"...\", \"...\" ], \"subject\" : \"...\", \"to\" : \"...\", \"userProfileSettingEndpoint\" : \"...\", \"withProfileSettingLink\" : true, \"withUnsubscribeLink\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /message/outbox : Retrieves the current authenticated user&#39;s outbox.
     * Retrieves the current authenticated user&#39;&#39;s outbox.  By default, the most recent messages are returned first. To flip the ordering, set the \&quot;descending\&quot; parameter to \&quot;false\&quot;. To change the way the messages are ordered, set the \&quot;orderBy\&quot; parameter to either \&quot;SEND_DATE\&quot; or \&quot;SUBJECT\&quot;. 
     *
     * @param descending By default, the most recent message are returned. (optional, default to true)
     * @param limit Limits the number of messages (optional, default to 10)
     * @param offset The offset index determines where this page will start from. (optional, default to 0)
     * @param orderBy Order by (optional, default to SEND_DATE)
     * @param body  (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Retrieves the current authenticated user's outbox.", nickname = "getOutbox", notes = "Retrieves the current authenticated user''s outbox.  By default, the most recent messages are returned first. To flip the ordering, set the \"descending\" parameter to \"false\". To change the way the messages are ordered, set the \"orderBy\" parameter to either \"SEND_DATE\" or \"SUBJECT\". ", response = PaginatedResultsOfMessageToUser.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Message Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PaginatedResultsOfMessageToUser.class) })
    @GetMapping(
        value = "/message/outbox",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PaginatedResultsOfMessageToUser> getOutbox(@ApiParam(value = "By default, the most recent message are returned.", defaultValue = "true") @Valid @RequestParam(value = "descending", required = false, defaultValue="true") Boolean descending,@Min(10)@ApiParam(value = "Limits the number of messages", defaultValue = "10") @Valid @RequestParam(value = "limit", required = false, defaultValue="10") Integer limit,@Min(0)@ApiParam(value = "The offset index determines where this page will start from.", defaultValue = "0") @Valid @RequestParam(value = "offset", required = false, defaultValue="0") Integer offset,@ApiParam(value = "Order by", allowableValues = "SUBJECT, SEND_DATE", defaultValue = "SEND_DATE") @Valid @RequestParam(value = "orderBy", required = false, defaultValue="SEND_DATE") String orderBy,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Object body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"results\" : [ { \"bcc\" : \"...\", \"cc\" : \"...\", \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"fileHandleId\" : \"...\", \"id\" : \"...\", \"inReplyTo\" : \"...\", \"inReplyToRoot\" : \"...\", \"isNotificationMessage\" : true, \"notificationUnsubscribeEndpoint\" : \"...\", \"recipients\" : [ \"...\", \"...\" ], \"subject\" : \"...\", \"to\" : \"...\", \"userProfileSettingEndpoint\" : \"...\", \"withProfileSettingLink\" : true, \"withUnsubscribeLink\" : true }, { \"bcc\" : \"...\", \"cc\" : \"...\", \"createdBy\" : \"...\", \"createdOn\" : \"...\", \"fileHandleId\" : \"...\", \"id\" : \"...\", \"inReplyTo\" : \"...\", \"inReplyToRoot\" : \"...\", \"isNotificationMessage\" : true, \"notificationUnsubscribeEndpoint\" : \"...\", \"recipients\" : [ \"...\", \"...\" ], \"subject\" : \"...\", \"to\" : \"...\", \"userProfileSettingEndpoint\" : \"...\", \"withProfileSettingLink\" : true, \"withUnsubscribeLink\" : true } ], \"totalNumberOfResults\" : 12345 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /message/status : Updates the current status of a message relative to the current authenticated user.
     * Updates the current status of a message relative to the current authenticated user.  Note: the \&quot;recipientId\&quot; field of the request body will be ignored.&#39; 
     *
     * @param messageStatus  (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Updates the current status of a message relative to the current authenticated user.", nickname = "updateMessageStatus", notes = "Updates the current status of a message relative to the current authenticated user.  Note: the \"recipientId\" field of the request body will be ignored.' ", response = String.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "Message Services", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = String.class) })
    @PutMapping(
        value = "/message/status",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<String> updateMessageStatus(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) MessageStatus messageStatus) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
