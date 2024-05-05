package com.serenitydojo.model;

public class Feeder {
    public String feeds(String animal, boolean isPremium) {

        if(animal.equals("Dog")) {
//            if(isPremium)
//                return "Deluxe Dog Food";
//            else
//                return "Dog Food";

            return (isPremium) ? "Deluxe Dog Food" : "Dog Food";
        }
        else if(animal.equals("Hamster")){
//            if(isPremium)
//                return "Lettuce";
//            else
//                return "Cabbage";

            return (isPremium) ? "Lettuce" : "Cabbage";
        }
        else if(animal.equals("Cat")) {
//            if(isPremium)
//                return "Salmon";
//            else
//                return "Tuna";

            return (isPremium) ? "Salmon" : "Tuna";
        }
        else {
            return "What we can find in the cupboards";
        }
    }
}
