package com.springboot_smart_api_practice.service;


import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Service;           

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot_smart_api_practice.model.TradeData;

@Service
public class TradeService {
	  
	 public TradeData readTradeDataFromFile(InputStream fileStream ) throws IOException {
		 
	        ObjectMapper objectMapper = new ObjectMapper();
	        
	    //    File file = new File(filePath);
	        
	        return objectMapper.readValue(fileStream, TradeData.class);
	        }
}