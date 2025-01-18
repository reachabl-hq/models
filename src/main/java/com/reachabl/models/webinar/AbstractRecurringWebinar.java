package com.reachabl.models.webinar;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.reachabl.models.meetings.RepeatType;

import java.time.LocalDate;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "repeatType", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = MonthlyByDayOfMonthRecurringWebinar.class, name = "MONTHLY_BY_DAY_OF_MONTH"),
        @JsonSubTypes.Type(value = MonthlyByDayOfWeekRecurringWebinar.class, name = "MONTHLY_BY_DAY_OF_WEEK"),
        @JsonSubTypes.Type(value = WeeklyRecurringWebinar.class, name = "WEEKLY"),
        @JsonSubTypes.Type(value = DailyRecurringWebinar.class, name = "DAILY")
})
public abstract class AbstractRecurringWebinar {
    private WebinarRepeatType repeatType;

    private int repeatEvery;

    private LocalDate endDate;

    private int afterTime;

    public AbstractRecurringWebinar(WebinarRepeatType repeatType, int repeatEvery, LocalDate endDate, int afterTime) {
        this.repeatType = repeatType;
        this.repeatEvery = repeatEvery;
        this.endDate = endDate;
        this.afterTime = afterTime;
    }

    public AbstractRecurringWebinar() {
    }

    public WebinarRepeatType getRepeatType() {
        return repeatType;
    }

    public void setRepeatType(WebinarRepeatType repeatType) {
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
