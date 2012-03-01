package com.sql.generator.commands;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sql.generator.values.Columns;
import com.sql.generator.values.TableName;


public class SelectCommandTest {
    
    @Test
    public void shouldReturnProperStatementRepresentation() {
        SelectCommand selectCommand = new SelectCommand(new TableName("x"), new Columns(new String[] {"a","b","c"}));
        assertEquals("select a,b,c from x", selectCommand.toString());
    }

}
