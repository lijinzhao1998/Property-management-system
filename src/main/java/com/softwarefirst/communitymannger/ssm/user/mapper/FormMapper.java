package com.softwarefirst.communitymannger.ssm.user.mapper;

import com.softwarefirst.communitymannger.ssm.user.model.Form;
import com.softwarefirst.communitymannger.ssm.user.model.FormExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FormMapper {
    long countByExample(FormExample example);

    int deleteByExample(FormExample example);

    int deleteByPrimaryKey(String foNumber);

    int insert(Form record);

    int insertSelective(Form record);

    List<Form> selectByExample(FormExample example);

    Form selectByPrimaryKey(String foNumber);

    int updateByExampleSelective(@Param("record") Form record, @Param("example") FormExample example);

    int updateByExample(@Param("record") Form record, @Param("example") FormExample example);

    int updateByPrimaryKeySelective(Form record);

    int updateByPrimaryKey(Form record);
}