/*
 * package com.example.blog.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.oauth2.server.resource.authentication.
 * JwtAuthenticationConverter; import
 * org.springframework.security.oauth2.server.resource.authentication.
 * JwtGrantedAuthoritiesConverter;
 * 
 * @EnableWebSecuritypublic class SecurityConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.authorizeRequests(authorizeRequests -> authorizeRequests
 * .antMatchers("/public/**").permitAll() .anyRequest().authenticated()
 * ).oauth2ResourceServer(oauth2ResourceServer -> oauth2ResourceServer .jwt(jwt
 * -> jwt.jwtAuthenticationConverter(jwtAuthenticationConverter())));
 * 
 * @Bean public JwtAuthenticationConverter jwtAuthenticationConverter() {
 * JwtGrantedAuthoritiesConverter grantedAuthoritiesConverter = new
 * JwtGrantedAuthoritiesConverter();
 * grantedAuthoritiesConverter.setAuthoritiesClaimName("roles");
 * grantedAuthoritiesConverter.setAuthorityPrefix("ROLE_");
 * JwtAuthenticationConverter jwtAuthenticationConverter = new
 * JwtAuthenticationConverter();
 * jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(
 * grantedAuthoritiesConverter); return jwtAuthenticationConverter;    }
 * 
 * }
 */