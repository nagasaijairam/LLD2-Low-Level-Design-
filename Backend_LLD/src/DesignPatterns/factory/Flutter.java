package DesignPatterns.factory;

public class Flutter {
    public void refresh(){
        System.out.println("UI is refreshing...");
    }
    public void theme(){
        System.out.println("Select your theme...");
    }

    public UIFactory getUIFactoryForPlatform(SupportedPlatforms platform){
//        if(platform.equals(SupportedPlatforms.Android)){
//            return new AndroidUIFactory();
//        }else if(platform.equals(SupportedPlatforms.IOS)){
//            return new IOSUIFactory();
//        }
//        return null;
        return  UIFactoryFactory.getUIFactoryForPlatform(platform);
    }
}
