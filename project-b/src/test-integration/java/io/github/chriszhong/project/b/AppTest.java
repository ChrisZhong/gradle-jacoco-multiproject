package io.github.chriszhong.project.b;

import org.junit.Test;
import org.springframework.boot.test.SpringApplicationConfiguration;

/**
 * @author Christopher Zhong
 * @version 1.0
 */
@SpringApplicationConfiguration(App.class)
public class AppTest {

    @Test
    public void test() throws Exception {
        new App();
    }

    @Test
    public void testMain() throws Exception {
        final String[] args = {};
        App.main(args);
    }

}
