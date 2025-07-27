package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
    private ArrayList<String> patientNotes;

    public Physician(Integer id) {
        this.id = id;
        this.patientNotes = new ArrayList<String>();
    }

    @Override
    public boolean assignPin(int pin) {
        if (String.valueOf(pin).length() == 4) {
            this.pin = pin;
            return true;
        }
        return false;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        return this.id.equals(confirmedAuthID);
    }

    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format("📅 %s\n👨‍⚕️ Physician ID: %s\n🧑‍🤝‍🧑 Patient: %s\n📝 Notes: %s\n", 
            date, this.id, patientName, notes);
        this.patientNotes.add(report);
    }

    public ArrayList<String> getPatientNotes() {
        return patientNotes;
    }

    public void setPatientNotes(ArrayList<String> patientNotes) {
        this.patientNotes = patientNotes;
    }
}
