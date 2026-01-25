package DesignPatterns.factory;

public  class UIFactoryFactory {
    public static UIFactory getUIFactoryForPlatform(SupportedPlatforms platform){
        if(platform.equals(SupportedPlatforms.Android)){
            return new AndroidUIFactory();
        }else if(platform.equals(SupportedPlatforms.IOS)){
            return new IOSUIFactory();
        }
        return null;
    }
}
