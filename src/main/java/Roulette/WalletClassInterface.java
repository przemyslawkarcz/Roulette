package Roulette;

public interface WalletClassInterface {

    void checksWalletBeforeGame();

    Integer checksWalletContent(Integer someInteger);

    void checksWalletAfterGame(Integer someWin);

    Integer checksWalletContentWhenBettingOnFields(Integer someInteger);

}
