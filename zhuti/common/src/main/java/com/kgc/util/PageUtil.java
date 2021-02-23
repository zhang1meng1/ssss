package com.kgc.util;

import java.util.List;

public class PageUtil<T> {
	private int pageindex;
	private int pagesize;
	private int totalcount;
	private int totalpage;
	private List<T> list;
	public int getPageindex() {
		return pageindex;
	}
	public void setPageindex(int pageindex) {
		this.pageindex = pageindex;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getTotalcount() {
		return totalcount;
	}
	public void setTotalcount(int totalcount) {
		this.totalcount = totalcount;
		this.totalpage=(this.totalcount%this.pagesize==0)?this.totalcount/this.pagesize:this.totalcount/this.pagesize+1;
	}
	public int getTotalpage() {
		return totalpage;
	}
	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
	
}
