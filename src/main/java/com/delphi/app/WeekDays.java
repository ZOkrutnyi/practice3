package com.delphi.app;

public enum WeekDays {
    MONDAY(1,"1"),
    TUESDAY(2,"2"),
    WEDNESDAY(3,"3"),
    THURSDAY(4,"4"),
    FRIDAY(5,"5"),
    SATURDAY(6,"6"),
    SUNDAY(7,"7");
    private final int day;
    private final String sDay;
    WeekDays(int day, String sDay)
    {
        this.day = day;
        this.sDay = sDay;
    }
    public static int getDay(String s)
    {
        for (WeekDays w: WeekDays.values()) {
            if(s.compareToIgnoreCase(w.name())==0||s.compareTo(w.sDay)==0)
                return w.day;
        }
        return -1;
    }
}
