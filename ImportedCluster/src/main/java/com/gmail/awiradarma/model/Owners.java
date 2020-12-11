package com.gmail.awiradarma.model;

import java.io.Serializable;

/**
 * Owners definition.
 * 
 * This file was generated by Ignite Web Console (12/08/2020, 21:25)
 **/
public class Owners implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for firstName. */
    private String firstName;

    /** Value for lastName. */
    private String lastName;

    /** Value for address. */
    private String address;

    /** Value for city. */
    private String city;

    /** Value for telephone. */
    private String telephone;

    /** Empty constructor. **/
    public Owners() {
        // No-op.
    }

    /** Full constructor. **/
    public Owners(String firstName,
        String lastName,
        String address,
        String city,
        String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.telephone = telephone;
    }

    /**
     * Gets firstName
     * 
     * @return Value for firstName.
     **/
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets firstName
     * 
     * @param firstName New value for firstName.
     **/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets lastName
     * 
     * @return Value for lastName.
     **/
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets lastName
     * 
     * @param lastName New value for lastName.
     **/
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets address
     * 
     * @return Value for address.
     **/
    public String getAddress() {
        return address;
    }

    /**
     * Sets address
     * 
     * @param address New value for address.
     **/
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets city
     * 
     * @return Value for city.
     **/
    public String getCity() {
        return city;
    }

    /**
     * Sets city
     * 
     * @param city New value for city.
     **/
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets telephone
     * 
     * @return Value for telephone.
     **/
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets telephone
     * 
     * @param telephone New value for telephone.
     **/
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /** {@inheritDoc} **/
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        
        if (!(o instanceof Owners))
            return false;
        
        Owners that = (Owners)o;

        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null)
            return false;
        

        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null)
            return false;
        

        if (address != null ? !address.equals(that.address) : that.address != null)
            return false;
        

        if (city != null ? !city.equals(that.city) : that.city != null)
            return false;
        

        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null)
            return false;
        
        return true;
    }

    /** {@inheritDoc} **/
    @Override public int hashCode() {
        int res = firstName != null ? firstName.hashCode() : 0;

        res = 31 * res + (lastName != null ? lastName.hashCode() : 0);

        res = 31 * res + (address != null ? address.hashCode() : 0);

        res = 31 * res + (city != null ? city.hashCode() : 0);

        res = 31 * res + (telephone != null ? telephone.hashCode() : 0);

        return res;
    }

    /** {@inheritDoc} **/
    @Override public String toString() {
        return "Owners [" + 
            "firstName=" + firstName + ", " + 
            "lastName=" + lastName + ", " + 
            "address=" + address + ", " + 
            "city=" + city + ", " + 
            "telephone=" + telephone +
        "]";
    }
}