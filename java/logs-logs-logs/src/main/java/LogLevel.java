public enum LogLevel {
  UNKNOWN(0),
  TRACE(1),
  DEBUG(2),
  INFO(4),
  WARNING(5),
  ERROR(6),
  FATAL(42);

private final int newOrdinal;

  LogLevel(int newOrdinal) {
    this.newOrdinal = newOrdinal;
  }

  public int getNewOrdinal() {
    return newOrdinal;
  }

  public static LogLevel getLogLevel(String shortName) {
    switch (shortName) {
      case "TRC":
        return TRACE;
      case "DBG":
        return DEBUG;
      case "INF":
        return INFO;
      case "WRN":
        return WARNING;
      case "ERR":
        return ERROR;
      case "FTL":
        return FATAL;
      default:
        return UNKNOWN;
    }
  }

}
