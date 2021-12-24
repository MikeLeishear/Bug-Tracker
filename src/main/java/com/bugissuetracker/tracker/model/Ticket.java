package com.bugissuetracker.tracker.model;

import java.util.Set;

public class Ticket {
    private String title;
    private String description;
    private Integer id;
    //owner/filer is specified by a user ID number
    private Integer owner;
    private Integer filer;

    public Ticket() {
    }

    public Ticket(String title, String description, Integer id, Integer owner, Integer filer) {
        this.title = title;
        this.description = description;
        this.id = id;
        this.owner = owner;
        this.filer = filer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public Integer getFiler() {
        return filer;
    }

    public void setFiler(Integer filer) {
        this.filer = filer;
    }
}
