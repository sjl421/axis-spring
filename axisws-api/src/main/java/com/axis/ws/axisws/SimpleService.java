package com.axis.ws.axisws;

import java.util.List;

import com.axis.ws.core.model.City;


public interface SimpleService {
	public String  helloService(String msg);
	public List<City> getCity();
}
