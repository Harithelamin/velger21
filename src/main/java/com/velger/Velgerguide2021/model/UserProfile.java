package com.velger.Velgerguide2021.model;

import com.sun.istack.NotNull;
import org.hibernate.envers.Audited;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;

import java.time.OffsetDateTime;
import java.util.Objects;

import static org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME;

public class UserProfile {
    private Integer id;
    private String email;
    private String mobileNo;

    //@Column(name = CREATED_DATE_ENG)
    @DateTimeFormat(iso = DATE_TIME)
    @Audited
    //@JsonProperty(CREATED_DATE)
    private OffsetDateTime createdDate;


    //@Column(name = CREATED_BY_ENG)
    @Audited
    //@JsonProperty(CREATED_BY)
    private String createdBy;


    @NotNull
    @Column(name = "account_non_locked", nullable = false)
    private boolean accountNonLocked = true;

    @Column(name = "enabled")
    @NotNull
    private Boolean enabled = true;

    @Column(name = "last_password_reset_date")
    @DateTimeFormat(iso = DATE_TIME)
    private OffsetDateTime lastPasswordResetDate;

    @Column(unique = true)
    @NotNull
    private String username;

    @Column(name = "password", length = 100)
    @NotNull
    //@Size(min = 1, max = 100)
    private String password;

    @Column(name = "firstname", length = 50)
    //@Size(min = 1, max = 50)
    private String firstname;

    @Column(name = "lastname", length = 50)
    //@Size(min = 1, max = 50)
    private String lastname;

    public UserProfile(Integer id, String email, String mobileNo, OffsetDateTime createdDate, String createdBy, boolean accountNonLocked, Boolean enabled, OffsetDateTime lastPasswordResetDate, String username, String password, String firstname, String lastname) {
        this.id = id;
        this.email = email;
        this.mobileNo = mobileNo;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.accountNonLocked = accountNonLocked;
        this.enabled = enabled;
        this.lastPasswordResetDate = lastPasswordResetDate;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public OffsetDateTime getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }

    public void setLastPasswordResetDate(OffsetDateTime lastPasswordResetDate) {
        this.lastPasswordResetDate = lastPasswordResetDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return accountNonLocked == that.accountNonLocked &&
                Objects.equals(id, that.id) &&
                Objects.equals(email, that.email) &&
                Objects.equals(mobileNo, that.mobileNo) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(enabled, that.enabled) &&
                Objects.equals(lastPasswordResetDate, that.lastPasswordResetDate) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, mobileNo, createdDate, createdBy, accountNonLocked, enabled, lastPasswordResetDate, username, password, firstname, lastname);
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", createdDate=" + createdDate +
                ", createdBy='" + createdBy + '\'' +
                ", accountNonLocked=" + accountNonLocked +
                ", enabled=" + enabled +
                ", lastPasswordResetDate=" + lastPasswordResetDate +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
