package ch.zli.m223.dto;

public class UserCreationDTO {
    public String username;
    public String email;
    public String passwordHash;
    
    public UserCreationDTO(String username, String email, String passwordHash) {
        this.username = username;
        this.email = email;
        this.passwordHash = passwordHash;
    }

}
