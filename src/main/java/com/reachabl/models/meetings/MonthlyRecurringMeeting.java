package com.reachabl.models.meetings;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MonthlyRecurringMeeting extends AbstractRecurringMeeting {
    private int day;
    private DayOfWeek dayOfWeek;
    public MonthlyRecurringMeeting(RepeatType repeatType, int repeatEvery, LocalDate endDate, int afterTime) {
        super(repeatType, repeatEvery, endDate, afterTime);
    }

    public MonthlyRecurringMeeting(RepeatType repeatType, int repeatEvery, LocalDate endDate, int afterTime, int day) {
        super(repeatType, repeatEvery, endDate, afterTime);
        this.day = day;
    }

    public MonthlyRecurringMeeting(RepeatType repeatType, int repeatEvery, LocalDate endDate, int afterTime, DayOfWeek dayOfWeek, int day) {
        super(repeatType, repeatEvery, endDate, afterTime);
        this.dayOfWeek = dayOfWeek;
        this.day = day;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
