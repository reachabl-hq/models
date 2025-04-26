package com.reachabl.models.webinar;

import com.reachabl.models.meetings.AbstractRecurringMeeting;
import com.reachabl.models.meetings.RepeatType;

import java.time.LocalDate;

public class MonthlyByDayOfMonthRecurringWebinar extends AbstractRecurringWebinar {
    private int day;
    public MonthlyByDayOfMonthRecurringWebinar() {
    }

    public MonthlyByDayOfMonthRecurringWebinar(WebinarRepeatType repeatType, int repeatEvery, LocalDate endDate, int afterTime) {
        super(repeatType, repeatEvery, endDate, afterTime);
    }

    public MonthlyByDayOfMonthRecurringWebinar(WebinarRepeatType repeatType, int repeatEvery, LocalDate endDate, int afterTime, int day) {
        super(repeatType, repeatEvery, endDate, afterTime);
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
