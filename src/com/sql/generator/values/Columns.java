package com.sql.generator.values;

public class Columns {
    
    private String[] values;
    private final String SEPARATOR = ",";

    public Columns(String[] values) {
        this.values = values;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if ( hasMoreThanOneItem() ) 
            result.append(this.values[0]);
        
        arrayStringValues(result);
        return result.toString();
    }

    protected boolean hasMoreThanOneItem() {
        return this.values.length > 0;
    }
    
    protected void arrayStringValues(StringBuilder result) {
        for ( int i = 1; i < this.values.length; i++ ) 
            result.append(SEPARATOR).append(this.values[i]);
    }

}
