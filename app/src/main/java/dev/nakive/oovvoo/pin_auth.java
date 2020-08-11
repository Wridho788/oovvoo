package dev.nakive.oovvoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.alimuzaffar.lib.pin.PinEntryEditText;

public class pin_auth extends AppCompatActivity {

    PinEntryEditText pinEntry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);

        pinEntry = (PinEntryEditText) findViewById(R.id.txt_pin_entry);
        if (pinEntry != null) {
            pinEntry.setOnPinEnteredListener(new PinEntryEditText.OnPinEnteredListener() {
                @Override
                public void onPinEntered(CharSequence str) {
                    if (str.toString().equals("1234")) {
                        startActivity(new Intent(pin_auth.this,
                                MainActivity.class));
                    } else {
                        Toast.makeText(pin_auth.this, "FAIL", Toast.LENGTH_SHORT).show();
                        pinEntry.setText(null);
                    }
                }
            });
        }
    }
}