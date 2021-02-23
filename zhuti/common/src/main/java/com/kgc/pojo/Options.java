package com.kgc.pojo;
//选项类
public class Options {
    private Integer id;
    private  String optContent;//选项内容
    private Integer vote;//得票数
    private Integer sid;//主题id

    public Options() {
        super();
    }

    public Options(Integer id, String optContent, Integer vote, Integer sid) {
        this.id = id;
        this.optContent = optContent;
        this.vote = vote;
        this.sid = sid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOptContent() {
        return optContent;
    }

    public void setOptContent(String optContent) {
        this.optContent = optContent;
    }

    public Integer getVote() {
        return vote;
    }

    public void setVote(Integer vote) {
        this.vote = vote;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}
