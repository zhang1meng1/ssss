package com.kgc.pojo;
//主题类
public class Subjects {
    private Integer id;
    private  String title;//主题
    private  Integer totalVotes ;//投票人数
    private Integer viewTimes ;//查看次数
    private String createDate;//创建日期

    public Subjects() {
        super();
    }

    public Subjects(Integer id, String title, Integer totalVotes, Integer viewTimes, String createDate) {
        this.id = id;
        this.title = title;
        this.totalVotes = totalVotes;
        this.viewTimes = viewTimes;
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(Integer totalVotes) {
        this.totalVotes = totalVotes;
    }

    public Integer getViewTimes() {
        return viewTimes;
    }

    public void setViewTimes(Integer viewTimes) {
        this.viewTimes = viewTimes;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
