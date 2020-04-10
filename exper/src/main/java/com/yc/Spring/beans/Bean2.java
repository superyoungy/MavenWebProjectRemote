package com.yc.Spring.beans;

import org.springframework.stereotype.Component;

@Component(value = "bean2")
public class Bean2 {
    private String id;
    private String name;

    public Bean2(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Bean2() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
