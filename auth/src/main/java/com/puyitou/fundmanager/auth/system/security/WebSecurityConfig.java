package com.puyitou.fundmanager.auth.system.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private PytAuthenticationProvider pytAuthenticationProvider;
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(pytAuthenticationProvider);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
        http
	        .httpBasic().and()
	        .authorizeRequests()
	        .anyRequest().authenticated()
	        .and()
	        .formLogin()
//	        .loginPage("/login")
	        .permitAll()
	        .and()
	        .logout()
	        .permitAll()
	        .and()
	        .csrf().disable();
	}
	
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
    
}
