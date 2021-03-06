package com.ljl.note.collection.support;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

@ImportResource(locations = {
		"classpath*:applicationContext-dubbo.xml"
})
@EnableDubboConfiguration
@EnableAsync
@SpringBootApplication
public class SupportApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SupportApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SupportApplication.class, args);
	}

}
