package com.monsters.service;

import com.monsters.entity.Monster;

import java.util.List;

public interface MonsterService {

    List<Monster> findMonsters();
    Monster saveMonster(Monster monster);
    Monster findMonsterById(Integer id);
    Monster updateMonster(Integer id, Monster monster);
    String deleteMonster(Integer id);
    List<Monster> findMonsterByName(String name);
}
