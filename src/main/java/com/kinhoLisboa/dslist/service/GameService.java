package com.kinhoLisboa.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kinhoLisboa.dslist.dto.GameMinDto;
import com.kinhoLisboa.dslist.repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDto> buscar (){
		var resultado = gameRepository.findAll();
		return resultado.stream().map(x -> new GameMinDto(x)).toList();
		
	}

}
