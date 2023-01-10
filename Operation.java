/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inquiryform;

/**
 *
 * @author Sarthak
 */
public class Operation {
    public static void printVisitorDetails(NewVisitor newVisitor){
        System.out.println("Course Opted "+ newVisitor.getCourseOpted());
        System.out.println("Candidate Name "+ newVisitor.getNameOfCandidate());
        System.out.println("Institute Name "+ newVisitor.getNameOfinstitute());
        System.out.println("Course "+ newVisitor.getCourse());
        System.out.println("Branch "+ newVisitor.getBranch());
        System.out.println("Year "+ newVisitor.getYear());
        System.out.println("mobile no 1 "+ newVisitor.getMobileNo1());
        System.out.println("mobile no 1 "+ newVisitor.getMobileNo2());
        System.out.println("Email Address "+ newVisitor.getEmail());
        System.out.println("Address "+ newVisitor.getAddress());
        System.out.println("City "+ newVisitor.getCity());
        System.out.println("State "+ newVisitor.getState());
        System.out.println("Pincode "+ newVisitor.getPinCode());
        System.out.println("Duration "+ newVisitor.getDuration());
        System.out.println("Time "+ newVisitor.getTime());
        System.out.println("Reference "+ newVisitor.getReference());
        System.out.println("Vaccination Dose 1 "+ newVisitor.getVaccinationDose1());
        System.out.println("Vaccination Dose 2 "+ newVisitor.getVaccinationDose2());
        System.out.println("Vaccination Status "+ newVisitor.getVaccinationStatus());
        System.out.println("Current Temperature"+ newVisitor.getCurrentTemperature());
    }
}
