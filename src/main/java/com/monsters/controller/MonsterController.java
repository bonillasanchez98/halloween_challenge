package com.monsters.controller;

import java.util.List;

import com.monsters.entity.Monster;
import com.monsters.service.MonsterService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.data.domain.Page;
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
    @Operation(summary = "Find all monsters")
    public List<Monster> findMonsters(@RequestParam("pageNum") Integer pageNum,
                                      @RequestParam("pageSize") Integer pageSize){
        Page<Monster> page = service.findMonsterWithPaginationAndSorting(pageNum, pageSize, null);
        return page.getContent();
    }

    @PostMapping("/monster")
    public Monster saveMonster(@RequestBody Monster monster) {
        return service.saveMonster(monster);
    }

    @GetMapping("/monster/{id}")
    @Operation(summary = "Find monster by id")
    public Monster findMonsterById(@PathVariable("id") Integer id) {
        return service.findMonsterById(id);
    }

    @GetMapping("/monster")
    @Operation(summary = "Find monsters by name")
    public List<Monster> getMonsterByName(@RequestParam("name") String name) {
        return service.findMonsterByName(name);
    }
    @GetMapping("/pag-and-sort/monsters")
    @Operation(summary = "Find monsters with pagination and sorting")
    public Page<Monster> findMonsterPaginationAndSorting(@RequestParam("pageNum") Integer pageNum,
                                                      @RequestParam("pageSize") Integer pageSize,
                                                      @RequestParam("field") String field) {
        return service.findMonsterWithPaginationAndSorting(pageNum, pageSize, field);
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
