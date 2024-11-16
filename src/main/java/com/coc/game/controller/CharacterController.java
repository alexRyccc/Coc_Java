package com.coc.game.controller;

import com.coc.game.pojo.COCCharacter;
import com.coc.game.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/character")
public class CharacterController {

    @Autowired
    private CharacterService characterService;
    @GetMapping("/hh")
    public String hh() {
        return "hello";
    }

    @PostMapping("/add")
    public String addCharacter(@RequestBody COCCharacter character) {
        return characterService.addCharacter(character);
    }

    @PutMapping("/update")
    public String updateCharacter(@RequestBody COCCharacter character, @RequestParam Long userId) {
        return characterService.updateCharacter(character, userId);
    }
}