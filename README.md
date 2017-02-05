# FloatingKeyboard
A Floating and Draggable KeyboardView for android that several EditText's can register to use it.

![Alt text](demo_small.gif?raw=true "FloatingKeaboardView Demo")

## Usage
Use it as normal keyboard view and

1. Place `FloatingKeyboardView` inside a `FrameLayout` or a `RelativeLayout` (TIP: Put it last or/and with some elevation)
2. Make an xml with you keyboard layout (https://developer.android.com/reference/android/inputmethodservice/Keyboard.html)
3. Declare it in activity code `FloatingKeyboardView mCustomKeyboard = (FloatingKeyboardView) findViewById(R.id.keyboardview);`
4. Assign the keyboard layout `mCustomKeyboard.setKeyboard(new Keyboard(this, R.xml.numkbd));`
5. Register edittexts to use it `mCustomKeyboard.registerEditText(R.id.edittext1);`

Optional but highly recommended:

1. Set a transparent background `android:background="@android:color/transparent"`
2. Disable text shadow `android:shadowRadius="0.0"`
3. Make a drawable selector and use as a key background `android:keyBackground="@drawable/keyback"`

## About
Based on the following great guide from Maarten Pennings (http://www.fampennings.nl/maarten/android/09keyboard/)
