package pl.ttpsc.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ListAnalizer {

    Map<Integer, Integer> numbers = new HashMap<>();
    private int maxValue = Integer.MIN_VALUE;
    private int minValue = Integer.MAX_VALUE;

    public ListAnalizer() { }
    public ListAnalizer(List<Integer> entryValues) {
        fillMapWithEntryValues(entryValues);
    }

    private void fillMapWithEntryValues(List<Integer> entryValues) {
        for (Integer singleValue : entryValues) {
            addNumberToMap(singleValue);
        }
    }

    private void addNumberToMap(Integer i) {
        if (numbers.containsKey(i)) {
            Integer k = numbers.get(i);
            numbers.put(i, k + 1);
        } else {
            numbers.put(i, 1);
        }
        if (i > maxValue) {
            maxValue = i;
        }
        if (i < minValue) {
            minValue = i;
        }
    }

    private int getOccurrenceOfNumber(int i) {
        if (numbers.containsKey(i)) {
            return numbers.get(i);
        } else {
            return 0;
        }
    }

    public double getAverageValue() {
        double sumOfValues = 0;
        double allNumbers = 0;
        for (Entry<Integer, Integer> u : numbers.entrySet()) {
            allNumbers += u.getValue();
            sumOfValues += u.getKey() * u.getValue();
        }
        return sumOfValues / allNumbers;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getMinValue() {
        return minValue;
    }
}