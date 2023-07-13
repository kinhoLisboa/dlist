package com.kinhoLisboa.dslist.dto;

import com.kinhoLisboa.dslist.domain.GameList;

import lombok.Value;

@Value
public class GameListDto {

	private Long id;
	private String nome;
	
	
	public GameListDto(GameList y) {
		this.id = y.getId();
		this.nome = y.getName();
	}

}
