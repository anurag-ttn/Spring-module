package com.example.demo.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "mydatabase")
@Component
public class PropertiesConfig {

    private String url,port,key;

    public String getUrl() {
        return url;
    }

    public String getPort() {
        return port;
    }

    public String getKey() {
        return key;
    }


    public void setUrl(String url) {
        this.url = url;
    }
    public void setPort(String port) {
        this.port = port;
    }
    public void setKey(String key) {
        this.key=key;
    }
}
