/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inquiryform;
public class Visitor {
    private String courseOpted;
    private String nameOfCandidate;
    private String nameOfinstitute;
    private String course;
    private String branch;
    private String year;
    private String mobileNo1;
    private String mobileNo2;
    private String email;
    private String address;
    private String city;
    private String state;
    private String pinCode;
    private String duration;
    private String time;
    private String reference;
    private String remark;

    public Visitor(String courseOpted, String nameOfCandidate, String nameOfinstitute, String course, String branch, String year, String mobileNo1, String mobileNo2, String email, String address, String city, String state, String pinCode, String duration, String time, String reference, String remark) {
        this.courseOpted = courseOpted;
        this.nameOfCandidate = nameOfCandidate;
        this.nameOfinstitute = nameOfinstitute;
        this.course = course;
        this.branch = branch;
        this.year = year;
        this.mobileNo1 = mobileNo1;
        this.mobileNo2 = mobileNo2;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.duration = duration;
        this.time = time;
        this.reference = reference;
        this.remark = remark;
    }

    public String getCourseOpted() {
        return courseOpted;
    }

    public String getNameOfCandidate() {
        return nameOfCandidate;
    }

    public String getNameOfinstitute() {
        return nameOfinstitute;
    }

    public String getCourse() {
        return course;
    }

    public String getBranch() {
        return branch;
    }

    public String getYear() {
        return year;
    }

    public String getMobileNo1() {
        return mobileNo1;
    }

    public String getMobileNo2() {
        return mobileNo2;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public String getDuration() {
        return duration;
    }

    public String getTime() {
        return time;
    }

    public String getReference() {
        return reference;
    }

    public String getRemark() {
        return remark;
    }
    
}
