package com.kinhoLisboa.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kinhoLisboa.dslist.dto.GameListDto;
import com.kinhoLisboa.dslist.dto.GameMinDto;
import com.kinhoLisboa.dslist.service.GameListService;
import com.kinhoLisboa.dslist.service.GameService;

@RequestMapping("/lists")
@RestController
public class GameListController {
	
	@Autowired
	private GameListService service;
	@Autowired
	private GameService services;
	
	@GetMapping
	public List<GameListDto> findAll(){
		List<GameListDto> result =	service.findAll();
		return result;
		
	}
	@GetMapping("/{listId}/games")
	public List<GameMinDto> findByList(@PathVariable Long listId){
		List<GameMinDto> result = services.findByList(listId);
		return result;

	}
}
