package Roulette;

import java.util.Random;
import java.util.Scanner;

import static Roulette.ControlClass.checksIfSelectedFieldsAreInRange_0_36;
import static Roulette.ControlClass.checksNumberOfFieldsAtStartOfGame;
import static Roulette.PrintClass.printsFieldsAndRatesChosenByPlayer;
import static Roulette.WalletClass.*;

public class Roulette implements RouletteClassInterface{

    // The class focuses methods directly related to roulette

    // The 'main' method that plays the game
    public static void playRoluette(Integer someFieldsAmount){

        Integer checkedNumberOfFields = checksNumberOfFieldsAtStartOfGame(someFieldsAmount);

        // Checks amount of fields
        if (checkedNumberOfFields <= 0){
            return;
        }

        checksWalletBeforeGame();

        // Checks data format
        if (walletContentParsedToInteger == null){
            return;
        }

        // Checks content of wallet
        if (walletContentParsedToInteger <= 0){
            return;
        }

        Integer[] rouletteFields = new Integer[someFieldsAmount];
        Integer[] cashBettingRatesForFields = new Integer[someFieldsAmount];

        Scanner scannerForRouletteFields = new Scanner(System.in);
        Scanner scannerForCashRatesForFields = new Scanner(System.in);

        if (someFieldsAmount >= 1 && someFieldsAmount <= 37) {

            System.out.println("\n* * * Which fields do you bet on? Fields from 0 to 36. * * *");
            for (int i = 0; i < someFieldsAmount; i++) {

                System.out.print("Select your field " + (i + 1) + ": ");
                int selectedField = scannerForRouletteFields.nextInt();

                Integer fieldsCheckedAgainstTheRange_0_36 = checksIfSelectedFieldsAreInRange_0_36(selectedField);

                if (fieldsCheckedAgainstTheRange_0_36 == 12349888) {
                    return;
                }

                rouletteFields[i] = selectedField;
            }

            for (int j = 0; j < someFieldsAmount; j++) {

                System.out.print("Enter the rate for the field " + (j + 1) + ": ");
                int selectedRate = scannerForCashRatesForFields.nextInt();

                Integer checkedWalletContentForBetting = checksWalletContentWhenBettingOnFields(selectedRate);

                if (checkedWalletContentForBetting <= -1) {
                    return;
                }

                cashBettingRatesForFields[j] = selectedRate;
            }

            printsFieldsAndRatesChosenByPlayer(rouletteFields, cashBettingRatesForFields);

            // The ball throw - The draw
            Integer ballThrow = new Random().nextInt(37);
            System.out.println("\n* * * The result of the draw is: " + ballThrow + ". * * *\n");

            checksIfItHasBeenWon(rouletteFields, ballThrow, cashBettingRatesForFields);

        }else {
            System.out.println("You have entered an invalid number of fields!");
            System.out.println("The number of betable fields is 37.");
        }

    }

    // A method that checks the result of the draw and compares the result with the roulette fields bet
    private static void checksIfItHasBeenWon(Integer[] someFieldsArray, Integer someInteger, Integer[] someRatesArray){

        int winningsConversionFactor = 3; // For winnings a conversion factor of 3 has been assumed initially
        int betsWon = 0;
        int betsLost = 0;

        System.out.println("* * * Betting summary * * *");
        for (int i = 0; i < someFieldsArray.length; i++) {

            if (someFieldsArray[i].equals(someInteger)){

                int fieldWon = someRatesArray[i] * winningsConversionFactor;
                System.out.println("Player has won: " + fieldWon + ", from field: " + someFieldsArray[i] + ", with a rate of: " +
                        + someRatesArray[i]);
                betsWon = betsWon + fieldWon;

            }else if (!someFieldsArray[i].equals(someInteger)){

                System.out.println("Player has lost: " + someRatesArray[i] + ", from field: " + someFieldsArray[i]);
                betsLost = betsLost + someRatesArray[i];

            }
        }

        System.out.println("Total winnings: " + betsWon);
        System.out.println("Total lost: " + betsLost);

        checksWalletAfterGame(betsWon);

    }

}
