package com.manage.demo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//获得指定日期的前一天

public class DateString {
    public static String getSpecifiedDayBefore(String time) {

        Calendar c = Calendar.getInstance();

        Date date = null;
        try
        {
            date = new SimpleDateFormat("yy-MM-dd").parse(time);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day - 1);
        String dayBefore = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
        return dayBefore;
    }

}