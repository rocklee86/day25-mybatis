package cn.qphone.mybatis.service.impl;

import cn.qphone.mybatis.mapper.EmpMapper;
import cn.qphone.mybatis.pojo.Emp;
import cn.qphone.mybatis.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    public List<Emp> findEmpList() {
        return empMapper.findEmpList();
    }

    public Emp get(Integer id) {
        return empMapper.get(id);
    }

    public void insert(Emp emp) {
        empMapper.insert(emp);
    }

    public void update(Emp emp) {
        empMapper.update(emp);
    }

    public void delete(Integer id) {
        empMapper.delete(id);
    }
}
