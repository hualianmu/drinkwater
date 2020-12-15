package com.fatoansw.registe.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fatoansw.registe.model.RegisterImg;


@Mapper
public interface RegisterImgDao {

	int insert(RegisterImg ri);

	void updateTableIdById(@Param("tableId")Integer tableId, @Param("id")Integer id);

	/**
	 * 	物理删除
	 * @param id
	 * @param string
	 * @param typeNormalPhoto
	 */
	void deleteByTableIdAndType(
			@Param("tableId")Integer tableI, @Param("type")Integer type);

	RegisterImg selectByTableIdAndType(
			@Param("tableId")Integer tableId, @Param("type")Integer type);

	RegisterImg selectByImageName(String newName);

	List<RegisterImg> selectInvalid(LocalDateTime day);

	int deleteById(Integer id);

}
