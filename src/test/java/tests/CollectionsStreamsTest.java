package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionsStreamsTest extends BaseTest {
    @Test
    public void frequencyMapTest() {
        String longText = "apple banana apple orange banana apple";
        Map<String, Long> actualResult =
                Arrays.stream(longText.split(" "))
                        .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        Map<String, Long> expectedResult = new HashMap<>(Map.of(
                "orange", 1L,
                "banana", 2L,
                "apple", 3L
        ));
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void groupByInitialLetterTest() {
        List<String> names = List.of("Alice", "Bob", "Aria", "Charlie", "Austin");
        Map<Character, List<String>> actualResult = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
        Map<Character, List<String>> expectedResult = new HashMap<>(Map.of(
                'A', List.of("Alice", "Aria", "Austin"),
                'B', List.of("Bob"),
                'C', List.of("Charlie")
        ));
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void mergingBasketsTest() {
        Map<String, Double> storeA = Map.of("apple", 1.5, "milk", 2.0);
        Map<String, Double> storeB = Map.of("apple", 1.2, "bread", 1.5);
        Map<String, Double> actualResult = new HashMap<>(storeA);
        storeB.forEach((k, v) ->
                actualResult.merge(k, v, Math::min));
        Map<String, Double> expectedResult = new HashMap<>(Map.of(
                "apple", 1.2d,
                "milk", 2d,
                "bread", 1.5d
        ));
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void collectionFilteringTest() {
        Map<String, Integer> inp = Map.of(
                "bread", 10,
                "milk", 2,
                "eggs", 12,
                "cheese", 3);
        Map<String, Integer> actualResult = inp.entrySet().stream()
                .filter(e -> e.getValue() < 5)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
        Map<String, Integer> expectedResult = new HashMap<>(Map.of(
                "milk", 2,
                "cheese", 3
        ));
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void dataTransformationTest() {
        Map<String, Integer> inp = Map.of(
                "John", 10,
                "Anna", 50,
                "Greg", 77,
                "Alice", 44);
        Map<String, String> actualResult = inp.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> e.getValue() > 50 ? "Pass" : "Fail"
                ));
        Map<String, String> expectedResult = new HashMap<>(Map.of(
                "John", "Fail",
                "Anna", "Fail",
                "Greg", "Pass",
                "Alice", "Fail"
        ));
        Assert.assertEquals(actualResult, expectedResult);
    }
}
