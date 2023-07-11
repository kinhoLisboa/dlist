package com.kinhoLisboa.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kinhoLisboa.dslist.dto.GameMinDto;
import com.kinhoLisboa.dslist.service.GameService;

@RestController
@RequestMapping("/games")
public class GameController {
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDto> buscar(){
		List<GameMinDto> result = gameService.buscar();
		return result;
		
	}

}
