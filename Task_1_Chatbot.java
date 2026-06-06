import java.util.HashMap;
import java.util.Scanner;

public class Task_1_Chatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> faq = new HashMap<>();

        faq.put("hi", "Hello! I am CodeAlpha ChatBot. How can I help you?");
        faq.put("certificate", "You get certificate after completing 2 tasks and submitting report.");
        faq.put("deadline", "Deadline is 10th June 2026 for task submission.");
        faq.put("bye", "Goodbye! All the best for your internship.");

        System.out.println("=== CodeAlpha FAQ ChatBot ===");
        System.out.println("Type 'bye' to exit");
        
        while(true) {
            System.out.print("\nYou: ");
            String input = sc.nextLine().toLowerCase();
            
            if(input.equals("bye")) {
                System.out.println("Bot: " + faq.get("bye"));
                break;
            }
            
            boolean found = false;
            for(String key : faq.keySet()) {
                if(input.contains(key)) {
                    System.out.println("Bot: " + faq.get(key));
                    found = true;
                    break;
                }
            }
            
            if(!found) {
                System.out.println("Bot: Ask about: certificate, deadline");
            }
        }
        System.out.println("\nSubmitted by: Mahima Patel - CodeAlpha Java Intern");
        sc.close();
    }
}
