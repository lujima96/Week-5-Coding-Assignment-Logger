package javaWeek05Project;

public class App {
    public static void main(String[] args) {
        // Instantiate AsteriskLogger and SpacedLogger
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();
        
        // Array of sample messages
        String[] messages = {
            "Yo bobby how is it going?",
            "Will you help me with this quest?",
            "I need to kill 100 boars"
        };
        
        // Array of sample error messages
        String[] errorMessages = {
            "I can't cast that yet",
            "I'm out of range",
            "Not enough rage"
        };
        
        // Testing Regular Messages with AsteriskLogger
        System.out.println("\n--- Testing Regular Messages with AsteriskLogger ---");
        for(String message : messages) {
            asteriskLogger.log(message);
        }
        
        // Testing Regular Messages with SpacedLogger
        System.out.println("\n--- Testing Regular Messages with SpacedLogger ---");
        for(String message : messages) {
            spacedLogger.log(message);
        }
    
        // Testing Error Messages with AsteriskLogger
        System.out.println("\n--- Testing Error Messages with AsteriskLogger ---");
        for(String errorMessage : errorMessages) {
            asteriskLogger.error(errorMessage);
        }
        
        // Testing Error Messages with SpacedLogger
        System.out.println("\n--- Testing Error Messages with SpacedLogger ---");
        for(String errorMessage : errorMessages) {
            spacedLogger.error(errorMessage);
        }
    }
}
