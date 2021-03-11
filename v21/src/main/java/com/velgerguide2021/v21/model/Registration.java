package com.velgerguide2021.v21.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Registration")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PROFILE_ID")
    User userProfile;

    private Date date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CONFIRMATION_ID")
    private Confirmation confirmation;
    private boolean confirmed;

    public Registration(Date date, Confirmation confirmation, boolean confirmed) {
        this.date = date;
        this.confirmation = confirmation;
        this.confirmed = confirmed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Confirmation getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(Confirmation confirmation) {
        this.confirmation = confirmation;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Confirmation> confirmations = new HashSet<Confirmation>();

    @Override
    public String toString() {
        return "Registration{" +
                "id=" + id +
                ", date=" + date +
                ", confirmation=" + confirmation +
                ", confirmed=" + confirmed +
                ", confirmations=" + confirmations +
                '}';
    }
}
