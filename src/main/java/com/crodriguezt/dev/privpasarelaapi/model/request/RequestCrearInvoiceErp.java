package com.crodriguezt.dev.privpasarelaapi.model.request;

import java.util.List;

public class RequestCrearInvoiceErp {

	private List<InvoiceOrder> orders;

	public List<InvoiceOrder> getOrders() {
		return orders;
	}

	public void setOrders(List<InvoiceOrder> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "RequestCrearInvoiceErp [orders=" + orders + "]";
	}

}
