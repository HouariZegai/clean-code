package com.houarizegai.tenniskata.model.dto;

import javax.validation.constraints.Min;

public record RecordWinDto(
        @Min(value = 0, message = "First player win must be positive")
        int firstPlayerWin,

        @Min(value = 0, message = "Second player win must be positive")
        int secondPlayerWin
) {
}
