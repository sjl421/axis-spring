package com.axis.ws.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.ws.core.mapper.CityMapper;
import com.axis.ws.core.model.City;
import com.axis.ws.core.service.CityService;


@Service("cityService")
public class CityServiceImpl implements CityService {
	@Autowired
	CityMapper cityMapper;
	
	@Override
	public List<City> select() {
		return cityMapper.select();
	}

}
