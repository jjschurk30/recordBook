package com.reference.icePicks.service;

import com.reference.icePicks.DTOs.PlayerDTO;
import com.reference.icePicks.DTOs.GoalieDTO;

import java.util.List;


public interface PlayerService {
    PlayerDTO createPlayerCatalog(PlayerDTO playerDTO);

    PlayerDTO retrievePlayerCatalogInfo(String lastName);

    GoalieDTO createGoalieCatalog(GoalieDTO goalieDTO);

    GoalieDTO retrieveGoalieCatalogInfo(String lastName);

    List<PlayerDTO> retrievePlayers(Long playerId);

    List<GoalieDTO> retrieveGoalies(Long goalieId);

}
