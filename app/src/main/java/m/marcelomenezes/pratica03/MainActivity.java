package m.marcelomenezes.pratica03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    private  static  final  String  []  cities  =  {"Recife",  "João Pessoa",  "Natal",  "Fortaleza",  "Rio de  Janeiro",
            "São Paulo",    "Salvador",  "Vitória",  "Florianópolis",  "Porto Alegre",  "São Luiz","Teresina",
            "Belém",  "Manaus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.queue  = Volley.newRequestQueue(this);

        ListView  listView  = (ListView)findViewById(R.id.list_view);listView.setAdapter(new CityArrayListAdapter(this,  queue,R.layout.city_listitem, cities));
    }
}
