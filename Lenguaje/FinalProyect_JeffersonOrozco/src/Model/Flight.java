/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Usuario
 */
public class Flight {
    private Plane plane;
    private AirlineEmployee airlineEmployee;
    private String originFlight;
    private String destineFlight;
    private int day;
    private int month;
    private int year;
    private int hour;
    private int estimateFlight;
    private int idFlight;

    public Flight(Plane plane, AirlineEmployee airlineEmployee, String originFlight, String destineFlight, int day, int month, int year, int hour, int estimateFlight, int idFlight) {
        this.plane = plane;
        this.airlineEmployee = airlineEmployee;
        this.originFlight = originFlight;
        this.destineFlight = destineFlight;
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.estimateFlight = estimateFlight;
        this.idFlight = idFlight;
    }

    public int getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(int idFlight) {
        this.idFlight = idFlight;
    }



    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public AirlineEmployee getAirlineEmployee() {
        return airlineEmployee;
    }

    public void setAirlineEmployee(AirlineEmployee airlineEmployee) {
        this.airlineEmployee = airlineEmployee;
    }

    public String getOriginFlight() {
        return originFlight;
    }

    public void setOriginFlight(String originFlight) {
        this.originFlight = originFlight;
    }

    public String getDestineFlight() {
        return destineFlight;
    }

    public void setDestineFlight(String destineFlight) {
        this.destineFlight = destineFlight;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getEstimateFlight() {
        return estimateFlight;
    }

    public void setEstimateFlight(int estimateFlight) {
        this.estimateFlight = estimateFlight;
    }
    
    
}
