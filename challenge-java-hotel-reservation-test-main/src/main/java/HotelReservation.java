public class HotelReservation {
    public String getCheapestHotel (String input) {

        //gets the clientType
        String clientType = Fix.Client(input);

        //splits the dates
        input.split(",");
        String[] separated = input.split(",");
        String date1 = separated[0];
        String date2 = separated[1];
        String date3 = separated[2];

        //abbreviates the date (mon, tues, wed...)
        date1 = Fix.Days(date1);
        date2 = Fix.Days(date2);
        date3 = Fix.Days(date3);
        return Best.Hotel(clientType, date1, date2, date3);
    }
}
