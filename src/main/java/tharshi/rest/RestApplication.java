package tharshi.rest;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tharshi.rest.entities.User;
import tharshi.rest.model.GithubUser;

@Slf4j
@SpringBootApplication
public class RestApplication {

    @Bean
    public Logger getLogger() {
        return log;
    }


    public static void main(String[] args) {
        log.info("Before Starting application");
        SpringApplication.run(RestApplication.class, args);
        log.debug("Starting my application in debug with {} args", args.length);
        log.info("Starting my application with {} args.", args.length);

        var user = new User();
        user.setName("ljlj");
        log.info("user   j" + user);

        val githubUser = GithubUser.builder()
                .login("ljklkjl")
                .name("ljlkjl")
                .build();
        log.info("khk" + githubUser);

    }

}
