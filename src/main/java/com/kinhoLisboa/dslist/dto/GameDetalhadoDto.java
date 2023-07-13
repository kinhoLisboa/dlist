package com.kinhoLisboa.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.kinhoLisboa.dslist.domain.Game;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class GameDetalhadoDto {
	
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public GameDetalhadoDto(Game game) {
		
		BeanUtils.copyProperties(game, this);;
	}

}
