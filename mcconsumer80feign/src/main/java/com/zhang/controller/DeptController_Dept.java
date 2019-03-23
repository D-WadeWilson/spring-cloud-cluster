package com.zhang.controller;

import com.zhang.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zhang.service.DeptClientService;

import java.util.List;

@RestController
public class DeptController_Dept {
    @Autowired
    private  DeptClientService clientService;
   // private  static  final  String PREFIX="http://localhost:8001";

    @SuppressWarnings("unchecked")
    @RequestMapping("/getDepts")
    public List<Dept> getDepts(){
        return clientService.findAll();
    }
    @RequestMapping("/getDept/{id}")
    public Dept getDeptById(@PathVariable("id") Long id){
        return clientService.findById(id);
    }
}
