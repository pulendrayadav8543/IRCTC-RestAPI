package com.ashokit.rest;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.entity.PassengerInfo;
import com.ashokit.service.PassengerSerivceImpl;
import com.ashokit.ticketEntity.TicketInfo;
import java.util.*;
@RestController
public class TicketController {
	@Autowired
	private PassengerSerivceImpl serviceImpl;
	
	@PostMapping("/bookTicket")
	public ResponseEntity<String> upsertDetails(@RequestBody PassengerInfo passenger){
		TicketInfo ticket=new TicketInfo();
		ticket.setFname(passenger.getFname());
		ticket.setLname(passenger.getLname());
		ticket.setAge(passenger.getAge());
		ticket.setGender(passenger.getGender());
		ticket.setPhNumber(passenger.getPhNumber());
		ticket.setFrom(passenger.getFrom());
		ticket.setTo(passenger.getTo());
		ticket.setDoj(passenger.getDoj());
		ticket.setClsType("3AC");
		ticket.setFare(1500);
		
		Random randomNumber=new Random();
		Integer seatNumber=randomNumber.nextInt(99)+1;
		
		ticket.setSeatNumber(seatNumber);
		
		char randomChar=(char)('A'+randomNumber.nextInt(26));
		String coachNumber=String.valueOf(randomChar)+randomNumber.nextInt(2);
		//random value set for coach number
		ticket.setCoach(coachNumber);
		
		long pnr= 1000000000L + (long)(randomNumber.nextDouble() * 9000000000L);
		long positiveRandomLong = Math.abs(pnr);
		//random value for pnr number
		ticket.setPnr(positiveRandomLong);
	
		ticket.setStatus("CNF");
		
		System.out.println(ticket);
		String str=serviceImpl.upsertPassengerDetails(ticket);
		return new ResponseEntity<>(str,HttpStatus.CREATED);
	}
	@GetMapping("/ticket")
	public ResponseEntity<List<TicketInfo>> getDetails(){
		List<TicketInfo> ticket=serviceImpl.getPassengerDetails();
		return new ResponseEntity<List<TicketInfo>>(ticket,HttpStatus.OK);
	}
	

}
