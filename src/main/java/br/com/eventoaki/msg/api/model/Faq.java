package br.com.eventoaki.msg.api.model;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

public class Faq {

	private Integer faqId;
	
	@NotNull
	private Integer productId;
	
	@NotNull
	private Integer userId;
	
	@NotNull
	private BigDecimal stars;
	
	
	private String coments;
	
	@NotNull
	private Integer type;
	
	public Integer getFaqId() {
		return faqId;
	}
	public void setFaqId(Integer faqId) {
		this.faqId = faqId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public BigDecimal getStars() {
		return stars;
	}
	public void setStars(BigDecimal stars) {
		this.stars = stars;
	}
	public String getComents() {
		return coments;
	}
	public void setComents(String coments) {
		this.coments = coments;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
	
}
