package com.northpolesouthern.train;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class TrainCatalog {

    private TrainCatalog() {
    }

    public static List<Train> getTrains() {
        return Collections.unmodifiableList(Arrays.asList(
                new Train(
                        "Polar Express",
                        "North Pole Station",
                        LocalDateTime.of(2026, 12, 24, 8, 0),
                        "Toy Town",
                        LocalDateTime.of(2026, 12, 24, 12, 30)),
                new Train(
                        "Reindeer Runner",
                        "Santa's Workshop",
                        LocalDateTime.of(2026, 12, 24, 9, 15),
                        "Elf Junction",
                        LocalDateTime.of(2026, 12, 24, 10, 45)),
                new Train(
                        "Snowflake Limited",
                        "Ice Harbor",
                        LocalDateTime.of(2026, 12, 24, 14, 0),
                        "Glacier Pass",
                        LocalDateTime.of(2026, 12, 24, 18, 20)),
                new Train(
                        "Midnight Mail",
                        "North Pole Station",
                        LocalDateTime.of(2026, 12, 24, 23, 30),
                        "Gift Depot",
                        LocalDateTime.of(2026, 12, 25, 2, 0))));
    }
}
