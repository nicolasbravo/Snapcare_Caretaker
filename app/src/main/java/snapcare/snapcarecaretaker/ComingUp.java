package snapcare.snapcarecaretaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ComingUp extends Variables {

    EditText writeTime;
    EditText writeContent;
    Spinner spinner;
    List item = new ArrayList<>();
    String[] ampm = {"AM", "PM"};
    String spinnerOutput = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coming_up);

        //ListView cominguplist = (ListView) findViewById(R.id.coming_up_listview);
        ListView cominguplist = (ListView)findViewById(R.id.coming_up_listview);
        item.add("Take medicine at 6:00 PM");
        item.add("Dinner at 6:30 PM");
        item.add("Wake up at 7:00 AM");
        item.add("Breakfast at 7:30 AM");
        item.add("Take medicine at 7:30 AM");
        item.add("Walk at 8:00 AM");
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item);
        cominguplist.setAdapter(adapter);

        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter spinnerAA = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ampm);
        spinner.setAdapter(spinnerAA);
    }

    public void onClick(View view) {
        writeContent = (EditText)findViewById(R.id.write_content);
        writeTime = (EditText)findViewById(R.id.write_time);
        int spinnerPosition = spinner.getSelectedItemPosition();
        spinnerOutput = String.valueOf(ampm[spinnerPosition]);
        item.add(writeContent.getText().toString() + " at " + writeTime.getText().toString() + " " + spinnerOutput);
    }
}
