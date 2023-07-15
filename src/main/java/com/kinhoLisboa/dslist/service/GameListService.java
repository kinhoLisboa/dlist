package com.kinhoLisboa.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kinhoLisboa.dslist.dto.GameListDto;
import com.kinhoLisboa.dslist.projection.GameMinProjection;
import com.kinhoLisboa.dslist.repository.GameListRepository;
import com.kinhoLisboa.dslist.repository.GameRepository;

import jakarta.transaction.Transactional;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public List<GameListDto> findAll(){
		var result = gameListRepository.findAll();
		
		return result.stream().map( y -> new GameListDto(y)).toList();
		}
	@Transactional
	public void move( Long listId,int sourceIndex, int destinatoionIndex) {
		List<GameMinProjection> list = gameRepository.searchByList(listId);
		GameMinProjection obj = list.remove(sourceIndex);
		list.add(destinatoionIndex,obj);
		
    	int min = sourceIndex < destinatoionIndex ? sourceIndex : destinatoionIndex;
    	int max = sourceIndex < destinatoionIndex ? destinatoionIndex : sourceIndex;
    	
    	for(int i = min; i <= max; i++) {
    		gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
    	}
	}

}
