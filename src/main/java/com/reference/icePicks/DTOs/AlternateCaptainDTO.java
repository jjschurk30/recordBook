package com.reference.icePicks.DTOs;

import lombok.Data;

import java.util.List;

@Data
public class AlternateCaptainDTO {

    private List<PlayerDTO> player;

    private int years;
}
