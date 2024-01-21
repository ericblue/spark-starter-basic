package com.ericblue.spark.starter.config;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Application configuration model")
public class AppConfiguration {

    @ApiModelProperty(value = "Application version", required = true)
    private String appVersion;

    @ApiModelProperty(value = "Location of static files", required = true)
    private String staticFileLocation;

    @ApiModelProperty(value = "WebSocket endpoint location")
    private String webSocketLocation;

    @ApiModelProperty(value = "HTTP port", required = true)
    private Integer httpPort;

    @ApiModelProperty(value = "Whether to cache templates", required = true)
    private Boolean cacheTemplates;

    @ApiModelProperty(value = "Application environment", allowableValues = "DEV, TEST, PRODUCTION")
    private AppEnvironment environment;


    public AppConfiguration() {
        this.staticFileLocation = "/public";
        this.httpPort = 4567;
        this.cacheTemplates = true;
    }

    public String getStaticFileLocation() {
        return staticFileLocation;
    }

    public void setStaticFileLocation(String staticFileLocation) {
        this.staticFileLocation = staticFileLocation;
    }

    public Integer getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
    }

    public Boolean getCacheTemplates() {
        return cacheTemplates;
    }

    public void setCacheTemplates(Boolean cacheTemplates) {
        this.cacheTemplates = cacheTemplates;
    }

    public String getWebSocketLocation() {
        return webSocketLocation;
    }

    public void setWebSocketLocation(String webSocketLocation) {
        this.webSocketLocation = webSocketLocation;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public AppEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(AppEnvironment environment) {
        this.environment = environment;
    }

}
