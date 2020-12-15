package com.fatoansw.registe.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fatoansw.registe.model.Community;
import com.fatoansw.registe.model.PassRecord;
import com.fatoansw.registe.model.TemperatureConfig;
import com.fatoansw.registe.model.param.CommunityQueryParam;
import com.fatoansw.registe.model.param.PassRecordQueryParam;



@Mapper
public interface TemperatureConfigDao {

	TemperatureConfig selectOne();

	void update(TemperatureConfig temperatureConfig);

	void insert(TemperatureConfig temperatureConfig);

}
