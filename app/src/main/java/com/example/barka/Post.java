package com.example.barka;

import java.io.File;

public class Post
{
    private String description;
    private String category;
    private String owner;
    private String location;
    private Boolean isFree;

    public Post(String description, String category, String owner, String location, Boolean isFree) {
        this.description = description;
        this.category = category;
        this.owner = owner;
        this.location = location;
        this.isFree = isFree;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getFree() {
        return isFree;
    }

    public void setFree(Boolean free) {
        isFree = free;
    }
}
