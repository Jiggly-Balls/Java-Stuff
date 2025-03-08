import java.sql.SQLOutput;

public class ConditionalStatements {
    public static void main(String[] args) {
        /* Relational Operators-
            > Greater Than
            < Lesser Than
            >= Greater Than OR Equal To
            <= Lesser Than OR Equal To
            == Equal to
            != Not equal to
         */

        int myGrade = 100;
        int totalGrade = 100;

        if (myGrade == totalGrade)
            System.out.println("You got a 100!");
        else if (myGrade > 50)
            System.out.println("You passed!");
        else
            System.out.println("You failed!");

        /* Logical Operators-
            || OR Operator
            && AND Operator
            ! NOT Operator
        */

        boolean isRainy = true;
        boolean hasUmbrella = false;

        if (isRainy && !hasUmbrella)
            System.out.println("You are wet! You need an umbrella");
    }
}
