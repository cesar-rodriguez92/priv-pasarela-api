package com.crodriguezt.dev.privpasarelaapi.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

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

}
