package com.fatoansw.registe.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fatoansw.registe.model.Register;
import com.fatoansw.registe.model.param.Histogram;
import com.fatoansw.registe.model.param.RegisterQueryParam;


@Mapper
public interface RegisterDao {

	void insert(Register register);

	/**
	 * 	根据openid查询
	 * @param wxId
	 * @return
	 */
	Register selectByOpenId(String openId);

	/**
	 * 	根据id和openId更新
	 * @param register
	 * @return
	 */
	int updateByKey(Register register);

	/**
	 * 	根据openId和registerId查询
	 * @param wxId
	 * @param registerId
	 * @return
	 */
	Register selectByKey(@Param("openId")String openId, @Param("registerId")String registerId);

	/**
	 * 	查询列表
	 * @param param
	 * @return
	 */
	List<Register> list(RegisterQueryParam param);

	/**
	 * 	统计
	 * @param param
	 * @return
	 */
	int count(RegisterQueryParam param);

	/**
	 * 	根据id查询
	 * @param registerId
	 * @return
	 */
	Register selectById(Integer id);

	Register selectByIdenNum(String idenNum);

	Register selectByIdTypeAndIdNum(@Param("idType")Integer idType, @Param("idNum")String idNum);

	List<Histogram> columnChart(RegisterQueryParam param);


}
