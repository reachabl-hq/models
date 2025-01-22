package com.reachabl.models.webinar;

public enum WebinarRepeatType {
    DAILY("Daily", "webinarDailyPopulator"),
    WEEKLY("Weekly", "webinarWeeklyPopulator"),
    MONTHLY_BY_DAY_OF_MONTH("Monthly by day of month", "webinarMonthlyByDayOfMonthPopulator"),
    MONTHLY_BY_DAY_OF_WEEK("Monthly by day of week", "webinarMonthlyByDayOfWeekPopulator"),;

    private final String name;
    private final String populatorName;


    WebinarRepeatType(String name, String populatorName) {
        this.name = name;
        this.populatorName = populatorName;
    }

    public String getName() {
        return name;
    }

    public String getPopulatorName() {
        return populatorName;
    }
}
