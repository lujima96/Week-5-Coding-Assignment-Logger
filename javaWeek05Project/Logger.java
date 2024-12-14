package javaWeek05Project;

public interface Logger {
	/*
	 * Creates a record of messages
	 * Parameter: String message
	 */
	void log(String message);

	/*
	 * Creates a record of error messages
	 */
	void error(String message);
}
