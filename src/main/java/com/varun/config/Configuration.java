package com.varun.config;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:config.properties", encoding="UTF-8")
public class Configuration {

  @Value("${path}")
  private String path;


  public String getFilePath() {
    return path;
  }


}
