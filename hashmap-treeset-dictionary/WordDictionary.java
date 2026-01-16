import java.util.*;

public class WordDictionary {
    private Map<Character, TreeSet<String>> dictionary;
    
    public WordDictionary() {
        dictionary = new HashMap<>();
    }
    
    public void addWord(String word) {
        if (word == null || word.isEmpty()) {
            return;
        }
        
        char firstLetter = Character.toUpperCase(word.charAt(0));
        
        if (!dictionary.containsKey(firstLetter)) {
            dictionary.put(firstLetter, new TreeSet<>());
        }
        
        dictionary.get(firstLetter).add(word);
    }
    
    public void printAllWords() {
        List<Character> letters = new ArrayList<>(dictionary.keySet());
        // Collections.sort(letters);
        
        for (char letter : letters) {
            System.out.println(letter + ":");
            for (String word : dictionary.get(letter)) {
                System.out.println("  " + word);
            }
            System.out.println();
        }
    }
    
    public void printWordsByLetter(char letter) {
        letter = Character.toUpperCase(letter);
        
        if (dictionary.containsKey(letter)) {
            System.out.println("Words starting with " + letter + ":");
            for (String word : dictionary.get(letter)) {
                System.out.println("  " + word);
            }
        } else {
            System.out.println("No words found for letter " + letter);
        }
    }
    
    public boolean searchWord(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        
        char firstLetter = Character.toUpperCase(word.charAt(0));
        
        if (dictionary.containsKey(firstLetter)) {
            for (String w : dictionary.get(firstLetter)) {
                if (w.equalsIgnoreCase(word)) {
                    return true;
                }
            }
        }
        return false;
    }
}