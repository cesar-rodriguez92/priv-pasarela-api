package com.crodriguezt.dev.privpasarelaapi.endpoint;

import java.security.MessageDigest;
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

	@RequestMapping(value = "/test3", method = RequestMethod.POST)
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

	@RequestMapping(value = "/test2", method = RequestMethod.GET)
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

	@RequestMapping(value = "/test5", method = RequestMethod.GET)
	public String generateSignature(@RequestParam String apiKey, @RequestParam String merchantId,
			@RequestParam String referenceCode, @RequestParam String monto, @RequestParam String moneda) {
		String resultado = "";
		String separador = "~";
		String textToHash = apiKey + separador + merchantId + separador + referenceCode + separador + monto + separador
				+ moneda;
		byte[] encodedHash = null;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			encodedHash = md.digest(textToHash.getBytes("UTF-8"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("hash: " + bytesToHex(encodedHash));
		resultado = bytesToHex(encodedHash);
		return "Hash: " + resultado;
	}

	private static String bytesToHex(byte[] hash) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < hash.length; i++) {
			String hex = Integer.toHexString(0xff & hash[i]);
			if (hex.length() == 1) {
				sb.append("0");
				sb.append(hex);
			}
		}
		return sb.toString();
	}

}
