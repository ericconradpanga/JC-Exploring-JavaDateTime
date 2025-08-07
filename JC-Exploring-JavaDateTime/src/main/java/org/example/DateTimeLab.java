package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.Period;

public class DateTimeLab {
    public static void main(String[] args) {
//        // exercise 1
//        LocalDate today = LocalDate.of(2025, 8, 21);
//
//        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy", Locale.ENGLISH);
//
//        System.out.println("Default format: " + today);
//        System.out.println("Custom format 1: " + today.format(dtf1));
//        System.out.println("Custom format 2: " + today.format(dtf2));
//
//        //  prediction: Default format: 2025-08-21
//        //              Custom format 1: 21/08/2025
//        //              Custom format 2: Thursday, August 21, 2025

//        // exercise 2
//        LocalTime now = LocalTime.of(16, 45, 30);
//
//        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");
//        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm:ss a");
//
//        System.out.println("Default format: " + now);
//        System.out.println("24-hour format: " + now.format(dtf1));
//        System.out.println("12-hour format with AM/PM: " + now.format(dtf2));
//
//        // prediction: Default format: 16:45:30
//        //             24-hour format: 16:45:30
//        //             12-hour format with AM/PM: 04:45:30 PM
//
//        // observation: Default format: 16:45:30
//        //              24-hour format: 16:45:30
//        //              12-hour format with AM/PM: 04:45:30 PM

//        // exercise 3
//        LocalDateTime event = LocalDateTime.of(2025, 11, 27, 19, 0, 0);
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' hh:mm a");
//
//        System.out.println("Default format: " + event);
//        System.out.println("Custom format: " + event.format(dtf));
//
//        // prediction: Default format: 2025-11-27T19:00
//        //             Custom format: Nov 27, 2025 at 07:00 PM
//
//        // observation: Default format: 2025-11-27T19:00
//        //              Custom format: Nov 27, 2025 at 07:00 PM

//        // exercise 4
//        LocalDate startDate = LocalDate.of(2025, 9, 1);
//
//        // Attempt to add 10 days, but don't assign the result
//        startDate.plusDays(10);
//
//        System.out.println("Start date after trying to modify it: " + startDate);
//
//        // Now, correctly add 10 days by assigning the result to a new variable
//        LocalDate endDate = startDate.plusDays(10);
//
//        System.out.println("The original start date is still: " + startDate);
//        System.out.println("The new end date is: " + endDate);
//
//        // prediction: Start date after trying to modify it: 2025-09-01
//        //             The original start date is still: 2025-09-01
//        //             The new end date is: 2025-09-11
//
//        // observation: Start date after trying to modify it: 2025-09-01
//        //              The original start date is still: 2025-09-01
//        //              The new end date is: 2025-09-11

//        // exercise 5
//        LocalDateTime baseTime = LocalDateTime.of(2025, 10, 15, 10, 30, 0);
//
//        LocalDateTime futureTime = baseTime.plusYears(1).plusMonths(2).plusHours(5);
//        LocalDateTime pastTime = baseTime.minusWeeks(3).minusDays(3);
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//
//        System.out.println("Base time:   " + baseTime.format(dtf));
//        System.out.println("Future time: " + futureTime.format(dtf));
//        System.out.println("Past time:   " + pastTime.format(dtf));
//
//        // prediction: Base time:   2025-10-15 10:30
//        //             Future time: 2026-12-15 15:30
//        //             Past time:   2025-09-21 10:30
//
//        // observation: Base time:   2025-10-15 10:30
//        //              Future time: 2026-12-15 15:30
//        //              Past time:   2025-09-21 10:30

//        // exercise 6
//        LocalDate date1 = LocalDate.of(2024, 3, 15);
//        LocalDate date2 = LocalDate.of(2026, 7, 20);
//
//        Period period = Period.between(date1, date2);
//
//        System.out.print("The period between the two dates is: ");
//        System.out.print(period.getYears() + " years, ");
//        System.out.print(period.getMonths() + " months, and ");
//        System.out.println(period.getDays() + " days.");
//
//        // prediction: The period between the two dates is: 2 years, 4 months, and 5 days.
//        // observation: The period between the two dates is: 2 years, 4 months, and 5 days.
    }
}