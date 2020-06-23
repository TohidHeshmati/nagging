package com.project.nagging.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("default")
public class DefaultConfiguration {

    /**
     * default welcome msg from default config
     */
    private String welcomeMsg = "Hello! this is default welcome message";

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }
}
