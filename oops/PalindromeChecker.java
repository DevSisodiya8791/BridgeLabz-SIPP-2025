class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker();
        pc.text = "Madam";
        pc.displayResult();
    }
}
