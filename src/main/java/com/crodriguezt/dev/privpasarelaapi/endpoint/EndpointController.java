package com.crodriguezt.dev.privpasarelaapi.endpoint;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class EndpointController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/test3", method = RequestMethod.GET)
	public String endpoint3(@RequestParam Map<String, String> allRequestParams) {
		logger.info("\n\n\n\n\n");
		logger.info("-> Llego a endpoint2 test2");
		logger.info("--> Inicia llamada a UtecResource");
		logger.info("---> allRequestParams   " + allRequestParams);
		// UtecResource<String> response = handleSuccessResponse();
		// response.setContent("Pago registrado en Netsuite");
		String response = "Pago registrado en Netsuite";
		return response;

	}

	@RequestMapping(value = "/test3", method = RequestMethod.GET)
	public String enpoint4() {
		System.out.println("SYSOUT: llego a endpoint 4");
		logger.info("logger: llego a endpoint 4");

		return "Respuesta exitosa";
	}
	
	@RequestMapping(value = "/test4", method = RequestMethod.POST)
	public String enpoint5() {
		System.out.println("SYSOUT: llego a endpoint 4");
		logger.info("logger: llego a endpoint 4");

		return "Respuesta exitosa";
	}

}
