package com.example.Example_51_1.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;
import java.util.Objects;

public class User {

    @NotBlank
    @Size(min = 3, max = 8)
    private String user;

    @NotBlank
    @Size(min = 3, max = 8)
    private String password;

    List<Authorities> permissions;

    public User(String name, String password) {
        this.user = name;
        this.password = password;
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

    public List<Authorities> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Authorities> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(this.user, user.user) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, password);
    }

}
