package org.cleartrip.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat extends BaseModel{
    private int rowNumber;
    private int columnNumber;
    private String seatNumber;
    private SeatType seatType;

}
