package Roulette;

public class ExceptionChecksDataFormat extends Exception {

    String friendlyMessageForDataFormat;

    public ExceptionChecksDataFormat(String friendlyMessage) {
        this.friendlyMessageForDataFormat = friendlyMessage;
        System.out.println("The entered data '" + friendlyMessage + "' is not an integer.");
        System.out.println("The game has been stopped! To play restart game :)");
    }

    public String getFriendlyMessageForDataFormat() {
        return friendlyMessageForDataFormat;
    }

}
