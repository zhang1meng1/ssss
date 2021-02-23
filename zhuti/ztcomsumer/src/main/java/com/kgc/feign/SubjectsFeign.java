package com.kgc.feign;

import com.kgc.pojo.Subjects;
import com.kgc.util.PageUtil;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ztprovider")
public interface SubjectsFeign {
    @RequestMapping("/page")
    public PageUtil<Subjects> page(@RequestParam(value = "pageindex",required = false,defaultValue = "1") Integer pageindex,
                                   @RequestParam(value = "pagesize" ,required = false,defaultValue = "3") Integer pagesize) ;

    @RequestMapping("/updateviewTimes/{id}")
    public int updateviewTimes(@PathVariable("id") Integer id);
    @RequestMapping("/updatetotalVotes/{id}")
    public int updatetotalVotes(@PathVariable("id")Integer id);
    @RequestMapping("/getsub/{id}")
    public Subjects getsub(@PathVariable("id")Integer id);

}
