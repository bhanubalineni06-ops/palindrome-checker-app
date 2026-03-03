class Palindrome {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker");
        System.out.println("Version 1.0");
        System.out.println("System Initialized");

        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}