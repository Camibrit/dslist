package com.devsuperior.camiladslist.repositories;

import com.devsuperior.camiladslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
