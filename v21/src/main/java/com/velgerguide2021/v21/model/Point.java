package com.velgerguide2021.v21.model;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Point")
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PROFILE_ID")
    User userProfile;

    private Date date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PARTIES_ID")
    private Parties parties;

    private int point;//-1, 0, 1, 2, 3, 4

    public Point(Parties parties) {
        this.date = new Date();
        this.parties = parties;
        this.point= point;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Assessment> assessments = new HashSet<Assessment>();
}
