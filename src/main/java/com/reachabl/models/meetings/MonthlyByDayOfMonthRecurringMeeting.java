package com.reachabl.models.meetings;

import java.time.LocalDate;

public class MonthlyByDayOfMonthRecurringMeeting extends AbstractRecurringMeeting {
    private int day;
    public MonthlyByDayOfMonthRecurringMeeting() {
    }

    public MonthlyByDayOfMonthRecurringMeeting(RepeatType repeatType, int repeatEvery, LocalDate endDate, int afterTime) {
        super(repeatType, repeatEvery, endDate, afterTime);
    }

    public MonthlyByDayOfMonthRecurringMeeting(RepeatType repeatType, int repeatEvery, LocalDate endDate, int afterTime, int day) {
        super(repeatType, repeatEvery, endDate, afterTime);
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    protected LocalDate nextOccurrence(LocalDate current) {
        LocalDate nextMonth = current.plusMonths(super.getRepeatEvery());
        int day = this.getDay();

        int lastDay = nextMonth.lengthOfMonth();
        return nextMonth.withDayOfMonth(Math.min(day, lastDay));
    }
}
