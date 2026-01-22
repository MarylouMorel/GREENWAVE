package com.back.demo.repository;

import com.back.demo.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface SessionRepository extends JpaRepository<Session, Integer> {

    List<Session> findByDateSession(LocalDate dateSession);

    List<Session> findByStatutSession(String statutSession);
}
