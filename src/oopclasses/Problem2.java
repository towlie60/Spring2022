package oopclasses;

import oopclasses.hotel.Room;

import java.util.HashMap;

public class Problem2 {

    public static void main(String[] args) {
        //Hyatt Regency
        //Hyatt manages a hotel with 5 rooms

        //As a guest I want to see room informartion
        //like how many bed rooms
        //how many bathrooms,
        //2 queen
        //2 kings
        //1 queen
        //1 king
        // is the room available or not

        HashMap<String,Integer> bds= new HashMap<>();
        bds.put("King",1);
        Room rm = new Room(12,2,2,bds,false);

    }
}
