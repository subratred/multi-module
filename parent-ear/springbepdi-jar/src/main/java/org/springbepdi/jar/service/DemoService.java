package org.springbepdi.jar.service;

import org.springbepdi.jar.entity.DemoEntity;
import org.springbepdi.jar.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public List<DemoEntity> findAll(){
        return demoMapper.selectAll();
    }

}
