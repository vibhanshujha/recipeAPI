package com.themechguy.recipeAPI.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("loginCredentials")
public class SignUp {
    private String name;
    private String username;
    private String passphrase;

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    private String profilePhoto;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* public SignUp(String name, String username, String passphrase){
        super();
        this.name=name;
        this.username=username;
        this.passphrase=passphrase;
        this.profilePhoto= profilePhoto;
    }*/

}
