package com.delphi.app;

public class GuessTheDay {
    public static void main(String[] args) {
            weekDays(WeekDays.FRIDAY);
            weekDays(7);
            weekDays(0);
    }
    public static void weekDays(WeekDays wd)
    {
        System.out.println(isWeekend(wd.getDay()));
    }
    public static void weekDays(int wd)
    {
        System.out.println(isWeekend(wd));
    }
    public static String isWeekend(int day)
    {
        if(day>=1&&day<=5) {
            return "Again work day";
        }
        else if(day>=6&&day<=7)
        {
            return "Finally weekend";
        }
        return "Is it even day???";
    }
}
