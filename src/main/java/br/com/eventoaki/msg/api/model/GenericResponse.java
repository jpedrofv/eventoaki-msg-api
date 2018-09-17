package br.com.eventoaki.msg.api.model;

import java.util.List;

import org.springframework.http.HttpStatus;

public class GenericResponse {

	private String msg;
	private HttpStatus status;
	private List<?> data;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public List<?> getData() {
		return data;
	}
	public void setData(List<?> data) {
		this.data = data;
	}
	
	
	
}
