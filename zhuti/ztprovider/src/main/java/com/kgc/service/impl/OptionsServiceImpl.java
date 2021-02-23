package com.kgc.service.impl;

import com.kgc.mapper.OptionsMapper;
import com.kgc.pojo.Options;
import com.kgc.service.RestOptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class OptionsServiceImpl implements RestOptionsService {
    @Autowired
    OptionsMapper optionsMapper;

    @RequestMapping("/getOplist/{sid}")
    @Override
    public List<Options> getOplist(@PathVariable("sid") Integer sid) {
        return optionsMapper.getOplist(sid);
    }
    @RequestMapping("/updatevote/{id}")
    @Override
    public int updatevote(@PathVariable("id")Integer id) {
        return optionsMapper.updatevote(id);
    }
}
