package com.basepkg.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashokit.entity.PassengerInfo;
import com.ashokit.ticketEntity.TicketInfo;

public interface TicketRepository extends JpaRepository<TicketInfo, Serializable>{
}
