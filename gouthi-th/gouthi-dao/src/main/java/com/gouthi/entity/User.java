package com.gouthi.entity;

import java.io.Serializable;

/**
 * Created by Lu.Bing on 2017/2/27.
 * in com.gouthi.entity
 * by Lu.Bing
 * on 2017/2/27
 */
public class User implements Serializable {
    private Long id;

    private String name;

    private String age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
