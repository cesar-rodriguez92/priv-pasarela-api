package com.crodriguezt.dev.privpasarelaapi.endpoint;

import java.math.BigDecimal;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crodriguezt.dev.privpasarelaapi.common.GenericUtils;
import com.crodriguezt.dev.privpasarelaapi.model.response.ResponseCrearInvoice;

@RestController
@RequestMapping("/v1")
public class EndpointController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/test3", method = RequestMethod.POST)
	public String endpoint3(
			@RequestParam Map<String, String> allRequestParams) {
		logger.info("\n\n\n\n\n");
		logger.info("-> Llego a endpoint2 test2");
		logger.info("--> Inicia llamada a UtecResource");
		logger.info("---> allRequestParams   " + allRequestParams);
		// UtecResource<String> response = handleSuccessResponse();
		// response.setContent("Pago registrado en Netsuite");
		String response = "Pago registrado en Netsuite";
		logger.info("fin test 3");
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
	public String generateSignature(@RequestParam String apiKey,
			@RequestParam String merchantId, @RequestParam String referenceCode,
			@RequestParam String monto, @RequestParam String moneda) {
		String resultado = "";
		String separador = "~";
		String textToHash = apiKey + separador + merchantId + separador
				+ referenceCode + separador + monto + separador + moneda;
		byte[] encodedHash = null;
		System.out.println("Inicia proceso hash");
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			System.out.println("MD instance ok");
			encodedHash = md.digest(textToHash.getBytes("UTF-8"));
			System.out.println("encodedHash: md.digest OK");

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(
				"sysout hash: " + GenericUtils.bytesToHex(encodedHash));
		resultado = GenericUtils.bytesToHex(encodedHash);
		return "Hash: " + resultado;
	}

	@RequestMapping(value = "/logger", method = RequestMethod.GET)
	public String simulateLogSave(HttpServletRequest request) {
		logger.info("Grabando en base de datos");
		logger.info("IP: " + request.getRemoteAddr());
		logger.info("IP: " + request.getRemoteUser());
		return "LOG-OK";
	}

	@RequestMapping(value = "/erp/invoice/crear", method = RequestMethod.GET)
	public ResponseCrearInvoice crearInvoiceErp() {

		ResponseCrearInvoice response = new ResponseCrearInvoice();

		String uuid = UUID.randomUUID().toString();
		int idLog = ThreadLocalRandom.current().nextInt(1000, 2000);
		int internalID = ThreadLocalRandom.current().nextInt(1020030, 1020099);
		int consecutive = ThreadLocalRandom.current().nextInt(10000, 10200);
		String fechaHoy = obtenerFechaHoyDDMMYYYY();
		System.out.println("SYSOUT: llego a /erp/invoice/crear");
		logger.info("logger: llego a /erp/invoice/crear");

		response.setStatus("OK");
		response.setMessage("Success");
		response.setUuid(uuid);
		response.setIdlog(String.valueOf(idLog));
		response.setInternalID(new BigDecimal(internalID));
		response.setConsecutive("BO-2018-" + consecutive);
		response.setDate(fechaHoy);

		return response;
	}
	@RequestMapping(value = "/erp/invoice/crear", method = RequestMethod.POST)
	public ResponseCrearInvoice crearInvoiceErpPost() {

		ResponseCrearInvoice response = new ResponseCrearInvoice();

		String uuid = UUID.randomUUID().toString();
		int idLog = ThreadLocalRandom.current().nextInt(1000, 2000);
		int internalID = ThreadLocalRandom.current().nextInt(1020030, 1020099);
		int consecutive = ThreadLocalRandom.current().nextInt(10000, 10200);
		String fechaHoy = obtenerFechaHoyDDMMYYYY();
		System.out.println("SYSOUT: llego a /erp/invoice/crear");
		logger.info("logger: llego a /erp/invoice/crear");

		response.setStatus("OK");
		response.setMessage("Success");
		response.setUuid(uuid);
		response.setIdlog(String.valueOf(idLog));
		response.setInternalID(new BigDecimal(internalID));
		response.setConsecutive("BO-2018-" + consecutive);
		response.setDate(fechaHoy);

		return response;
	}

	public static String obtenerFechaHoyDDMMYYYY() {

		Date date = Calendar.getInstance().getTime();
		DateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
		String today = formatter.format(date);
		System.out.println("Today : " + today);

		return today;
	}
}
