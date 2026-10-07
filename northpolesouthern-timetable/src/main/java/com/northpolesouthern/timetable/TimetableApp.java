package com.northpolesouthern.timetable;

import com.northpolesouthern.train.Train;
import com.northpolesouthern.train.TrainCatalog;

public final class TimetableApp {

    private TimetableApp() {
    }

    public static void main(String[] args) {
        System.out.println("North Pole Southern Timetable");
        System.out.println("-----------------------------");

        for (Train train : TrainCatalog.getTrains()) {
            System.out.println(train);
            System.out.println();
        }
    }
}
