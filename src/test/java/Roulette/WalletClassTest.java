package Roulette;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static Roulette.ControlClass.checksDataFormat;
import static Roulette.WalletClass.walletContentParsedToInteger;

public class WalletClassTest {

    @Test
    public void checksWalletBeforeGameTest01(){

        WalletClass walletClass = new WalletClass();

        String walletContent = "100";

        try {
            walletContentParsedToInteger = checksDataFormat(walletContent);
        } catch (ExceptionChecksDataFormat exceptionChecksDataFormat) {
            exceptionChecksDataFormat.getMessage();
        }

        if (walletContentParsedToInteger == null){
            return;
        }

        walletClass.checksWalletContent(walletContentParsedToInteger);

        if (walletContentParsedToInteger <= 0){
            return;
        }

        System.out.println("\n* * * Welcome to the game! * * *");
        System.out.print("Wallet before game: " + walletContentParsedToInteger);
        System.out.println();
        Assertions.assertEquals(100, walletContentParsedToInteger);

    }

    @Test
    public void checksWalletBeforeGameTest02(){

        WalletClass walletClass = new WalletClass();

        String walletContent = "200";

        try {
            walletContentParsedToInteger = checksDataFormat(walletContent);
        } catch (ExceptionChecksDataFormat exceptionChecksDataFormat) {
            exceptionChecksDataFormat.getMessage();
        }

        if (walletContentParsedToInteger == null){
            return;
        }

        walletClass.checksWalletContent(walletContentParsedToInteger);

        if (walletContentParsedToInteger <= 0){
            return;
        }

        System.out.println("\n* * * Welcome to the game! * * *");
        System.out.print("Wallet before game: " + walletContentParsedToInteger);
        System.out.println();
        Assertions.assertNotEquals(300, walletContentParsedToInteger);

    }

    @Test
    public void checksWalletContentTest01(){

        WalletClass walletClass = new WalletClass();
        int someValue = -1;

        Integer walletContent = walletClass.checksWalletContent(someValue);

        Assertions.assertEquals(0, walletContent);

    }

    @Test
    public void checksWalletContentTest02(){

        WalletClass walletClass = new WalletClass();
        int someValue = -2;

        Integer walletContent = walletClass.checksWalletContent(someValue);

        Assertions.assertNotEquals(1, walletContent);

    }

    @Test
    public void checksWalletContentTest03(){

        WalletClass walletClass = new WalletClass();
        int someValue = 2;

        Integer walletContent = walletClass.checksWalletContent(someValue);

        Assertions.assertEquals(2, walletContent);

    }

    @Test
    public void checksWalletContentTest04(){

        WalletClass walletClass = new WalletClass();
        int someValue = 3;

        Integer walletContent = walletClass.checksWalletContent(someValue);

        Assertions.assertNotEquals(4, walletContent);

    }

    @Test
    public void checksWalletAfterGameTest01(){

        WalletClass walletClass = new WalletClass();

        walletContentParsedToInteger = 500;
        Integer someValue = 100;
        Integer walletAfterGame = walletClass.checksWalletAfterGame(someValue);

        Assertions.assertEquals(600, walletAfterGame);

    }

    @Test
    public void checksWalletAfterGameTest02(){

        WalletClass walletClass = new WalletClass();

        walletContentParsedToInteger = 600;
        Integer someValue = 200;
        Integer walletAfterGame = walletClass.checksWalletAfterGame(someValue);

        Assertions.assertNotEquals(700, walletAfterGame);

    }

    @Test
    public void checksWalletContentWhenBettingOnFieldsTest01(){

        WalletClass walletClass = new WalletClass();

        walletContentParsedToInteger = 1000;
        Integer someValue = 1001;
        Integer integer = walletClass.checksWalletContentWhenBettingOnFields(someValue);

        Assertions.assertEquals(-1, integer);

    }

    @Test
    public void checksWalletContentWhenBettingOnFieldsTest02(){

        WalletClass walletClass = new WalletClass();

        walletContentParsedToInteger = 2000;
        Integer someValue = 2002;
        Integer integer = walletClass.checksWalletContentWhenBettingOnFields(someValue);

        Assertions.assertNotEquals(-3, integer);

    }

    @Test
    public void checksWalletContentWhenBettingOnFieldsTest03(){

        WalletClass walletClass = new WalletClass();

        walletContentParsedToInteger = 3000;
        Integer someValue = 3000;
        Integer integer = walletClass.checksWalletContentWhenBettingOnFields(someValue);

        Assertions.assertEquals(0, integer);

    }

    @Test
    public void checksWalletContentWhenBettingOnFieldsTest04(){

        WalletClass walletClass = new WalletClass();

        walletContentParsedToInteger = 4000;
        Integer someValue = 3999;
        Integer integer = walletClass.checksWalletContentWhenBettingOnFields(someValue);

        Assertions.assertNotEquals(2, integer);

    }

}
