public class LeapYear {
    public static void main(String[] args){
    int year = 1900;
    boolean leap = false;
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0)
                leap = true;
            else
                leap = false;
        }
        else
            leap = true;
    }
    else
    leap = false;
    if (leap)
            System.out.println(year + " leap year.");
    else
            System.out.println(year + "  not a leap year.");
}
}

