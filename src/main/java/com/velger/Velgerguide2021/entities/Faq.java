package com.velger.Velgerguide2021.entities;

import java.util.Date;
import java.util.Objects;

public class Faq {
    private Integer id;
    private String createdBy;
    private String modifiedBy;
    private Date createdDate;
    private Date modifiedDate;
    private String question;
    private String answer;

    public Faq(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faq faq = (Faq) o;
        return Objects.equals(id, faq.id) &&
                Objects.equals(createdBy, faq.createdBy) &&
                Objects.equals(modifiedBy, faq.modifiedBy) &&
                Objects.equals(createdDate, faq.createdDate) &&
                Objects.equals(modifiedDate, faq.modifiedDate) &&
                Objects.equals(question, faq.question) &&
                Objects.equals(answer, faq.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdBy, modifiedBy, createdDate, modifiedDate, question, answer);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
