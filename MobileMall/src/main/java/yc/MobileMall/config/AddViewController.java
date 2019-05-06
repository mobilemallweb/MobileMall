package yc.MobileMall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import yc.MobileMall.web.MyLocaleResolver;

@Configuration
public class AddViewController implements WebMvcConfigurer{
	@Bean
	public WebMvcConfigurer webMvcAdapter(){
		return new WebMvcConfigurer(){
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("main.html").setViewName("index");

				//test
				registry.addViewController("seccess.html").setViewName("seccess.html");
				
				//addViewController里写什么，拦截什么
				registry.addViewController("/").setViewName("login");
				registry.addViewController("login").setViewName("login");
				registry.addViewController("login.html").setViewName("login");
				registry.addViewController("index").setViewName("index");
				registry.addViewController("index.html").setViewName("index");
				registry.addViewController("index-2.html").setViewName("index-2");
				registry.addViewController("index-3.html").setViewName("index-3");
				registry.addViewController("index-3").setViewName("index-3");
				registry.addViewController("index-4.html").setViewName("index-4.html");
				registry.addViewController("my-account.html").setViewName("my-account");
				registry.addViewController("register.html").setViewName("register.html");
				registry.addViewController("cart.html").setViewName("cart.html");
				registry.addViewController("checkout.html").setViewName("checkout.html");
				registry.addViewController("wishlist.html").setViewName("wishlist.html");
				registry.addViewController("compare.html").setViewName("compare.html");
				registry.addViewController("faqs.html").setViewName("faqs.html");
				registry.addViewController("404.html").setViewName("404.html");
				registry.addViewController("shop-grid.html").setViewName("shop-grid.html");
				registry.addViewController("shop-list.html").setViewName("shop-list.html");
				registry.addViewController("shop-right-sidebar.html").setViewName("shop-right-sidebar.html");
				registry.addViewController("shop-fullwidth.html").setViewName("shop-fullwidth.html");
				registry.addViewController("single-product.html").setViewName("single-product.html");
				registry.addViewController("blog.html").setViewName("blog.html");
				registry.addViewController("blog-left-sidebar.html").setViewName("blog-left-sidebar.html");
				registry.addViewController("blog-right-sidebar.html").setViewName("blog-right-sidebar.html");
				registry.addViewController("blog-details.html").setViewName("blog-details.html");
				registry.addViewController("about.html").setViewName("about.html");
				registry.addViewController("contact.html").setViewName("contact.html");
			}
		};
	}
	
	@Bean
	public LocaleResolver localeResolver(){
		return new MyLocaleResolver();
	}
	
	/*@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }*/
	
}
