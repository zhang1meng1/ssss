package com.kgc.mapper;

import com.kgc.pojo.Subjects;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//主题的接口
@Mapper
public interface SubjectsMapper {
    //分页
    public int getcount();
    public List<Subjects> getlist(@Param("from") Integer from,@Param("pagesize")Integer pagesize);
    //根据id查询
    public Subjects getsub(Integer id);

    //#根据主题id  添加查询次数
    public int updateviewTimes(Integer id);
    //#根据投票 进行修改主题的 投票数
    public int  updatetotalVotes(Integer id);
}
