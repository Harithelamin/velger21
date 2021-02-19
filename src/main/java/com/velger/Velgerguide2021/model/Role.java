package com.velger.Velgerguide2021.model;

import org.hibernate.envers.Audited;

import javax.persistence.Column;
import java.util.Objects;

public class Role {
    private Long id;

    @Column(name = "read")
    @Audited
    private Boolean read;


    @Column(name = "create")
    @Audited
    private Boolean create;


    @Column(name = "update")
    @Audited
    private Boolean update;


    @Column(name = "delete")
    @Audited
    private Boolean delete;
    private Boolean active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    public Boolean getCreate() {
        return create;
    }

    public void setCreate(Boolean create) {
        this.create = create;
    }

    public Boolean getUpdate() {
        return update;
    }

    public void setUpdate(Boolean update) {
        this.update = update;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(id, role.id) &&
                Objects.equals(read, role.read) &&
                Objects.equals(create, role.create) &&
                Objects.equals(update, role.update) &&
                Objects.equals(delete, role.delete) &&
                Objects.equals(active, role.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, read, create, update, delete, active);
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", read=" + read +
                ", create=" + create +
                ", update=" + update +
                ", delete=" + delete +
                ", active=" + active +
                '}';
    }
}
