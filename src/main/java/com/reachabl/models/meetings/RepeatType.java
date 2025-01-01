package com.reachabl.models.meetings;

public enum RepeatType {
    DAILY("Daily", "dailyPopulator"),
    WEEKLY("Weekly", "weeklyPopulator"),
    MONTHLY_BY_DAY_OF_MONTH("Monthly by day of month", "monthlyByDayOfMonthPopulator"),
    MONTHLY_BY_DAY_OF_WEEK("Monthly by day of week", "monthlyByDayOfWeekPopulator"),;

    private final String name;
    private final String populatorName;


    RepeatType(String name, String populatorName) {
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
