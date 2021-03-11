package com.velgerguide2021.v21.model;


import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.List;

@Entity
@Table(name="Test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PROFILE_ID")
    User userProfile;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TOPIC_ID")
    private Topic topic;

    private Date startDate;
    //private List<UserAnswer> userAnswer;
    private boolean complete;
    private Date completedDate;

    public Test() {
    }
}
