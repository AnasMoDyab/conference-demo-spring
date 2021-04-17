package com.example.pluralsight.repositories;

import com.example.pluralsight.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {


}
