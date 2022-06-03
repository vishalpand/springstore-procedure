package com.springbootcallstoreprocesure.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbootcallstoreprocesure.model.Ticket;

@Repository
public class TicketDao {
     @Autowired
     private EntityManager em;
     
     @SuppressWarnings("unchecked")
	public List<Ticket> getTicketInfo(){
    	 return em.createNamedStoredProcedureQuery("firstProcesure").getResultList();
     }
     
     
     @SuppressWarnings("unchecked")
 	public List<Ticket> getTicketInfobycatagory(){
     	 return em.createNamedStoredProcedureQuery("secondProcesure").setParameter("catagory", em).getResultList();
      }


//	public List<Ticket> getTicketInfo() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
