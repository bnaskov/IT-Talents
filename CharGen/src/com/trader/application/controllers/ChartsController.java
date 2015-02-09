package com.trader.application.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.trader.application.models.Quote;

@RestController
public class ChartsController {
	
//	@RequestMapping(value="/", method=RequestMethod.POST)
//	public String getJson(@RequestBody String input){
//		//String arrStrings = "Hello charts\", \"asdads";
//		System.out.println(input);
//		return input;
//	}
//	
//	@RequestMapping(value="/", method=RequestMethod.GET)
//	public String getAnotherJson() {
//		return "hello World";
//	}
	

//	@RequestMapping(value="/", method=RequestMethod.POST)
//	public String getQuote(@RequestBody String quote) {
//		Gson gson = new Gson();
//		
//		
//		Quote q1 = gson.fromJson(quote, Quote.class);
//		
//		System.out.println(q1);
//		
//		return "hello World";
//	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public Quote getQuote(@RequestBody Quote quote) {
				
				
		System.out.println(quote);
		
		return quote;
	}

}
