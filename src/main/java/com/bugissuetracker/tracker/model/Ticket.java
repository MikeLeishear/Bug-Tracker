package com.bugissuetracker.tracker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;
    private String description;
    //owner/filer is specified by a user ID number
    private Integer owner;
    private Integer filer;

    //JPA requires no arg initializer
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        return id != null ? id.equals(ticket.id) : ticket.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
