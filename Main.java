import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj słowa oddzielone spacjami:");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+"); // Podziel wejście na słowa

        Map<String, Integer> wordCountMap = new HashMap<>();

        // Oblicz liczbę wystąpień każdego słowa
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                // Jeśli słowo już wystąpiło, zwiększ licznik o 1
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                // Jeśli słowo nie wystąpiło wcześniej, dodaj je z licznikiem 1
                wordCountMap.put(word, 1);
            }
        }

        // Wyświetl powtórzenia
        System.out.println("Powtórzenia wśród podanych słów:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " razy");
            }
        }
    }
}