package com.softwarefirst.communitymannger.ssm.admin.service.Impl;

import com.softwarefirst.communitymannger.ssm.admin.mapper.AdminMapper;
import com.softwarefirst.communitymannger.ssm.admin.model.Admin;
import com.softwarefirst.communitymannger.ssm.admin.model.AdminExample;
import com.softwarefirst.communitymannger.ssm.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: communitymannger
 * @description: 管理员数据库实例
 * @author: li jinzhao
 * @create: 2020-03-23 16:34
 */
@Service
public class AdminServiceImpl implements AdminService {
     @Autowired
     private AdminMapper mapper;
    @Override
    public long countByExample(AdminExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AdminExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String admNumber) {
        return mapper.deleteByPrimaryKey(admNumber);
    }

    @Override
    public int insert(Admin record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Admin record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Admin> selectByExample(AdminExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Admin selectByPrimaryKey(String admNumber) {
        return mapper.selectByPrimaryKey(admNumber);
    }

    @Override
    public int updateByExampleSelective(Admin record, AdminExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Admin record, AdminExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return mapper.updateByPrimaryKey(record);
    }
}
