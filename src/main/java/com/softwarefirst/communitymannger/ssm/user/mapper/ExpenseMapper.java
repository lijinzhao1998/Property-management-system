package com.softwarefirst.communitymannger.ssm.user.mapper;

import com.softwarefirst.communitymannger.ssm.user.model.Expense;
import com.softwarefirst.communitymannger.ssm.user.model.ExpenseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpenseMapper {
    long countByExample(ExpenseExample example);

    int deleteByExample(ExpenseExample example);

    int deleteByPrimaryKey(String exNumber);

    int insert(Expense record);

    int insertSelective(Expense record);

    List<Expense> selectByExample(ExpenseExample example);

    Expense selectByPrimaryKey(String exNumber);

    int updateByExampleSelective(@Param("record") Expense record, @Param("example") ExpenseExample example);

    int updateByExample(@Param("record") Expense record, @Param("example") ExpenseExample example);

    int updateByPrimaryKeySelective(Expense record);

    int updateByPrimaryKey(Expense record);
}