package com.zhang.dao;

import com.zhang.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    public  boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
