public class Best {
    public static String Hotel (String clientType, String date1, String date2, String date3){
        HotelsSums hotels = new HotelsSums();

        //gets the total sum for each hotel according to the dates.
        int LakewoodPrice = hotels.Lakewood(clientType, date1, date2, date3);
        int BridgewoodPrice = hotels.Bridgewood(clientType, date1, date2, date3);
        int RidgewoodPrice = hotels.Ridgewood(clientType, date1, date2, date3);

        //creates hotel objects, so I can access its rating, name and prices.
        Hotel LakewoodObject = new Hotel(3, "Lakewood", LakewoodPrice);
        Hotel BridgewoodObject = new Hotel(4, "Bridgewood", BridgewoodPrice);
        Hotel RidgewoodObject = new Hotel(5, "Ridgewood", RidgewoodPrice);

        //creates an array, so I can iterate through them and find the cheapest one
        //if the price is the same, the one with the highest rating wins.
        Hotel [] hotelArray = new Hotel[4];
        hotelArray[0] = LakewoodObject;
        hotelArray[1] = BridgewoodObject;
        hotelArray[2] = RidgewoodObject;

        //Tho all the hotels have been created above, the forth one will always be
        //the hotel with the best price, so later I can use it to compare ratings on line 33.
        hotelArray[3] = new Hotel(0, "", 0);
        int cheapestHotel = hotelArray[0].finalPrice;
        String best = "";
        for (int i = 0; i < hotelArray.length; i++) {
            if(hotelArray[i].finalPrice < cheapestHotel){
                cheapestHotel = hotelArray[i].finalPrice;
                hotelArray[3] = hotelArray[i];
            }
            else if (hotelArray[i].finalPrice == cheapestHotel){
                if(hotelArray[i].rating > hotelArray[3].rating){
                    best = hotelArray[i].name;
                }
                else{
                    best = hotelArray[3].name;
                }
            }
        }
        return best;
    }
}
