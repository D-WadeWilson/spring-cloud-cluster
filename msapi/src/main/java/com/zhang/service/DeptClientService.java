package com.zhang.service;

import com.zhang.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "MS-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "dept/add",method = RequestMethod.POST)
    public  boolean addDept(Dept dept);

    @RequestMapping(value = "/dept/{id}",method = RequestMethod.GET)
    public Dept findById(Long id);

    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    public List<Dept> findAll();

}
