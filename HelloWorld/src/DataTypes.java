/*
Notes-
    Variables use pascal casing
    '+' is used for concatenation
    char datatype value should be in single quotes
    String datatype should be in double quotes
 */

public class DataTypes {
    public static void main(String[] args) {
        // Primitive Datatypes-

        int age = 19;
        double salary = -23.4;
        float money = 3.6f;
        boolean isUnderage = false;
        char grade = 'F';

        // Non-Primitive Datatypes-

        String name = "Krish";

        System.out.println(
                "My name is " + name + ". I'm " + age + " years old "
                + "and my salary is " + salary
        );

        System.out.println(
                "Am I underage? " + isUnderage + "\nMy math grade: " + grade
        );

    }
}
