package com.lambdaschool.foodtrucktrackr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class to start the application.
 */
// @EnableJpaAuditing
@SpringBootApplication
public class FoodTruckTrackrApplicationTesting
{
    /**
     * Main method to start the application.
     *
     * @param args Not used in this application.
     */
    public static void main(String[] args)
    {
        SpringApplication.run(FoodTruckTrackrApplicationTesting.class,
            args);
    }
}
