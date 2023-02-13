package com.br.canix.srvtruckmanager.domain.exception;

public class TruckNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public TruckNotFoundException(String message) {
        super(message);
    }

    public TruckNotFoundException(Long truckId) {
        this(String.format("There is no truck registration with code %d", truckId));
    }
}
