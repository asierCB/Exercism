public class LogLevels {
    public static String message(String logLine) {
		int position = logLine.indexOf(':');
		String resultFinal= logLine.substring(position + 1, logLine.length());
		return resultFinal.trim();
    }

    public static String logLevel(String logLine) {
        int position1 = logLine.indexOf('[');
        int position2 = logLine.indexOf(']');
        String resultFinal= logLine.substring(position1 + 1, position2);
        return resultFinal.toLowerCase();
    }

    public static String reformat(String logLine) {
    	int position = logLine.indexOf(':');
		String resultFinal1= logLine.substring(position + 1, logLine.length()).trim();
		
		int position1 = logLine.indexOf('[');
        int position2 = logLine.indexOf(']');
        String resultFinal2= logLine.substring(position1 + 1, position2).toLowerCase();
        
        return (resultFinal1 + " (" + resultFinal2 + ")");   
    }
    
}
