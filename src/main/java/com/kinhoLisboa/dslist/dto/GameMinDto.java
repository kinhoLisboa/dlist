package com.kinhoLisboa.dslist.dto;

import com.kinhoLisboa.dslist.domain.Game;
import com.kinhoLisboa.dslist.projection.GameMinProjection;

import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor
public class GameMinDto {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDto(Game entity) {
		this.id= entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}

	public GameMinDto(GameMinProjection projection) {
		this.id= projection.getId();
		this.title = projection.getTitle();
		this.year = projection.getYear();
		this.imgUrl = projection.getImgUrl();
		this.shortDescription = projection.getShortDercription();	

	}
}
