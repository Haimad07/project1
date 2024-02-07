package com.springboot_smart_api_practice.model;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class TradeData {
	
	@JsonProperty("status")
	private boolean status;
	
	@JsonProperty("message")
    private String message;
	
	@JsonProperty("errorCode")
    private String errorCode;
	
	@JsonProperty("data")
    private List<TradeItem> data;

    public static class TradeItem {
    	@JsonProperty("variety")
        private String variety;
    	
    	@JsonProperty("orderType")
        private String ordertype;
    	
    	@JsonProperty("productType")
        private String producttype;
    	
    	@JsonProperty("duration")
        private String duration;
    	
    	@JsonProperty("price")
        private float price;
    	
    	@JsonProperty("triggerPrice")
        private float triggerPrice;
    	
    	@JsonProperty("quantity")
        private float quantity;
    	
    	@JsonProperty("disclosedQuantity")
        private String disclosedquantity;
    	
    	@JsonProperty("squareOff")
        private String squareoff;
    	
    	@JsonProperty("stopLoss")
        private String stoploss;
    	
    	@JsonProperty("trailingStoploss")
        private String trailingStoploss;
    	
    	@JsonProperty("tradingSymbol")
        private String tradingsymbol;
    	
    	@JsonProperty("transactionType")
        private String transactiontype;
    	
    	@JsonProperty("exchange")
        private String exchange;
    	
    	@JsonProperty("symbolToken")
        private String symboltoken;
    	
    	@JsonProperty("instrumenType")
        private String instrumentype;
    	
    	@JsonProperty("strikePrice")
        private float strikeprice;
    	
    	@JsonProperty("optionType")
        private String optiontype;
    	
    	@JsonProperty("expiryDate")
        private String expirydate;
    	
    	@JsonProperty("lotSize")
        private String lotsize;
    	
    	@JsonProperty("cancelSize")
        private String cancelsize;
    	
    	@JsonProperty("averagePrice")
        private float averageprice;
    	
    	@JsonProperty("filledShares")
        private String filledshares;
    	
    	@JsonProperty("unfilledShares")
        private String unfilledshares;
    	
    	@JsonProperty("orderId")
        private long orderid;
    	
    	@JsonProperty("text")
        private String text;
    	
    	@JsonProperty("status")
        private String status;
    	
    	@JsonProperty("orderStatus")
        private String orderstatus;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MMM-dd HH:mm:ss")
    	@JsonSerialize(using = LocalDateTimeSerializer.class)
    	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
    	@JsonProperty("updateTime")
        private LocalDateTime  updateTime;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MMM-dd HH:mm:ss")
    	@JsonSerialize(using = LocalDateTimeSerializer.class)
    	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
    	@JsonProperty("exchTime")
        private LocalDateTime  exchTime;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MMM-dd HH:mm:ss")
    	@JsonSerialize(using = LocalDateTimeSerializer.class)
    	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
    	@JsonProperty("exchorderUpdatetime")
        private LocalDateTime  exchorderUpdatetime;
        
        @JsonProperty("fillId")
        private String fillId;
        
        @JsonProperty("fillTime")
        private String fillTime;
        
        @JsonProperty("parentorderId")
        private String parentorderId;
        
        @JsonProperty("uniqueorderId")
        private String uniqueorderId;

        
    }

}
