package com.kgc.service;

import com.kgc.pojo.Options;

import java.util.List;

public interface OptionsService {
    // #根据id 查询对应的选项
    public List<Options> getOplist(Integer sid);

    //根据投票进行修改选项的 投票数
    public int updatevote(Integer id);
}
