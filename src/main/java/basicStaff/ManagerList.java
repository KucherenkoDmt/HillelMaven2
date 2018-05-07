package basicStaff;

import HomeWork.Log.ConsoleLogger;
import HomeWork.UrlBuilder.Url;

public class ManagerList {
    public  ConfigurationManager configuration(){
        return ConfigurationManager.getInstatance();
    }
    public ConsoleLogger logger(){
        return new ConsoleLogger();
    }
    public Url.UrlBuilder urlBuilder(String hostName){
        return new Url.UrlBuilder(hostName);
    }

}
