package com.trader.application.models;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Quote {
	private String code;
	private BigDecimal price;
	private Timestamp ts;

	public Quote(String code, BigDecimal price, Timestamp ts)
	{
		super();
		this.code = code;
		this.price = price;
		this.ts = ts;
	}

	public BigDecimal getPrice()
	{
		return price;
	}

	public void setPrice(BigDecimal price)
	{
		this.price = price;
	}

	public Timestamp getTs()
	{
		return ts;
	}

	public void setTs(Timestamp ts)
	{
		this.ts = ts;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	@Override
	public String toString()
	{
		return "Quote [code=" + code + ", price=" + price + ", ts=" + ts + "]";
	}
}
