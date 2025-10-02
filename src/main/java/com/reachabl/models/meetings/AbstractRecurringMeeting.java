package com.reachabl.models.meetings;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.time.LocalDate;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "repeatType", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = MonthlyByDayOfMonthRecurringMeeting.class, name = "MONTHLY_BY_DAY_OF_MONTH"),
        @JsonSubTypes.Type(value = MonthlyByDayOfWeekRecurringMeeting.class, name = "MONTHLY_BY_DAY_OF_WEEK"),
        @JsonSubTypes.Type(value = WeeklyRecurringMeeting.class, name = "WEEKLY"),
        @JsonSubTypes.Type(value = DailyRecurringMeeting.class, name = "DAILY")
})
public abstract class AbstractRecurringMeeting {
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

    public AbstractRecurringMeeting() {
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

    /**
     * Calculate the next occurrence given the current date.
     */
    protected abstract LocalDate nextOccurrence(LocalDate current);

    /**
     * Determine the calculated end date.
     * Either the provided endDate, or the last occurrence after 'afterTime'.
     */
    public LocalDate calculateEndDate(LocalDate startDate) {
        LocalDate occurrence = startDate;

        // If explicit endDate is provided, use whichever comes first
        if (endDate != null) {
            return endDate;
        }

        // Otherwise, calculate using afterTime
        for (int i = 1; i < afterTime; i++) {
            occurrence = nextOccurrence(occurrence);
        }
        return occurrence;
    }
}
