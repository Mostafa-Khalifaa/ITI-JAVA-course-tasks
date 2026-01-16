import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WordDictionary dict = new WordDictionary();
        Scanner scanner = new Scanner(System.in);
       
        
        dict.addWord("Ball");
        dict.addWord("Book");
        dict.addWord("Bird");
        dict.addWord("Box");
        dict.addWord("Bag");
        dict.addWord("Boat");
        dict.addWord("Baby");
        dict.addWord("Bell");
        dict.addWord("Bone");
        dict.addWord("Bear");
        
        dict.addWord("Cat");
        dict.addWord("Car");
        dict.addWord("Cup");
        dict.addWord("Cake");
        dict.addWord("Coin");
        dict.addWord("Chair");
        dict.addWord("Cloud");
        dict.addWord("Clock");
        dict.addWord("Cow");
        dict.addWord("Coat");
        
        dict.addWord("Dog");
        dict.addWord("Door");
        dict.addWord("Desk");
        dict.addWord("Duck");
        dict.addWord("Doll");
        dict.addWord("Dish");
        dict.addWord("Day");
        dict.addWord("Dream");
        dict.addWord("Dance");
        dict.addWord("Drum");
        
        dict.addWord("Egg");
        dict.addWord("Eye");
        dict.addWord("Ear");
        dict.addWord("Earth");
        dict.addWord("East");
        dict.addWord("End");
        dict.addWord("Edge");
        dict.addWord("Elbow");
        dict.addWord("Engine");
        dict.addWord("Eagle");


         
        dict.addWord("Apple");
        dict.addWord("Animal");
        dict.addWord("Art");
        dict.addWord("Arrow");
        dict.addWord("Angel");
        dict.addWord("Anchor");
        dict.addWord("Ant");
        dict.addWord("Arm");
        dict.addWord("Air");
        dict.addWord("Aunt");
        
        int choice = 0;
        
        do {
            System.out.println("\n=== Word Dictionary Menu ===");
            System.out.println("1. Print all words");
            System.out.println("2. Search by letter");
            System.out.println("3. Search for a word");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input");
                scanner.nextLine();
                continue;
            }
            
            switch (choice) {
                case 1:
                    System.out.println("\n All Words in Dictionary ");
                    dict.printAllWords();
                    break;
                    
                case 2:
                    System.out.print("Enter a letter to search: ");
                    String letterInput = scanner.nextLine();
                    if (letterInput.isEmpty()) {
                        System.out.println("Please enter a letter");
                        break;
                    }
                    char letter = letterInput.charAt(0);
                    System.out.println();
                    dict.printWordsByLetter(letter);
                    break;
                    
                case 3:
                    System.out.print("Enter a word to search: ");
                    String searchWord = scanner.nextLine();
                    if (searchWord.isEmpty()) {
                        System.out.println("Please enter a word");
                        break;
                    }
                    if (dict.searchWord(searchWord)) {
                        System.out.println("'" + searchWord + "' found in dictionary");
                    } else {
                        System.out.println("'" + searchWord + "' NOT found");
                    }
                    break;
                    
                case 4:
                    break;
                    
                default:
                    System.out.println("Invalid choice");
            }
            
        } while (choice != 4);
        
        scanner.close();
    }
}