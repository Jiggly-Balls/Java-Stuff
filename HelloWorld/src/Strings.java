public class Strings {
    public static void main(String[] args) {
        String name = "Krish";
        int age = 19;

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.indexOf("Kr"));
        // Returns the index of that character.
        // If it doesn't exist, it returns -1.

        String formatString = "%s is %d years old.";
        System.out.printf(formatString, name, age);  // String formatting

        /* Format identifiers-
        %d - Integers
        %f - Floats & Doubles
        %s - Strings & Chars
         */
    }
}
