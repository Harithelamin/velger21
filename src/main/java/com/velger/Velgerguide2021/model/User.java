package com.velger.Velgerguide2021.model;

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
    private String username;
    private String password;
    private String gender;
    private Date birthday;
    private String email;
    private String mobileNo;
    private String homePhone;
    private String fax;
    private String comment;

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
