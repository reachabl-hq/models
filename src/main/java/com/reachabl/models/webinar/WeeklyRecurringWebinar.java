package com.reachabl.models.webinar;

import com.reachabl.models.meetings.RepeatType;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeeklyRecurringWebinar extends AbstractRecurringWebinar {

    private DayOfWeek repeatOn;

    public WeeklyRecurringWebinar(WebinarRepeatType repeatType, int repeatEvery, LocalDate endDate, int afterTime, DayOfWeek repeatOn) {
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
