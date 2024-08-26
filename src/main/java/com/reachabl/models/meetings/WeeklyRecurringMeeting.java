package com.reachabl.models.meetings;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeeklyRecurringMeeting extends AbstractRecurringMeeting{

    private DayOfWeek repeatOn;

    public WeeklyRecurringMeeting(RepeatType repeatType, int repeatEvery, LocalDate endDate, int afterTime, DayOfWeek repeatOn) {
        super(repeatType, repeatEvery, endDate, afterTime);
        this.repeatOn = repeatOn;
    }

    public DayOfWeek getRepeatOn() {
        return repeatOn;
    }

    public void setRepeatOn(DayOfWeek repeatOn) {
        this.repeatOn = repeatOn;
    }
}
