package com.softwarefirst.communitymannger.ssm.admin.service;

import com.softwarefirst.communitymannger.ssm.admin.model.Admin;
import com.softwarefirst.communitymannger.ssm.admin.model.AdminExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AdminService {

        long countByExample(AdminExample example);

        int deleteByExample(AdminExample example);

        int deleteByPrimaryKey(String admNumber);

        int insert(Admin record);

        int insertSelective(Admin record);

        List<Admin> selectByExample(AdminExample example);

        Admin selectByPrimaryKey(String admNumber);

        int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

        int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

        int updateByPrimaryKeySelective(Admin record);

        int updateByPrimaryKey(Admin record);

}
