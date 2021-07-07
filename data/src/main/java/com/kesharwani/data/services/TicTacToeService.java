package com.kesharwani.data.services;

import com.kesharwani.data.model.TicTacToeGame;
import com.kesharwani.data.repository.TicTacToeGameRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicTacToeService {

    @Autowired
    TicTacToeGameRepository gameRepository;

    public static final Logger logger = LoggerFactory.getLogger(TicTacToeService.class);
    /**
     * getting all the games for listing
     */
    public List<TicTacToeGame> getAllGames()
    {
        List<TicTacToeGame> games = new ArrayList<TicTacToeGame>();
        logger.info("Method getAllGames invoked");
        gameRepository.findAll().forEach(game -> games.add(game));
        return games;
    }

    public TicTacToeGame getGameById(long id)
    {
        logger.info("Method getGameById invoked");
        return gameRepository.findById(id).get();
    }

    public void deleteGameById(long id)
    {
        gameRepository.deleteById(id);
    }

    public void newOrUpdate(TicTacToeGame game)
    {
        gameRepository.save(game);
    }

}
