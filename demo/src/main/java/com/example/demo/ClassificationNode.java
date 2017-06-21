package com.example.demo;

public class ClassificationNode {

	private String code;
	private String path;
	ObjectReference parent = new ObjectReference();
	PartyRole pRole = new PartyRole();
	
	public ClassificationNode(){
		this.code = "Define-Code";
		this.path = "Define-Path";
	}
	public String getCode() {
		return code;
	}
	public String getPath() {
		return path;
	}
	public ObjectReference getParent() {
		return parent;
	}
	public PartyRole getpRole() {
		return pRole;
	}
	
}
