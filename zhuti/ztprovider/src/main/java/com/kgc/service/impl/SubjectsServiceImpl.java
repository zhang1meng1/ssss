package com.kgc.service.impl;

import com.kgc.mapper.SubjectsMapper;
import com.kgc.pojo.Subjects;
import com.kgc.service.RestSubjectsService;
import com.kgc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectsServiceImpl implements RestSubjectsService {
    @Autowired
    SubjectsMapper subjectsMapper;

    @RequestMapping("/page")
    @Override
    public PageUtil<Subjects> page(@RequestParam(value = "pageindex",required = false,defaultValue = "1") Integer pageindex,
                                   @RequestParam(value = "pagesize" ,required = false,defaultValue = "3") Integer pagesize) {
        PageUtil<Subjects> page=new PageUtil<>();
        page.setPageindex(pageindex);
        page.setPagesize(pagesize);
        page.setTotalcount(subjectsMapper.getcount());
        page.setList(subjectsMapper.getlist((pageindex-1)*pagesize,pagesize ));
        return page;
    }

    @RequestMapping("/updateviewTimes/{id}")
    @Override
    public int updateviewTimes(@PathVariable("id") Integer id) {
        return subjectsMapper.updateviewTimes(id);
    }
    @RequestMapping("/updatetotalVotes/{id}")
    @Override
    public int updatetotalVotes(@PathVariable("id")Integer id) {
        return subjectsMapper.updatetotalVotes(id);
    }

    //根据id查询
    @RequestMapping("/getsub/{id}")
    @Override
    public Subjects getsub(@PathVariable("id")Integer id){
        return subjectsMapper.getsub(id);
    };

}
