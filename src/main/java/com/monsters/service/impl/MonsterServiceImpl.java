package com.monsters.service.impl;

import com.monsters.entity.Monster;
import com.monsters.exception.MonsterNotFoundException;
import com.monsters.repository.MonsterRepository;
import com.monsters.service.MonsterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MonsterServiceImpl implements MonsterService {

    private final MonsterRepository repo;
    @Override
    public List<Monster> findMonsters() {
        return repo.findAll();
    }

    @Override
    public Monster saveMonster(Monster monster) {
        return repo.save(monster);
    }

    @Override
    public Monster findMonsterById(Integer id) {
        if(repo.findById(id).isEmpty())
            throw new MonsterNotFoundException("Id ["+id+"] requested not found!");

        return repo.findById(id).get();
    }

    @Override
    public Monster updateMonster(Integer id, Monster monster) {

        if(repo.findById(id).isPresent()) {

            Monster updMonster = new Monster();
            updMonster.setId(id);
            updMonster.setName(monster.getName());
            updMonster.setDescription(monster.getDescription());
            updMonster.setHabitat(monster.getHabitat());
            updMonster.setDiet(monster.getDiet());

            return repo.save(updMonster);
        }
        throw new MonsterNotFoundException("Id ["+id+"] requested not found!");
    }

    @Override
    public List<Monster> findMonsterByName(String name) {
        return repo.findAllMonsterByName(name);
    }

    @Override
    public String deleteMonster(Integer id) {
        if(repo.findById(id).isEmpty())
            throw new MonsterNotFoundException("Id ["+id+"] requested not found!");

        repo.deleteById(id);
        return "Monster Deleted Successfully";
    }
}
