package io.github.chriszhong.common.b;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Christopher Zhong
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(TestApp.class)
public class SomeAutoConfigurationTest {

    @Test
    public void test1() throws Exception {
        new SomeAutoConfiguration();
    }

    @Test
    public void test2() throws Exception {

    }

}
