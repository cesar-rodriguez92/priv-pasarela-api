package com.crodriguezt.dev.privpasarelaapi.model.request;

import java.math.BigDecimal;
import java.util.List;

public class InvoiceOrder {

	private BigDecimal orderId;
	private String datetimeRequested;
	private String idCountry;
	private String clientId;
	private String segment;
	private String currency;
	private String memo;
	private String canalRecaudacion;
	private List<InvoiceItem> items;
	private BigDecimal discountPercentage;

	public BigDecimal getOrderId() {
		return orderId;
	}

	public void setOrderId(BigDecimal orderId) {
		this.orderId = orderId;
	}

	public String getDatetimeRequested() {
		return datetimeRequested;
	}

	public void setDatetimeRequested(String datetimeRequested) {
		this.datetimeRequested = datetimeRequested;
	}

	public String getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(String idCountry) {
		this.idCountry = idCountry;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getCanalRecaudacion() {
		return canalRecaudacion;
	}

	public void setCanalRecaudacion(String canalRecaudacion) {
		this.canalRecaudacion = canalRecaudacion;
	}

	public List<InvoiceItem> getItems() {
		return items;
	}

	public void setItems(List<InvoiceItem> items) {
		this.items = items;
	}

	public BigDecimal getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(BigDecimal discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	@Override
	public String toString() {
		return "InvoiceOrder [orderId=" + orderId + ", datetimeRequested="
				+ datetimeRequested + ", idCountry=" + idCountry + ", clientId="
				+ clientId + ", segment=" + segment + ", currency=" + currency
				+ ", memo=" + memo + ", canalRecaudacion=" + canalRecaudacion
				+ ", items=" + items + ", discountPercentage="
				+ discountPercentage + "]";
	}

}
