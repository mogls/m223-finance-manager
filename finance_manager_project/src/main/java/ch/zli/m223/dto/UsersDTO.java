package ch.zli.m223.dto;

import ch.zli.m223.model.Users;

public class UsersDTO {
    public String username;
    public String email;
    public String password;

    public UsersDTO(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public UsersDTO(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public UsersDTO(Users user) {
        this.username = user.getName();
        this.email = user.getEmail();
        this.password = user.getPasswordHash();
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
