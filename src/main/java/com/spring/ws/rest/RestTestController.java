package com.spring.ws.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {
	private List<String> dataList = new ArrayList<String>(Arrays.asList(
			"Spring", "Rest", "SRC"));

	@RequestMapping
	public Data getData(
			@RequestParam(value = "id", defaultValue = "0") Integer id) {
		return new Data(id, dataList.get(id));
	}

}
