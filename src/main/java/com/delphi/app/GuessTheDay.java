package com.delphi.app;

import static com.delphi.app.WeekDays.getDay;

public class GuessTheDay {
    public static void main(String[] args) {
        if (args.length > 0) {
            new GuessTheDay().findDay(args[0]);
        } else
            System.out.println("You better try to run another program without parameters!");
    }

    /**
     * findDay(String wd) converts input String to WeekDays type
     * and prints it`s weekend or not
     */
    public void findDay(String wd) {
        System.out.println(weekDay(getDay(wd)));
    }

    /**
     * weekDay(int day) take the day
     * if day exists return if it`s weekend or not
     */
    private String weekDay(int day) {
        if (day >= 1 && day <= 5) {
            return "Again work day";
        } else if (day >= 6 && day <= 7) {
            return "Finally weekend";
        }
        return "Is it even day???";
    }
}
