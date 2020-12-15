package com.fatoansw.registe.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fatoansw.registe.model.PassRecord;
import com.fatoansw.registe.model.param.Histogram;
import com.fatoansw.registe.model.param.PassRecordQueryParam;



@Mapper
public interface PassRecordDao {
	/**
	 * 	统计人数
	 * @param param
	 * @return
	 */
	int count(PassRecordQueryParam param);

	/**
	 * 	查询列表
	 * @param param
	 * @return
	 */
	List<PassRecord> list(PassRecordQueryParam param);

	PassRecord selectById(Integer id);

	void insert(PassRecord passRecord);

	List<Histogram> queryColumnChart(PassRecordQueryParam param);

}
