public class CompareCharacters {
    public static void main(String[] args) {

        String str = "level";

        // Convert string to character array
        char[] chars = str.toCharArray();

        // Two pointers
        int start = 0;
        int end = chars.length - 1;

        boolean isSame = true;

        // Compare characters
        while (start < end) {
            if (chars[start] != chars[end]) {
                isSame = false;
                break;
            }
            start++;
            end--;
        }

        if (isSame) {
            System.out.println("Characters match (Palindrome)");
        } else {
            System.out.println("Characters do not match");
        }
    }
}