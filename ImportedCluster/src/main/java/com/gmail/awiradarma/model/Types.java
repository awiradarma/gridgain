package com.gmail.awiradarma.model;

import java.io.Serializable;

/**
 * Types definition.
 * 
 * This file was generated by Ignite Web Console (12/08/2020, 21:25)
 **/
public class Types implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for name. */
    private String name;

    /** Empty constructor. **/
    public Types() {
        // No-op.
    }

    /** Full constructor. **/
    public Types(String name) {
        this.name = name;
    }

    /**
     * Gets name
     * 
     * @return Value for name.
     **/
    public String getName() {
        return name;
    }

    /**
     * Sets name
     * 
     * @param name New value for name.
     **/
    public void setName(String name) {
        this.name = name;
    }

    /** {@inheritDoc} **/
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        
        if (!(o instanceof Types))
            return false;
        
        Types that = (Types)o;

        if (name != null ? !name.equals(that.name) : that.name != null)
            return false;
        
        return true;
    }

    /** {@inheritDoc} **/
    @Override public int hashCode() {
        int res = name != null ? name.hashCode() : 0;

        return res;
    }

    /** {@inheritDoc} **/
    @Override public String toString() {
        return "Types [" + 
            "name=" + name +
        "]";
    }
}