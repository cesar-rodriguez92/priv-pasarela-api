package com.crodriguezt.dev.privpasarelaapi.endpoint;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crodriguezt.dev.privpasarelaapi.common.GenericUtils;
import com.crodriguezt.dev.privpasarelaapi.model.response.ResponseCatalogoDocumAcad;
import com.crodriguezt.dev.privpasarelaapi.model.response.ResponseCrearInvoice;
import com.crodriguezt.dev.privpasarelaapi.model.response.Services;

@RestController
@RequestMapping("/v1")
public class EndpointController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/test3", method = RequestMethod.POST)
	public String endpoint3(
			@RequestParam Map<String, String> allRequestParams) {
		System.out.println("\n\n\n\n\n");
		System.out.println("-> Llego a endpoint2 test2");
		System.out.println("--> Inicia llamada a UtecResource");
		System.out.println("---> allRequestParams   " + allRequestParams);
		// UtecResource<String> response = handleSuccessResponse();
		// response.setContent("Pago registrado en Netsuite");
		String response = "Pago registrado en Netsuite";
		System.out.println("fin test 3");
		return response;

	}

	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String enpoint4() {
		System.out.println("SYSOUT: llego a endpoint 4");
		System.out.println("logger: llego a endpoint 4");

		return "Respuesta exitosa";
	}

	@RequestMapping(value = "/test4", method = RequestMethod.POST)
	public String enpoint5() {
		System.out.println("SYSOUT: llego a endpoint 4");
		System.out.println("logger: llego a endpoint 4");

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
		System.out.println("Grabando en base de datos");
		System.out.println("IP: " + request.getRemoteAddr());
		System.out.println("IP: " + request.getRemoteUser());
		return "LOG-OK";
	}

	@RequestMapping(value = "/erp/invoice/crear", method = RequestMethod.GET)
	public ResponseCrearInvoice crearInvoiceErp() {

		System.out.println("POST SYSOUT: llego a /erp/invoice/crear");

		ResponseCrearInvoice response = new ResponseCrearInvoice();

		BigDecimal bigDecInternal = null;
		BigDecimal bigDecConsec = null;
		BigDecimal bgUno = new BigDecimal("1");
		String internalId = null;
		String consecutive = null;
		String fn1 = "internalId.txt";
		String fn2 = "consecutive.txt";
		internalId = leerArchivo(fn1);
		consecutive = leerArchivo(fn2);
		bigDecInternal = new BigDecimal(internalId).add(bgUno);
		bigDecConsec = new BigDecimal(consecutive).add(bgUno);
		System.out.println("Nuevo intarnalId: " + bigDecInternal.toString());
		System.out.println("Nuevo consecutive: " + bigDecConsec.toString());
		guardarArchivo(fn1, bigDecInternal.toString());
		guardarArchivo(fn2, bigDecConsec.toString());

		String uuid = UUID.randomUUID().toString();
		int idLog = ThreadLocalRandom.current().nextInt(1000, 2000);
		String fechaHoy = obtenerFechaHoyDDMMYYYY();

		response.setStatus("OK");
		response.setMessage("Success");
		response.setUuid(uuid);
		response.setIdLog(String.valueOf(idLog));
		response.setInternalId(bigDecInternal);
		response.setConsecutive("BO-2018-" + bigDecConsec.toString());
		response.setDate(fechaHoy);

		return response;
	}

	@RequestMapping(value = "/erp/invoice/crear", method = RequestMethod.POST)
	public ResponseCrearInvoice crearInvoiceErpPost() {

		System.out.println("POST SYSOUT: llego a /erp/invoice/crear");

		ResponseCrearInvoice response = new ResponseCrearInvoice();

		BigDecimal bigDecInternal = null;
		BigDecimal bigDecConsec = null;
		BigDecimal bgUno = new BigDecimal("1");
		String internalId = null;
		String consecutive = null;
		String fn1 = "internalId.txt";
		String fn2 = "consecutive.txt";
		internalId = leerArchivo(fn1);
		consecutive = leerArchivo(fn2);
		bigDecInternal = new BigDecimal(internalId).add(bgUno);
		bigDecConsec = new BigDecimal(consecutive).add(bgUno);
		System.out.println("Nuevo intarnalId: " + bigDecInternal.toString());
		System.out.println("Nuevo consecutive: " + bigDecConsec.toString());
		guardarArchivo(fn1, bigDecInternal.toString());
		guardarArchivo(fn2, bigDecConsec.toString());

		String uuid = UUID.randomUUID().toString();
		int idLog = ThreadLocalRandom.current().nextInt(1000, 2000);
		String fechaHoy = obtenerFechaHoyDDMMYYYY();

		response.setStatus("OK");
		response.setMessage("Success");
		response.setUuid(uuid);
		response.setIdLog(String.valueOf(idLog));
		response.setInternalId(bigDecInternal);
		response.setConsecutive("BO-2018-" + bigDecConsec.toString());
		response.setDate(fechaHoy);

		return response;
	}

	@RequestMapping(value = "/erp/catalogo/documAcad", method = RequestMethod.GET)
	public ResponseCatalogoDocumAcad obtenerCatalogo() {

		System.out.println("GET SYSOUT: llego a /erp/catalogo/documAcad");

		String uuid = UUID.randomUUID().toString();
		int idLog = ThreadLocalRandom.current().nextInt(1000, 2000);

		List<Services> lista = generarCatalogo();
		ResponseCatalogoDocumAcad response = new ResponseCatalogoDocumAcad();

		response.setStatus("OK");
		response.setMessage("Success");
		response.setUuid(uuid);
		response.setIdlog(String.valueOf(idLog));
		response.setServices(lista);

		return response;
	}

	@RequestMapping(value = "/erp/catalogo/documAcad", method = RequestMethod.POST)
	public ResponseCatalogoDocumAcad obtenerCatalogoPost() {

		System.out.println("POST SYSOUT: llego a /erp/catalogo/documAcad");

		String uuid = UUID.randomUUID().toString();
		int idLog = ThreadLocalRandom.current().nextInt(1000, 2000);

		List<Services> lista = generarCatalogo();
		ResponseCatalogoDocumAcad response = new ResponseCatalogoDocumAcad();

		response.setStatus("OK");
		response.setMessage("Success");
		response.setUuid(uuid);
		response.setIdlog(String.valueOf(idLog));
		response.setServices(lista);

		return response;
	}

	public static String obtenerFechaHoyDDMMYYYY() {

		Date date = Calendar.getInstance().getTime();
		DateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
		String today = formatter.format(date);
		System.out.println("Today : " + today);

		return today;
	}

	public List<Services> generarCatalogo() {

		Services item = new Services();
		List<Services> lista = new ArrayList<Services>();

		item.setId("108");
		item.setName("Certificado de estudios (español)");
		item.setUnitAmountPEN(new BigDecimal("120.00"));
		lista.add(item);
		item = new Services();
		item.setId("110");
		item.setName(
				"Certificado de notas (por cada semestre académico) (español)");
		item.setUnitAmountPEN(new BigDecimal("85"));
		lista.add(item);
		item = new Services();
		item.setId("112");
		item.setName("Constancia de Egresado (español)");
		item.setUnitAmountPEN(new BigDecimal("120"));
		lista.add(item);
		item = new Services();
		item.setId("114");
		item.setName("Constancia de Estudios (español)");
		item.setUnitAmountPEN(new BigDecimal("60"));
		lista.add(item);
		item = new Services();
		item.setId("116");
		item.setName("Constancia de Matrícula (español)");
		item.setUnitAmountPEN(new BigDecimal("60"));
		lista.add(item);
		item = new Services();
		item.setId("118");
		item.setName("Constancia de No Baja por Disciplina (español)");
		item.setUnitAmountPEN(new BigDecimal("60"));
		lista.add(item);
		item = new Services();
		item.setId("120");
		item.setName(
				"Constancia de Orden de mérito y promedio ponderado acumulado (español)");
		item.setUnitAmountPEN(new BigDecimal("60"));
		lista.add(item);
		item = new Services();
		item.setId("121");
		item.setName("Solicitud de Trámite de Bachiller");
		item.setUnitAmountPEN(new BigDecimal("1500"));
		lista.add(item);
		item = new Services();
		item.setId("200");
		item.setName("Constancia de Notas Pronabec (Español)");
		item.setUnitAmountPEN(new BigDecimal("180"));
		lista.add(item);
		item = new Services();
		item.setId("210");
		item.setName("Constancia de Matrícula Pronabec (Español)");
		item.setUnitAmountPEN(new BigDecimal("150"));
		lista.add(item);
		item = new Services();
		item.setId("227");
		item.setName("Constancia de Alto Rendimiento CAFED");
		item.setUnitAmountPEN(new BigDecimal("0"));
		lista.add(item);

		return lista;

	}

	private String leerArchivo(String fileName) {

		String respuesta = null;
		try {
			FileReader fr1 = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fr1);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				respuesta = line;
				System.out.println("Read: " + respuesta);
			}
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}

	private void guardarArchivo(String fileName, String texto) {

		try {
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write(texto);
			bufferedWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/erp/invoice/crear/error", method = RequestMethod.POST)
	public Map<String, Object> crearInvoiceErpPostErrorText() {

		System.out
				.println("POST SYSOUT: llego a /erp/invoice/crear/error/text");

		Map<String, Object> map = new HashMap<>();
		map.put("internalId", "");
		map.put("message",
				"\"ERROR: Cannot read property \"text\" from undefined");
		map.put("uuid", UUID.randomUUID().toString());
		map.put("idLog", 158401);
		System.out.println("Response de servicio: " + map);
		return map;
	}

	@RequestMapping(value = "/erp/invoice/crear/error", method = RequestMethod.GET)
	public Map<String, Object> crearInvoiceErpGetErrorText() {

		System.out
				.println("POST SYSOUT: llego a /erp/invoice/crear/error/text");

		Map<String, Object> map = new HashMap<>();
		map.put("internalId", "");
		map.put("message",
				"\"ERROR: Cannot read property \"text\" from undefined");
		map.put("uuid", UUID.randomUUID().toString());
		map.put("idLog", 158401);
		System.out.println("Response de servicio: " + map);
		return map;
	}

	@RequestMapping(value = "/erp/invoice/crear/delay", method = RequestMethod.POST)
	public ResponseCrearInvoice crearInvoiceErpPostDelay() {

		System.out.println("POST SYSOUT: llego a /erp/invoice/crear/delay");

		ResponseCrearInvoice response = new ResponseCrearInvoice();

		BigDecimal bigDecInternal = null;
		BigDecimal bigDecConsec = null;
		BigDecimal bgUno = new BigDecimal("1");
		String internalId = null;
		String consecutive = null;
		String fn1 = "internalId.txt";
		String fn2 = "consecutive.txt";
		internalId = leerArchivo(fn1);
		consecutive = leerArchivo(fn2);
		bigDecInternal = new BigDecimal(internalId).add(bgUno);
		bigDecConsec = new BigDecimal(consecutive).add(bgUno);
		System.out.println("Nuevo intarnalId: " + bigDecInternal.toString());
		System.out.println("Nuevo consecutive: " + bigDecConsec.toString());
		guardarArchivo(fn1, bigDecInternal.toString());
		guardarArchivo(fn2, bigDecConsec.toString());

		String uuid = UUID.randomUUID().toString();
		int idLog = ThreadLocalRandom.current().nextInt(1000, 2000);
		String fechaHoy = obtenerFechaHoyDDMMYYYY();

		response.setStatus("OK");
		response.setMessage("Success");
		response.setUuid(uuid);
		response.setIdLog(String.valueOf(idLog));
		response.setInternalId(bigDecInternal);
		response.setConsecutive("BO-2018-" + bigDecConsec.toString());
		response.setDate(fechaHoy);
		try {
			logger.info("Inicia Delay");
			TimeUnit.SECONDS.sleep(25);
			logger.info("Fin Delay, respuesta");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return response;
	}

	@RequestMapping(value = "/erp/invoice/crear/delay", method = RequestMethod.GET)
	public ResponseCrearInvoice crearInvoiceErpGetDelay() {

		System.out.println("POST SYSOUT: llego a /erp/invoice/crear/delay");

		ResponseCrearInvoice response = new ResponseCrearInvoice();

		BigDecimal bigDecInternal = null;
		BigDecimal bigDecConsec = null;
		BigDecimal bgUno = new BigDecimal("1");
		String internalId = null;
		String consecutive = null;
		String fn1 = "internalId.txt";
		String fn2 = "consecutive.txt";
		internalId = leerArchivo(fn1);
		consecutive = leerArchivo(fn2);
		bigDecInternal = new BigDecimal(internalId).add(bgUno);
		bigDecConsec = new BigDecimal(consecutive).add(bgUno);
		System.out.println("Nuevo intarnalId: " + bigDecInternal.toString());
		System.out.println("Nuevo consecutive: " + bigDecConsec.toString());
		guardarArchivo(fn1, bigDecInternal.toString());
		guardarArchivo(fn2, bigDecConsec.toString());

		String uuid = UUID.randomUUID().toString();
		int idLog = ThreadLocalRandom.current().nextInt(1000, 2000);
		String fechaHoy = obtenerFechaHoyDDMMYYYY();

		response.setStatus("OK");
		response.setMessage("Success");
		response.setUuid(uuid);
		response.setIdLog(String.valueOf(idLog));
		response.setInternalId(bigDecInternal);
		response.setConsecutive("BO-2018-" + bigDecConsec.toString());
		response.setDate(fechaHoy);
		try {
			logger.info("Inicia Delay");
			TimeUnit.SECONDS.sleep(25);
			logger.info("Fin Delay, respuesta");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return response;
	}
}
