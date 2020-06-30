package com.reference.icePicks.DTOs;

import lombok.Data;

import java.util.List;

@Data
public class CaptainDTO {


    private List<PlayerDTO> player;

    private int wins;

    private int losses;

    private int years;
}
