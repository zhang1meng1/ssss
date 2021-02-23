package com.kgc.feign;

import com.kgc.pojo.Options;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//选项接口
@FeignClient(name = "ztprovider")
public interface OptionsFeign {
    @RequestMapping("/getOplist/{sid}")
    public List<Options> getOplist(@PathVariable("sid") Integer sid);
    @RequestMapping("/updatevote/{id}")
    public int updatevote(@PathVariable("id")Integer id);

}
