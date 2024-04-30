package com.aarya.parkinglot.services;

import com.aarya.parkinglot.models.Gate;
import com.aarya.parkinglot.models.VehicleType;
import com.aarya.parkinglot.repositories.GateRepository;
import com.aarya.parkinglot.exceptions.InvalidGateException;
import com.aarya.parkinglot.models.Ticket;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gate;

    public TicketService(GateRepository gate) {
        this.gate = gate;
    }

    public Ticket issueTicket(Long gateId, String vehicleNumber, VehicleType vehicleType, String ownerName) throws InvalidGateException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gate.findById(gateId);

        if (optionalGate.isEmpty()) {
            throw new InvalidGateException("Invalid gate Id");
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());

        // TODO: add vehicle.


        return null;
    }
}
