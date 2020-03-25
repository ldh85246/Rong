package com.bit.exam06;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/com/bit/exam06/beans.xml")
public class SpringConfig {

	@Bean(autowire = Autowire.BY_TYPE)
	public WriteArticleServiceImpl ws() {
		return new WriteArticleServiceImpl();
	}
}
