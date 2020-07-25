package com.example.demo.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.demo.model.bean.Veiculo;
import com.example.demo.model.repository.JPAUtil;


public class TesteCreateVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Veiculo v = new Veiculo ();
		v.setModelo("Fit");
		v.setMarca("Honda");
		v.setPlaca ("ABC-1234");
		v.setAno (2016);
		
		manager.persist(v);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
