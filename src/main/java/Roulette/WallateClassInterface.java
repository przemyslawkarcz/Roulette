package Roulette;

public interface WallateClassInterface {

    void checksWalletBeforeGame();

    static Integer checksWalletContent(Integer someInteger){
        return 0;
    }

    void checksWalletAfterGame(Integer someWin);

    Integer checksWalletContentWhenBettingOnFields(Integer someInteger);

}
