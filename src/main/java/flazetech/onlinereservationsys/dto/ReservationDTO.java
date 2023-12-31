package flazetech.onlinereservationsys.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationDTO {
    //
    private Long userId;
    private String firstName;
    private String lastName;
    private String fromCity;
    private String toCity;
    private String reservationDate;
    private String userStatus;
}
