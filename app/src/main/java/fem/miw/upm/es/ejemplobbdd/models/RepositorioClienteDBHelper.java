package fem.miw.upm.es.ejemplobbdd.models;

import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static fem.miw.upm.es.ejemplobbdd.models.ClienteContract.tablaClientes;
/**
 * Created by Raquel on 19/10/17.
 */

public class RepositorioClienteDBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = tablaClientes.TABLE_NAME + ".db";


    public RepositorioClienteDBHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createSQL = "CREATE TABLE " + ClienteContract.tablaClientes.TABLE_NAME + " (" +
                tablaClientes.COL_NAME_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT," +
                tablaClientes.COL_NAME_NOMBRE + " TEXT," +
                tablaClientes.COL_NAME_DNI + " TEXT," +
                tablaClientes.COL_NAME_TELEFONO + " INTEGER," +
                tablaClientes.COL_NAME_EMAIL + " TEXT," +
                tablaClientes.COL_NAME_VERIFICADO + " INTEGER" + " )";
        db.execSQL(createSQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String deleteSQL = "DROP TABLE IF EXISTS " + tablaClientes.TABLE_NAME;
        db.execSQL(deleteSQL);
        onCreate(db);
    }

    public long count(){
        SQLiteDatabase db = this.getReadableDatabase();
        return DatabaseUtils.queryNumEntries(db, tablaClientes.TABLE_NAME);
    }
}
