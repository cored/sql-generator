package com.sql.generator.commands;

import com.sql.generator.values.Columns;
import com.sql.generator.values.TableName;

public class SelectCommand implements ISQLCommand {
    
    private TableName tableName;
    private Columns columns;

    public SelectCommand(TableName tableName, Columns columns) {
        this.tableName = tableName;
        this.columns = columns;
    }

    @Override
    public String toString() {
        return String.format("select %s from %s", this.columns.toString(), tableName.toString());
    }

}
