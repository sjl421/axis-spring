package com.axis.ws.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.axis.ws.core.model.City;


@Mapper
public interface CityMapper {
	public List<City> select();
}
