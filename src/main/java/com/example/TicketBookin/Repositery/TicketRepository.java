package com.example.TicketBookin.Repositery;

import com.example.TicketBookin.Entity.TicketEnitity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<TicketEnitity,Integer> {
}
