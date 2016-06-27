package io.github.chriszhong.common.b;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Christopher Zhong
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(TestApp.class)
public class SomePropertiesTest {

    @Inject
    private SomeProperties properties;

    @Test
    public void test() throws Exception {
        new SomeProperties();
    }

    @Test
    public void testKey1() throws Exception {
        assertThat(properties.getKey1(), is(equalTo("key1")));
    }

    @Test
    public void testKey2() throws Exception {
        assertThat(properties.getKey2(), is(equalTo("key2")));
    }

}
