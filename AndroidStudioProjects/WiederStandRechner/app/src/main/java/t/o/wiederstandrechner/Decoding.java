package t.o.wiederstandrechner;


import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;



public class Decoding {
    private static boolean isProgrammaticallyChanged = false;
    private  void changeTextProgrammatically(String newText,EditText editText) {
        isProgrammaticallyChanged = true;
        editText.setText(newText);
        isProgrammaticallyChanged = false;
    }

    public static void setFirvstThreeRingsValue(final EditText editText, final MainActivity mainActivity, final Spinner spinner2, final Spinner spinner, final Spinner spinner5, final Spinner spinner6
            ,ImageView v0, ImageView v1, ImageView v2, ImageView v3, ImageView v4, ImageView v5, ImageView v6, ImageView v7,ImageView v8, ImageView v9
            ,ImageView x0, ImageView x1, ImageView x2, ImageView x3, ImageView x4, ImageView x5, ImageView x6, ImageView x7,ImageView x8, ImageView x9
            ,ImageView a0, ImageView a1, ImageView a2, ImageView a3, ImageView a4, ImageView a5, ImageView a6, ImageView a7,ImageView a8, ImageView a9,
                                                boolean isUpdating, String enteredValue) {
        editText.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    editText.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                            handleTextChanged(editText, spinner2, spinner, spinner5, spinner6); // Value changed true User
                            changePictureOn1(spinner, v0, v1, v2, v3, v4, v5, v6, v7, v8, v9);
                            changePictureOn2(spinner5, x0, x1, x2, x3, x4, x5, x6, x7, x8, x9);
                            changePictureOn3(spinner6, a0, a1, a2, a3, a4, a5, a6, a7, a8, a9);
                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {

                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });
                }
           return false; }
        });
    }

    private static void changePictureOn1(Spinner spinner,ImageView v0, ImageView v1, ImageView v2, ImageView v3, ImageView v4, ImageView v5, ImageView v6, ImageView v7,ImageView v8, ImageView v9)
    {
        String selectedItem=spinner.getSelectedItem().toString();
        v0.setVisibility(View.GONE);
        v1.setVisibility(View.GONE);
        v2.setVisibility(View.GONE);
        v3.setVisibility(View.GONE);
        v4.setVisibility(View.GONE);
        v5.setVisibility(View.GONE);
        v6.setVisibility(View.GONE);
        v7.setVisibility(View.GONE);
        v8.setVisibility(View.GONE);
        v9.setVisibility(View.GONE);

        switch (selectedItem){
            case "Schwarz":
                v0.setVisibility(View.VISIBLE);
                break;
            case "Braun":
                v1.setVisibility(View.VISIBLE);
                break;
            case "Rot":
                v2.setVisibility(View.VISIBLE);
                break;
            case "Orange":
                v3.setVisibility(View.VISIBLE);
                break;
            case "Gelb":
                v4.setVisibility(View.VISIBLE);
                break;
            case "Grün":
                v5.setVisibility(View.VISIBLE);
                break;
            case "Blau":
                v6.setVisibility(View.VISIBLE);
                break;
            case "Lila":
                v7.setVisibility(View.VISIBLE);
                break;
            case "Grau":
                v8.setVisibility(View.VISIBLE);
                break;
            case "Weiß":
                v9.setVisibility(View.VISIBLE);
                break;
        }

    }

    private static void changePictureOn2(Spinner spinner5,ImageView x0, ImageView x1, ImageView x2, ImageView x3, ImageView x4, ImageView x5, ImageView x6, ImageView x7,ImageView x8, ImageView x9)
    {
        String selectedItem=spinner5.getSelectedItem().toString();
        x0.setVisibility(View.GONE);
        x1.setVisibility(View.GONE);
        x2.setVisibility(View.GONE);
        x3.setVisibility(View.GONE);
        x4.setVisibility(View.GONE);
        x5.setVisibility(View.GONE);
        x6.setVisibility(View.GONE);
        x7.setVisibility(View.GONE);
        x8.setVisibility(View.GONE);
        x9.setVisibility(View.GONE);

        switch (selectedItem){
            case "Schwarz":
                x0.setVisibility(View.VISIBLE);
                break;
            case "Braun":
                x1.setVisibility(View.VISIBLE);
                break;
            case "Rot":
                x2.setVisibility(View.VISIBLE);
                break;
            case "Orange":
                x3.setVisibility(View.VISIBLE);
                break;
            case "Gelb":
                x4.setVisibility(View.VISIBLE);
                break;
            case "Grün":
                x5.setVisibility(View.VISIBLE);
                break;
            case "Blau":
                x6.setVisibility(View.VISIBLE);
                break;
            case "Lila":
                x7.setVisibility(View.VISIBLE);
                break;
            case "Grau":
                x8.setVisibility(View.VISIBLE);
                break;
            case "Weiß":
                x9.setVisibility(View.VISIBLE);
                break;
        }

    }

    private static void changePictureOn3(Spinner spinner6,ImageView a0, ImageView a1, ImageView a2, ImageView a3, ImageView a4, ImageView a5, ImageView a6, ImageView a7,ImageView a8, ImageView a9)
    {
        String selectedItem=spinner6.getSelectedItem().toString();
        a0.setVisibility(View.GONE);
        a1.setVisibility(View.GONE);
        a2.setVisibility(View.GONE);
        a3.setVisibility(View.GONE);
        a4.setVisibility(View.GONE);
        a5.setVisibility(View.GONE);
        a6.setVisibility(View.GONE);
        a7.setVisibility(View.GONE);
        a8.setVisibility(View.GONE);
        a9.setVisibility(View.GONE);

        switch (selectedItem){
            case "Schwarz":
                a0.setVisibility(View.VISIBLE);
                break;
            case "Braun":
                a1.setVisibility(View.VISIBLE);
                break;
            case "Rot":
                a2.setVisibility(View.VISIBLE);
                break;
            case "Orange":
                a3.setVisibility(View.VISIBLE);
                break;
            case "Gelb":
                a4.setVisibility(View.VISIBLE);
                break;
            case "Grün":
                a5.setVisibility(View.VISIBLE);
                break;
            case "Blau":
                a6.setVisibility(View.VISIBLE);
                break;
            case "Lila":
                a7.setVisibility(View.VISIBLE);
                break;
            case "Grau":
                a8.setVisibility(View.VISIBLE);
                break;
            case "Weiß":
                a9.setVisibility(View.VISIBLE);
                break;
        }

    }

