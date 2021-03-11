package com.velgerguide2021.v21.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Confirmation")
public class Confirmation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PROFILE_ID")
    User userProfile;

    private String confirmationCode;
    private Date confirmationRequest;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MESSAGE_ID")
    private Message message;
    private boolean confirmedByMobile;
    private boolean confirmedByEmail;
    private Date confirmationDate;

    public Confirmation(String confirmationCode, Date confirmationRequest, Message message, boolean confirmedByMobile, boolean confirmedByEmail, Date confirmationDate) {
        this.confirmationCode = confirmationCode;
        this.confirmationRequest = confirmationRequest;
        this.message = message;
        this.confirmedByMobile = confirmedByMobile;
        this.confirmedByEmail = confirmedByEmail;
        this.confirmationDate = confirmationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode;
    }

    public Date getConfirmationRequest() {
        return confirmationRequest;
    }

    public void setConfirmationRequest(Date confirmationRequest) {
        this.confirmationRequest = confirmationRequest;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public boolean isConfirmedByMobile() {
        return confirmedByMobile;
    }

    public void setConfirmedByMobile(boolean confirmedByMobile) {
        this.confirmedByMobile = confirmedByMobile;
    }

    public boolean isConfirmedByEmail() {
        return confirmedByEmail;
    }

    public void setConfirmedByEmail(boolean confirmedByEmail) {
        this.confirmedByEmail = confirmedByEmail;
    }

    public Date getConfirmationDate() {
        return confirmationDate;
    }

    public void setConfirmationDate(Date confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    @Override
    public String toString() {
        return "Confirmation{" +
                "id=" + id +
                ", confirmationCode='" + confirmationCode + '\'' +
                ", confirmationRequest=" + confirmationRequest +
                ", message=" + message +
                ", confirmedByMobile=" + confirmedByMobile +
                ", confirmedByEmail=" + confirmedByEmail +
                ", confirmationDate=" + confirmationDate +
                '}';
    }
}
