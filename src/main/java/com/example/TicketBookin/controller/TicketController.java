package com.example.TicketBookin.controller;

import com.example.TicketBookin.Entity.TicketEnitity;
import org.springframework.ui.Model;
import com.example.TicketBookin.service.TicketService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TicketController {

   @Autowired
    private TicketService service;

   @GetMapping("/")
    public String home(Model model){
       model.addAttribute("ticket",new TicketEnitity());
        return "index";
    }
    @PostMapping("/save")
    public String saveTicket( @ModelAttribute TicketEnitity ticket){
       service.saveTicket(ticket);
       return "redirect:/view";
    }
    @GetMapping("/view")
    public String viewTickets(Model model){
       model.addAttribute("ticket",service.getAllTickets());
        return "viewTickets";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam Integer id, Model model){
       model.addAttribute("ticket",service.getTicketById(id));
       return "index";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam Integer id){
       service.deleteTicket(id);
       return "redirect:/view";
    }
}
