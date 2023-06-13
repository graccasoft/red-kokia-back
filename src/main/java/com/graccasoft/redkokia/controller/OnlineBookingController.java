package com.graccasoft.redkokia.controller;

import com.graccasoft.redkokia.model.dto.TimeSlot;
import com.graccasoft.redkokia.model.dto.TreatmentDto;
import com.graccasoft.redkokia.service.BookingService;
import com.graccasoft.redkokia.service.TreatmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("online-booking")
public class OnlineBookingController {

    private final BookingService bookingService;
    private final TreatmentService treatmentService;
    @GetMapping("/available-slots")
    public List<TimeSlot> getAvailableTimeSlots(
            @RequestParam Long tenantId,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date date,
            @RequestParam Integer duration
    ){
        return bookingService.getAvailableTimeSlots(date,tenantId, duration);
    }

    @GetMapping("/treatments")
    public List<TreatmentDto> getTreatments(@RequestParam Long tenantId){
        return treatmentService.getTreatments(tenantId);
    }
}