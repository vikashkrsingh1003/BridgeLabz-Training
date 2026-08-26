package com.fundoonotesapp.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ReminderRequest {

    @NotNull(message = "Reminder date and time is required")
    @Future(message = "Reminder must be a future date and time")
    private LocalDateTime reminderAt;
}