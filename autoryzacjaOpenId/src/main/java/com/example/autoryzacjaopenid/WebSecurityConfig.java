package com.example.autoryzacjaopenid;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableOAuth2Sso
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.httpBasic().and()
                .authorizeHttpRequests().requestMatchers( "/test1").permitAll()
                .requestMatchers("/test2").authenticated();
                //.anyRequest().hasRole("ADMIN")
/*                .and().formLogin().permitAll()
                .and().logout().permitAll()
                .and().csrf().disable();*/


        //.httpBasic(withDefaults());

        return http.build();
    }
/*    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user = User.withDefaultPasswordEncoder().username("user").password("user").roles("USER").build();
        UserDetails moderator = User.withDefaultPasswordEncoder().username("moderator").password("moderator").roles("MODERATOR").build();
        UserDetails admin = User.withDefaultPasswordEncoder().username("admin").password("admin").roles("ADMIN").build();
        return new InMemoryUserDetailsManager(user,admin);
    }*/
}
