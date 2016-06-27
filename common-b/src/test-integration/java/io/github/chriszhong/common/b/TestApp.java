package io.github.chriszhong.common.b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author Christopher Zhong
 * @version 1.0
 */
@SpringBootApplication
@Import(SomeAutoConfiguration.class)
public class TestApp {

    public static void main(String[] args) {
        SpringApplication.run(TestApp.class, args);
    }

}
