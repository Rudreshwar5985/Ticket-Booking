package com.example.TicketBookin.ServiceImlp;

import com.example.TicketBookin.Entity.TicketEnitity;
import com.example.TicketBookin.Repositery.TicketRepository;
import com.example.TicketBookin.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository repository;

    @Override
    public Integer saveTicket(TicketEnitity ticket) {
        return repository.save(ticket).getId();
    }

    @Override
    public List<TicketEnitity> getAllTickets() {
        return repository.findAll();
    }

    @Override
    public TicketEnitity getTicketById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void deleteTicket(Integer id) {
        repository.deleteById(id);
    }
}