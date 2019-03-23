package com.zhang.controller;

import com.zhang.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Dept {
   // private  static  final  String PREFIX="http://localhost:8001";
    private  static  final  String PREFIX="http://MS-DEPT";
    @Autowired
    private RestTemplate restTemplate;

    @SuppressWarnings("unchecked")
    @RequestMapping("/getDepts")
    public List<Dept> getDepts(){
        return restTemplate.getForObject(PREFIX+"/depts",List.class);
    }
    @RequestMapping("/getDept/{id}")
    public Dept getDeptById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PREFIX+"/dept/"+id,Dept.class);
    }
    @RequestMapping(value = "/cons/dic")
    public Object discovery(){
        return restTemplate.getForObject(PREFIX+"/dept/disc",Object.class);
    }
}
