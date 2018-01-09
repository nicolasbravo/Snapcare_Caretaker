package snapcare.snapcarecaretaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TimePicker;

import java.util.ArrayList;
import java.util.List;

public class Health extends Variables {

    TimePicker writeTime;
    EditText writeHealth;
    List item = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        ListView healthlist = (ListView) findViewById(R.id.health_listview);
        item.add("Arthritis\n\t-20mg Humera with each meal");
        item.add("Diabetes\n\t-20mL insulin every other day");
        item.add("Supplements\n\t-Calcium supplement with each meal\n\t-Flintstones multivites with breakfast");
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item);
        healthlist.setAdapter(adapter);
    }

    public void onClick(View view) {
        writeHealth = (EditText)findViewById(R.id.write_content);
        item.add(writeHealth.getText().toString());
    }
}
