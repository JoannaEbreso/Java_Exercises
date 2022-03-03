package DateClass;

public class DateClass {

    private int[] date = new int[3];

    private static final String[] monthArray = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};


    public DateClass(int day, int month, int year) throws Exception {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public DateClass(String month, int day, int year) throws Exception {
        setMonthString(month);
        setDay(day);
        setYear(year);
    }

    public void setYear(int year) throws Exception {
        confirmYear(year);
        date[2] = year;
    }

    public void setMonth(int month) throws Exception {
        confirmMonth(month);
        date[1] = month;
    }

    public void setDay(int day) throws Exception {
        confirmDay(day);
        date[0] = day;
    }

    private int confirmDay(int day) throws Exception {
        if(day > 0 && day <=7){
            return day;
        }
        else{
            throw new Exception("Inputed day doesn't exist!");
        }
    }

    private int confirmMonth(int month) throws Exception {
        if(month > 0 && month <=12){
            return month;
        }
        else {
            throw new Exception("Inputed month doesn't exist");
        }
    }

    private int confirmYear(int year) throws Exception {
        if(year > 0 && year <=2022){
            return year;
        }
        else {
            throw new Exception("Inputed year doesn't exist");
        }
    }

    public void setMonthString(String month){
        String inputedMonth = month.toUpperCase();
        int confirmedMonth = checkMonthString(inputedMonth);

        date[1] = confirmedMonth;
    }

    private int checkMonthString(String month){
        for (int count = 0; count < monthArray.length ; count++) {
            if(monthArray[count] == month){
                return count + 1;
            }
        }
       return 0;
    }
}
