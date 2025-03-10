package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
    public static void main(String args[]){

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("AudiVehicle", Vehicle.class);
        System.out.println("Vehicle from Spring " + veh1.getName());

        Vehicle veh2 = context.getBean("FerrariVehicle", Vehicle.class);
        System.out.println("Vehicle from Spring " + veh2.getName());

        Vehicle veh3 = context.getBean("MercedesVehicle", Vehicle.class);
        System.out.println("Vehicle from Spring " + veh3.getName());



    }
}
