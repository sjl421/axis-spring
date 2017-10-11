package com.axis.ws.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.axis.ws.core.model.City;
import com.axis.ws.core.service.CityService;

@RestController
@RequestMapping("/web")
public class CityController {
	@Autowired
	private CityService cityService;
	
	@GetMapping("/test.do")
	@ResponseBody
	public List<City> cityService(){
		return cityService.select();
	}
}
