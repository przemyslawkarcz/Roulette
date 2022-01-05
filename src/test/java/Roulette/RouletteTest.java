package Roulette;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RouletteTest {

    @Test
    public void checksIfItHasBeenWonTest01(){

        Integer[] someFieldsArray = new Integer[]{5, 10, 15};
        Integer[] someRatesArray = new Integer[]{500, 500, 500};
        Integer someInteger = 10;

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

        Assertions.assertEquals(1500, betsWon);

    }

    @Test
    public void checksIfItHasBeenWonTest02(){

        Integer[] someFieldsArray = new Integer[]{10, 20, 30};
        Integer[] someRatesArray = new Integer[]{100, 200, 300};
        Integer someInteger = 10;

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

        Assertions.assertEquals(500, betsLost);

    }

    @Test
    public void checksIfItHasBeenWonTest03(){

        Integer[] someFieldsArray = new Integer[]{11, 21, 31};
        Integer[] someRatesArray = new Integer[]{101, 201, 301};
        Integer someInteger = 31;

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

        Assertions.assertNotEquals(904, betsWon);

    }

    @Test
    public void checksIfItHasBeenWonTest04(){

        Integer[] someFieldsArray = new Integer[]{11, 21, 31};
        Integer[] someRatesArray = new Integer[]{101, 201, 301};
        Integer someInteger = 31;

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

        Assertions.assertNotEquals(303, betsLost);

    }

}
