public class HotelsSums {

    public int Lakewood (String clientType, String date1, String date2, String date3) {
        int result;
        if (clientType.equals("Regular")) {
         result = sumLakewoodRegular(date1, date2, date3);
        }
        else {
            result = sumLakewoodReward(date1, date2, date3);
        }
        return result;
    }

    public int sumLakewoodRegular (String date1, String date2, String date3) {
        int sumDate1;
        int sumDate2;
        int sumDate3;
        if (date1 == "mon" || date1 == "tues" || date1 == "wed" || date1 == "thur" || date1 == "fri") {
            sumDate1 = 110;
        }
        else{
            sumDate1 = 90;
        }
        if (date2 == "mon" || date2 == "tues" || date2 == "wed" || date2 == "thur" || date2 == "fri") {
            sumDate2 = 110;
        }
        else{
            sumDate2 = 90;
        }
        if (date3 == "mon" || date3 == "tues" || date3 == "wed" || date3 == "thur" || date3 == "fri") {
            sumDate3 = 110;
        }
        else{
            sumDate3 = 90;
        }
        return sumDate1 + sumDate2 + sumDate3;
    }

    public int sumLakewoodReward (String date1, String date2, String date3) {
        int sumDate1;
        int sumDate2;
        int sumDate3;
        if (date1 == "mon" || date1 == "tues" || date1 == "wed" || date1 == "thur" || date1 == "fri") {
            sumDate1 = 80;
        }
        else{
            sumDate1 = 80;
        }
        if (date2 == "mon" || date2 == "tues" || date2 == "wed" || date2 == "thur" || date2 == "fri") {
            sumDate2 = 80;
        }
        else{
            sumDate2 = 80;
        }
        if (date3 == "mon" || date3 == "tues" || date3 == "wed" || date3 == "thur" || date3 == "fri") {
            sumDate3 = 80;
        }
        else{
            sumDate3 = 80;
        }
        return sumDate1 + sumDate2 + sumDate3;
    }

    public int Bridgewood (String clientType, String date1, String date2, String date3) {
        int result;
        if (clientType.equals("Regular")) {
            result = sumBridgewoodRegular(date1, date2, date3);
        }
        else {
            result = sumBridgewoodReward(date1, date2, date3);
        }
        return result;
    }

    public int sumBridgewoodRegular (String date1, String date2, String date3) {
        int sumDate1;
        int sumDate2;
        int sumDate3;
        if (date1 == "mon" || date1 == "tues" || date1 == "wed" || date1 == "thur" || date1 == "fri") {
            sumDate1 = 160;
        }
        else{
            sumDate1 = 60;
        }
        if (date2 == "mon" || date2 == "tues" || date2 == "wed" || date2 == "thur" || date2 == "fri") {
            sumDate2 = 160;
        }
        else{
            sumDate2 = 60;
        }
        if (date3 == "mon" || date3 == "tues" || date3 == "wed" || date3 == "thur" || date3 == "fri") {
            sumDate3 = 160;
        }
        else{
            sumDate3 = 60;
        }
        return sumDate1 + sumDate2 + sumDate3;
    }

    public int sumBridgewoodReward (String date1, String date2, String date3) {
        int sumDate1;
        int sumDate2;
        int sumDate3;
        if (date1 == "mon" || date1 == "tues" || date1 == "wed" || date1 == "thur" || date1 == "fri") {
            sumDate1 = 110;
        }
        else{
            sumDate1 = 50;
        }
        if (date2 == "mon" || date2 == "tues" || date2 == "wed" || date2 == "thur" || date2 == "fri") {
            sumDate2 = 110;
        }
        else{
            sumDate2 = 50;
        }
        if (date3 == "mon" || date3 == "tues" || date3 == "wed" || date3 == "thur" || date3 == "fri") {
            sumDate3 = 110;
        }
        else{
            sumDate3 = 50;
        }
        return sumDate1 + sumDate2 + sumDate3;
    }

    public int Ridgewood (String clientType, String date1, String date2, String date3) {
        int result;
        if (clientType.equals("Regular")) {
            result = sumRidgewoodRegular(date1, date2, date3);
        }
        else {
            result = sumRidgewoodReward(date1, date2, date3);
        }
        return result;
    }

    public int sumRidgewoodRegular (String date1, String date2, String date3) {
        int sumDate1;
        int sumDate2;
        int sumDate3;
        if (date1 == "mon" || date1 == "tues" || date1 == "wed" || date1 == "thur" || date1 == "fri") {
            sumDate1 = 220;
        }
        else{
            sumDate1 = 150;
        }
        if (date2 == "mon" || date2 == "tues" || date2 == "wed" || date2 == "thur" || date2 == "fri") {
            sumDate2 = 220;
        }
        else{
            sumDate2 = 150;
        }
        if (date3 == "mon" || date3 == "tues" || date3 == "wed" || date3 == "thur" || date3 == "fri") {
            sumDate3 = 220;
        }
        else{
            sumDate3 = 150;
        }
        return sumDate1 + sumDate2 + sumDate3;
    }

    public int sumRidgewoodReward (String date1, String date2, String date3) {
        int sumDate1;
        int sumDate2;
        int sumDate3;
        if (date1 == "mon" || date1 == "tues" || date1 == "wed" || date1 == "thur" || date1 == "fri") {
            sumDate1 = 100;
        }
        else{
            sumDate1 = 40;
        }
        if (date2 == "mon" || date2 == "tues" || date2 == "wed" || date2 == "thur" || date2 == "fri") {
            sumDate2 = 100;
        }
        else{
            sumDate2 = 40;
        }
        if (date3 == "mon" || date3 == "tues" || date3 == "wed" || date3 == "thur" || date3 == "fri") {
            sumDate3 = 100;
        }
        else{
            sumDate3 = 40;
        }
        return sumDate1 + sumDate2 + sumDate3;
    }

}
