package com.fatoansw.registe.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fatoansw.registe.model.Community;
import com.fatoansw.registe.model.Leader;
import com.fatoansw.registe.model.PassRecord;
import com.fatoansw.registe.model.param.CommunityQueryParam;
import com.fatoansw.registe.model.param.Histogram;
import com.fatoansw.registe.model.param.PassRecordQueryParam;



@Mapper
public interface CommunityDao {

	void insert(Community community);

	/**
	 * 	查询列表
	 * @param param
	 * @return
	 */
	List<Community> list(CommunityQueryParam param);

	/**
	 * 	统计
	 * @param param
	 * @return
	 */
	int count(CommunityQueryParam param);

	void disabled(Community community);

	Community selectById(Integer id);

	/**
	 * 	更新密码
	 * @param c
	 */
	void updatePasswordById(Community c);

	Community selectByUserName(String userName);

	void update(Community c);

	List<Histogram> columnChart(CommunityQueryParam param);

	List<Community> selectAll();
}
