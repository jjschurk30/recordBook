package com.reference.icePicks.controllers;

import com.reference.icePicks.DTOs.GoalieDTO;
import com.reference.icePicks.DTOs.PlayerDTO;
import com.reference.icePicks.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class playerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping(

            path = "/roster/player/{lastName}",
            produces = MediaType.APPLICATION_JSON_VALUE


    )

    @ResponseBody
    public ResponseEntity<PlayerDTO> getPlayerInfo(@PathVariable("lastName") String lastName) {

        return new ResponseEntity<PlayerDTO>(playerService.retrievePlayerCatalogInfo(lastName), HttpStatus.OK);
    }

    @PostMapping("/roster/player")
    @ResponseBody
    public ResponseEntity<PlayerDTO> catalogPlayer(@RequestBody PlayerDTO playerDTO) {

        return new ResponseEntity<PlayerDTO>(playerService.createPlayerCatalog(playerDTO), HttpStatus.CREATED);
    }


    @GetMapping(

            path = "/roster/player/{lastName}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )

    @ResponseBody
    public ResponseEntity<GoalieDTO> getGoalieInfo(@PathVariable("lastName") String lastName) {

        return new ResponseEntity<GoalieDTO>(playerService.retrieveGoalieCatalogInfo(lastName), HttpStatus.OK);
    }

    @PostMapping("/roster/goalie")
    @ResponseBody

    public ResponseEntity<GoalieDTO> catalogGoalie(@RequestBody GoalieDTO goalieDTO) {

        return new ResponseEntity<GoalieDTO>(playerService.createGoalieCatalog(goalieDTO), HttpStatus.CREATED);
    }

    @GetMapping(
            path = {
                    "/roster/player/",
                    "/roster/player/{playerId}"
            },
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public ResponseEntity<List<PlayerDTO>> getPlayer(@PathVariable(required = false, name = "playerId") Long playerId) {

        return new ResponseEntity<List<PlayerDTO>>(playerService.retrievePlayers(playerId), HttpStatus.OK);
    }

    @GetMapping(
            path = {
                    "/roster/goalie",
                    "/roster/goalie/{goalieId}"
            },
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public ResponseEntity<List<GoalieDTO>> getGoalie(@PathVariable(required = false, name = "goalieId") Long goalieId) {

        return new ResponseEntity<List<GoalieDTO>>(playerService.retrieveGoalies(goalieId), HttpStatus.OK);
    }


}