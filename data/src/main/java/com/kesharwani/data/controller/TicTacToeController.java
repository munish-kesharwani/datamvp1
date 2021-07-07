package com.kesharwani.data.controller;

import com.kesharwani.data.model.TicTacToeGame;
import com.kesharwani.data.services.TicTacToeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicTacToeController {

    @Autowired
    TicTacToeService myService;

    @GetMapping("/games")
    private List<TicTacToeGame> getAllGames()
    {
        return myService.getAllGames();
    }

    @GetMapping("/games/{id}")
    private TicTacToeGame getGameById(@PathVariable("id") long id)
    {
        return myService.getGameById(id);
    }

    @DeleteMapping("/games/{id}")
    private void deleteGameById(@PathVariable("id") long id)
    {
        myService.deleteGameById(id);
    }

    @PostMapping("/games")
    private long saveGame(@RequestBody TicTacToeGame game)
    {
        myService.newOrUpdate(game);
        return game.getGameID();
    }

}
