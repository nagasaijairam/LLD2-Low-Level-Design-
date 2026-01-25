package DesignPatterns.factory;

import DesignPatterns.factory.Buttons.Button;
import DesignPatterns.factory.Buttons.IOSButton;
import DesignPatterns.factory.DropDowns.DropDown;
import DesignPatterns.factory.DropDowns.IOSDropDown;

public  class IOSUIFactory implements UIFactory {
    public Button createButton() {
        return new IOSButton();
    }
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}