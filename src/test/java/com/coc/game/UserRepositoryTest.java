//package com.coc.game;
//
//import com.coc.game.dao.CharacterDao;
//import com.coc.game.dao.UserDao;
//import com.coc.game.pojo.Character;
//import com.coc.game.pojo.User;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.Arrays;
//
//@SpringBootTest
//public class UserRepositoryTest {
//
//    @Autowired
//    private UserDao userDao;
//
//    @Autowired
//    private CharacterDao characterDao;
//
//    @Test
//    public void testInsertUsersAndCharacters() {
//        // 创建用户
//        User user1 = new User();
//        user1.setUserName("user1");
//        user1.setEmail("user1@example.com");
//        user1.setPassword("password1");
//        user1.setMobile("1234567890");
//
//        User user2 = new User();
//        user2.setUserName("user2");
//        user2.setEmail("user2@example.com");
//        user2.setPassword("password2");
//        user2.setMobile("0987654321");
//
//        // 保存用户
//        userDao.saveAll(Arrays.asList(user1, user2));
//
//        // 创建角色
//        Character character1 = new Character();
//        character1.setCharacterId("char1");
//        character1.setName("Character One");
//        character1.setCharacterClass("Warrior");
//        character1.setLevel(10);
//        character1.setUser(user1);
//
//        Character character2 = new Character();
//        character2.setCharacterId("char2");
//        character2.setName("Character Two");
//        character2.setCharacterClass("Mage");
//        character2.setLevel(15);
//        character2.setUser(user1);
//
//        Character character3 = new Character();
//        character3.setCharacterId("char3");
//        character3.setName("Character Three");
//        character3.setCharacterClass("Rogue");
//        character3.setLevel(20);
//        character3.setUser(user2);
//
//        // 保存角色
//        characterDao.saveAll(Arrays.asList(character1, character2, character3));
//    }
//}