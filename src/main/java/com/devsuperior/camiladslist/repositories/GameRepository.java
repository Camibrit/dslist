package com.devsuperior.camiladslist.repositories;
import java.util.List;

import com.devsuperior.camiladslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface GameRepository extends JpaRepository<Game, Long> {
}
