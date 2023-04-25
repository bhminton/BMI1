package com.welovecrazyquotes.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//pulls the XML file R=Resource
        findViews();
        setupButtonClickListener();
    }
    private void findViews() {
        // an exampleString alertText="poopface";// variable string
        // an example Toast.makeText(this,alertText, Toast.LENGTH_LONG).show();
        // findViewById(R.id.text_view_result);
//        maleButton = findViewById(R.id.radio_button_male);
//        femaleButton = findViewById(R.id.radio_button_female);
//        ageText = findViewById(R.id.edit_text_age);
       // imageView = findViewById(R.id.image_blue_scale);
        feetText = findViewById(R.id.edit_text_feet);
        inchesText = findViewById(R.id.edit_text_inches);
        weightText = findViewById(R.id.edit_text_weight);
        calculateButton = findViewById(R.id.button_calculate);
        // if you want to change  resultText.setText("27 you are overweight ")
        resultText = findViewById(R.id.text_view_result);
    }

    private void setupButtonClickListener() {
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              ///  Toast.makeText(MainActivity.this,"poop face",Toast.LENGTH_LONG).show();
          calculateBMI();
            }
        });
    }

    private void calculateBMI() {

//        String ageET=ageText.getText().toString();
        String feetET=feetText.getText().toString();
        String inchesET=inchesText.getText().toString();
        String weightET=weightText.getText().toString();

      // resultText.setText("Age: "+ ageText+ ",Feet :"+ feetText+",inches :"+inchesText+", weight:"+ weightText);

//        int age=Integer.parseInt(ageET);
       int  feet=Integer.parseInt(feetET);
        int inches=Integer.parseInt(inchesET);
        int weight=Integer.parseInt(weightET);


        int totalInches = (feet*12)+inches;
        double heightInMeters = totalInches*0.0254;
        double weightinlbs  = weight;

        double bmi =(weightinlbs/(totalInches* totalInches)) *703;
          String  finalBMI = String.valueOf(bmi);
        resultText.setText(finalBMI);







    }
    //double calculateBMI (int feet,int inches,int weight ){
     //   double BMI= (((weight)/((feet * 12)+inches))*((feet * 12)+inches)) * 703))

//    private   RadioButton maleButton;
//    private  RadioButton femaleButton = findViewById(R.id.radio_button_female);
//    ///Class variable declared outside of all methods so its SCOPE is not limited
//    ///to local  also known as fields

//    private  EditText ageText;
    private EditText feetText;
    private  EditText inchesText;
    private EditText weightText;
    private Button calculateButton;
    private TextView resultText;
   // private ImageView imageView;
    }

// android:src="@drawable/image_blue_scale" />
//storing this down here because cause cant comment out on xml
//
//<ImageView
//        android:id="@+id/imageView2"
//                android:layout_width="match_parent"
//                android:layout_height="wrap_content"
//                app:srcCompat="@drawable/image_blue_scale2" />