package u4pp;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        } else {
            if (year % 100 == 0 && year % 400 == 0) {
                return true;
            } else if (year % 100 == 0) {
                return false;
            }
            if (year % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }

    }
}

// For **PART A**, you need to create the `public static` method `isLeapYear(int
// year)` in a class called `LeapYear`.
// A `year` is a leap year based on the following rules:

// 1. Everything before 1582 is not a leap year
// 2. Every year between 1582 and now that is exactly divisible by four is a
// leap year.
// - Years that are evenly divisible by 100 are not leap years unless they are
// evenly divisible by 400
// - - Example: 1700, 1800, and 1900 are not leap years
// - - Example: 1600 and 2000 are leap years

// Your function should `return true` if the argument is a leap year and `false`
// if the year is not a leap year.