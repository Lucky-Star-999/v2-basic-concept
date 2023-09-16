package com.example.v2basicconcept.service;

import com.example.v2basicconcept.constant.MonthConstant;
import org.springframework.stereotype.Service;

@Service
public class MonthService {
    public String getMonthFromNumber(int monthNumber) {
        return MonthConstant.getMonthFromNumber(monthNumber);
    }
}
