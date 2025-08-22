class ReverseWords {
    public static String reverseWords(String s) {
        // Step 1: Trim and split the string
        String[] words = s.trim().split("\\s+");
        
        // Step 2: Reverse the words
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) result.append(" ");
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "the sky is blue";
        System.out.println(reverseWords(input)); // Output: blue is sky the
    }
}
