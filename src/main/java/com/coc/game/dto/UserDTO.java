package com.coc.game.dto;

import com.coc.game.pojo.COCCharacter;


import java.util.List;

public class UserDTO {
    private Long id;
    private String userName;
    private String email;
    private String password;
    private String mobile;
    private List<COCCharacter> characters;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<COCCharacter> getCharacters() {
        return characters;
    }

    public void setCharacters(List<COCCharacter> characters) {
        this.characters = characters;
    }
}
