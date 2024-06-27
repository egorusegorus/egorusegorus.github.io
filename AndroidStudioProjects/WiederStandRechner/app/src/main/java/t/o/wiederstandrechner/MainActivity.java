package t.o.wiederstandrechner;




import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;



import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);  //Portrait Orientation
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            final boolean isUpdating = false;
            String enteredValue = "";
            EditText editText= findViewById(R.id.editTextNumber2);

            Spinner spinner2 = findViewById(R.id.spinner2); // object spinner2 (Einheiten)
            Spinner spinner6 = findViewById(R.id.spinner6); // object spinner7 (EinheiteII)
            Spinner spinner4 = findViewById(R.id.spinner4); // object spinner4 (Tolleranz)
            Spinner spinner7 = findViewById(R.id.spinner7); // object spinner4 (TolleranzII)
            Spinner spinner = findViewById(R.id.spinner); // object spinner (Ring1)
            Spinner spinner5 = findViewById(R.id.spinner5); // object spinner5 (Ring2)
            Spinner spinner8 = findViewById(R.id.spinner8); // object spinner5 (Ring2)
            Elementen e = new Elementen();                  // object e

            e.setAdapter(this, spinner2, e.einheiten);          //Enifüllung spinner
            e.setAdapter(this, spinner6, e.ring1and2and3);
            e.setAdapter(this, spinner4, e.toleranz);
            e.setAdapter(this, spinner7, e.einheitenII);
            e.setAdapter(this, spinner, e.ring1and2and3);
            e.setAdapter(this, spinner5, e.ring1and2and3);
            e.setAdapter(this, spinner8, e.toleranzII);

            ImageView iv0=findViewById(R.id.y0);                        // *.png objects- Ring 4
            ImageView iv1=findViewById(R.id.y1);
            ImageView iv2=findViewById(R.id.y2);
            ImageView iv3=findViewById(R.id.y3);
            ImageView iv4=findViewById(R.id.y4);
            ImageView iv5=findViewById(R.id.y5);
            ImageView iv6=findViewById(R.id.y6);
            ImageView iv7=findViewById(R.id.y7);
            ImageView ivgold=findViewById(R.id.ygold);
            ImageView ivsilber=findViewById(R.id.ysilber);

            ImageView iv0z=findViewById(R.id.z0);                       // *.png objects- Ring 5
            ImageView iv1z=findViewById(R.id.z1);
            ImageView iv2z=findViewById(R.id.z2);
            ImageView iv3z=findViewById(R.id.z3);
            ImageView iv4z=findViewById(R.id.z4);
            ImageView iv5z=findViewById(R.id.z5);
            ImageView ivgoldz=findViewById(R.id.zgold);
            ImageView ivsilberz=findViewById(R.id.zsilber);

            ImageView v0 = findViewById(R.id.v0);
            ImageView v1 = findViewById(R.id.v1);
            ImageView v2 = findViewById(R.id.v2);
            ImageView v3 = findViewById(R.id.v3);
            ImageView v4 = findViewById(R.id.v4);
            ImageView v5 = findViewById(R.id.v5);
            ImageView v6 = findViewById(R.id.v6);
            ImageView v7 = findViewById(R.id.v7);
            ImageView v8 = findViewById(R.id.v8);
            ImageView v9 = findViewById(R.id.v9);

            ImageView x0 = findViewById(R.id.x0);
            ImageView x1 = findViewById(R.id.x1);
            ImageView x2 = findViewById(R.id.x2);
            ImageView x3 = findViewById(R.id.x3);
            ImageView x4 = findViewById(R.id.x4);
            ImageView x5 = findViewById(R.id.x5);
            ImageView x6 = findViewById(R.id.x6);
            ImageView x7 = findViewById(R.id.x7);
            ImageView x8 = findViewById(R.id.x8);
            ImageView x9 = findViewById(R.id.x9);

            ImageView a0 = findViewById(R.id.a0);
            ImageView a1 = findViewById(R.id.a1);
            ImageView a2 = findViewById(R.id.a2);
            ImageView a3 = findViewById(R.id.a3);
            ImageView a4 = findViewById(R.id.a4);
            ImageView a5 = findViewById(R.id.a5);
            ImageView a6 = findViewById(R.id.a6);
            ImageView a7 = findViewById(R.id.a7);
            ImageView a8 = findViewById(R.id.a8);
            ImageView a9 = findViewById(R.id.a9);

            Decoding.setSpinner2ItemSelectedListener(spinner2,this,iv0,iv1,iv2,iv3,iv4,iv5,iv6,iv7,ivgold,ivsilber,spinner7);
            Decoding.setSpinner4ItemSelectedListener(spinner4,this,iv0z,iv1z,iv2z,iv3z,iv4z,iv5z,ivgoldz,ivsilberz,spinner8);
            Decoding.setFirvstThreeRingsValue(editText, this, spinner2, spinner, spinner5,spinner6
                    , v0,  v1,  v2,v3,  v4, v5,  v6,  v7, v8,  v9
                    , x0,  x1,  x2,  x3,  x4,  x5,  x6,  x7, x8,  x9
                    , a0,  a1,  a2,  a3,  a4,  a5,  a6,  a7, a8,  a9,isUpdating,enteredValue);

            Encoding.setOnSpinerI(spinner7,spinner2,MainActivity.this);
            Encoding.setOnSpinerI(spinner8,spinner4,MainActivity.this);
            Encoding.setOnEditText(editText,spinner,spinner5,spinner6,MainActivity.this);


            return insets;
        });

    }

}