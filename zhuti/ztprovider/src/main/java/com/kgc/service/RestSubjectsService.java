package com.kgc.service;

import com.kgc.pojo.Subjects;
import com.kgc.util.PageUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RestSubjectsService {
    //分页
    public PageUtil<Subjects> page(Integer pageindex,Integer pagesize);
   //#根据主题id  添加查询次数
    public int updateviewTimes(Integer id);
    //#根据投票进行修改主题的 投票数
    public int  updatetotalVotes(Integer id);
    //根据id查询
    public Subjects getsub(Integer id);

}
