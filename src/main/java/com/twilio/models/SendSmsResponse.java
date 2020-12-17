package com.twilio.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SendSmsResponse {
    @SerializedName("account_sid")
    @Expose
    public String accountSid;
    @SerializedName("api_version")
    @Expose
    public String apiVersion;
    @SerializedName("body")
    @Expose
    public String body;
    @SerializedName("date_created")
    @Expose
    public String dateCreated;
    @SerializedName("date_sent")
    @Expose
    public String dateSent;
    @SerializedName("date_updated")
    @Expose
    public String dateUpdated;
    @SerializedName("direction")
    @Expose
    public String direction;
    @SerializedName("error_code")
    @Expose
    public Object errorCode;
    @SerializedName("error_message")
    @Expose
    public Object errorMessage;
    @SerializedName("from")
    @Expose
    public String from;
    @SerializedName("messaging_service_sid")
    @Expose
    public String messagingServiceSid;
    @SerializedName("num_media")
    @Expose
    public String numMedia;
    @SerializedName("num_segments")
    @Expose
    public String numSegments;
    @SerializedName("price")
    @Expose
    public Object price;
    @SerializedName("price_unit")
    @Expose
    public Object priceUnit;
    @SerializedName("sid")
    @Expose
    public String sid;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("subresource_uris")
    @Expose
    public SubresourceUris subresourceUris;
    @SerializedName("to")
    @Expose
    public String to;
    @SerializedName("uri")
    @Expose
    public String uri;
}
