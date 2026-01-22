package com.back.demo.repository;

import com.back.demo.entity.Recompense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecompenseRepository extends JpaRepository<Recompense, Integer> {
}
