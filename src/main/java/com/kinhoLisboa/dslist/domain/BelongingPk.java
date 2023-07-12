package com.kinhoLisboa.dslist.domain;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class BelongingPk {
	
	@ManyToOne
	@JoinColumn(name = "game_id")
	private Game game;
	@ManyToOne
	@JoinColumn(name = "gameList_id")
	private GameList gameList;

	@Override
	public int hashCode() {
		return Objects.hash(game, gameList);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPk other = (BelongingPk) obj;
		return Objects.equals(game, other.game) && Objects.equals(gameList, other.gameList);
	}
	
}
