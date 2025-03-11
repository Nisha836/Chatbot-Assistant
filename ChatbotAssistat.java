import java.util.Scanner;
import java.util.HashMap;  
import java.util.Map;    
public class ChatbotAssistant {
    static class Chatbot {
        private Map<String, String> responses;
        public Chatbot() {
            responses = new HashMap<>();
            initializeResponses();
        }
        private void initializeResponses() {
            responses.put("hi", "Hello! How can I help you today?");
            responses.put("hello", "Hi there! How can I assist you?");
            responses.put("how are you?", "I'm doing great, thank you for asking!");
            responses.put("bye", "Goodbye! Have a great day!");
            responses.put("thank you", "You're welcome!");
            responses.put("what is your name?", "I am a simple chatbot assistant.");
            responses.put("what is java?", "Java is a high-level programming language used to build applications.");
        }
        public String getResponse(String input) {
            input = input.toLowerCase().trim();
            if (responses.containsKey(input)) {
                return responses.get(input);
            } else {
                return "I'm sorry, I don't understand that. Can you ask something else?";
            }
        }
    }
    public static void main(String[] args) {
        Chatbot chatbot = new Chatbot();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot Assistant: Hello! Type 'bye' to exit.");
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("Chatbot Assistant: Goodbye! Take care.");
                break;
            }
            String response = chatbot.getResponse(userInput);
            System.out.println("Chatbot Assistant: " + response);
        }

        scanner.close();
    }
}