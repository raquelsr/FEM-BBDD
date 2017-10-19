package fem.miw.upm.es.ejemplobbdd.models;

import android.provider.BaseColumns;

/**
 * Created by Raquel on 19/10/17.
 */

public class ClienteContract {

    private ClienteContract(){}

    public static abstract class tablaClientes implements BaseColumns {

        static final String TABLE_NAME = "clientes";

        static final String COL_NAME_ID = _ID;
        static final String COL_NAME_NOMBRE = "nombre";
        static final String COL_NAME_DNI= "dni";
        static final String COL_NAME_TELEFONO = "telefono";
        static final String COL_NAME_EMAIL = "email";
        static final String COL_NAME_VERIFICADO = "verificado";
    }
}
