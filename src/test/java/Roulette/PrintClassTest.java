package Roulette;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class PrintClassTest {

    @Test
    public void printsFieldsAndRatesChosenByPlayerTest01(){

        PrintClass printClass = new PrintClass();

        Integer[] fields = new Integer[]{1, 2, 3};
        Integer[] rates = new Integer[]{100, 200, 300};

        ArrayList<Integer> arrayList = printClass.printsFieldsAndRatesChosenByPlayer(fields, rates);

        Assertions.assertEquals(3, arrayList.get(2));

    }

    @Test
    public void printsFieldsAndRatesChosenByPlayerTest02(){

        PrintClass printClass = new PrintClass();

        Integer[] fields = new Integer[]{1, 2, 3};
        Integer[] rates = new Integer[]{100, 200, 300};

        ArrayList<Integer> arrayList = printClass.printsFieldsAndRatesChosenByPlayer(fields, rates);

        Assertions.assertNotEquals(4, arrayList.get(2));

    }

    @Test
    public void printsFieldsAndRatesChosenByPlayerTest03(){

        PrintClass printClass = new PrintClass();

        Integer[] fields = new Integer[]{1, 2, 3};
        Integer[] rates = new Integer[]{100, 200, 300};

        ArrayList<Integer> arrayList = printClass.printsFieldsAndRatesChosenByPlayer(fields, rates);

        Assertions.assertNotNull(arrayList.get(5));

    }

    @Test
    public void printsFieldsAndRatesChosenByPlayerTest04(){

        PrintClass printClass = new PrintClass();

        Integer[] fields = new Integer[]{1, 2, 3};
        Integer[] rates = new Integer[]{100, 200, 300};

        ArrayList<Integer> arrayList = printClass.printsFieldsAndRatesChosenByPlayer(fields, rates);

        ArrayList<Integer> arrayListForChecking = new ArrayList<>();
        arrayListForChecking.add(1);
        arrayListForChecking.add(2);
        arrayListForChecking.add(3);
        arrayListForChecking.add(100);
        arrayListForChecking.add(200);
        arrayListForChecking.add(3000);

        Assertions.assertNotEquals(arrayListForChecking, arrayList);

    }

    @Test
    public void printsFieldsAndRatesChosenByPlayerTest05(){

        PrintClass printClass = new PrintClass();

        Integer[] fields = new Integer[]{1, 2, 3};
        Integer[] rates = new Integer[]{100, 200, 300};

        ArrayList<Integer> arrayList = printClass.printsFieldsAndRatesChosenByPlayer(fields, rates);

        ArrayList<Integer> arrayListForChecking = new ArrayList<>();
        arrayListForChecking.add(1);
        arrayListForChecking.add(2);
        arrayListForChecking.add(3);
        arrayListForChecking.add(100);
        arrayListForChecking.add(200);
        arrayListForChecking.add(300);

        Assertions.assertEquals(arrayListForChecking, arrayList);

    }

}
