package testproject.managers;

import org.apache.logging.log4j.Logger;

public class LogManager {
    public static Logger log = null;

    private LogManager() {}

    public static Logger getLogger() {
        if (log == null) {
            initializeLogger();
        }
        return log;
    }

    private static void initializeLogger() {
        log = org.apache.logging.log4j.LogManager.getLogger();
    }
}
