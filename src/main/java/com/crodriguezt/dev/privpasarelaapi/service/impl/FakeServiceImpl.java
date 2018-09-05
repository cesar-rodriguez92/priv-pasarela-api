package com.crodriguezt.dev.privpasarelaapi.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crodriguezt.dev.privpasarelaapi.model.response.Services;
import com.crodriguezt.dev.privpasarelaapi.service.FakeService;

@Service("fakeService")
public class FakeServiceImpl implements FakeService {

	@Override
	public Map<String, Object> responseErpTimeOut() {
		Map<String, Object> response = new HashMap<>();
		Map<String, Object> innerMap = new HashMap<>();
		innerMap.put("code", "SSS_TIME_LIMIT_EXCEEDED");
		innerMap.put("message", "Script Execution Time Exceeded.");
		response.put("error", innerMap);
		return response;
	}

	@Override
	public List<Services> generarCatalogo() {

		Services item = new Services();
		List<Services> lista = new ArrayList<Services>();

		item = new Services("108", "Certificado de estudios (español)",
				new BigDecimal("120.00"), null);
		lista.add(item);
		item = new Services("109", "Certificado de estudios (inglés)",
				new BigDecimal("180.00"), null);
		lista.add(item);
		item = new Services("110",
				"Certificado de notas (por cada semestre académico) (español)",
				new BigDecimal("90.00"), null);
		lista.add(item);
		item = new Services("111",
				"Certificado de notas (por cada semestre académico) (inglés)",
				new BigDecimal("135"), null);
		lista.add(item);
		item = new Services("225", "Constancia de alto rendimiento PRONABEC",
				new BigDecimal("0"), null);
		lista.add(item);
		item = new Services("112", "Constancia de Egresado (español)",
				new BigDecimal("150"), null);
		lista.add(item);
		item = new Services("114", "Constancia de Estudios (español)",
				new BigDecimal("70"), null);
		lista.add(item);
		item = new Services("116", "Constancia de Matrícula (español)",
				new BigDecimal("70"), null);
		lista.add(item);
		item = new Services("117", "Constancia de Matrícula (inglés)",
				new BigDecimal("105"), null);
		lista.add(item);
		item = new Services("224", "Constancia de Matrícula PRONABEC",
				new BigDecimal("0"), null);
		lista.add(item);
		item = new Services("118",
				"Constancia de No Baja por Disciplina (español)",
				new BigDecimal("70"), null);
		lista.add(item);
		item = new Services("223", "Constancia de Notas PRONABEC",
				new BigDecimal("0"), null);
		lista.add(item);
		item = new Services("120",
				"Constancia de Orden de mérito y promedio ponderado acumulado (español)",
				new BigDecimal("70"), null);
		lista.add(item);
		item = new Services("121",
				"Constancia de Orden de mérito y promedio ponderado acumulado (inglés)",
				new BigDecimal("105"), null);
		lista.add(item);
		item = new Services("122",
				"Constancia de Retiro de la universidad (español)",
				new BigDecimal("70"), null);
		lista.add(item);
		item = new Services("221",
				"PRONABEC- Constancia de Matricula Detalle en español ",
				new BigDecimal("0"), null);
		lista.add(item);
		item = new Services("222", "Solicitud de Bachiller",
				new BigDecimal("1500"), null);
		lista.add(item);
		item = new Services("227", "Constancia de Alto Rendimiento CAFED",
				new BigDecimal("0"), null);
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

}
