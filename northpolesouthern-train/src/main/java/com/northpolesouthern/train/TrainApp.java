package com.northpolesouthern.train;

public final class TrainApp {

    private TrainApp() {
    }

    public static void main(String[] args) {
        System.out.println("North Pole Southern Train Catalog");
        System.out.println("---------------------------------");
        for (Train train : TrainCatalog.getTrains()) {
            System.out.println(train);
            System.out.println();
        }
    }
}
