package com.valeria.interactivemap;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Information extends AppCompatActivity
{
    private TextView tv_capital, tv_country, tv_president, tv_money, tv_history;
    private ImageView flag;
    private int idIndexInf;
    private int nameIndexInf;
    private int capitalIndexInf;
    private int presidentIndexInf;
    private int currencyIndexInf;
    private int historyIndexInf;
    private int imgIndexInf;
    private String newString;
    private DBHelper dbHelper;
    private SQLiteDatabase database;

    @Override
    protected void onCreate( Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString = null;
            } else {
                newString= extras.getString("key");
            }
        } else {
            newString= (String) savedInstanceState.getSerializable("key");
        }
        Log.d("mLog", "newString"+ newString);

        tv_capital=findViewById(R.id.tv_name_capital);
        tv_country=findViewById(R.id.tv_name_country);
        tv_president=findViewById(R.id.tv_name_president);
        tv_money=findViewById(R.id.tv_name_money);
        tv_history=findViewById(R.id.tv_name_history);
        flag=findViewById(R.id.img_flag_country);
        dbHelper = new DBHelper(this);
        database = dbHelper.getWritableDatabase();
        setView(database,newString);
    }

    public void setView(SQLiteDatabase db, String id){
        Cursor cursor=db.rawQuery("SELECT * FROM "+DBHelper.TABLE_CONTACTS+" WHERE "+ DBHelper.KEY_ID +"="+id+";", null);
        if (cursor.moveToFirst()) {
            idIndexInf = cursor.getColumnIndex(DBHelper.KEY_ID);
            nameIndexInf = cursor.getColumnIndex(DBHelper.KEY_NAME);
            capitalIndexInf = cursor.getColumnIndex(DBHelper.KEY_CAPITAL);
            presidentIndexInf = cursor.getColumnIndex(DBHelper.KEY_PRESIDENT);
            currencyIndexInf = cursor.getColumnIndex(DBHelper.KEY_CURRENCY);
            historyIndexInf = cursor.getColumnIndex(DBHelper.KEY_HISTORY);
            imgIndexInf = cursor.getColumnIndex(DBHelper.KEY_IMAGE);
            do {

                  tv_country.setText(""+cursor.getString(nameIndexInf));
                    flag.setBackgroundResource(Integer.parseInt(cursor.getString(imgIndexInf)));
                    tv_capital.setText(cursor.getString(capitalIndexInf));
                    tv_president.setText(cursor.getString(presidentIndexInf));
                    tv_money.setText(cursor.getString(currencyIndexInf));
                    tv_history.setText(Integer.parseInt(cursor.getString(historyIndexInf)));
                Log.d("mLog", "ID = " + cursor.getInt(idIndexInf) +
                        ", name = " + cursor.getString(nameIndexInf) +
                        ", capital = " + cursor.getString(capitalIndexInf)+
                        ", president = " + cursor.getString(presidentIndexInf)+
                        ", currency = " + cursor.getString(currencyIndexInf)+
                        ", history = " + cursor.getString(historyIndexInf)+
                        ", img = " + cursor.getString(imgIndexInf));
            } while (cursor.moveToNext());
        }
        cursor.close();
    }
}
