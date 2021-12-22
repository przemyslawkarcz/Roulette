package Roulette;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Roulette.ControlClass.checksDataFormat;

public class ControlClassTest {

    @Test
    public void checksIfSelectedFieldsAreInRange_0_36Test01(){

        int x = 36;

        ControlClass controlClass = new ControlClass();
        Integer integer = controlClass.checksIfSelectedFieldsAreInRange_0_36(x);

        Assertions.assertEquals(36, integer);

    }

    @Test
    public void checksIfSelectedFieldsAreInRange_0_36Test02(){

        int x = 36;

        ControlClass controlClass = new ControlClass();
        Integer integer = controlClass.checksIfSelectedFieldsAreInRange_0_36(x);

        Assertions.assertNotEquals(37, integer);

    }

    @Test
    public void checksIfSelectedFieldsAreInRange_0_36Test03(){

        int x = 0;

        ControlClass controlClass = new ControlClass();
        Integer integer = controlClass.checksIfSelectedFieldsAreInRange_0_36(x);

        Assertions.assertEquals(0, integer);

    }

    @Test
    public void checksIfSelectedFieldsAreInRange_0_36Test04(){

        int x = 0;

        ControlClass controlClass = new ControlClass();
        Integer integer = controlClass.checksIfSelectedFieldsAreInRange_0_36(x);

        Assertions.assertNotEquals(-1, integer);

    }

    @Test
    public void checksDataFormatTest01() throws ExceptionChecksDataFormat {

        String someText = "1";

        Integer integer = checksDataFormat(someText);

        Assertions.assertEquals(1, integer);

    }

    @Test
    public void checksNumberOfFieldsAtStartOfGameTest01(){

        int x = 1;

        ControlClass controlClass = new ControlClass();
        Integer integer = controlClass.checksNumberOfFieldsAtStartOfGame(x);

        Assertions.assertEquals(1, integer);

    }

    @Test
    public void checksNumberOfFieldsAtStartOfGameTest02(){

        int x = 37;

        ControlClass controlClass = new ControlClass();
        Integer integer = controlClass.checksNumberOfFieldsAtStartOfGame(x);

        Assertions.assertNotEquals(38, integer);

    }

}
