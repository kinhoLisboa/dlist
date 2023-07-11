package com.kinhoLisboa.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kinhoLisboa.dslist.domain.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
