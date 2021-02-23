package com.kgc.service.impl;

import com.kgc.feign.OptionsFeign;
import com.kgc.pojo.Options;
import com.kgc.service.OptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionsServiceImpl implements OptionsService {
    @Autowired
    OptionsFeign optionsFeign;

    @Override
    public List<Options> getOplist(Integer sid) {
        return optionsFeign.getOplist(sid);
    }

    //修改选项的 投票数
    @Override
    public int updatevote(Integer id) {
        return optionsFeign.updatevote(id);
    }
}
