package util;
import org.junit.jupiter.api.Assertions;

public class SoftAssert extends Assertions {
    private static Logger log = Logger.getInstance();

    private enum assertType {
        TRUE,
        FALSE,
        INT,
        STRING
    }

    private static void printComplete() {
        log.info("<- assertion completed!");
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
        Assertions.assertTrue(condition);
        printComplete();
    }

    public static void assertTrue(boolean condition, String msg) {
        log.info(customStart(assertType.TRUE, msg));
        Assertions.assertTrue(condition);
        printComplete();
    }

    // ===============assertFalse=================
    public static void assertFalse(boolean condition) {
        log.info(start(assertType.FALSE));
        Assertions.assertFalse(condition);
        printComplete();
    }

    public static void assertFalse(boolean condition, String msg) {
        log.info(customStart(assertType.FALSE, msg));
        Assertions.assertFalse(condition);
        printComplete();
    }

    // ===============assertEquals=================
    public static void assertEquals(String expected, String actual) {
        log.info(start(assertType.STRING));
        Assertions.assertEquals(expected, actual);
        printComplete();
    }

    public static void assertEquals(String expected, String actual, String msg) {
        log.info(customStart(assertType.STRING, msg));
        Assertions.assertEquals(expected, actual);
        printComplete();
    }

    public static void assertEquals(int expected, int actual) {
        log.info(start(assertType.INT));
        Assertions.assertEquals(expected, actual);
        printComplete();
    }

    public static void assertEquals(int expected, int actual, String msg) {
        log.info(customStart(assertType.INT, msg));
        Assertions.assertEquals(expected, actual);
        printComplete();
    }
}
