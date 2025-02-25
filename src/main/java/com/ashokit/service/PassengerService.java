package com.ashokit.service;

import com.ashokit.entity.PassengerInfo;
import com.ashokit.ticketEntity.TicketInfo;

import java.util.*;
public interface PassengerService {
	public String upsertPassengerDetails(TicketInfo pdetails);
	public List<TicketInfo> getPassengerDetails();
	public String deletePassengerDetails(Integer id);

}
