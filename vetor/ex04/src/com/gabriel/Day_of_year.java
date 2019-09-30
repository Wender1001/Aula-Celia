package com.gabriel;

import java.util.Calendar;
import java.util.Date;

import com.gabriel.exception.InvalidDate;

public class Day_of_year {

    private int day;

    public Day_of_year(int day) {
        this.day = day;
        if (this.day < 0 || this.day > 31) {
            throw new InvalidDate("Data inválida.");
        }
    }

    public int day_of_year() {
        Date date = new Date();

        date.setDate(this.day);

        Calendar c = Calendar.getInstance();
        c.setTime(date);

        return c.get(Calendar.DAY_OF_YEAR);

    }
}
