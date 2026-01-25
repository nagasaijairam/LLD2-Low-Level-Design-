package DesignPatterns.factory;

import DesignPatterns.factory.Buttons.AndroidButton;
import DesignPatterns.factory.Buttons.Button;
import DesignPatterns.factory.Buttons.IOSButton;
import DesignPatterns.factory.DropDowns.AndroidDropDown;
import DesignPatterns.factory.DropDowns.DropDown;
import DesignPatterns.factory.DropDowns.IOSDropDown;

public class AndroidUIFactory implements UIFactory {
    public Button createButton() {
        return new AndroidButton();
    }
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
