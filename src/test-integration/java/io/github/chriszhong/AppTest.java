package io.github.chriszhong;

import org.junit.Test;
import org.springframework.boot.test.SpringApplicationConfiguration;

/**
 * @author Christopher Zhong
 * @version 1.0
 */
@SpringApplicationConfiguration(io.github.chriszhong.project.b.App.class)
public class AppTest {

    @Test
    public void test() throws Exception {
        new io.github.chriszhong.project.b.App();
    }

    @Test
    public void testMain() throws Exception {
        final String[] args = {};
        io.github.chriszhong.project.b.App.main(args);
    }

}
