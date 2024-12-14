package javaWeek05Project;

public class SpacedLogger implements Logger {


    // Prints out the spaces messages
    public void log(String message) {
        System.out.println(addSpaces(message));
    }


    public void error(String message) {
        // Printing error messages
        System.err.println(addSpaces(message));
    }

    private String addSpaces(String message) {

        // Creates StringBuilder to craft spaced messages
        StringBuilder spacedMessage = new StringBuilder();

        // Loop to add spaces after each character in the string
        for (int i = 0; i < message.length(); i++) {
        	//Builds the string with the characters
            spacedMessage.append(message.charAt(i));
            // Add a space after each character except the last one
            if (i < message.length() - 1) {
                spacedMessage.append(' ');
            }
        }

        // Return the transformed message with spaces
        return spacedMessage.toString();
    }
}
