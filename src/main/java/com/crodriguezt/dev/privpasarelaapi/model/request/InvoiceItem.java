package com.crodriguezt.dev.privpasarelaapi.model.request;

import java.math.BigDecimal;

public class InvoiceItem {

	private BigDecimal itemId;
	private BigDecimal itemAmount;
	private BigDecimal itemQuantity;

	public BigDecimal getItemId() {
		return itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

	public BigDecimal getItemAmount() {
		return itemAmount;
	}

	public void setItemAmount(BigDecimal itemAmount) {
		this.itemAmount = itemAmount;
	}

	public BigDecimal getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(BigDecimal itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	@Override
	public String toString() {
		return "InvoiceItem [itemId=" + itemId + ", itemAmount=" + itemAmount
				+ ", itemQuantity=" + itemQuantity + "]";
	}

}
