package com.fatoansw.registe.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fatoansw.registe.model.Entrance;
import com.fatoansw.registe.model.param.EntranceQueryParam;



@Mapper
public interface EntranceDao {

	void insert(Entrance entrance);

	Entrance selectByCommunityIdAndEntranceName(@Param("communityId")Integer communityId,@Param("entranceName") String entranceName);

	/**
	 * 逻辑删除
	 * @param entranceId
	 * @param loginName
	 */
	void deleteLogic(@Param("id")Integer id, @Param("updator")String updator);

//	List<Entrance> list(Integer communityId);

	List<Entrance> list(EntranceQueryParam param);

	int count(EntranceQueryParam param);

}
