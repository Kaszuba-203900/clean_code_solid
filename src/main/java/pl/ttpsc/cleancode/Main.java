package pl.ttpsc.cleancode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> testValues = new ArrayList<Integer>() {{
            add(4);
            add(5);
            add(36);
            add(5);
        }};
        ListAnalizer listAnalizer = new ListAnalizer(testValues);
        System.out.println(listAnalizer.getAverageValue());
        System.out.println(listAnalizer.getMaxValue());
        System.out.println(listAnalizer.getMinValue());
        System.out.println(listAnalizer.getOccurrenceOfNumber(5));
    }
}
