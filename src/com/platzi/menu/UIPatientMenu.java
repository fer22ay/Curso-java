package com.platzi.menu;

import com.platzi.model.Doctor;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {

    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientLogged);
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointment");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        } while (response != 0);

    }

    private static void showBookAppointmentMenu() {
        int response = 0;
        do {            
            System.out.println("::Book an appointment");
            System.out.println("::Select date: ");
            //Numeracion de la lista de fechas
            //Indice de la fecha seleccionada
            //[doctors]
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            for (int i = 0; UIDoctorMenu.doctorsAvailableAppointments.size() < 10; i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments = 
                        UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
            }
        } while (response != 0);
    }

}
