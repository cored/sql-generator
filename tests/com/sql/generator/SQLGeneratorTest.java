package com.sql.generator;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sql.generator.SQLGenerator;
import com.sql.generator.values.Columns;
import com.sql.generator.values.TableName;



public class SQLGeneratorTest {
    
    @Test
    public void shouldGenerateStatementForSelect() {
        SQLGenerator sqlGenerator = new SQLGenerator();
        assertEquals("select a,b,c from x", sqlGenerator.select(new TableName("x"), new Columns(new String[]{"a","b","c"})));
    }

}
