package com.kinhoLisboa.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kinhoLisboa.dslist.domain.Game;
import com.kinhoLisboa.dslist.dto.GameDetalhadoDto;
import com.kinhoLisboa.dslist.dto.GameMinDto;
import com.kinhoLisboa.dslist.projection.GameMinProjection;
import com.kinhoLisboa.dslist.repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDetalhadoDto findById (Long id) {
		
		Game game = gameRepository.findById(id).get();
		return new GameDetalhadoDto(game);
		
	}
	@Transactional(readOnly = true)
	public List<GameMinDto> buscar (){
		List<Game> resultado = gameRepository.findAll();
		return resultado.stream().map(x -> new GameMinDto(x)).toList();
		
	}
	@Transactional(readOnly = true)
	public List<GameMinDto> findByList (Long listId){
		List<GameMinProjection> resultado = gameRepository.searchByList(listId);
		return resultado.stream().map(x -> new GameMinDto(x)).toList();
		
	}

}
