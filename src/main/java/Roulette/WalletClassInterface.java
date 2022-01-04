package Roulette;

public interface WalletClassInterface {

    void checksWalletBeforeGame();

    Integer checksWalletContent(Integer someInteger);

    static void checksWalletAfterGame(Integer someWin) {

    }

    Integer checksWalletContentWhenBettingOnFields(Integer someInteger);

}
