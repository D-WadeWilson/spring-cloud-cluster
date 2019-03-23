package com.zhang.service;

import com.zhang.entities.Dept;

import java.util.List;

public interface DeptService {
    public  boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
