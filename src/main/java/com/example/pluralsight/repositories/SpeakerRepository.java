package com.example.pluralsight.repositories;

import com.example.pluralsight.models.Session;
import com.example.pluralsight.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
