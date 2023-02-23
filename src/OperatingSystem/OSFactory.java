 package OperatingSystem;

public class OSFactory {
    OS getOS(String input){
        switch (input){
            case "android":
                return new Android();
            case "windows":
                return new Windows();
            case "mac":
                return new Mac();
            default:
                return null;
        }
    }


}
