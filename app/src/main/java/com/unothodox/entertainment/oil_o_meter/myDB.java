package com.unothodox.entertainment.oil_o_meter;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class myDB extends SQLiteOpenHelper {

    private static final String DB_Name = "myDB";
    private static final String table_01 = "OIL_DATA";

    public myDB(Context context) {
        super(context, DB_Name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String create_table_01 = "CREATE TABLE " + table_01 +
                " ( ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                " DATE TEXT"

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
