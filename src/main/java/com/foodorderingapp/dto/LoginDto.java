package com.foodorderingapp.dto;

public class LoginDto {

    private int userId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String userPassword;
    private String email;
    private String contactNo;
    private String address;
    private String userRole;

    public LoginDto(){

    }

    public LoginDto(String userPassword, String email, String userRole, double balance) {
        this.userPassword = userPassword;
        this.email = email;
        this.userRole = userRole;
        this.balance = balance;
    }

    private double balance;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoginDto loginDto = (LoginDto) o;

        if (userPassword != null ? !userPassword.equals(loginDto.userPassword) : loginDto.userPassword != null)
            return false;
        return email != null ? email.equals(loginDto.email) : loginDto.email == null;
    }

    @Override
    public int hashCode() {
        int result = userPassword != null ? userPassword.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LoginDto{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", email='" + email + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", address='" + address + '\'' +
                ", userRole='" + userRole + '\'' +
                ", balance=" + balance +
                '}';
    }
}
