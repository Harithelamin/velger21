package com.velger.Velgerguide2021.model;

import java.util.Date;
import java.util.Objects;

public class Question {
    private String id;
    private String createdBy;
    private Date createdDate;
    private Date modifiedData;
    private Parties parties;
    private String answer;
    private Topic topic;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals(id, question.id) &&
                Objects.equals(createdBy, question.createdBy) &&
                Objects.equals(createdDate, question.createdDate) &&
                Objects.equals(modifiedData, question.modifiedData) &&
                Objects.equals(parties, question.parties) &&
                Objects.equals(answer, question.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdBy, createdDate, modifiedData, parties, answer);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedData() {
        return modifiedData;
    }

    public void setModifiedData(Date modifiedData) {
        this.modifiedData = modifiedData;
    }

    public Parties getParties() {
        return parties;
    }

    public void setParties(Parties parties) {
        this.parties = parties;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id='" + id + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate=" + createdDate +
                ", modifiedData=" + modifiedData +
                ", parties=" + parties +
                ", answer='" + answer + '\'' +
                '}';
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
