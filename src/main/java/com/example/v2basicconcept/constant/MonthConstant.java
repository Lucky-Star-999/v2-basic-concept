package com.example.v2basicconcept.constant;

public class MonthConstant {
    public static class Month {
        public static final String JANUARY = "January";
        public static final String FEBRUARY = "February";
        public static final String MARCH = "March";
        public static final String APRIL = "April";
        public static final String MAY = "May";
        public static final String JUNE = "June";
        public static final String JULY = "July";
        public static final String AUGUST = "August";
        public static final String SEPTEMBER = "September";
        public static final String OCTOBER = "October";
        public static final String NOVEMBER = "November";
        public static final String DECEMBER = "December";
    }

    public static class Number {
        public static final int JANUARY = 1;
        public static final int FEBRUARY = 2;
        public static final int MARCH = 3;
        public static final int APRIL = 4;
        public static final int MAY = 5;
        public static final int JUNE = 6;
        public static final int JULY = 7;
        public static final int AUGUST = 8;
        public static final int SEPTEMBER = 9;
        public static final int OCTOBER = 10;
        public static final int NOVEMBER = 11;
        public static final int DECEMBER = 12;
    }

    public static String getMonthFromNumber(int monthNumber) {
        if (monthNumber == MonthConstant.Number.JANUARY) {
            return MonthConstant.Month.JANUARY;
        } else if (monthNumber == MonthConstant.Number.FEBRUARY) {
            return MonthConstant.Month.FEBRUARY;
        } else if (monthNumber == MonthConstant.Number.MARCH) {
            return MonthConstant.Month.MARCH;
        } else if (monthNumber == MonthConstant.Number.APRIL) {
            return MonthConstant.Month.APRIL;
        } else if (monthNumber == MonthConstant.Number.MAY) {
            return MonthConstant.Month.MAY;
        } else if (monthNumber == MonthConstant.Number.JUNE) {
            return MonthConstant.Month.JUNE;
        } else if (monthNumber == MonthConstant.Number.JULY) {
            return MonthConstant.Month.JULY;
        } else if (monthNumber == MonthConstant.Number.AUGUST) {
            return MonthConstant.Month.AUGUST;
        } else if (monthNumber == MonthConstant.Number.SEPTEMBER) {
            return MonthConstant.Month.SEPTEMBER;
        } else if (monthNumber == MonthConstant.Number.OCTOBER) {
            return MonthConstant.Month.OCTOBER;
        } else if (monthNumber == MonthConstant.Number.NOVEMBER) {
            return MonthConstant.Month.NOVEMBER;
        } else if (monthNumber == MonthConstant.Number.DECEMBER) {
            return MonthConstant.Month.DECEMBER;
        } else {
            return "";
        }
    }
}
