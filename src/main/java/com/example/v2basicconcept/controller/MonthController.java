package com.example.v2basicconcept.controller;

import com.example.v2basicconcept.service.MonthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/month")
public class MonthController {

    private final MonthService monthService;

    public MonthController(MonthService monthService) {
        this.monthService = monthService;
    }

    @GetMapping("/get-month-from-number")
    public String getMonthFromNumber(@RequestParam int number) {
        return monthService.getMonthFromNumber(number);
    }
}
