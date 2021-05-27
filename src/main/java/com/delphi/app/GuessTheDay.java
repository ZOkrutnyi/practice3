package com.delphi.app;

import static com.delphi.app.WeekDays.getDay;

public class GuessTheDay {
    public static void main(String[] args) {
        if(args.length>0) {
            GuessTheDay g = new GuessTheDay();
            g.weekDays(args[0]);
        }else
        System.out.println("You better try to run another program without parameters!");
    }
    public void weekDays(String wd)
    {
        System.out.println(isWeekend(getDay(wd)));
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
