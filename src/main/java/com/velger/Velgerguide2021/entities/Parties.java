package com.velger.Velgerguide2021.entities;

import java.util.Objects;

public class Parties {
    private String id;
    private String name;
    private String code;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parties parties = (Parties) o;
        return Objects.equals(id, parties.id) &&
                Objects.equals(name, parties.name) &&
                Objects.equals(code, parties.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, code);
    }

    public Parties(String id) {
        this.id = id;
    }

}
