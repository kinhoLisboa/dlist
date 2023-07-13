package com.kinhoLisboa.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kinhoLisboa.dslist.dto.GameListDto;
import com.kinhoLisboa.dslist.repository.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	public List<GameListDto> findAll(){
		var result = gameListRepository.findAll();
		
		return result.stream().map( y -> new GameListDto(y)).toList();
		}

}
