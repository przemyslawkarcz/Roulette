package Roulette;

import java.util.ArrayList;

public class PrintClass implements PrintClassInterface{

    // The class is intended for data printing and data presentation

    // The method prints chosen by player roulette fields and corresponding rates
    public ArrayList<Integer> printsFieldsAndRatesChosenByPlayer(Integer[] someFieldsArray, Integer[] someRatesArray){

        ArrayList<Integer> acquiredData = new ArrayList<>();

        System.out.println("\n* * * Chosen Fields & Rates * * *");
        System.out.print("Fields: ");
        for (int i = 0; i < someFieldsArray.length; i++) {
            System.out.printf("%8d |", someFieldsArray[i]);
            acquiredData.add(someFieldsArray[i]);
        }

        System.out.print("\nRates : ");
        for (int i = 0; i < someRatesArray.length; i++) {
            System.out.printf("%8d |", someRatesArray[i]);
            acquiredData.add(someRatesArray[i]);
        }
        System.out.println();

        return acquiredData;

    }

}
