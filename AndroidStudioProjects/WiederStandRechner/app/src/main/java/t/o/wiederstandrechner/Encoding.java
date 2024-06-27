package t.o.wiederstandrechner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import android.content.Context;
import android.widget.Spinner;
import android.widget.Toast;

public class Encoding {

    private static int returnSelectedItem(Spinner spinner, Context context) {
        int selectedItem = spinner.getSelectedItemPosition();
        //Toast.makeText(context, "Selected position = " + selectedItem, Toast.LENGTH_SHORT).show();
        return selectedItem;
    }

    private static void setValueOnSpinner( Spinner input, Spinner output,Context context){

        int value=returnSelectedItem(input,context);
        output.setSelection(value,true);


    }

    public static void setOnSpinerI(Spinner input, Spinner output,Context context){ //CliclListner for Spinner Ring 4 & Ring5
        input.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                setValueOnSpinner(input,output,context);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    @SuppressLint("SetTextI18n")
    private static void whatIsTheNumber(EditText editText, Spinner spinner1, Spinner spinner2, Spinner spinner3, Context context){ //Setting Number in EditText
        int seletedPositioSpinner1=returnSelectedItem(spinner1,context);
        int seletedPositioSpinner2=returnSelectedItem(spinner2,context);
        int seletedPositioSpinner3=returnSelectedItem(spinner3,context);
        int number=-1;
        if (seletedPositioSpinner1>0){seletedPositioSpinner1*=100;}
        if (seletedPositioSpinner1>0){seletedPositioSpinner2*=10;}
        number=seletedPositioSpinner1+seletedPositioSpinner2+seletedPositioSpinner3;
        editText.setText("" + number);

    }

    public static void setOnEditText(EditText editText, Spinner input1, Spinner input2, Spinner input3, Context context) {


        input1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    whatIsTheNumber(editText, input1, input2, input3, context);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        input2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    whatIsTheNumber(editText, input1, input2, input3, context);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        input3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    whatIsTheNumber(editText, input1, input2, input3, context);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

    }
 private void setRightColorOnRing1to3(Spinner input, ImageView imageView0, ImageView imageView1,ImageView imageView2,
                                      ImageView imageView3,ImageView imageView4,ImageView imageView5,ImageView imageView6,
                                      ImageView imageView7,ImageView imageView8,ImageView imageView9){
        int value= input.getSelectedItemPosition();

     imageView0.setVisibility(View.GONE);
     imageView1.setVisibility(View.GONE);
     imageView2.setVisibility(View.GONE);
     imageView3.setVisibility(View.GONE);
     imageView4.setVisibility(View.GONE);
     imageView5.setVisibility(View.GONE);
     imageView6.setVisibility(View.GONE);
     imageView7.setVisibility(View.GONE);
     imageView8.setVisibility(View.GONE);
     imageView9.setVisibility(View.GONE);

        switch (value){
            case 0:
                imageView0.setVisibility(View.VISIBLE);
                break;
            case 1:
                imageView1.setVisibility(View.VISIBLE);
                break;
            case 2:
                imageView2.setVisibility(View.VISIBLE);
                break;
            case 3:
                imageView3.setVisibility(View.VISIBLE);
                break;
            case 4:
                imageView4.setVisibility(View.VISIBLE);
                break;
            case 5:
                imageView5.setVisibility(View.VISIBLE);
                break;
            case 6:
                imageView6.setVisibility(View.VISIBLE);
                break;
            case 7:
                imageView7.setVisibility(View.VISIBLE);
                break;
            case 8:
                imageView8.setVisibility(View.VISIBLE);
                break;
            case 9:
                imageView9.setVisibility(View.VISIBLE);
                break;
            default:
                imageView0.setVisibility(View.VISIBLE);
                break;
        }
        //wywolac w listnerze!!!
 }
}