package snapcare.snapcarecaretaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Variables {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);

        ListView mainlist = (ListView) findViewById(R.id.main_listview);
        String[] item = new String[]{name};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item);
        mainlist.setAdapter(adapter);
        mainlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {*/
                Intent intent = new Intent(getApplicationContext(), EditPage.class);
                startActivity(intent);
            /*}
        });*/
    }
}