package com.zhang.service.impl;

import com.zhang.dao.DeptDao;
import com.zhang.entities.Dept;
import com.zhang.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao;
    @Override
    public boolean addDept(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> findAll() {
        return dao.findAll();
    }
}
