package com.monsters.repository;

import com.monsters.entity.Monster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MonsterRepository extends JpaRepository<Monster, Integer> {
    List<Monster> findAllMonsterByName(String name);
}
