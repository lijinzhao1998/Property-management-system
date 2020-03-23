package com.softwarefirst.communitymannger.ssm.admin.service.Impl;

import com.softwarefirst.communitymannger.ssm.admin.mapper.DepartmentMapper;
import com.softwarefirst.communitymannger.ssm.admin.model.Department;
import com.softwarefirst.communitymannger.ssm.admin.model.DepartmentExample;
import com.softwarefirst.communitymannger.ssm.admin.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: communitymannger
 * @description: 这是部门服务器的一个实例
 * @author: li jinzhao
 * @create: 2020-03-23 16:55
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
   @Autowired
   private DepartmentMapper mapper;
    @Override
    public long countByExample(DepartmentExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DepartmentExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String deNumber) {
        return mapper.deleteByPrimaryKey(deNumber);
    }

    @Override
    public int insert(Department record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Department record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Department> selectByExample(DepartmentExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Department selectByPrimaryKey(String deNumber) {
        return mapper.selectByPrimaryKey(deNumber);
    }

    @Override
    public int updateByExampleSelective(Department record, DepartmentExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Department record, DepartmentExample example) {
        return mapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Department record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Department record) {
        return mapper.updateByPrimaryKey(record);
    }
}
