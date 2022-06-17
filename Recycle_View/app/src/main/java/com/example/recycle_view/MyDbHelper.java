package com.example.recycle_view;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class MyDbHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Nursery_ms";

    public MyDbHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createQuery = "CREATE TABLE flower (flower_id INTEGER PRIMARY KEY AUTOINCREMENT,flower_name TEXT,flower_sow TEXT,flower_num INTEGER,flower_price INTEGER)";
        db.execSQL(createQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+DATABASE_NAME);
        onCreate(db);
    }
    public void insertData(String name,String Date,Integer num,Integer price){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("flower_name",name);
        contentValues.put("flower_sow",Date);
        contentValues.put("flower_num",num);
        contentValues.put("flower_price",price);
        db.insert("flower",null,contentValues);
        db.close();
    }
    public Cursor selectData(){
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM flower";
        Cursor cursor = db.rawQuery(query,null);
        return cursor;
    }
}
