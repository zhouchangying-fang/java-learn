package com.baidu.conf;

import com.baidu.joro.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public User user(){
        return  new User();
    }

}
