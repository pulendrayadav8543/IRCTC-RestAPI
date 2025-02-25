package com.basepkg.ticketEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="Ticket_Dtls")
public class TicketInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private Integer id;
	@Column(name="first_name")
	private String fname;
	
	@Column(name="last_name")
	private String lname;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="phoneNumber")
	private Integer phNumber;
	
	@Column(name="From_Station")
	private String from;
	
	@Column(name="To_Station")
	private String to;
	
	@Column(name="DOJ")
	private String doj;
	
	@Column(name="Class_Type")
	private String clsType;
	
	@Column(name="Status")
	private String status;
	
	@Column(name="PNR")
	private Long pnr;
	
	@Column(name="Coach")
	private String coach;
	
	@Column(name="Seat_Number")
	private Integer seatNumber;
	
	@Column(name="Fare")
	private Integer fare;
	

}
