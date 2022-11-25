package com.shop_java_school.first_version.controller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Class customer, it has all the data needed for the sign up
 */
@Entity
public class Customer {
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

    /**
     * Constructor of the class customer
     * @param idCustomer identifier of the user
     * @param idAddress identifier of the address
     * @param customerName name of the customer
     * @param customerSurname surname of the customer
     * @param dateofBirth date of birth
     * @param email email of the customer
     * @param accountPassword password
     */
    public Customer(int idCustomer, int idAddress, String customerName, String customerSurname, Date dateofBirth, String email, String accountPassword) {
        this.idCustomer = idCustomer;
        this.idAddress = idAddress;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.dateofBirth = dateofBirth;
        this.email = email;
        this.accountPassword = accountPassword;
    }

    /**
     * Getter
     * @return isCustomer
     */
    public int getIdCustomer() {
        return idCustomer;
    }

    /**
     * Setter
     * @param idCustomer
     */
    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    /**
     * Getter
     * @return idAddress
     */
    public int getIdAddress() {
        return idAddress;
    }

    /**
     * Setter
     * @param idAddress
     */
    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    /**
     * Getter
     * @return customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Setter
     * @param customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Getter
     * @return customerSurname
     */
    public String getCustomerSurname() {
        return customerSurname;
    }

    /**
     * Setter
     * @param customerSurname
     */
    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    /**
     * Getter
     * @return dateOfBirth
     */
    public Date getDateofBirth() {
        return dateofBirth;
    }

    /**
     * Setter
     * @param dateofBirth
     */
    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    /**
     * Getter
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter
     * @return accountPassword
     */
    public String getAccountPassword() {
        return accountPassword;
    }

    /**
     * Setter
     * @param accountPassword
     */
    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }
}