/*private static void changePicture(Spinner spinner, ImageView[] imageViews, String[] colors) {
    String selectedItem = spinner.getSelectedItem().toString();


    for (ImageView imageView : imageViews) {
        imageView.setVisibility(View.GONE);
    }


    for (int i = 0; i < colors.length; i++) {
        if (colors[i].equals(selectedItem)) {
            imageViews[i].setVisibility(View.VISIBLE);
            break;
        }
    }
}
*/

    private static void handleTextChanged(EditText editText, Spinner spinner2, Spinner spinner, Spinner spinner5, Spinner spinner6) {

        String currentText = editText.getText().toString();


        int length = currentText.length(); //setting spinner on right position
        if (length >= 1) {
            int value1 = Character.getNumericValue(currentText.charAt(length - 1));
            spinner6.setSelection(value1);
        }
        if (length >= 2) {
            int value2 = Character.getNumericValue(currentText.charAt(length - 2));
            spinner5.setSelection(value2);
        }
        if (length >= 3) {
            int value3 = Character.getNumericValue(currentText.charAt(length - 3));
            spinner.setSelection(value3);
        }
    }



    private static void changingRing4(String selectedItem, ImageView y0, ImageView y1, ImageView y2,
                                      ImageView y3, ImageView y4, ImageView y5, ImageView y6,
                                      ImageView y7, ImageView ygold, ImageView ysilber,Spinner spinner7)
    {
        y0.setVisibility(View.GONE);
        y1.setVisibility(View.GONE);
        y2.setVisibility(View.GONE);
        y3.setVisibility(View.GONE);
        y4.setVisibility(View.GONE);
        y5.setVisibility(View.GONE);
        y6.setVisibility(View.GONE);
        y7.setVisibility(View.GONE);
        ygold.setVisibility(View.GONE);
        ysilber.setVisibility(View.GONE);
        switch (selectedItem) {
            case "X1Ω":
                y0.setVisibility(View.VISIBLE);
                spinner7.setSelection(0,true);
                break;
            case "X10Ω":
                y1.setVisibility(View.VISIBLE);
                spinner7.setSelection(1,true);
                break;
            case "X100Ω":
                y2.setVisibility(View.VISIBLE);
                spinner7.setSelection(2,true);
                break;
            case "X1.000Ω(kΩ)":
                y3.setVisibility(View.VISIBLE);
                spinner7.setSelection(3,true);
                break;
            case "X10.000Ω(10kΩ)":
                y4.setVisibility(View.VISIBLE);
                spinner7.setSelection(4,true);
                break;
            case "X100.000Ω(100kΩ)":
                y5.setVisibility(View.VISIBLE);
                spinner7.setSelection(5,true);
                break;
            case "X1.000.000Ω(1MΩ)":
                y6.setVisibility(View.VISIBLE);
                spinner7.setSelection(6,true);
                break;
            case "X10.000.000Ω(10MΩ)":
                y7.setVisibility(View.VISIBLE);
                spinner7.setSelection(7,true);
                break;
            case "X0,1Ω":
                ygold.setVisibility(View.VISIBLE);
                spinner7.setSelection(8,true);
                break;
            case "X0,01Ω":
                ysilber.setVisibility(View.VISIBLE);
                spinner7.setSelection(9,true);
                break;
            default:
                throw new IllegalArgumentException("Unbekante multiplikator: " + selectedItem);
        }
    }




    private static void changingRing5(String selectedItem,ImageView z0, ImageView z1,
                                      ImageView z2,ImageView z3,ImageView z4, ImageView z5,
                                      ImageView zgold, ImageView zsilber,Spinner spinner8)
    {
        z0.setVisibility(View.GONE);
        z1.setVisibility(View.GONE);
        z2.setVisibility(View.GONE);
        z3.setVisibility(View.GONE);
        z4.setVisibility(View.GONE);
        z5.setVisibility(View.GONE);
        zgold.setVisibility(View.GONE);
        zsilber.setVisibility(View.GONE);
        switch (selectedItem) {
            case "±1%":
                z0.setVisibility(View.VISIBLE);
                spinner8.setSelection(0,true);
                break;
            case "±2%":
                z1.setVisibility(View.VISIBLE);
                spinner8.setSelection(1,true);
                break;
            case "±0,5%":
                z2.setVisibility(View.VISIBLE);
                spinner8.setSelection(2,true);
                break;
            case "±0,25%":
                z3.setVisibility(View.VISIBLE);
                spinner8.setSelection(3,true);
                break;
            case "±0,1%":
                z4.setVisibility(View.VISIBLE);
                spinner8.setSelection(4,true);
                break;
            case "±0,05%":
                z5.setVisibility(View.VISIBLE);
                spinner8.setSelection(5,true);
                break;
            case "±5%":
                zgold.setVisibility(View.VISIBLE);
                spinner8.setSelection(6,true);
                break;
            case "±10%":
                zsilber.setVisibility(View.VISIBLE);
                spinner8.setSelection(7,true);
                break;

            default:
                throw new IllegalArgumentException("Unbekante Toleranz: " + selectedItem);
        }
    }
    public static void setSpinner4ItemSelectedListener(final Spinner spinner, final MainActivity mainActivity,
                                                       ImageView z0, ImageView z1, ImageView z2, ImageView z3,
                                                       ImageView z4, ImageView z5, ImageView zgold, ImageView zsilber,
                                                       Spinner spinner8)
    {
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                changingRing5(selectedItem, z0, z1, z2, z3, z4, z5, zgold, zsilber, spinner8);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });}
    public static void setSpinner2ItemSelectedListener ( final Spinner spinner,
                                                         final MainActivity mainActivity, ImageView y0, ImageView y1,
                                                         ImageView y2, ImageView y3, ImageView y4, ImageView y5,
                                                         ImageView y6, ImageView y7, ImageView ygold, ImageView ysilber,
                                                         Spinner spinner7)
    {
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();

                changingRing4(selectedItem, y0, y1, y2, y3, y4, y5, y6, y7, ygold, ysilber, spinner7);
                //  Toast.makeText(mainActivity, "Selected item: " + a, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


}