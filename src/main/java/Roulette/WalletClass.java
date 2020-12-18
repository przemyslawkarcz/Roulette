package Roulette;

import java.util.Scanner;

import static Roulette.ControlClass.checksDataFormat;

public class WalletClass implements WallateClassInterface{

    // The class concentrates methods controlling the player's wallet before, during and after the game

    static String walletContent;
    static Integer walletContentParsedToInteger;

    // The method creates a wallet before starting the game and concentrates other methods to check e.g. the contents of the wallet, number formats, etc.
    public static void checksWalletBeforeGame() {

        Scanner enteringContentOfWallet = new Scanner(System.in);
        System.out.print("* * * Enter wallet content * * *\n");
        System.out.print("Wallet: ");
        walletContent = enteringContentOfWallet.nextLine();

        try {
            walletContentParsedToInteger = checksDataFormat(walletContent);
        } catch (ExceptionChecksDataFormat exceptionChekcsDataFormat) {
            exceptionChekcsDataFormat.getMessage();
        }

        if (walletContentParsedToInteger == null){
            return;
        }

        checksWalletContent(walletContentParsedToInteger);

        if (walletContentParsedToInteger <= 0){
            return;
        }

        System.out.println("\n* * * Welcome to the game! * * *");
        System.out.print("Wallet before game: " + walletContentParsedToInteger);
        System.out.println();
    }

    // A 'getter' method that gives access to the wallet
    private static Integer getWalletContentParsedToInteger() {
        return walletContentParsedToInteger;
    }

    // A method that checks enough cash in wallet
    private static Integer checksWalletContent(Integer someInteger) {

        if (someInteger <= 0){
            System.out.println("You don't have enough resources to play!");
            System.out.println("The game is over. To play again, restart the game with more funds :)");
            return 0;
        }

        return someInteger;

    }

    // The method showing the content of the wallet after the game
    public static void checksWalletAfterGame(Integer someWin){

        Integer walletAfterGame = getWalletContentParsedToInteger() + someWin;
        System.out.println("Wallet after game: " + walletAfterGame);

    }

    // A method showing the content of the wallet when betting on fields
    public static Integer checksWalletContentWhenBettingOnFields(Integer someInteger){

        walletContentParsedToInteger = getWalletContentParsedToInteger() - someInteger;

        System.out.println("Wallet after betting: " + getWalletContentParsedToInteger());

        if (getWalletContentParsedToInteger() <= -1){

            System.out.println("You do not have enough money in your wallet to use the last bid!");
            System.out.println("Increase the contents of the wallet and start playing again :)");
            return -1;
        }

        return walletContentParsedToInteger;
    }

}
