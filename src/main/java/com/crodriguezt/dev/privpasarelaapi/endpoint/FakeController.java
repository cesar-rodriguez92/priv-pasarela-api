package com.crodriguezt.dev.privpasarelaapi.endpoint;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crodriguezt.dev.privpasarelaapi.service.FakeService;

@RestController
@RequestMapping("/fake")
public class FakeController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private FakeService fakeService;

	@RequestMapping(value = "/erp/invoice/crear/timeOut", method = RequestMethod.GET)
	public Map<String, Object> crearInvoiceErpErrorTimeoutGet() {

		logger.info("Inicio Crear boleta TimeOut");
		System.out.println("POST SYSOUT: llego a /erp/invoice/crear/timeOut");
		Map<String, Object> response = fakeService.responseErpTimeOut();
		logger.info("Response de timeOut: " + response);
		return response;
	}

	@RequestMapping(value = "/erp/invoice/crear/timeOut", method = RequestMethod.POST)
	public Map<String, Object> crearInvoiceErpErrorTimeoutPost() {

		logger.info("Inicio Crear boleta TimeOut");
		System.out.println("POST SYSOUT: llego a /erp/invoice/crear/timeOut");
		Map<String, Object> response = fakeService.responseErpTimeOut();
		logger.info("Response de timeOut: " + response);
		return response;
	}

}
