package com.coc.game.dao;

import com.coc.game.pojo.COCCharacter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterDao extends CrudRepository<COCCharacter, String> {
}