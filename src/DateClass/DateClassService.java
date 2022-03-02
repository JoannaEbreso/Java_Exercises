package DateClass;

public class DateClassService {

    public String convertToMMDDYYYYFormat(DateClass dateClass){
        return String.format("%2d" + "/" + "%2d" + "/" + "%d",dateClass.getMonth(),dateClass.getDay(),dateClass.getYear());
    }
}
