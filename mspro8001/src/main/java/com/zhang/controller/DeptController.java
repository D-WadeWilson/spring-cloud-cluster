package com.zhang.controller;

import com.zhang.entities.Dept;
import com.zhang.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import  org.springframework.cloud.client.discovery.DiscoveryClient;
import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    public List<Dept> getAll(){
        return deptService.findAll();
    }
    @RequestMapping(value = "/dept/{id}",method = RequestMethod.GET)
    public Dept getDept(@PathVariable("id") Long id){
        return deptService.findById(id);
    }
    @RequestMapping(value = "/dept/disc")
    public  Object discovery(){
        List<String> list=client.getServices();
        System.out.println(list);
        List<ServiceInstance> instances = client.getInstances("ms-dept");

        for(ServiceInstance s:instances){
            System.out.println(s.getServiceId()+"\t"+s.getHost());
        }
        return  this.client;
    }


}
