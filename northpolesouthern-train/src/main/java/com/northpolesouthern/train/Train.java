package com.northpolesouthern.train;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public final class Train {

    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");

    private final String name;
    private final String departureStation;
    private final LocalDateTime departureTime;
    private final String destinationStation;
    private final LocalDateTime destinationTime;

    public Train(
            String name,
            String departureStation,
            LocalDateTime departureTime,
            String destinationStation,
            LocalDateTime destinationTime) {
        this.name = Objects.requireNonNull(name, "name");
        this.departureStation = Objects.requireNonNull(departureStation, "departureStation");
        this.departureTime = Objects.requireNonNull(departureTime, "departureTime");
        this.destinationStation = Objects.requireNonNull(destinationStation, "destinationStation");
        this.destinationTime = Objects.requireNonNull(destinationTime, "destinationTime");
    }

    public String getName() {
        return name;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public LocalDateTime getDestinationTime() {
        return destinationTime;
    }

    @Override
    public String toString() {
        return name + System.lineSeparator()
                + "  Departs: " + departureStation + " at " + departureTime.format(TIME_FORMAT) + System.lineSeparator()
                + "  Arrives: " + destinationStation + " at " + destinationTime.format(TIME_FORMAT);
    }
}
