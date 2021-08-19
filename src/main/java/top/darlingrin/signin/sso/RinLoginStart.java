package top.darlingrin.signin.sso;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 自定义启动器
 *
 */
@Slf4j
@SpringBootApplication
public class RinLoginStart extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RinLoginStart.class);
    }

    public static void main(String[] args) {
        log.info("RinProject_Login_Start......");
        log.info("Log_Data_Start......");
        log.info("DataBase_Manager_Start......");
        log.info("String_Context_Part_Start......");
        SpringApplication.run(RinLoginStart.class, args);
        log.info("RinProject_Login_Start Successful....");
    }
}
