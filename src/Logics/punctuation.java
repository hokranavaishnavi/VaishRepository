package Logics;

public class punctuation {
        public static void main(String[] args) {
            String str = "Hello, world! How_ are you doing today?";
            int count = 0;
            int i = 0;

            while (i < str.length()) {
                char ch = str.charAt(i);
                // Check if character is punctuation
                if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                    count++;
                }
                i++;
            }

            System.out.println("Total number of punctuation characters: " + count);
        }
    }


