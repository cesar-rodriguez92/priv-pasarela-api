package com.crodriguezt.dev.privpasarelaapi.model.response;

import java.util.List;

public class ResponseCatalogoDocumAcad {

	private String status;
	private String message;
	private String uuid;
	private String idlog;
	private List<Services> services;

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
	public List<Services> getServices() {
		return services;
	}
	public void setServices(List<Services> services) {
		this.services = services;
	}
	@Override
	public String toString() {
		return "ResponseCatalogoDocumAcad [status=" + status + ", message="
				+ message + ", uuid=" + uuid + ", idlog=" + idlog
				+ ", services=" + services + "]";
	}

}
