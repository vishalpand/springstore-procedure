package com.springbootcallstoreprocesure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springbootcallstoreprocesure.dao.TicketDao;
import com.springbootcallstoreprocesure.model.Ticket;

//import com.springbootcallstoreprocesure.model.Ticket;

@RestController
public class Controller {
	
	@Autowired
	private TicketDao dao;
	
	@GetMapping("/api")
	public List<Ticket> findTickets(){
		return dao.getTicketInfo();
	}
	
	

}
