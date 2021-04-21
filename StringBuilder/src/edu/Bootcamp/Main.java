package edu.Bootcamp;

public class Main {

    public static void main(String[] args) {
//      Strings are immutable, but the StringBuilder Class lets us mutate an existing Sting, and gives us an efficient way to build a String piece by piece.

        String location = "Florida";
        int flightNumber = 175;
        StringBuilder exampleOfStringBuilderVariable = new StringBuilder(40); // The number in the parenthesis here is optional, but it helps it to work more efficiently if you know about how many characters your String will be.

        exampleOfStringBuilderVariable.append("I flew to ");
        exampleOfStringBuilderVariable.append(location);
        exampleOfStringBuilderVariable.append(" on Flight #");
        exampleOfStringBuilderVariable.append(flightNumber);

//      Now, to view what the final product is, just run the result throught .toString() and set it equal to another String:
        String finalMessage = exampleOfStringBuilderVariable.toString();
        System.out.println(finalMessage);

//      Aside from .append(), we can also replace existing parts of a StringBuilder variable:
        String time = "0900";
        int variableWithAPosition = exampleOfStringBuilderVariable.indexOf(" on"); // This saves a part of the StringBuilder variable and gives you a chance to edit it, even though it's in the very middle of the String.
        exampleOfStringBuilderVariable.insert(variableWithAPosition, " at "); // Here, we're locating the value of variableWithAPosition in the String, and inserting " at " where variableWithAPosition was.
        exampleOfStringBuilderVariable.insert(variableWithAPosition + 4, time); // This does the same thing as the previous .insert(), but inserts it 4 characters after variableWithAPosition

        finalMessage = exampleOfStringBuilderVariable.toString();
        System.out.println(finalMessage);

    }
}
