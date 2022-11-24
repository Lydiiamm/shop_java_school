package com.shop_java_school.first_version.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class customer {
    @Id
    private int idCustomer;
    @Column(name="idAddress", nullable=true, unique=false)
    private int idAddress;
    @Column(name="customerName", length=50, nullable=false, unique=false)
    private String customerName;
    @Column(name="customerSurname", length=50, nullable=true, unique=false)
    private String customerSurname;
    @Column(name="dateofBirth",  nullable=false, unique=false)
    private Date dateofBirth;
    @Column(name="email", length=50, nullable=false, unique=false)
    private String email;
    @Column(name="accountPassword", length=50, nullable=false, unique=false)
    private String accountPassword;

    public customer(int idCustomer, int idAddress, String customerName, String customerSurname, Date dateofBirth, String email, String accountPassword) {
        this.idCustomer = idCustomer;
        this.idAddress = idAddress;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.dateofBirth = dateofBirth;
        this.email = email;
        this.accountPassword = accountPassword;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }
}
