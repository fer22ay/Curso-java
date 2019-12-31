package com.platzi.model;

import com.platzi.users.User;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributos
    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * *
     * Constructor de la clase Doctor con parametro
     *
     * @param name Recibe el nombre del User
     * @param email Recibe el correo del User
     */
    public Doctor(String name, String email) {
        super(name, email);
//        System.out.println("El nombre asignado es: " + name);
//        this.speciality = speciality;
    }

    public void addAvailableAppointment(String date, String time) {

        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerologia");
    }

    public static class AvailableAppointment {

        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public String getDate(String DATE) {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

    }

}
