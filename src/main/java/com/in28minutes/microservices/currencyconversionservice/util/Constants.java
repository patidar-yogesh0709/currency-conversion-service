package com.in28minutes.microservices.currencyconversionservice.util;

public class Constants {
	
	public class Api
	{
		public static final String CONVERSION_FROM_TO_QUANTITY ="/currency-conversion/from/{from}/to/{to}/quantity/{quantity}";
		public static final String FEIGN_CONVERSION_FROM_TO_QUANTITY ="/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}";
	}

}
