package com.basepkg.entity;

import com.ashokit.ticketEntity.TicketInfo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
public class PassengerInfo {
	private String fname;
	private String lname;
	private Integer age;
	private String gender;
	private Integer phNumber;
	private String from;
	private String to;
	private String doj;
}
