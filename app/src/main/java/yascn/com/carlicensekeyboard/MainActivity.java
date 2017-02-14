package yascn.com.carlicensekeyboard;

import android.inputmethodservice.KeyboardView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {


    TextView inputbox1;

    TextView inputbox2;

    TextView inputbox3;

    TextView inputbox4;

    TextView inputbox5;

    TextView inputbox6;

    TextView inputbox7;


    LinearLayout boxesContainer;

    LicenseKeyboardUtil keyboardUtil;

    KeyboardView keyboard_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputbox1 = (TextView) findViewById(R.id.et_car_license_inputbox1);
        inputbox2 = (TextView) findViewById(R.id.et_car_license_inputbox2);
        inputbox3 = (TextView) findViewById(R.id.et_car_license_inputbox3);
        inputbox4 = (TextView) findViewById(R.id.et_car_license_inputbox4);
        inputbox5 = (TextView) findViewById(R.id.et_car_license_inputbox5);
        inputbox6 = (TextView) findViewById(R.id.et_car_license_inputbox6);
        inputbox7 = (TextView) findViewById(R.id.et_car_license_inputbox7);
        boxesContainer = (LinearLayout) findViewById(R.id.ll_car_license_inputbox_content);
        keyboard_view = (KeyboardView) findViewById(R.id.keyboard_view);
//        boxesContainer.setVisibility(View.VISIBLE);
        keyboardUtil = new LicenseKeyboardUtil(keyboard_view, boxesContainer, this, new TextView[]{inputbox1, inputbox2, inputbox3,
                inputbox4, inputbox5, inputbox6, inputbox7});
        keyboardUtil.showKeyboard();


    }




}
