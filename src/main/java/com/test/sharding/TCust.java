package com.test.sharding;

import java.io.Serializable;
import java.util.Date;

public class TCust implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2633230887312704636L;

	/**
     * 用户ID
     */
    private long custId;

    /**
     * 客户姓名
     */
    private String custName;

    /**
     * 用户手机号
     */
    private long custMobile;
    
    private int gender;

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public long getCustMobile() {
		return custMobile;
	}

	public void setCustMobile(long custMobile) {
		this.custMobile = custMobile;
	}
	
	
	
	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public TCust(Long custId, String custName, String custMobile,Integer gender) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custMobile =Long.valueOf(custMobile);
		this.gender = gender;
	}
	
	

	@Override
	public String toString() {
		return "TCust [custId=" + custId + ", custName=" + custName + ", custMobile=" + custMobile + ", gender="
				+ gender + "]";
	}

	public TCust(String custName, long custMobile,int gender) {
		this.custName = custName;
		this.custMobile = custMobile;
		this.gender = gender;
	}

    
}