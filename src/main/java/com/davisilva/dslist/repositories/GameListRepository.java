package com.davisilva.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davisilva.dslist.entities.Game;
import com.davisilva.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
