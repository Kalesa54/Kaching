package com.company;

public class Main {

    public static void main(String[] args) {
	int number = 1;

      /*  For every multiple of 3, instead of calling the number itself, the player has to call out "ka"
        For every multiple of 5, instead of calling the number itself, the player has to call out "ching!"
        Which leads to every multiple of 15 being called out as "ka-ching!"
        The first 18 steps of the game thus sound as follows: "1", "2", "ka", "4", ching!", "6", "7", "8", "ka", "ching!", "11", "ka", "13", "14", "ka-ching!", "16", "17", "ka"...*/
        while (number <= 30){
            if (number % 15 == 0) {
                System.out.println("ka-ching!");
            } else if (number % 5 == 0) {
                System.out.println("ching!");
            } else if(number % 3 == 0) {
                System.out.println("ka");
            } else {
                System.out.println(number);
            }
            number++;
        }
    }
}
