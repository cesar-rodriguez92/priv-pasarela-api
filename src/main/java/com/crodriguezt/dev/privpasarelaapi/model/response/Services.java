package com.crodriguezt.dev.privpasarelaapi.model.response;

import java.math.BigDecimal;

public class Services {

	private String id;
	private String name;
	private BigDecimal unitAmountPEN;
	private BigDecimal unitAmountUSD;

	public Services() {
		super();
	}

	public Services(String id, String name, BigDecimal unitAmountPEN,
			BigDecimal unitAmountUSD) {
		super();
		this.id = id;
		this.name = name;
		this.unitAmountPEN = unitAmountPEN;
		this.unitAmountUSD = unitAmountUSD;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getUnitAmountPEN() {
		return unitAmountPEN;
	}
	public void setUnitAmountPEN(BigDecimal unitAmountPEN) {
		this.unitAmountPEN = unitAmountPEN;
	}
	public BigDecimal getUnitAmountUSD() {
		return unitAmountUSD;
	}
	public void setUnitAmountUSD(BigDecimal unitAmountUSD) {
		this.unitAmountUSD = unitAmountUSD;
	}
	@Override
	public String toString() {
		return "Services [id=" + id + ", name=" + name + ", unitAmountPEN="
				+ unitAmountPEN + ", unitAmountUSD=" + unitAmountUSD + "]";
	}

}
