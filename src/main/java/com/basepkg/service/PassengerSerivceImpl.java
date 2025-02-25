package com.basepkg.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.ashokit.entity.PassengerInfo;
import com.ashokit.repo.TicketRepository;
import com.ashokit.ticketEntity.TicketInfo;
@Service
public class PassengerSerivceImpl implements PassengerService {
	
	private TicketRepository repository;
	PassengerInfo passenger=new PassengerInfo();
	public PassengerSerivceImpl(TicketRepository repository) {
		this.repository=repository;
	}
	
	@Override
	public String upsertPassengerDetails(TicketInfo ticket) {
		Integer id=ticket.getId();
		repository.save(ticket);
		if(id==null) {
			return "Record inserted";
		}else {
			return "Record updated";
		}
	}

	@Override
	public List<TicketInfo> getPassengerDetails() {
		List<TicketInfo> getDetails=repository.findAll();
		return getDetails;
	}

	@Override
	public String deletePassengerDetails(Integer id) {
		repository.deleteById(id);
		return "Record Deleted";
	}

}
