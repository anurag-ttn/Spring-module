package com.example.demo;

import com.example.demo.configuration.PropertiesConfig;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;



@RestController
public class Main {
    @Autowired
    private PropertiesConfig properties;

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    @GetMapping("/readproperties")
    public PropertiesConfig getprops(){
        String url = properties.getUrl();
        String port = properties.getPort();
        String key = properties.getKey();
        LOGGER.info(url+" "+port+" "+key);
        return properties;
    }

}
