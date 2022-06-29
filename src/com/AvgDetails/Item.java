package com.AvgDetails;

public class Item {
	int itemid;
	String itemname;
	Float itemprice;
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public Float getItemprice() {
		return itemprice;
	}
	public void setItemprice(Float itemprice) {
		this.itemprice = itemprice;
	}
	public Item(int itemid, String itemname, Float itemprice) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.itemprice = itemprice;
	}
	
	
}
