package com.example.TicketBookin.service;


import com.example.TicketBookin.Entity.TicketEnitity;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface TicketService<Ticket> {
    Integer saveTicket(TicketEnitity ticket);

    List<TicketEnitity> getAllTickets();

    TicketEnitity getTicketById(Integer id);

    void deleteTicket(Integer id);

}