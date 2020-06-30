package com.reference.icePicks.DTOs;

import lombok.Data;


@Data
public class GoalieDTO {

    private Long goalieId;

    private String firstName;

    private String lastName;

    private String position;

    private int number;

    private int gamesPlayed;

    private int wins;

    private int losses;

    private int goals;

    private int assists;

    private int PIM;

    private int shutouts;

    private int minutesPlayed;

    private int goalsAgainst;

    private Double GAA;

    private Double GSAA;

    private int shotsFaced;

    private int saves;

    private Double savePercentage;



}
