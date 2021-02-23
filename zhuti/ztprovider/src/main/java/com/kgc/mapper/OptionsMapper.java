package com.kgc.mapper;

import com.kgc.pojo.Options;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//选项接口
@Mapper
public interface OptionsMapper {
   // #根据id 查询对应的选项
    public List<Options> getOplist(Integer sid);

    //根据投票进行修改选项的 投票数
    public int updatevote(Integer id);
}
