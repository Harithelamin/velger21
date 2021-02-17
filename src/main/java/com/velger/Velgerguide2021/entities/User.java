package com.velger.Velgerguide2021.entities;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.Objects;

public class User implements UserDetails {
    private Integer id;
    private Date createdDate;
    private String createdBy;
    private String personNo;
    private String gender;
    private Date birthdate;
    private String email;
    private String mobileNo;
    private String homePhone;
    private String fax;
    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonNo() {
        return personNo;
    }

    public void setPersonNo(String personNo) {
        this.personNo = personNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
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

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User(Integer id, Date createdDate, String createdBy, String personNo, String gender, Date birthdate, String email, String mobileNo, String homePhone, String fax, String comment) {
        this.id = id;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.personNo = personNo;
        this.gender = gender;
        this.birthdate = birthdate;
        this.email = email;
        this.mobileNo = mobileNo;
        this.homePhone = homePhone;
        this.fax = fax;
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(personNo, user.personNo) &&
                Objects.equals(gender, user.gender) &&
                Objects.equals(birthdate, user.birthdate) &&
                Objects.equals(email, user.email) &&
                Objects.equals(mobileNo, user.mobileNo) &&
                Objects.equals(homePhone, user.homePhone) &&
                Objects.equals(fax, user.fax) &&
                Objects.equals(comment, user.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, personNo, gender, birthdate, email, mobileNo, homePhone, fax, comment);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", personNo='" + personNo + '\'' +
                ", gender='" + gender + '\'' +
                ", birthdate=" + birthdate +
                ", email='" + email + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", fax='" + fax + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }


}
