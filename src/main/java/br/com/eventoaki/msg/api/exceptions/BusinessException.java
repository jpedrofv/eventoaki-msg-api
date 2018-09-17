package br.com.eventoaki.msg.api.exceptions;

public class BusinessException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String msg;
	
	public BusinessException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	public String getMsg() {
		return this.msg;
	}
}
