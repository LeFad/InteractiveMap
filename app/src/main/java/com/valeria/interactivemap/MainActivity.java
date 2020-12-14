package com.valeria.interactivemap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.valeria.interactivemap.DB.Constants;
import com.valeria.interactivemap.DB.DBHelper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    DBHelper dbHelper;
    SQLiteDatabase database;
    Button btn_Rus1, btn_Rus2, btn_Rus3, btn_Fin, btn_Swed1, btn_Swed2, btn_Norw1, btn_Norw2, btn_Norw3,
            btn_UK, btn_Ice, btn_Irel, btn_Port, btn_Spain1, btn_Spain2, btn_Andora, btn_France1, btn_France2,
            btn_Estonia, btn_Latvia, btn_Litvenia1, btn_Litvenia2, btn_Denmark, btn_Belg, btn_Netherlands,
            btn_Lux, btn_Belarus, btn_Germany1, btn_Germany2, btn_Poland, btn_Ukr1, btn_Ukr2, btn_Czech,
            btn_Switz, btn_Lihten, btn_Austria, btn_Slovakia1, btn_Slovakia2, btn_Moldova1, btn_Moldova2,
            btn_Hungary1, btn_Hungary2, btn_Romania, btn_Bulgaria1, btn_Bulgaria2, btn_Slovenia, btn_Croatia1,
            btn_Croatia2, btn_Croatia3, btn_Serbia1, btn_Serbia2, btn_Bosnia1, btn_Bosnia2, btn_Montenegro,
            btn_Kosovo, btn_Macedonia1, btn_Macedonia2, btn_Albania, btn_Greece1, btn_Greece2, btn_Italy1,
            btn_Italy2, btn_Italy3, btn_Monaco, btn_San, btn_Vatican, btn_Malta;
    ConstraintLayout constraintLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout=findViewById(R.id.constraintLayout1);

        dbHelper = new DBHelper(this);
        database = dbHelper.getWritableDatabase();

        dbinfo(database);

        final ZoomLayout zoomLayout = (ZoomLayout) findViewById(R.id.constraintLayout0);
        zoomLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                zoomLayout.init(MainActivity.this);
                return false;
            }
        });

        btn_Rus1=findViewById(R.id.btn_Rus1);
        btn_Rus2=findViewById(R.id.btn_Rus2);
        btn_Rus3=findViewById(R.id.btn_Rus3);
        btn_Fin=findViewById(R.id.btn_Fin);
        btn_Swed1=findViewById(R.id.btn_Swed1);
        btn_Swed2=findViewById(R.id.btn_Swed2);
        btn_Norw1=findViewById(R.id.btn_Norw1);
        btn_Norw2=findViewById(R.id.btn_Norw2);
        btn_Norw3=findViewById(R.id.btn_Norw3);
        btn_UK=findViewById(R.id.btn_UK);
        btn_Ice=findViewById(R.id.btn_Ice);
        btn_Irel=findViewById(R.id.btn_Irel);
        btn_Port=findViewById(R.id.btn_Port);
        btn_Spain1=findViewById(R.id.btn_Spain1);
        btn_Spain2=findViewById(R.id.btn_Spain2);
        btn_Andora=findViewById(R.id.btn_Andora);
        btn_France1=findViewById(R.id.btn_France1);
        btn_France2=findViewById(R.id.btn_France2);
        btn_Estonia=findViewById(R.id.btn_Estonia);
        btn_Latvia=findViewById(R.id.btn_Latvia);
        btn_Litvenia1=findViewById(R.id.btn_Litvenia1);
        btn_Litvenia2=findViewById(R.id.btn_Litvenia2);
        btn_Denmark=findViewById(R.id.btn_Denmark);
        btn_Belg=findViewById(R.id.btn_Belg);
        btn_Netherlands=findViewById(R.id.btn_Netherlands);
        btn_Lux=findViewById(R.id.btn_Lux);
        btn_Belarus=findViewById(R.id.btn_Belarus);
        btn_Germany1=findViewById(R.id.btn_Germany1);
        btn_Germany2=findViewById(R.id.btn_Germany2);
        btn_Poland=findViewById(R.id.btn_Poland);
        btn_Ukr1=findViewById(R.id.btn_Ukr1);
        btn_Ukr2=findViewById(R.id.btn_Ukr2);
        btn_Czech=findViewById(R.id.btn_Czech);
        btn_Switz=findViewById(R.id.btn_Switz);
        btn_Lihten=findViewById(R.id.btn_Lihten);
        btn_Austria=findViewById(R.id.btn_Austria);
        btn_Slovakia1=findViewById(R.id.btn_Slovakia1);
        btn_Slovakia2=findViewById(R.id.btn_Slovakia2);
        btn_Moldova1=findViewById(R.id.btn_Moldova1);
        btn_Moldova2=findViewById(R.id.btn_Moldova2);
        btn_Hungary1=findViewById(R.id.btn_Hungary1);
        btn_Hungary2=findViewById(R.id.btn_Hungary2);
        btn_Romania=findViewById(R.id.btn_Romania);
        btn_Bulgaria1=findViewById(R.id.btn_Bulgaria1);
        btn_Bulgaria2=findViewById(R.id.btn_Bulgaria2);
        btn_Slovenia=findViewById(R.id.btn_Slovenia);
        btn_Croatia1=findViewById(R.id.btn_Croatia1);
        btn_Croatia2=findViewById(R.id.btn_Croatia2);
        btn_Croatia3=findViewById(R.id.btn_Croatia3);
        btn_Serbia1=findViewById(R.id.btn_Serbia1);
        btn_Serbia2=findViewById(R.id.btn_Serbia2);
        btn_Bosnia1=findViewById(R.id.btn_Bosnia1);
        btn_Bosnia2=findViewById(R.id.btn_Bosnia2);
        btn_Montenegro=findViewById(R.id.btn_Montenegro);
        btn_Kosovo=findViewById(R.id.btn_Kosovo);
        btn_Macedonia1=findViewById(R.id.btn_Macedonia1);
        btn_Macedonia2=findViewById(R.id.btn_Macedonia2);
        btn_Albania=findViewById(R.id.btn_Albania);
        btn_Greece1=findViewById(R.id.btn_Greece1);
        btn_Greece2=findViewById(R.id.btn_Greece2);
        btn_Italy1=findViewById(R.id.btn_Italy1);
        btn_Italy2=findViewById(R.id.btn_Italy2);
        btn_Italy3=findViewById(R.id.btn_Italy3);
        btn_Monaco=findViewById(R.id.btn_Monaco);
        btn_San=findViewById(R.id.btn_San);
        btn_Vatican=findViewById(R.id.btn_Vatican);
        btn_Malta=findViewById(R.id.btn_Malta);

        btn_Rus1.setOnClickListener(this);
        btn_Rus2.setOnClickListener(this);
        btn_Rus3.setOnClickListener(this);
        btn_Fin.setOnClickListener(this);
        btn_Swed1.setOnClickListener(this);
        btn_Swed2.setOnClickListener(this);
        btn_Norw1.setOnClickListener(this);
        btn_Norw2.setOnClickListener(this);
        btn_Norw3.setOnClickListener(this);
        btn_UK.setOnClickListener(this);
        btn_Ice.setOnClickListener(this);
        btn_Irel.setOnClickListener(this);
        btn_Port.setOnClickListener(this);
        btn_Spain1.setOnClickListener(this);
        btn_Spain2.setOnClickListener(this);
        btn_Andora.setOnClickListener(this);
        btn_France1.setOnClickListener(this);
        btn_France2.setOnClickListener(this);
        btn_Estonia.setOnClickListener(this);
        btn_Latvia.setOnClickListener(this);
        btn_Litvenia1.setOnClickListener(this);
        btn_Litvenia2.setOnClickListener(this);
        btn_Denmark.setOnClickListener(this);
        btn_Belg.setOnClickListener(this);
        btn_Netherlands.setOnClickListener(this);
        btn_Lux.setOnClickListener(this);
        btn_Belarus.setOnClickListener(this);
        btn_Germany1.setOnClickListener(this);
        btn_Germany2.setOnClickListener(this);
        btn_Poland.setOnClickListener(this);
        btn_Ukr1.setOnClickListener(this);
        btn_Ukr2.setOnClickListener(this);
        btn_Czech.setOnClickListener(this);
        btn_Switz.setOnClickListener(this);
        btn_Lihten.setOnClickListener(this);
        btn_Austria.setOnClickListener(this);
        btn_Slovakia1.setOnClickListener(this);
        btn_Slovakia2.setOnClickListener(this);
        btn_Moldova1.setOnClickListener(this);
        btn_Moldova2.setOnClickListener(this);
        btn_Hungary1.setOnClickListener(this);
        btn_Hungary2.setOnClickListener(this);
        btn_Romania.setOnClickListener(this);
        btn_Bulgaria1.setOnClickListener(this);
        btn_Bulgaria2.setOnClickListener(this);
        btn_Slovenia.setOnClickListener(this);
        btn_Croatia1.setOnClickListener(this);
        btn_Croatia2.setOnClickListener(this);
        btn_Croatia3.setOnClickListener(this);
        btn_Serbia1.setOnClickListener(this);
        btn_Serbia2.setOnClickListener(this);
        btn_Bosnia1.setOnClickListener(this);
        btn_Bosnia2.setOnClickListener(this);
        btn_Montenegro.setOnClickListener(this);
        btn_Kosovo.setOnClickListener(this);
        btn_Macedonia1.setOnClickListener(this);
        btn_Macedonia2.setOnClickListener(this);
        btn_Albania.setOnClickListener(this);
        btn_Greece1.setOnClickListener(this);
        btn_Greece2.setOnClickListener(this);
        btn_Italy1.setOnClickListener(this);
        btn_Italy2.setOnClickListener(this);
        btn_Italy3.setOnClickListener(this);
        btn_Monaco.setOnClickListener(this);
        btn_San.setOnClickListener(this);
        btn_Vatican.setOnClickListener(this);
        btn_Malta.setOnClickListener(this);
    }

    public void dbinfo(SQLiteDatabase db){
        db.execSQL("drop table if exists "+ Constants.TABLE);
        db.execSQL(Constants.CREATE_TABLE);
        Cursor cur = db.rawQuery("SELECT COUNT(*) FROM "+ Constants.TABLE, null);
        if (cur != null) {
            cur.moveToFirst();
            if (cur.getInt (0) == 0) {

            }
        }

        if((cur.getCount()!=cur.getInt (0))  ) {
            db.execSQL("drop table if exists "+ Constants.TABLE);
            db.execSQL(Constants.CREATE_TABLE);
            String query_insert=Constants.INSERT_INTO+Constants.INSERT_VALUES;
            db.execSQL(query_insert);
        }
        cur.close();
        Cursor cursor = db.query(Constants.TABLE, null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            Constants.idIndex = cursor.getColumnIndex(Constants.KEY_ID);
            Constants.nameIndex = cursor.getColumnIndex(Constants.KEY_NAME);
            Constants.capitalIndex = cursor.getColumnIndex(Constants.KEY_CAPITAL);
            Constants.presidentIndex = cursor.getColumnIndex(Constants.KEY_PRESIDENT);
            Constants.currencyIndex = cursor.getColumnIndex(Constants.KEY_CURRENCY);
            Constants.historyIndex = cursor.getColumnIndex(Constants.KEY_HISTORY);
            Constants.imgIndex = cursor.getColumnIndex(Constants.KEY_IMAGE);
            do {
                Log.d("mLog", "ID = " + cursor.getInt(Constants.idIndex) +
                        ", name = " + cursor.getString(Constants.nameIndex) +
                        ", capital = " + cursor.getString(Constants.capitalIndex)+
                        ", president = " + cursor.getString(Constants.presidentIndex)+
                        ", currency = " + cursor.getString(Constants.currencyIndex)+
                        ", history = " + cursor.getString(Constants.historyIndex)+
                        ", img = " + cursor.getString(Constants.imgIndex));
            } while (cursor.moveToNext());
        } else
            Log.d("mLog","0 rows");
        cursor.close();

    }

    @Override
    public void onClick(View view)
    {
        Information information = new Information();
        Intent intent;
        String str_name;
        switch (view.getId()){
            case R.id.btn_Rus1:
            case R.id.btn_Rus2:
            case R.id.btn_Rus3:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "1";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Fin:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "2";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Swed1:
            case R.id.btn_Swed2:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "3";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Norw1:
            case R.id.btn_Norw2:
            case R.id.btn_Norw3:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "4";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_UK:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "5";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Ice:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "6";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Irel:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "7";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Port:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "8";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Spain1:
            case R.id.btn_Spain2:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "9";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Andora:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "10";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_France1:
            case R.id.btn_France2:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "11";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Estonia:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "12";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Latvia:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "13";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Litvenia1:
            case R.id.btn_Litvenia2:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "14";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Denmark:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "15";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Belg:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "16";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Netherlands:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "17";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Lux:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "18";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Belarus:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "19";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Germany1:
            case R.id.btn_Germany2:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "20";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Poland:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "21";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Ukr1:
            case R.id.btn_Ukr2:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "22";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Czech:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "23";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Switz:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "24";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Lihten:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "25";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Austria:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "26";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Slovakia1:
            case R.id.btn_Slovakia2:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "27";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Moldova1:
            case R.id.btn_Moldova2:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "28";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Hungary1:
            case R.id.btn_Hungary2:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "29";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Romania:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "30";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Bulgaria1:
            case R.id.btn_Bulgaria2:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "31";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Slovenia:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "32";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Croatia1:
            case R.id.btn_Croatia2:
            case R.id.btn_Croatia3:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "33";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Serbia1:
            case R.id.btn_Serbia2:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "34";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Bosnia1:
            case R.id.btn_Bosnia2:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "35";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Montenegro:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "36";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Kosovo:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "37";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Macedonia1:
            case R.id.btn_Macedonia2:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "38";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Albania:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "39";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Greece1:
            case R.id.btn_Greece2:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "40";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Italy1:
            case R.id.btn_Italy2:
            case R.id.btn_Italy3:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "41";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Monaco:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "42";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_San:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "43";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Vatican:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "44";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;
            case R.id.btn_Malta:
                dbHelper = new DBHelper(this);
                dbHelper.getWritableDatabase();
                intent = new Intent(this, Information.class);
                str_name = "45";
                intent.putExtra("key",str_name);
                startActivity(intent);
                break;

        }

        dbHelper.close();

    }

}