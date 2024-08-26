package com.reachabl.models.meetings;

import java.time.LocalDate;

public class AbstractRecurringMeeting {
    private RepeatType repeatType;

    private int repeatEvery;

    private LocalDate endDate;

    private int afterTime;

    public AbstractRecurringMeeting(RepeatType repeatType, int repeatEvery, LocalDate endDate, int afterTime) {
        this.repeatType = repeatType;
        this.repeatEvery = repeatEvery;
        this.endDate = endDate;
        this.afterTime = afterTime;
    }

    public RepeatType getRepeatType() {
        return repeatType;
    }

    public void setRepeatType(RepeatType repeatType) {
        this.repeatType = repeatType;
    }

    public int getRepeatEvery() {
        return repeatEvery;
    }

    public void setRepeatEvery(int repeatEvery) {
        this.repeatEvery = repeatEvery;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getAfterTime() {
        return afterTime;
    }

    public void setAfterTime(int afterTime) {
        this.afterTime = afterTime;
    }
}
