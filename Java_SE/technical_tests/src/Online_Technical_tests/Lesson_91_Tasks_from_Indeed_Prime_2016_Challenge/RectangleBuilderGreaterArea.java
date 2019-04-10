package Online_Technical_tests.Lesson_91_Tasks_from_Indeed_Prime_2016_Challenge;

// GitHub code

import java.util.*;
import java.util.stream.Collectors;

public class RectangleBuilderGreaterArea {
    public int solution(int[] A, int X) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            if (map.get(a) == null) {
                map.put(a, 1);
            } else {
                map.put(a, map.get(a) + 1);
            }
        }
        List<Integer> valid = map.entrySet().stream()
                .filter(entry -> entry.getValue() >= 2)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        int count = 0;
        int duplicatesCount = 0;
        int result = 0;
        Collections.sort(valid);
        for (Integer number : valid) {
            int factor = (int) Math.ceil((double) X / (double) number);
            int index = Collections.binarySearch(valid, factor);
            if (index < 0) {
                index = -index - 1;
            }
            count += valid.size() - index;
            if (number >= factor) {
                if (map.get(number) >= 4) {
                    duplicatesCount++;
                }
                count--;
            }
            result = count / 2 + duplicatesCount;
            if (result > 1000000000) {
                return -1;
            }
        }
        return result;
    }
}