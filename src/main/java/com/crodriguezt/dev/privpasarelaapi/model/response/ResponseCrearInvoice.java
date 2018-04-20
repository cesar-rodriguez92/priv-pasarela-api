package com.crodriguezt.dev.privpasarelaapi.model.response;

import java.math.BigDecimal;

public class ResponseCrearInvoice {

	private String status;
	private String message;
	private String uuid;
	private String idlog;
	private BigDecimal internalId;
	private String consecutive;
	private String date;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getIdlog() {
		return idlog;
	}
	public void setIdlog(String idlog) {
		this.idlog = idlog;
	}
	public BigDecimal getInternalId() {
		return internalId;
	}
	public void setInternalId(BigDecimal internalId) {
		this.internalId = internalId;
	}
	public String getConsecutive() {
		return consecutive;
	}
	public void setConsecutive(String consecutive) {
		this.consecutive = consecutive;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "ResponseCrearInvoice [status=" + status + ", message=" + message
				+ ", uuid=" + uuid + ", idlog=" + idlog + ", internalId="
				+ internalId + ", consecutive=" + consecutive + ", date=" + date
				+ "]";
	}

}
