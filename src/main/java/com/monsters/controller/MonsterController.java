package com.monsters.controller;

import java.util.List;

import com.monsters.entity.Monster;
import com.monsters.service.MonsterService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/halloween-challenge")
@RequiredArgsConstructor
public class MonsterController {

    private final MonsterService service;

    @GetMapping("/monsters")
    public List<Monster> findMonsters(){
        return service.findMonsters();
    }

    @PostMapping("/monster")
    public Monster saveMonster(@RequestBody Monster monster) {
        return service.saveMonster(monster);
    }

    @GetMapping("/monster/{id}")
    public Monster findMonsterById(@PathVariable("id") Integer id) {
        return service.findMonsterById(id);
    }

    @GetMapping("/monster")
    public List<Monster> getMonsterByName(@RequestParam("name") String name) {
        return service.findMonsterByName(name);
    }

    @PutMapping("/upd-monster/{id}")
    public Monster updateMonster(@PathVariable("id") Integer id, @RequestBody Monster monster) {
        return service.updateMonster(id, monster);
    }

    @DeleteMapping("/dlt-monster/{id}")
    public String deleteMonsterById(@PathVariable("id") Integer id) {
        return service.deleteMonster(id);
    }
}
