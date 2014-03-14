package com.tngtech.jenkins.notification.endpoints;

import com.tngtech.jenkins.notification.model.BuildInfo;
import org.apache.camel.Body;
import org.apache.camel.Handler;

public interface FeedbackEndpoint {
    @Handler
    void process(@Body BuildInfo buildInfo) throws Exception;
}