/*package com.AlaCartApp.service.implementation;

import com.AlaCartApp.exception.ResourceNotFoundException;
import com.AlaCartApp.models.entity.Order;
import com.AlaCartApp.models.entity.Ticket;
import com.AlaCartApp.models.entity.User;
import com.AlaCartApp.models.mapper.TicketMapper;
import com.AlaCartApp.models.request.TicketDto;
import com.AlaCartApp.repository.OrderRepository;
import com.AlaCartApp.repository.TicketRepository;
import com.AlaCartApp.repository.UserRepository;
import com.AlaCartApp.service.abstraction.TicketService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private TicketMapper ticketMapper;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<TicketDto> findAll() {
        return ticketMapper.toTicketsDTO(ticketRepository.findAll());
    }

    @Override
    public TicketDto create(TicketDto ticketDto) {
        ticketDto.setDate(LocalDateTime.now());
        ticketDto.setIsActive(Boolean.TRUE);
        ticketDto.setPaid(Boolean.FALSE);
        Optional<User> user = userRepository.findById(ticketDto.getUser().getId());
        if(user.isPresent()){
            Optional<Order> order = orderRepository.findById(ticketDto.getOrder().getId());
            if(order.isPresent()){
                return ticketMapper.toTicketDTO(ticketRepository.save(ticketMapper.toTicket(ticketDto)));
            }else{
                throw new ResourceNotFoundException("Order not found with id: " + ticketDto.getOrder().getId());
            }
        }else{
            throw new ResourceNotFoundException("User not found with id: " + ticketDto.getUser().getId());
        }
    }

    @Override
    public TicketDto update(Long id, TicketDto ticketDto) {
        Optional<Ticket> ticket = ticketRepository.findById(id);
        if(ticket.isPresent()){
            delete(id);
            return create(ticketDto);
        }else{
            throw new ResourceNotFoundException("Ticket not found with id: " + id);
        }
    }

    @Override
    public void delete(Long id) {
        Optional<Ticket> ticket = ticketRepository.findById(id);
        if(ticket.isPresent()){
            ticket.get().setIsActive(false);
            ticketRepository.save(ticket.get());
        }else{
            throw new ResourceNotFoundException("Ticket not found with id: " + id);
        }
    }

    @Override
    public TicketDto find(Long id) {
        Optional<Ticket> ticket = ticketRepository.findById(id);
        if(ticket.isPresent()){
            return ticketMapper.toTicketDTO(ticket.get());
        }else{
            throw new ResourceNotFoundException("Ticket not found with id: " + id);
        }
    }
}
*/