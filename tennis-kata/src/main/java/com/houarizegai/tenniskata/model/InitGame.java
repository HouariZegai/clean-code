package com.houarizegai.tenniskata.model;

import javax.validation.constraints.NotBlank;

public record InitGame(
        @NotBlank(message = "First player name is required")
        String firstPlayerName,

        @NotBlank(message = "Second player name is required")
        String secondPlayerName
) {
}
