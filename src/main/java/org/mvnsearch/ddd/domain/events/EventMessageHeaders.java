package org.mvnsearch.ddd.domain.events;

/**
 * event message headers
 *
 * @author linux_china
 */
public class EventMessageHeaders {
    /**
     * unique ID of the event, used for invocation logging and tracking
     */
    public static final String EVENT_ID = "event-id";
    /**
     * Requiered, identify the unique event, format as class/kind/version
     * apiVersion - Api namespace and version (similar to k8s approach)
     * class - event model sync | async | stream | ..
     * Kind - the event sub-type (e.g. GitHub webhook message)
     */
    public static final String EVENT_TYPE = "event-type";
    /**
     * Requiered if contain a body, the body encoding scheme (e.g. application/json)
     */
    public static final String CONTENT_TYPE = "content-type";
    /**
     * RFC 3339, Timestamp of event creation generated by the client, String with timezone or long timestamp
     */
    public static final String CREATED_AT = "created-at";
    /**
     * the source resource which published the event
     */
    public static final String SOURCE = "source";
    /**
     * the Identity of the origin
     */
    public static final String SOURCE_IDENTITY = "source-identity";
    /**
     * the type of the event source
     */
    public static final String SOURCE_TYPE = "source-type";
    /**
     * the (http) method used in the call
     */
    public static final String METHOD = "method";
    /**
     * the level of logging that the publisher may want to log this specific event (e.g. debug)
     */
    public static final String LOG_LEVEL = "log-level ";
    /**
     * an optional return end-point for completion events
     */
    public static final String RECEIPT_QUEUE = "receipt-queue ";


}
