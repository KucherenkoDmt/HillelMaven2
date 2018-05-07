package HomeWork.Log;

import java.io.IOException;

public class MainLog {
    public static void main(String[] args) throws IOException {
        TextAndFileLogger textAndFilleLogger = new TextAndFileLogger();
      textAndFilleLogger.log("Start Log");
      textAndFilleLogger.log("Open website");
      textAndFilleLogger.log("Login user");
      textAndFilleLogger.log("Open my account");

     FilleLogger filleLogger = new FilleLogger();
     filleLogger.toFile("Start browser2");
     filleLogger.toFile("Open website2");


          testLogin();
    }

    private static void testLogin() throws IOException {
        ConsoleLogger log1 = new ConsoleLogger();
        log1.log("Start browser");
        log1.log("Open website");
        log1.log("Login user");
        log1.log("Open my account");
    }
}
