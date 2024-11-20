package com.example.springweb.Entity;

import java.util.Objects;

public class UserTable {
    private int id;
    private String user;
    private String password;

    @Override
    public String toString() {
        return "UserTable{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserTable userTable = (UserTable) o;
        return id == userTable.id && Objects.equals(user, userTable.user) && Objects.equals(password, userTable.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserTable(int id, String user, String password) {
        this.id = id;
        this.user = user;
        this.password = password;
    }

    public UserTable() {
    }
}
