/*package com.AlaCartApp.controller;

import com.AlaCartApp.models.request.TicketDto;
import com.AlaCartApp.models.request.TicketDto;
import com.AlaCartApp.models.request.TableEntityDto;
import com.AlaCartApp.models.request.TicketDto;
import com.AlaCartApp.service.abstraction.TicketService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping
    public ResponseEntity<TicketDto> createTicket(@RequestBody TicketDto ticketDto) {
        return ResponseEntity.ok(ticketService.create(ticketDto));
    }

    @GetMapping
    public ResponseEntity<List<TicketDto>> ListTicket() {        
        return ResponseEntity.ok(ticketService.findAll());
    }

    @PutMapping
    @Transactional
    public ResponseEntity<TicketDto> updateTicket(@PathVariable Long id, @RequestBody TicketDto ticketDto) {
        return ResponseEntity.ok(ticketService.update(id, ticketDto));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> deleteTicket(@PathVariable Long id) {
        ticketService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    @Transactional
    public ResponseEntity<TicketDto> returnTicket(@PathVariable Long id){
        return ResponseEntity.ok(ticketService.find(id));
    }

}
*/