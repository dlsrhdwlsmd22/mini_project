package com.sts.vo;

import java.util.Arrays;

public class RecipeVO {

	private int rid = 0;	
	private String rname = null;
	private String ritem = null;	
	private byte[] rimage = null;
	private String rcontent = null;
	private int rhit = 0;
	
	public RecipeVO() {
		super();
	}
	public RecipeVO(int rid, String rname, String ritem, byte[] rimage, String rcontent, int rhit) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.ritem = ritem;
		this.rimage = rimage;
		this.rcontent = rcontent;
		this.rhit = rhit;
	}
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRitem() {
		return ritem;
	}
	public void setRitem(String ritem) {
		this.ritem = ritem;
	}
	public byte[] getRimage() {
		return rimage;
	}
	public void setRimage(byte[] rimage) {
		this.rimage = rimage;
	}
	public String getRcontent() {
		return rcontent;
	}
	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}
	public int getRhit() {
		return rhit;
	}
	public void setRhit(int rhit) {
		this.rhit = rhit;
	}
	
	@Override
	public String toString() {
		return "RecipeVO [rid=" + rid + ", rname=" + rname + ", ritem=" + ritem + ", rimage=" + Arrays.toString(rimage)
				+ ", rcontent=" + rcontent + ", rhit=" + rhit + "]";
	}
}
