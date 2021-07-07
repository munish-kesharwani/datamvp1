package com.kesharwani.data.repository;

import com.kesharwani.data.model.TicTacToeGame;
import org.springframework.data.repository.CrudRepository;

public interface TicTacToeGameRepository extends CrudRepository<TicTacToeGame,Long> {
}
