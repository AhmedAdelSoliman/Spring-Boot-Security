package com.ahmed.adel.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
	/*	auth.jdbcAuthentication()
		    .dataSource(dataSource)
		    .withDefaultSchema()
		    .withUser(
		    		User.withUsername("ahmed")
		    		.password("123")
		    		.roles("USER")
		    		
		    		)
		    .withUser(
		    		User.withUsername("mohamed")
		    		.password("123")
		    		.roles("ADMIN")
		    		);*/
		
		
		auth.jdbcAuthentication()
	    .dataSource(dataSource);		
		
	}
	

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
	http.authorizeRequests()
	     .antMatchers("/admin").hasRole("ADMIN")
	     .antMatchers("/user").hasRole("USER")
	     .antMatchers("/").permitAll()
	     .and().formLogin();
	}
	
	
	
	
}
