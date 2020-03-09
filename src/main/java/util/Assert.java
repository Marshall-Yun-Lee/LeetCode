package util;
import org.junit.jupiter.api.Assertions;
import org.opentest4j.AssertionFailedError;

public class Assert extends Assertions {
    private static Logger log = Logger.getInstance();

    // ===============Helpers=================
    private enum assertType {
        TRUE,
        FALSE,
        INT,
        STRING
    }

    private static void printComplete(Object actual, Object expected, boolean flag) {

        if (flag) {
            log.info("<- Test passed: " + actual + "\n");
        } else {
            log.info("<- Test expected [" + expected + "] but found [" + actual + "]\n");
            throw new AssertionFailedError();
        }
    }

    private static void printCompleteT(boolean flag) {
        if (flag) {
            log.info("<- Test passed: TRUE\n");
        } else {
            log.info("<- Test failed: FALSE\n");
            throw new AssertionFailedError();
        }
    }

    private static void printCompleteF(boolean flag) {
        if (flag) {
            log.info("<- Test passed: FALSE\n");
        } else {
            log.info("<- Test failed: TRUE\n");
            throw new AssertionFailedError();
        }
    }

    private static String start(assertType type) {
        String out = "";
        switch (type) {
            case TRUE:
                out = "-> asserting true... ";
                break;
            case FALSE:
                out = "-> asserting false... ";
                break;
            case INT:
                out = "-> asserting int... ";
                break;
            case STRING:
                out = "-> asserting string... ";
                break;
        }
        return out;
    }

    private static String customStart(assertType type, String msg) {
        return start(type) + msg;
    }

    // ===============assertTrue=================
    public static void assertTrue(boolean condition) {
        log.info(start(assertType.TRUE));
        try {
            Assertions.assertTrue(condition);
        } catch (AssertionFailedError e) {
            printCompleteT(false);
        }
        printCompleteT(true);
    }

    public static void assertTrue(boolean condition, String msg) {
        log.info(customStart(assertType.TRUE, msg));
        try {
            Assertions.assertTrue(condition);
        } catch (AssertionFailedError e) {
            printCompleteT(false);
        }
        printCompleteT(true);
    }

    // ===============assertFalse=================
    public static void assertFalse(boolean condition) {
        log.info(start(assertType.FALSE));
        try {
            Assertions.assertFalse(condition);
        } catch (AssertionFailedError e) {
            printCompleteT(false);
        }
        printCompleteT(true);
    }

    public static void assertFalse(boolean condition, String msg) {
        log.info(customStart(assertType.FALSE, msg));
        try {
            Assertions.assertFalse(condition);
        } catch (AssertionFailedError e) {
            printCompleteT(false);
        }
        printCompleteT(true);
    }

    // ===============assertEquals=================
    public static void assertEquals(String expected, String actual) {
        log.info(start(assertType.STRING));
        try {
            Assertions.assertEquals(expected, actual);
        } catch (AssertionFailedError e) {
            printComplete(expected, actual, false);
        }
        printComplete(expected, actual, true);
    }

    public static void assertEquals(String expected, String actual, String msg) {
        log.info(customStart(assertType.STRING, msg));
        try {
            Assertions.assertEquals(expected, actual);
        } catch (AssertionFailedError e) {
            printComplete(expected, actual, false);
        }
        printComplete(expected, actual, true);
    }

    public static void assertEquals(int expected, int actual) {
        log.info(start(assertType.INT));
        try {
            Assertions.assertEquals(expected, actual);
        } catch (AssertionFailedError e) {
            printComplete(expected, actual, false);
        }
        printComplete(expected, actual, true);
    }

    public static void assertEquals(int expected, int actual, String msg) {
        log.info(customStart(assertType.INT, msg));
        try {
            Assertions.assertEquals(expected, actual);
        } catch (AssertionFailedError e) {
            printComplete(expected, actual, false);
        }
        printComplete(expected, actual, true);
    }
}
