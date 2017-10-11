package com.crodriguezt.dev.privpasarelaapi.endpoint;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {

		return "Welcome Page";
	}

	@RequestMapping(value = "/confirmacionPagoPayu", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String confirmacionPagoPasarela(MultiValueMap  request) {
		String respuesta = "OK";
		System.out.println("----->Inicio llamada a WS de Confirmacion:");
		System.out.println("Map: " + request);
		System.out.println("----------->detailed Map");
		//for (String key : request.keySet()) {
			//System.out.println("--->" + key + ":\t\t\t" + request.get(key));
		//}
		System.out.println("to String: " + request.toString());
		
		System.out.println("------>Fin print map");
		return respuesta;
	}
	
	@RequestMapping(value = "/confirmacionPagoPayu2", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String confirmacionPagoPasarela2(Map<String, Object> request) {
		String respuesta = "OK";
		System.out.println("----->Inicio llamada a WS de Confirmacion:");
		System.out.println("Map: " + request);
		System.out.println("----------->detailed Map");
		for (String key : request.keySet()) {
			System.out.println("--->" + key + ":\t\t\t" + request.get(key));
		}
		System.out.println("------>Fin print map");
		return respuesta;
	}

}
