package info.gargy.floatingkeyboard;

import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import info.gargy.floatingkeyboardview.FloatingKeyboardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingKeyboardView mCustomKeyboard = (FloatingKeyboardView) findViewById(R.id.keyboardview);
        mCustomKeyboard.setKeyboard(new Keyboard(this, R.xml.numkbd));
        mCustomKeyboard.setPreviewEnabled(false); // NOTE Do not show the preview balloons
        mCustomKeyboard.registerEditText(R.id.edittext1);
        mCustomKeyboard.setAllignBottomCenter(true);
    }
}
