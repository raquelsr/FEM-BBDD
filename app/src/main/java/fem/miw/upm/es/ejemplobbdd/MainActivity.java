package fem.miw.upm.es.ejemplobbdd;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import fem.miw.upm.es.ejemplobbdd.models.RepositorioClienteDBHelper;

public class MainActivity extends Activity {

    RepositorioClienteDBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new RepositorioClienteDBHelper(getApplicationContext());

        long numeroElementos = db.count();
        Log.i("MiW", String.valueOf(numeroElementos));

    }
}
