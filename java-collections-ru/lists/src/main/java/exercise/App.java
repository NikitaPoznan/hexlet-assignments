package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String symbols, String word) {

        symbols=symbols.toLowerCase();

        List availableSymbols = new ArrayList();
        for (int i = 0; i < symbols.length(); i++) {
            availableSymbols.add(symbols.charAt(i));
        }

        for (Character symbol : word.toLowerCase().toCharArray()) {
            if (!availableSymbols.contains(symbol)) {
                return false;
            }
            availableSymbols.remove(symbol);
        }
                return true;
    }

}
//END
