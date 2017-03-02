package com.kennywoo.config;

import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * Created by kennywoo on 2017/3/1.
 */
//@Configuration
public class MyConfiguration {

//    @Bean
    public HttpMessageConverters customConverters() {
        HttpMessageConverter<?> additional = null;
        HttpMessageConverter<?> another = null;

        // ...

        return new HttpMessageConverters(additional, another);
    }

}
