package tharshi.rest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tharshi.rest.controller.HomeController;

@SpringBootTest
class RestApplicationTests {

    @Autowired
    HomeController homeController;


    @Test
    @DisplayName("If contexts are loaded")
    void contextLoads() {
        Assertions.assertNotNull(homeController);
    }

}
