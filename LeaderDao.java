package com.fatoansw.registe.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fatoansw.registe.model.Community;
import com.fatoansw.registe.model.Leader;
import com.fatoansw.registe.model.PassRecord;
import com.fatoansw.registe.model.param.CommunityQueryParam;
import com.fatoansw.registe.model.param.PassRecordQueryParam;

@Mapper
public interface LeaderDao {

	/**
	 * 	根据用户名查询
	 * @param random
	 * @return
	 */
	Leader selectByUserName(String userName);

	/**
	 * 插入
	 * @param leader
	 */
	void insert(Leader leader);

	Leader selectById(Integer id);

	void updatePasswordById(Leader leader);

	Leader selectByCommunityId(Integer communityId);

	void updateUserNameAndPasswordByCommunityId(Leader leader);

}
