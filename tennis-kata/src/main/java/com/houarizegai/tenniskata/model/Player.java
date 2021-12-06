package com.houarizegai.tenniskata.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Player {

    private String name;
    private int score;
}
