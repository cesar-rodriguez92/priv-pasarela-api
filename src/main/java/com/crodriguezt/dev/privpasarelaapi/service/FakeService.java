package com.crodriguezt.dev.privpasarelaapi.service;

import java.util.List;
import java.util.Map;

import com.crodriguezt.dev.privpasarelaapi.model.response.Services;

public interface FakeService {

	Map<String, Object> responseErpTimeOut();

	List<Services> generarCatalogo();
}
