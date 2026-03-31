package org.example;
import java.util.Scanner;

public class AiChatbot {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Chatbot started 🤖 (type 'exit' to stop)");

            while (true) {
                System.out.print("You: ");
                String input = sc.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Bot: Goodbye 👋");
                    break;
                } else if (input.equalsIgnoreCase("hello")) {
                    System.out.println("Bot: Hi there 😊");
                } else if (input.equalsIgnoreCase("how are you")) {
                    System.out.println("Bot: I'm fine 👍");
                } else {
                    System.out.println("Bot: I don't understand 🤔");
                }
            }

            sc.close();
        }
    }

