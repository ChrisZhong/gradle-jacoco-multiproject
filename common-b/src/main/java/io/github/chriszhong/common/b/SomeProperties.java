package io.github.chriszhong.common.b;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Christopher Zhong
 * @version 1.0
 */
@ConfigurationProperties(prefix = SomeProperties.PREFIX)
public class SomeProperties {
    public static final String PREFIX = "io.github.chriszhong";

    private String key1;
    private String key2;

    public String getKey1() {
        return key1;
    }

    public void setKey1(final String key1) {
        this.key1 = key1;
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(final String key2) {
        this.key2 = key2;
    }
}
