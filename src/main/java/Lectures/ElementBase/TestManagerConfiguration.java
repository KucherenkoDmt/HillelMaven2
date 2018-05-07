package Lectures.ElementBase;

public class TestManagerConfiguration {
    private static TestManagerConfiguration instance;

    TestManagerConfiguration() {  }

    public static TestManagerConfiguration getInstance() {
        if (instance == null) {
            instance = new TestManagerConfiguration();
        }
        return instance;
    }

    public String getTestBrowser() {
        return System.getenv("testBrowser") == null ? "Crome" : System.getenv("testBrowser");
    }

    public String getTestEnv() {
        return valueOrDefault(System.getenv("testEnv"), "Prodaction");
    }

    private String valueOrDefault(String envVar, String defoltValue) {
        return envVar == null ? defoltValue : envVar;
    }
}
