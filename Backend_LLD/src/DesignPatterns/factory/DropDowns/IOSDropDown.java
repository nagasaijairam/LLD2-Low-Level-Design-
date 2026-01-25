package DesignPatterns.factory.DropDowns;

public class IOSDropDown implements DropDown {
    @Override
    public void showDropDown() {
        System.out.println("Showing IOSDropDown");
    }
}
