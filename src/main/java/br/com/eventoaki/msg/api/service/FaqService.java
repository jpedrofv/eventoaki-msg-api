package br.com.eventoaki.msg.api.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.eventoaki.msg.api.exceptions.BusinessException;
import br.com.eventoaki.msg.api.model.Faq;

@Service
public class FaqService {

	
	public List<Faq> getReviewByProduct(Integer productId) throws BusinessException{

		return getMock(productId);
	}
	
	private List<Faq> getMock(Integer id){
		
		List<Faq> lista = new ArrayList<>();
		
		Faq object = new Faq();
		object.setFaqId(1);
		object.setProductId(id);
		object.setUserId(1);
		object.setComents("Produto muito bom, recomendo!");
		object.setStars(new BigDecimal("5.0"));
		object.setType(1);
		
		Faq object1 = new Faq();
		object.setFaqId(2);
		object.setProductId(id);
		object.setUserId(2);
		object.setComents("Produto bom, porém entregou com atraso.");
		object.setStars(new BigDecimal("3.5"));
		object.setType(1);
		
		Faq object3 = new Faq();
		object.setFaqId(3);
		object.setProductId(id);
		object.setUserId(3);
		object.setComents("Valores altos para serviço de péssima qualidade! Não recomendo!");
		object.setStars(new BigDecimal("1.0"));
		object.setType(1);
		
		lista.add(object);
		lista.add(object1);
		lista.add(object3);
		
		return lista;
	}
}
