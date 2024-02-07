package com.springboot_smart_api_practice.controller;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_smart_api_practice.model.TradeData;
import com.springboot_smart_api_practice.service.TradeService;

@RestController
@RequestMapping("/api/trade")
public class TradeController {
    @Autowired
    private TradeService tradeService;
    @GetMapping("/read")
    public TradeData readOrderData() {
        
        InputStream fileStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("order.json");
         
        try {
            return tradeService.readTradeDataFromFile(fileStream);
        } catch (IOException e) {
            
            e.printStackTrace();
            
            throw new RuntimeException("Error reading trade data from file", e);
        }
    }

}
    
