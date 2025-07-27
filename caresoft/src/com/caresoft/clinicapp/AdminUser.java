package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;

    public AdminUser(Integer employeeID, String role) {
        this.employeeID = employeeID;
        this.role = role;
        this.securityIncidents = new ArrayList<String>();
    }

    @Override
    public boolean assignPin(int pin) {
        if (String.valueOf(pin).length() >= 6) {
            this.pin = pin;
            return true;
        }
        return false;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        if (!this.id.equals(confirmedAuthID)) {
            authIncident();
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return this.securityIncidents;
    }

    public void newIncident(String notes) {
        String report = String.format("⚠️ INCIDENT REPORT ⚠️\n📅 %s\n🆔 Admin ID: %s\n🗒️ Notes: %s\n", 
            new Date(), this.id, notes);
        this.securityIncidents.add(report);
    }

    public void authIncident() {
        String report = String.format("🚨 AUTH FAILURE 🚨\n📅 %s\n🆔 Admin ID: %s\n🔒 Unauthorized access attempt.\n", 
            new Date(), this.id);
        this.securityIncidents.add(report);
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

