package org.cleartrip.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Theater extends BaseModel{
    private String name;
    private String region;
    private List<Screen> screens;
}
