package com.houarizegai.tenniskata.model.dto;

import com.houarizegai.tenniskata.model.Player;

public record GameScoreDto(Player firstPlayer, Player secondPlayer, String score) {
}
