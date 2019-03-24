package com.zhang.service;

import com.zhang.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept findById(Long id) {
                return new Dept().setDeptno(id).setDname("no such data please waiting");
            }

            @Override
            public List<Dept> findAll() {
                List<Dept> list=new ArrayList<>();
                list.add(new Dept().setDname("no list"));
                return list;
            }
        };
    }
}
