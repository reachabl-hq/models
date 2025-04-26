package com.reachabl.models.webinar;

import com.reachabl.models.meetings.RepeatType;

import java.time.LocalDate;

public class DailyRecurringWebinar extends AbstractRecurringWebinar {
    public DailyRecurringWebinar(WebinarRepeatType repeatType, int repeatEvery, LocalDate endDate, int afterTime) {
        super(repeatType, repeatEvery, endDate, afterTime);
    }
}
