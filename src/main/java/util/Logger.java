package util;

public class Logger {
    // static instance of Logger
    public static Logger instance;

    // singleton
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void success(String msg) {
        System.out.println("SUCCESS::: " + msg);
    }
    public void success(int msg) {
        System.out.println("SUCCESS::: " + msg);
    }

    public void fail(String msg) {
        System.out.println("FAIL::: " + msg);
    }
    public void fail(int msg) {
        System.out.println("FAIL::: " + msg);
    }

    public void debug(String msg) {
        System.out.println("debug: " + msg);
    }
    public void debug(int msg) {
        System.out.println("debug: " + msg);
    }

    public void info(String msg) {
        System.out.println("INFO: " + msg);
    }
    public void info(int msg) {
        System.out.println("INFO: " + msg);
    }


    public void plain(String msg) {
        System.out.println(msg);
    }
    public void plain(int msg) {
        System.out.println(msg);
    }
}
