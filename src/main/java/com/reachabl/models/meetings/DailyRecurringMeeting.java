package com.reachabl.models.meetings;

import java.time.LocalDate;

public class DailyRecurringMeeting extends AbstractRecurringMeeting {
    public DailyRecurringMeeting(RepeatType repeatType, int repeatEvery, LocalDate endDate, int afterTime) {
        super(repeatType, repeatEvery, endDate, afterTime);
    }

    @Override
    protected LocalDate nextOccurrence(LocalDate current) {
        return current.plusDays(super.getRepeatEvery());
    }
}
