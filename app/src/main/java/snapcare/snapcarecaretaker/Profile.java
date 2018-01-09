package snapcare.snapcarecaretaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;

public class Profile extends Variables {

    Button submitName;
    Button submitPhone;
    EditText writeName;
    EditText writePhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        submitName = (Button)findViewById(R.id.submit_name);
        submitName.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                writeName = (EditText)findViewById(R.id.write_name);
                name = writeName.getText().toString();
            }
        });
        submitPhone = (Button)findViewById(R.id.submit_phone);
        submitPhone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText writePhone = (EditText)findViewById(R.id.write_phone);
                phone = writePhone.getText().toString();
            }
        });
    }
}
