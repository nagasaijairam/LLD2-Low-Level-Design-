package DesignPatterns.factory;

import DesignPatterns.factory.Buttons.Button;
import DesignPatterns.factory.DropDowns.DropDown;

public interface UIFactory {
   public Button createButton(); // Factory method
   public DropDown createDropDown();// Factory method
}
