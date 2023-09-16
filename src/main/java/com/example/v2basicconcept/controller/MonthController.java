package com.example.v2basicconcept.controller;

import com.example.v2basicconcept.service.MonthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/month")
@Tag(name = "Month Controller", description = "Month Controller!")
public class MonthController {

    private final MonthService monthService;

    public MonthController(MonthService monthService) {
        this.monthService = monthService;
    }

    @GetMapping("/get-month-from-number")
    @Operation(summary = "getMonthFromNumber", description = "Get month from number")
    public ResponseEntity<String> getMonthFromNumber(
            @Parameter(description = "Fill in from 1 to 12") @RequestParam int number) {
        String month = monthService.getMonthFromNumber(number);
        if (month.equals("")) {
            // If it lacks body(), it will need build()
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(month);
    }
}
