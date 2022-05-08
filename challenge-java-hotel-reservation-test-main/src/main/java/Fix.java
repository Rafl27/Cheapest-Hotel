public class Fix {
    public static String Days(String date) {
        if (date.contains("mon"))
            date = "mon";
        else if (date.contains("tues"))
            date = "tues";
        else if (date.contains("wed"))
            date = "wed";
        else if (date.contains("thur"))
            date = "thur";
        else if (date.contains("fri"))
            date = "fri";
        else if (date.contains("sat"))
            date = "sat";
        else if (date.contains("sun"))
            date = "sun";
        return date;
    }

    public static String Client(String input){
        return input.substring(0,7);
    }
}
