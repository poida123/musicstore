package com.peterchivers.musicstore.entities;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    protected Long id;

    public BaseEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
