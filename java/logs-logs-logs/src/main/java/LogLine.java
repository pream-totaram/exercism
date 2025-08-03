public class LogLine {

    private String logLine;

    public LogLine(String logLine) {
      this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
      int startIndex = logLine.indexOf("[") + 1;
      int endIndex = logLine.indexOf("]");
      String shortName = logLine.substring(startIndex, endIndex);
      return LogLevel.getLogLevel(shortName);
    }

    public String getOutputForShortLog() {
      LogLevel level = getLogLevel();
      int beginIndex = logLine.indexOf(":") +2;
      return String.format("%d:%s",level.getNewOrdinal(),logLine.substring(beginIndex));
    }
}
