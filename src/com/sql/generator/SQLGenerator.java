package com.sql.generator;
import com.sql.generator.commands.ISQLCommand;
import com.sql.generator.commands.SelectCommand;
import com.sql.generator.values.Columns;
import com.sql.generator.values.TableName;


public class SQLGenerator {
    private ISQLCommand sqlCommand;
    
    public String select(TableName tableName, Columns columns) {
        sqlCommand = new SelectCommand(tableName, columns);
        return sqlCommand.toString();
    }

}
