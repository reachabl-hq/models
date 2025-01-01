package com.reachabl.models.meetings;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MonthlyByDayOfWeekRecurringMeeting extends AbstractRecurringMeeting {

    private DayOfWeek dayOfWeek;

    /**
     * 0 means first in the month
     * 1 means second in the month
     * -1 means last in the month
     */
    private int index;

    public MonthlyByDayOfWeekRecurringMeeting() {
    }

    public MonthlyByDayOfWeekRecurringMeeting(RepeatType repeatType, int repeatEvery, LocalDate endDate, int afterTime) {
        super(repeatType, repeatEvery, endDate, afterTime);
    }

    public MonthlyByDayOfWeekRecurringMeeting(RepeatType repeatType, int repeatEvery, LocalDate endDate, int afterTime, DayOfWeek dayOfWeek) {
        super(repeatType, repeatEvery, endDate, afterTime);
        this.dayOfWeek = dayOfWeek;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
