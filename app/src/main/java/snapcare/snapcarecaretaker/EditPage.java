package snapcare.snapcarecaretaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EditPage extends Variables {

    TextView profile1Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_page);
        //profile1Text = (TextView)findViewById(R.id.profile1);
        //profile1Text.setText(name);

        ListView scrollviewlist = (ListView) findViewById(R.id.scrollview_list);
        String[] item = new String[]{"Take medicine at 6:00 PM", "Dinner at 6:30 PM", "Wake up at 7:00 AM", "Breakfast at 7:30 AM", "Take medicine at 7:30 AM", "Walk at 8:00 AM"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item);
        scrollviewlist.setAdapter(adapter);
        scrollviewlist.setNestedScrollingEnabled(true);

        scrollviewlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), ComingUp.class);
                startActivity(intent);
            }
        });
    }

    public void onClickHelp(View view) {
        Intent intent = new Intent(this, Phone.class);
        startActivity(intent);
    }
    public void onClickInfo(View view) {
        Intent intent = new Intent(this, Health.class);
        startActivity(intent);
    }
    public void onClickProfile(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
    public void onClickComingUp(View view) {
        Intent intent = new Intent(this, ComingUp.class);
        startActivity(intent);
    }
}
