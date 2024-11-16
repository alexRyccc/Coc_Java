package com.coc.game.service;

import com.coc.game.dao.CharacterDao;
import com.coc.game.dao.UserDao;
import com.coc.game.pojo.COCCharacter;
import com.coc.game.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    @Autowired
    private CharacterDao characterDao;

    @Autowired
    private UserDao userDao;

    public String addCharacter(COCCharacter character) {
        characterDao.save(character);
        return "Character added successfully!";
    }

    public String updateCharacter(COCCharacter character, Long userId) {
        User user = userDao.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        COCCharacter existingCharacter = characterDao.findById(character.getCharacterId())
                .orElseThrow(() -> new RuntimeException("Character not found"));
        characterDao.save(character);
        return "Character updated successfully!";
    }
}