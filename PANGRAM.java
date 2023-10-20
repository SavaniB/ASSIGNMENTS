
       public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace with your input string
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        // Create an array to mark the presence of each letter in the alphabet
        boolean[] alphabetPresent = new boolean[26];

        // Convert the input string to lowercase to handle uppercase and lowercase letters
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check if the character is a lowercase letter
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                alphabetPresent[index] = true;
            }
        }

        // Check if all letters from a to z are present in the input
        for (boolean present : alphabetPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}
