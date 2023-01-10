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
public class NewVisitor extends Visitor {
    private String vaccinationDose1;
    private String vaccinationDose2;
    private String vaccinationStatus;
    private String currentTemperature;

    public String getVaccinationDose1() {
        return vaccinationDose1;
    }

    public void setVaccinationDose1(String vaccinationDose1) {
        this.vaccinationDose1 = vaccinationDose1;
    }

    public String getVaccinationDose2() {
        return vaccinationDose2;
    }

    public void setVaccinationDose2(String vaccinationDose2) {
        this.vaccinationDose2 = vaccinationDose2;
    }

    public String getVaccinationStatus() {
        return vaccinationStatus;
    }

    public void setVaccinationStatus(String vaccinationStatus) {
        this.vaccinationStatus = vaccinationStatus;
    }

    public String getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(String currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public NewVisitor(String vaccinationDose1, String vaccinationDose2, String vaccinationStatus, String currentTemperature, String courseOpted, String nameOfCandidate, String nameOfinstitute, String course, String branch, String year, String mobileNo1, String mobileNo2, String email, String address, String city, String state, String pinCode, String duration, String time, String reference, String remark) {
        super(courseOpted, nameOfCandidate, nameOfinstitute, course, branch, year, mobileNo1, mobileNo2, email, address, city, state, pinCode, duration, time, reference, remark);
        this.vaccinationDose1 = vaccinationDose1;
        this.vaccinationDose2 = vaccinationDose2;
        this.vaccinationStatus = vaccinationStatus;
        this.currentTemperature = currentTemperature;
    }
    
    
    
}
