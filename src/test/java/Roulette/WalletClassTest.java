package Roulette;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static Roulette.WalletClass.walletContentParsedToInteger;

public class WalletClassTest {

    @Test
    public void checksWalletContentTest01(){

        WalletClass walletClass = new WalletClass();
        int zero = -1;

        Integer walletContent = walletClass.checksWalletContent(zero);

        Assertions.assertEquals(0, walletContent);

    }

    @Test
    public void checksWalletContentTest02(){

        WalletClass walletClass = new WalletClass();
        int zero = -1;

        Integer walletContent = walletClass.checksWalletContent(zero);

        Assertions.assertNotEquals(1, walletContent);

    }

    @Test
    public void checksWalletContentTest03(){

        WalletClass walletClass = new WalletClass();
        int zero = 1;

        Integer walletContent = walletClass.checksWalletContent(zero);

        Assertions.assertEquals(1, walletContent);

    }

    @Test
    public void checksWalletContentTest04(){

        WalletClass walletClass = new WalletClass();
        int zero = 1;

        Integer walletContent = walletClass.checksWalletContent(zero);

        Assertions.assertNotEquals(0, walletContent);

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

        walletContentParsedToInteger = 1000;
        Integer someValue = 1001;
        Integer integer = walletClass.checksWalletContentWhenBettingOnFields(someValue);

        Assertions.assertNotEquals(0, integer);

    }

    @Test
    public void checksWalletContentWhenBettingOnFieldsTest03(){

        WalletClass walletClass = new WalletClass();

        walletContentParsedToInteger = 1000;
        Integer someValue = 1000;
        Integer integer = walletClass.checksWalletContentWhenBettingOnFields(someValue);

        Assertions.assertEquals(0, integer);

    }

    @Test
    public void checksWalletContentWhenBettingOnFieldsTest04(){

        WalletClass walletClass = new WalletClass();

        walletContentParsedToInteger = 1000;
        Integer someValue = 1000;
        Integer integer = walletClass.checksWalletContentWhenBettingOnFields(someValue);

        Assertions.assertNotEquals(1, integer);

    }

}
