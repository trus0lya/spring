package com.example.train.mapper;

import com.example.train.entity.DiscountsEntity;
import com.example.train.entity.TicketEntity;
import com.example.train.model.Discount;
import com.example.train.model.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketMapper {
    public static TicketEntity ticketToTicketEntity (Ticket ticket) {
        TicketEntity ticketEntity = new TicketEntity();
        ticketEntity.setId(ticket.getId());
        ticketEntity.setTicketNumber(ticket.getTicketNumber());
        ticketEntity.setPassenger(PassengerMapper.passengerToPassengerEntity(ticket.getPassenger()));
        ticketEntity.setRoutes(RouteMapper.RouteToRouteEntity(ticket.getRoute()));
        ticketEntity.setPrice(ticket.getPrice());
        ticketEntity.setCarriage(CarriageMapper.carriageToCarriageEntity(ticket.getCarriage()));
        List<DiscountsEntity> discountsEntities = new ArrayList<>();
        for(int i = 0; i < ticket.getDiscounts().size(); ++i) {
            discountsEntities.add(DiscountMapper.discountToDiscountEntity(ticket.getDiscounts().get(i)));
        }
        ticketEntity.setDiscounts(discountsEntities);
        return ticketEntity;
    }

    public static Ticket ticketEntityToTicket(TicketEntity ticketEntity) {
        Ticket ticket = new Ticket();
        ticket.setId(ticketEntity.getId());
        ticket.setTicketNumber(ticketEntity.getTicketNumber());
        ticket.setPassenger(PassengerMapper.passengerEntityToPassenger(ticketEntity.getPassenger()));
        ticket.setRoute(RouteMapper.routeEntityToRoute(ticketEntity.getRoutes()));
        ticket.setPrice(ticket.getPrice());
        ticket.setCarriage(CarriageMapper.carriageEntityToCarriage(ticketEntity.getCarriage()));
        List<Discount> discounts = new ArrayList<>();
        for(int i = 0; i < ticketEntity.getDiscounts().size(); ++i) {
            discounts.add(DiscountMapper.discountEntityToDiscount(ticketEntity.getDiscounts().get(i)));
        }
        ticket.setDiscounts(discounts);
        return ticket;
    }
}
