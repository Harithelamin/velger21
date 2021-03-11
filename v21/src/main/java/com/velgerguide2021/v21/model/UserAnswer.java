package com.velgerguide2021.v21.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="UserAnswer")
public class UserAnswer {
    @Id
    //@Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TOPIC_ID")
    private Topic topic;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "QUESTION_ID")
    private Question question;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Assessment>assessments;
    private boolean skip;
    private boolean completed;
    private Date completedTime;
    private Date modifiedTime;




}




