package DesignPatterns.factory;

import DesignPatterns.factory.Buttons.Button;
import DesignPatterns.factory.DropDowns.DropDown;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactoryForPlatform(SupportedPlatforms.IOS);
        Button button =  uiFactory.createButton();
       DropDown dropDown= uiFactory.createDropDown();
       button.click();
       dropDown.showDropDown();
    }
}
