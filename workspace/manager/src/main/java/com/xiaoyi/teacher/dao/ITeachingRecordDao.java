package com.xiaoyi.teacher.dao;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.xiaoyi.teacher.domain.TeachingRecord;

public interface ITeachingRecordDao {
	//获取老师关联的订单
	List<JSONObject> selectRecordsByTid(String teacherId);

	//录入老师带课记录
	int insertTeachingRecords(List<TeachingRecord> tRecords);
	
	
	int deleteByPrimaryKey(String recordid);

    int insert(TeachingRecord record);

    int insertSelective(TeachingRecord record);

    TeachingRecord selectByPrimaryKey(String recordid);

    int updateByPrimaryKeySelective(TeachingRecord record);

    int updateByPrimaryKey(TeachingRecord record);
}
