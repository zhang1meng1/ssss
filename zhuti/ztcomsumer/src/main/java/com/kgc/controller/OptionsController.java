package com.kgc.controller;

import com.kgc.pojo.Options;
import com.kgc.service.OptionsService;
import com.kgc.service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.beans.Transient;
import java.util.List;

@CrossOrigin
@RestController
public class OptionsController {
    @Autowired
    OptionsService optionsService;
    @Autowired
    SubjectsService subjectsService;
    //根据主题id 查询
    @RequestMapping("/getOplist/{sid}")
    public List<Options> getOplist(@PathVariable("sid") Integer sid) {
        return optionsService.getOplist(sid);
    }
    //根据选项id修改投票书数,  主题id修改投票人数

    @RequestMapping("/updatevote")
    public int updatevote(@RequestParam("oid")Integer id, @RequestParam("sid") Integer sid) {
        //修改选项投票
        int count=optionsService.updatevote(id);
        System.out.println("投票+1");
        if(count>0){
            //修改投票人数
           int count2= subjectsService.updatetotalVotes(sid);
           if(count2>0){
               System.out.println("投票人数+1");
               return count2;
           }
        }
        return count;
    }
}
