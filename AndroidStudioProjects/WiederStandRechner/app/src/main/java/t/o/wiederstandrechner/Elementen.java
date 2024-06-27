package t.o.wiederstandrechner;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Elementen extends AppCompatActivity {
    public
    String[] einheiten = {"X1Ω", "X10Ω", "X100Ω","X1.000Ω(kΩ)","X10.000Ω(10kΩ)", "X100.000Ω(100kΩ)", "X1.000.000Ω(1MΩ)","X10.000.000Ω(10MΩ)","X0,1Ω","X0,01Ω"};
    String[] einheitenII = {"Schwarz", "Braun", "Rot","Orange","Gelb", "Grün", "Blau","Lila","Gold","Silber"};

    String[] toleranz = {"±1%", "±2%", "±0,5%","±0,25%","±0,1%","±0,05%","±5%","±10%"};
    String[] toleranzII = {"Braun", "Rot", "Grün","Blau","Lila","Grau","Gold","Silber"};

    String[] ring1and2and3 = {"Schwarz", "Braun", "Rot","Orange","Gelb", "Grün", "Blau","Lila","Grau","Weiß"};

    void setAdapter(Context context, Spinner spinner, String[] data) {          // Laden ArrayAdapter für Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(context, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_checked);
        spinner.setAdapter(adapter);
    }
}