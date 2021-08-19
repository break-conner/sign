package top.darlingrin.signin.sso.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RinLoginConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index.html").setViewName("RinLogin");
        registry.addViewController("/index").setViewName("RinLogin");
        registry.addViewController("/").setViewName("index");
    }

    @Bean
    public MyLocalResover localeResolver() {
        return new MyLocalResover();
    }

    private static final String[] strp = {"/", "/index", "/index.html", "/asserts/**", "/webjars/**", "/signin","/signup","/static/**"};

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).excludePathPatterns(strp);
    }

}
