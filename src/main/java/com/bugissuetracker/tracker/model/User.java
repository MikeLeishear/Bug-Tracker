package com.bugissuetracker.tracker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username;
    private String email;
    private Set<Ticket> ownedTickets;
    private Set<Ticket> filedTickets;


    //JPA requires a no args constructor
    public User() {
    }

    public User(Integer id, String username, String email, Set<Ticket> ownedTickets, Set<Ticket> filedTickets) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.ownedTickets = ownedTickets;
        this.filedTickets = filedTickets;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Ticket> getOwnedTickets() {
        return ownedTickets;
    }

    public void setOwnedTickets(Set<Ticket> ownedTickets) {
        this.ownedTickets = ownedTickets;
    }

    public Set<Ticket> getFiledTickets() {
        return filedTickets;
    }

    public void setFiledTickets(Set<Ticket> filedTickets) {
        this.filedTickets = filedTickets;
    }
}
