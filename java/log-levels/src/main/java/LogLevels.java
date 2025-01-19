public class LogLevels {
    
    public static String message(String logLine) {
        String[] message = logLine.split(":", 2);
        return message[1].trim();
    }

    public static String logLevel(String logLine) {
    	return logLine.split("]:")[0].substring(1).toLowerCase();
    }

    public static String reformat(String logLine) {
    	return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
