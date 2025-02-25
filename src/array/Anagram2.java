package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagram2 {
    void m1() {
        String[] wrds = {"evil", "eat", "df", "bad", "abd", "ate", "tea", "vile", "flat"};
        HashMap<String, List<String>> anagramMap = new HashMap<>();
        for (int i = 0; i < wrds.length; i++) {
            String word = wrds[i];
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if (!anagramMap.containsKey(sortedWord)) {
                anagramMap.put(sortedWord, new ArrayList<>());
            }
            anagramMap.get(sortedWord).add(word);
        }
        List<List<String>> result = new ArrayList<>();
        List<String> keys = new ArrayList<>(anagramMap.keySet());
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            result.add(anagramMap.get(key));
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Anagram2 obj = new Anagram2();
        obj.m1();
    }
}