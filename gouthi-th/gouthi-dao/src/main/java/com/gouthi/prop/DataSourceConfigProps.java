package com.gouthi.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Lu.Bing on 2017/2/27.
 * in com.gouthi.prop
 * by Lu.Bing
 * on 2017/2/27
 */
@ConfigurationProperties(prefix = DataSourceConfigProps.PREFIX, ignoreUnknownFields = false)
public class DataSourceConfigProps {
    final static String PREFIX="jdbc";

    private String type;

    private String driver;

    private String url;

    private String username;

    private String password;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DataSourceConfigProps{" +
                "type='" + type + '\'' +
                ", driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
