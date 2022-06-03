package com.springbootcallstoreprocesure.model;

import java.util.List;

//import java.security.Policy.Parameters;

import javax.persistence.Entity;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
//import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name="firstProcesure", procedureName = "getTickets"),@NamedStoredProcedureQuery(name="secondProcesure",procedureName = "getTicketDetails",parameters= {@StoredProcedureParameter(mode=ParameterMode.IN,name="catagory",type=String.class)} )})
public class Ticket {
	
	private int id;
	private int amount;
	private String catagory;
	
	

}
