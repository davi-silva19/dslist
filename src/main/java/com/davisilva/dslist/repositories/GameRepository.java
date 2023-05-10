package com.davisilva.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davisilva.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
