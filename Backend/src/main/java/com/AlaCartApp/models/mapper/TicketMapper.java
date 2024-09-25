/*package com.AlaCartApp.models.mapper;

import com.AlaCartApp.models.entity.Ticket;
import com.AlaCartApp.models.request.TicketDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TicketMapper {

    TicketDto toTicketDTO(Ticket ticket);
    List<TicketDto> toTicketsDTO(List<Ticket> ticketList);

    @InheritInverseConfiguration
    Ticket toTicket(TicketDto ticketDto);

    List<Ticket> toTickets(List<TicketDto> ticketDtoList);
}
*/