package site.moregreen.basic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import site.moregreen.basic.util.interceptor.MenuHandler;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Bean
	public MenuHandler menuHandler() {
		return new MenuHandler();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
//		registry.addInterceptor( userAuthHandler() )
//				.addPathPatterns("/product/**")
//				.addPathPatterns("/topic/**")
//				.addPathPatterns("/user/**")
//				.addPathPatterns("/notice/**")
//				.addPathPatterns("/main")
//				.excludePathPatterns("/user/login");
		
		//메뉴 고정하는 부분
		registry.addInterceptor( menuHandler() )
				.addPathPatterns("/**");
		
	}
	
}
