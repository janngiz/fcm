package com.tamzid.fcmdemo.dto;


public class NotificationRequestDto {

    private String target;
    private String title;
    private String body;
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public NotificationRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NotificationRequestDto(String target, String title, String body) {
		super();
		this.target = target;
		this.title = title;
		this.body = body;
	}
    
    
}
