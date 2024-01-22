package com.devsuperior.camiladslist.services;

import com.devsuperior.camiladslist.dto.GameListDTO;
import com.devsuperior.camiladslist.entities.GameList;
import com.devsuperior.camiladslist.repositories.GameListRepository;
import com.devsuperior.camiladslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }

}

