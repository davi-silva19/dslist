package com.davisilva.dslist.dto;

import com.davisilva.dslist.entities.Game;
import com.davisilva.dslist.entities.GameList;

public class GameListDTO {
	
	private Long id;
	private String name;
	
	public GameListDTO() {
		super();
	}

	public GameListDTO(GameList entity) {
		
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
