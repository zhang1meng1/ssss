package com.kgc.service.impl;

import com.kgc.feign.SubjectsFeign;
import com.kgc.pojo.Subjects;
import com.kgc.service.SubjectsService;
import com.kgc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectsServiceImpl  implements SubjectsService {
    @Autowired
    SubjectsFeign subjectsFeign;

    @Override
    public PageUtil<Subjects> page(Integer pageindex, Integer pagesize) {
        return subjectsFeign.page(pageindex,pagesize);
    }

    //添加查询次数
    @Override
    public int updateviewTimes(Integer id) {
        return subjectsFeign.updateviewTimes(id);
    }

    //修改主题的 投票数
    @Override
    public int updatetotalVotes(Integer id) {
        return subjectsFeign.updatetotalVotes(id);
    }

    //根据id查询
    public Subjects getsub(Integer id) {
      return subjectsFeign.getsub(id);
    };
}
