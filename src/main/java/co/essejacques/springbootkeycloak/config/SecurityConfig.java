package co.essejacques.springbootkeycloak.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;


/**
 * Author  : essejacques.co
 * Date    : 02/03/2023 23:42
 * Project : spring-boot-keycloak
 */
@Configuration
public class SecurityConfig extends WebSecurityConfiguration {

    public void configure(HttpSecurity http ) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().cors().and()
                .csrf().disable()
                .oauth2ResourceServer().jwt();
    }

}
