# Spring Security Use



Spring Security 6文档

https://docs.spring.io/spring-security/reference/index.html



```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```



## 原生

添加依赖后 访问接口时 会自动跳转到自带的登录界面 密码在控制台

默认使用session

<img src="https://cdn.jsdelivr.net/gh/twtsuif/picture/twtsuif2023-04-05/9a13714c13edeb64521dd79e155fd405--7fa7--image-20230405140218879.png" alt="image-20230405140218879" style="zoom: 67%;" />



## 简单配置

```java
@Configuration
public class SecuritySimpleConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authorize) -> authorize
                        .anyRequest().authenticated()
                )
                .httpBasic(withDefaults())
                .formLogin(withDefaults());
        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);
    }
}
```

