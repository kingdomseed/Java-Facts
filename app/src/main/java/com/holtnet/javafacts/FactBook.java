package com.holtnet.javafacts;

import java.util.Random;

/**
 * Created by jholt on 11/4/2014.
 * Blueprint for FactBook
 */
public class FactBook {
    // This object contains mColors.

   public String[] mFacts = {
            "Java is cAsE sEnSiTiVe.",
            "Every Java statement must end with a semicolon;",
            "Everything in a Java program must be inside a class.",
            "A class looks like: public class HelloWorld {\n" +
                    "            }",
            "Every Java program must have a main method that looks like: public static void main(String[] args) {\n" +
                    "            }",
            "System.out.println(); prints the contents of () to the console window.",
            "System.out.println(); can have variables and String literals passed to it",
            "The JAVAC compiles Java source code into byte code that the JVM can understand.",
            "The JVM executes the instructions in the byte code and sends the appropriate instructions to hardware.",
            "A variable is a named piece of memory that can store data.", // Index 9
            "Variable declaration has two parts: choose data type, name variable.",
            "Variable initialization has two parts: assignment operator and value or state",
            "Primitive data types in Java include: int, byte, short, long, double, float, char, and boolean.",
            "All primitive data types start with a lowercase letter.",
            "Objects and advanced data types begin with an upper case letter. Ex. String.",
            "Example of a variable declaration: int num;",
            "Example of a variable initialization: int num = 25;",
            "Example of an object instantiation: Scanner keyboard = new Scanner(System.in);",
            "Java is an Object-Oriented programming language.",
            "Most classes require you to import them before you can instantiate a new object from that class.",
            "In order to perform a cast (converting one data type to another) you need to place the name of the data type you want to convert to in parenthesis before the variable you want to convert.",
            "Operators in Java include: +, -, *, /, and, %.",
            "We can store calculations in variables as follows:\n" +
                    "int num, bum, sum;\n" +
                    "num = 5; bum = 10; sum = num + bum;"
    };

    public String getFact() {

        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random();  // Construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }


}
