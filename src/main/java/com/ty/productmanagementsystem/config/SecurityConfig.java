//package com.ty.productmanagementsystem.config;
//
//import org.aspectj.weaver.patterns.AndAnnotationTypePattern;
//import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
//import org.springframework.security.config.annotation.authentication.configurers.provisioning.UserDetailsManagerConfigurer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter   {
//	
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication()
//		.withUser("Admin")
//		.password("ADMIN")
//		.roles("Admin")
//		.and()
//		.withUser("Employee")
//		.password("EMPLOYEE")
//		.roles("Employee");
//	}
//	
//	
//	@Bean
//	public PasswordEncoder getPasswordEncoder() {
//		
//		return NoOpPasswordEncoder.getInstance();
//	}
//	
//		
//	@Override
//		protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//		.antMatchers("/Admin").hasRole("Admin")
//		.antMatchers("/Employee").hasAnyRole("User","Employee")
//		.antMatchers("/").permitAll()
//		.and().formLogin();
//		}	
// 
//}
