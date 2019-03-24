package com.zhang.controller;

import com.zhang.entities.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhang.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    public List<Dept> getAll(){
        return deptService.findAll();
    }

    @RequestMapping(value = "/dept/{id}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept getDept(@PathVariable("id") Long id){
        Dept dept= deptService.findById(id);
        if(null == dept){
            throw  new RuntimeException("sorry"+ id+"can not find your data");
        }
        return dept;
    }
    public  Dept processHystrix_Get(@PathVariable("id") Long id){
       return new Dept().setDeptno(id).setDname("wow"+"没有对应信息");
    }



}
