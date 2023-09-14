package com.masti.health.HealthManagment.model;

public class InsurancePackages {
   
    private int inspId;
    private String inspTitle;
    private String inspDesc;
    private String inspStatus;
    private int inspRangeStart;
    private int inspRangeEnd;
    private int inspAgeLimitStart;
    private int inspAgeLimitEnd;
    
    
	public InsurancePackages() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getInspId() {
		return inspId;
	}
	public void setInspId(int inspId) {
		this.inspId = inspId;
	}
	public String getInspTitle() {
		return inspTitle;
	}
	public void setInspTitle(String inspTitle) {
		this.inspTitle = inspTitle;
	}
	public String getInspDesc() {
		return inspDesc;
	}
	public void setInspDesc(String inspDesc) {
		this.inspDesc = inspDesc;
	}
	public String getInspStatus() {
		return inspStatus;
	}
	public void setInspStatus(String inspStatus) {
		this.inspStatus = inspStatus;
	}
	public int getInspRangeStart() {
		return inspRangeStart;
	}
	public void setInspRangeStart(int inspRangeStart) {
		this.inspRangeStart = inspRangeStart;
	}
	public int getInspRangeEnd() {
		return inspRangeEnd;
	}
	public void setInspRangeEnd(int inspRangeEnd) {
		this.inspRangeEnd = inspRangeEnd;
	}
	public int getInspAgeLimitStart() {
		return inspAgeLimitStart;
	}
	public void setInspAgeLimitStart(int inspAgeLimitStart) {
		this.inspAgeLimitStart = inspAgeLimitStart;
	}
	public int getInspAgeLimitEnd() {
		return inspAgeLimitEnd;
	}
	public void setInspAgeLimitEnd(int inspAgeLimitEnd) {
		this.inspAgeLimitEnd = inspAgeLimitEnd;
	}
	
	
	@Override
	public String toString() {
		return "InsurancePackages [inspId=" + inspId + ", inspTitle=" + inspTitle + ", inspDesc=" + inspDesc
				+ ", inspStatus=" + inspStatus + ", inspRangeStart=" + inspRangeStart + ", inspRangeEnd=" + inspRangeEnd
				+ ", inspAgeLimitStart=" + inspAgeLimitStart + ", inspAgeLimitEnd=" + inspAgeLimitEnd + "]";
	}
    
    
}
