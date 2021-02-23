package com.kgc.controller;

import com.kgc.pojo.Subjects;
import com.kgc.service.SubjectsService;
import com.kgc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class SubjectsController {
    @Autowired
    SubjectsService subjectsService;

    @RequestMapping("/page")
    public PageUtil<Subjects> page(@RequestParam(value = "pageindex",required = false,defaultValue = "1") Integer pageindex,
                                   @RequestParam(value = "pagesize" ,required = false,defaultValue = "3") Integer pagesize) {
        return subjectsService.page(pageindex,pagesize);
    }
    //#根据主题id  添加查询次数
    @RequestMapping("/updateviewTimes/{id}")
    public int updateviewTimes(@PathVariable("id") Integer id) {
        return subjectsService.updateviewTimes(id);
    }
    @RequestMapping("/updatetotalVotes/{id}")
    public int updatetotalVotes(@PathVariable("id")Integer id) {
        return subjectsService.updatetotalVotes(id);
    }
    //根据id查询
    @RequestMapping("/getsub/{id}")
    public Subjects getsub(@PathVariable("id")Integer id){
        //查询次数+1
        this.updateviewTimes(id);
        return subjectsService.getsub(id);
    };
}
