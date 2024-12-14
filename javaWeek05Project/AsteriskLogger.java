package javaWeek05Project;

//Logs messages placing asterisks and a space before and after a message or error message
public class AsteriskLogger implements Logger {

	// Handles message inputs
    public void log(String message) {
        String decoratedMessage = "*** " + message + " ***";
        System.out.println(decoratedMessage);
    }
    // Handles error message inputs
    public void error(String message) {
        String decoratedError = "*** ERROR: " + message + " ***";
        System.err.println(decoratedError);
    }
}
