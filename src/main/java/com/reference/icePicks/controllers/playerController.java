package com.reference.icePicks.controllers;

import com.reference.icePicks.DTOs.PlayerDTO;
import com.reference.icePicks.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class playerController {

@Autowired private PlayerService playerService;

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
     public ResponseEntity<PlayerDTO> getPlayer(@RequestBody PlayerDTO playerDTO) {

    return new ResponseEntity<PlayerDTO>(playerService.createPlayerCatalog(playerDTO), HttpStatus.CREATED);
    }



}