package com.caresoft.clinicapp;

import java.util.*;

public class HospitalConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("╔════════════════════════════════╗");
        System.out.println("║ 🏥 CARESOFT HOSPITAL TERMINAL ║");
        System.out.println("╚════════════════════════════════╝");

        AdminUser admin = new AdminUser(101, "Security Officer");
        admin.setId(101);
        Physician doc = new Physician(202);
        doc.setId(202);

        boolean running = true;

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1️⃣ Assign PINs");
            System.out.println("2️⃣ Access Authorization Test");
            System.out.println("3️⃣ Log Patient Note (Physician)");
            System.out.println("4️⃣ Trigger Failed Admin Access");
            System.out.println("5️⃣ Print Security Incidents");
            System.out.println("6️⃣ Exit");
            System.out.print("➤ Choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter 4-digit PIN for Physician: ");
                    int pPin = input.nextInt();
                    System.out.println(doc.assignPin(pPin) ? "✅ PIN accepted" : "❌ Invalid PIN");
                    
                    System.out.print("Enter 6-digit PIN for Admin: ");
                    int aPin = input.nextInt();
                    System.out.println(admin.assignPin(aPin) ? "✅ PIN accepted" : "❌ Invalid PIN");
                    break;

                case 2:
                    System.out.print("Enter ID to test Physician access: ");
                    int pid = input.nextInt();
                    System.out.println(doc.accessAuthorized(pid) ? "🔓 Access Granted" : "🔒 Access Denied");

                    System.out.print("Enter ID to test Admin access: ");
                    int aid = input.nextInt();
                    System.out.println(admin.accessAuthorized(aid) ? "🔓 Access Granted" : "🔒 Access Denied & Incident Logged");
                    break;

                case 3:
                    input.nextLine(); // clear buffer
                    System.out.print("Patient name: ");
                    String name = input.nextLine();
                    System.out.print("Note: ");
                    String note = input.nextLine();
                    doc.newPatientNotes(note, name, new Date());
                    System.out.println("📝 Note recorded.");
                    break;

                case 4:
                    System.out.println("Simulating multiple failed admin access attempts...");
                    admin.accessAuthorized(999);
                    admin.accessAuthorized(888);
                    admin.accessAuthorized(777);
                    break;

                case 5:
                    System.out.println("\n🗃️ Security Incident Logs:");
                    admin.printSecurityIncidents();
                    break;

                case 6:
                    System.out.println("👋 Shutting down terminal. Stay compliant!");
                    running = false;
                    break;

                default:
                    System.out.println("❌ Invalid option. Try again.");
            }
        }

        input.close();
    }
}

