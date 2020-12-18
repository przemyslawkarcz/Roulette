package Roulette;

public class ControlClass implements ControlClassInterface{

    // The class contains methods that check correctness of the number of fields and number formats

    // The method checks if the player correctly uses fields from 0 to 36
    public static Integer checksIfSelectedFieldsAreInRange_0_36(Integer someInteger) {

        if (someInteger < 0 || someInteger > 36) {

            System.out.println("The game accepts fields from 0 to 36");
            System.out.println("The game has been stopped. Start again :)");

            return 12349888;
        }

        return someInteger;
    }

    // The method checks the correctness of the entered data relative to their format and uses its own exception method
    public static Integer checksDataFormat(String someString) throws ExceptionChecksDataFormat {

        try {

            return Integer.parseInt(someString);

        }catch (NumberFormatException e){

            throw new ExceptionChecksDataFormat(someString);
        }

    }

    // The method checks the number of fields at start of the game
    public static Integer checksNumberOfFieldsAtStartOfGame(Integer someAmountsOfFields){

        if (someAmountsOfFields <= 0 || someAmountsOfFields > 37){
            System.out.println("You have entered an invalid number of fields, which interrupted the game!");
            System.out.println("Game accepts 37 fields.");
            return 0;
        }

        return someAmountsOfFields;

    }

}
