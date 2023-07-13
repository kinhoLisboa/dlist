package com.kinhoLisboa.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kinhoLisboa.dslist.domain.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
