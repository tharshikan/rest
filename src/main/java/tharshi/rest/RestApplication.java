package tharshi.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestApplication {
    static final Logger log =
            LoggerFactory.getLogger(RestApplication.class);

    @Bean
    public Logger getLogger() {
        return log;
    }


    public static void main(String[] args) {
        log.info("Before Starting application");
        SpringApplication.run(RestApplication.class, args);
        log.debug("Starting my application in debug with {} args", args.length);
        log.info("Starting my application with {} args.", args.length);
    }

}
