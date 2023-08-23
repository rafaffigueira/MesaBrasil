package database;



import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    private static final String DATABASE_NAME = "myapp.db";
    private static final int DATABASE_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // ...
  // ..  @Override
  // ..  public void onCreate(SQLiteDatabase db) {
        // Crie as tabelas do banco de dados aqui
  // ..  }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Atualize o banco de dados
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

  //..  @Override
  // ..  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

 // ..   }
}

