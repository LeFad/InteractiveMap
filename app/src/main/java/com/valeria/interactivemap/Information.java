package com.valeria.interactivemap;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.State;

import com.valeria.interactivemap.DB.Constants;
import com.valeria.interactivemap.DB.DBHelper;

public class Information extends AppCompatActivity
{
    private TextView tv_capital, tv_country, tv_president, tv_money, tv_history;
    private ImageView flag;
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

    public void setView(SQLiteDatabase db, String name){
      //  Cursor cursor=db.rawQuery("SELECT * FROM "+ Constants.TABLE+" WHERE "+ Constants.KEY_ID +"="+id+";", null);
        String [] selectSQL = {Constants.KEY_ID,Constants.KEY_NAME,Constants.KEY_CAPITAL,Constants.KEY_PRESIDENT,Constants.KEY_CURRENCY,Constants.KEY_HISTORY,Constants.KEY_IMAGE};
        Cursor cursor=db.query(Constants.TABLE, selectSQL, Constants.KEY_NAME+" like ?", new String[]{"%"+name+"%"},null,null,null, null);
        if (cursor.moveToFirst()) {
            Constants.idIndex = cursor.getColumnIndex(Constants.KEY_ID);
            Constants.nameIndex = cursor.getColumnIndex(Constants.KEY_NAME);
            Constants.capitalIndex = cursor.getColumnIndex(Constants.KEY_CAPITAL);
            Constants.presidentIndex = cursor.getColumnIndex(Constants.KEY_PRESIDENT);
            Constants.currencyIndex = cursor.getColumnIndex(Constants.KEY_CURRENCY);
            Constants.historyIndex = cursor.getColumnIndex(Constants.KEY_HISTORY);
            Constants.imgIndex = cursor.getColumnIndex(Constants.KEY_IMAGE);
            do {

                  tv_country.setText(""+cursor.getString(Constants.nameIndex));
                    flag.setBackgroundResource(Integer.parseInt(cursor.getString(Constants.imgIndex)));
                    tv_capital.setText(cursor.getString(Constants.capitalIndex));
                    tv_president.setText(cursor.getString(Constants.presidentIndex));
                    tv_money.setText(cursor.getString(Constants.currencyIndex));
                    tv_history.setText(Integer.parseInt(cursor.getString(Constants.historyIndex)));
                Log.d("mLog", "ID = " + cursor.getInt(Constants.idIndex) +
                        ", name = " + cursor.getString(Constants.nameIndex) +
                        ", capital = " + cursor.getString(Constants.capitalIndex)+
                        ", president = " + cursor.getString(Constants.presidentIndex)+
                        ", currency = " + cursor.getString(Constants.currencyIndex)+
                        ", history = " + cursor.getString(Constants.historyIndex)+
                        ", img = " + cursor.getString(Constants.imgIndex));
            } while (cursor.moveToNext());
        }
        cursor.close();
    }
}
