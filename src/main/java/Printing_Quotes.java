 /*
  * UCF COP3330 Fall 2021 Assignment 1 Solution
  * Copyright 2021 Deirdre Gruman-Walsh
  */
import java.util.Scanner;

public class Printing_Quotes<Author_Value> {

        public static void main(String[] args) {
            var author_input = new Scanner(System.in);
            var quote_input = new Scanner(System.in);

            System.out.print("What is the Quote? ");
            var Quote = quote_input.nextLine();

            System.out.printf("Who said it? ");
            var Author = author_input.nextLine();

            System.out.print("\n"+Author+ " said,\"" +Quote+ "\"");
        }
    }

