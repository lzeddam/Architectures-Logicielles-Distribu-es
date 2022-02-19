package com.example.agencyService2.controller;

import com.example.agencyService2.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
    @Autowired
    ReservationService reservationService;
    private static  final String agencyName = "agency2";

    @GetMapping(agencyName+"/reservation/{hotelId}/{offerId}/{firstName}/{lastName}")
    public Long creatReservation(@PathVariable Long hotelId, @PathVariable Long offerId, @PathVariable String firstName
            , @PathVariable String lastName){
        return reservationService.creatReservation(hotelId, offerId, firstName, lastName);
    }
}
