package com.gmail.awiradarma.model;

import java.io.Serializable;
import java.sql.Date;

/**
 * Visits definition.
 * 
 * This file was generated by Ignite Web Console (12/08/2020, 21:25)
 **/
public class Visits implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for petId. */
    private long petId;

    /** Value for visitDate. */
    private Date visitDate;

    /** Value for description. */
    private String description;

    /** Empty constructor. **/
    public Visits() {
        // No-op.
    }

    /** Full constructor. **/
    public Visits(long petId,
        Date visitDate,
        String description) {
        this.petId = petId;
        this.visitDate = visitDate;
        this.description = description;
    }

    /**
     * Gets petId
     * 
     * @return Value for petId.
     **/
    public long getPetId() {
        return petId;
    }

    /**
     * Sets petId
     * 
     * @param petId New value for petId.
     **/
    public void setPetId(long petId) {
        this.petId = petId;
    }

    /**
     * Gets visitDate
     * 
     * @return Value for visitDate.
     **/
    public Date getVisitDate() {
        return visitDate;
    }

    /**
     * Sets visitDate
     * 
     * @param visitDate New value for visitDate.
     **/
    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * Gets description
     * 
     * @return Value for description.
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Sets description
     * 
     * @param description New value for description.
     **/
    public void setDescription(String description) {
        this.description = description;
    }

    /** {@inheritDoc} **/
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        
        if (!(o instanceof Visits))
            return false;
        
        Visits that = (Visits)o;

        if (petId != that.petId)
            return false;
        

        if (visitDate != null ? !visitDate.equals(that.visitDate) : that.visitDate != null)
            return false;
        

        if (description != null ? !description.equals(that.description) : that.description != null)
            return false;
        
        return true;
    }

    /** {@inheritDoc} **/
    @Override public int hashCode() {
        int res = (int)(petId ^ (petId >>> 32));

        res = 31 * res + (visitDate != null ? visitDate.hashCode() : 0);

        res = 31 * res + (description != null ? description.hashCode() : 0);

        return res;
    }

    /** {@inheritDoc} **/
    @Override public String toString() {
        return "Visits [" + 
            "petId=" + petId + ", " + 
            "visitDate=" + visitDate + ", " + 
            "description=" + description +
        "]";
    }
}