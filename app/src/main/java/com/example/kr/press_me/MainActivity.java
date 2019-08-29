package com.example.kr.press_me;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.OnColorChangedListener;
import com.flask.colorpicker.OnColorSelectedListener;
import com.flask.colorpicker.builder.ColorPickerClickListener;
import com.flask.colorpicker.builder.ColorPickerDialogBuilder;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    Button button2;
    Random r;
    int invisbutton;
    int hardmodee;
    int haha = 0;
    private static final int PICK_IMAGE_REQUEST = 1;
    Random x;
    Button button;
    ArrayList<String> fa;
    ListView listView;
    ListAdapter adapter;
    FrameLayout frameLayout;
    int wow;
    Uri image;
    EditText textSize;
ImageView imageView;
float pos_x;
float pos_y;
int fakebuttonswitcher;
int imagechecker;
SharedPreferences sharedPreferences;
SharedPreferences.Editor editor;
    @Override
    public void onResume(){
        super.onResume();
        int x = sharedPreferences.getInt("rickroll", -1);
        if(x ==1){
            Toast.makeText(this, "Never gonna give you up...", LENGTH_SHORT).show();
            editor.putInt("rickroll", 0);
            editor.apply();
            editor.commit();


        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fakebuttonswitcher = 0;
        button2 = (Button) findViewById(R.id.button2);
        imagechecker = 0;
        r = new Random();
            imageView = (ImageView) findViewById(R.id.wowow);
        invisbutton = 0;
        hardmodee = 0;
        x = new Random();
        button = (Button) findViewById(R.id.press_me);
        pos_x = button.getX();
        pos_y = button.getY();
        button.setX(pos_x);
        button.setY(pos_y);
        button.getX();
        button.getY();
        fa = new ArrayList<String>();
        fa.add("Change Button Size");
        fa.add("Reset");
        fa.add("Change color");
        fa.add("Background");
        fa.add("Set Text Color");
fa.add("Change Text Size");
fa.add("Change position");
fa.add("Change Opacity");
fa.add("Ar mode");
fa.add("Surprise");
fa.add("Change Text");
fa.add("Hard Mode");
fa.add("I'm bored");
fa.add("Fake Button");
origButton();
button2.setX(100);
button.setY(240);
button2.setVisibility(View.INVISIBLE);
    adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fa);
        frameLayout = (FrameLayout) findViewById(R.id.Framelayout);
        listView = findViewById(R.id.set_stuff_for_button);
        sharedPreferences = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
        editor = sharedPreferences.edit();
        int y = sharedPreferences.getInt("boreddude", -1);
        if(y ==1){
            Toast.makeText(this, "Stopped being bored huh", LENGTH_SHORT).show();
            editor.putInt("boreddude", 0);
            editor.apply();
            editor.commit();


        }
        editor.putInt("rickroll", 0);
        editor.putInt("boreddude", 0);
        editor.commit();

        listView.setAdapter(adapter);
        wow = 0;

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position){
                    case 0:
                        openDialogSizeChanger();
                        break;
                    default:
                        break;
                    case 1:
                        origButton();

                        break;

                    case 2:
                    chooseColour();

                        break;
                    case 3:
                    if(imagechecker ==0) {
                        openFileChooser();
                        imagechecker = 1;
                    } else{
                        imageView.setVisibility(View.INVISIBLE);
                        imagechecker = 0;
                    }

                        break;
                    case 4:
                        chooseTextColor();
                        break;
                    case 5:
                        openDialogTextChanger();
                        break;
                    case 6:
                        openButtonLocationChanger();
                        break;
                    case 7:
                        Invisibler();
                        break;
                    case 12:
                            editor.putInt("boreddude", 1);
                            editor.apply();
                            editor.commit();
                           finish();
                           moveTaskToBack(true);
                           break;

                    case 11:
                        scrambler();
                        hardmodee = 1;
                        break;
                    case 10:
                        changeText();
                        break;
                    case 9:
                        rickrolled();
                        break;
                    case 13:
                        if(fakebuttonswitcher == 0) {
                            button2.setVisibility(View.VISIBLE);
                            fakebuttonswitcher = 1;
                        }
                        else{
                            button2.setVisibility(View.INVISIBLE);
                            fakebuttonswitcher = 0;
                        }

                        break;
                    case 8:
                        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                        startActivity(intent);
                        break;


                }

            }
        });

    }

 public void noForu(int x){
        if(x==1){
            Toast.makeText(this, "no saved preferences for u haha", LENGTH_SHORT).show();
        }

 }
public void origButton(){
    button.setText("Press Me!");
    button.setHeight(40);
    button.setWidth(100);
    button.setBackgroundColor(0xFFFF0000);
    button.setTextColor(Color.BLACK);
    button.setTextSize(14);
    button.getBackground().setAlpha(255);
    button.setX(pos_x);
    button.setY(pos_y);
    button.setHighlightColor(0);
    button.setAlpha(1);
    if(hardmodee == 1){
        Toast.makeText(this, "So ya cheated huh", LENGTH_SHORT).show();
        hardmodee = 0;
    }
    button2.setVisibility(View.INVISIBLE);
    fakebuttonswitcher = 0;
    imageView.setVisibility(View.INVISIBLE);
    if(imagechecker == 1) {
        imagechecker = 0;
    }

}    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int width_touched = (int) event.getX();
        int length_touched = (int) event.getY();
        Log.e("touch motion", "touch motion");

        if(!(width_touched > frameLayout.getLeft() && width_touched
                < frameLayout.getRight() && length_touched >
                frameLayout.getTop() && length_touched < frameLayout.getBottom())){
            frameLayout.setVisibility(View.INVISIBLE);
            wow = 0;
        }
        else{


        }
        return true;

    }


    public void onClick(View view){
        Log.e("MAIN BUTTON", "MAIN BUTTON HAS BEEN PRESSED");
        Toast.makeText(MainActivity.this, "You did it yay",
                LENGTH_SHORT).show();


        if(invisbutton == 1){
            Toast.makeText(MainActivity.this, "You did it yay",
                    LENGTH_SHORT).show();

        }
        if(hardmodee == 1){
            Toast.makeText(this, "you are a master", LENGTH_SHORT).show();
            hardmodee = 0;
            button.setX(pos_x);
            button.setY(pos_y);
            button.setAlpha(1);



        }
        if(imagechecker == 1){
            origButton();
            imagechecker =0;

        }

    }

    // create an action bar button
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // handle button activities
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.mybutton) {
            Log.e("SETTINGS", "BUTTON HAS BEEN CLICKED");
            frameLayout.setVisibility(View.VISIBLE);
            wow = 1;



        }
        return super.onOptionsItemSelected(item);
    }


    public void openDialogSizeChanger() {

        final AlertDialog.Builder alertDialogBuilder =
                new AlertDialog.Builder(this);
        final AlertDialog alert = alertDialogBuilder.create();
        LayoutInflater inflater = getLayoutInflater();
        alertDialogBuilder.setView(inflater.inflate(R.layout.custom_viewsize, null));
        View v = inflater.inflate(R.layout.custom_viewsize, null);
        final EditText widthl = v.findViewById(R.id.width);
        final EditText heightl = v.findViewById(R.id.height);

        alertDialogBuilder.setView(v);
//        alert.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;

        alertDialogBuilder.setMessage("Enter a new Size")
                .setPositiveButton("Change size", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if( heightl.getText().toString().equals("") && widthl.getText().toString().equals("")) {
                            Toast.makeText(MainActivity.this, "Cmon man", LENGTH_SHORT).show();
                        }
                        else if (widthl.getText().toString().equals("") && Integer.parseInt(heightl.getText().toString()) > 30)
                        {
                            button.setHeight(Integer.parseInt(heightl.getText().toString()));
                        }

                        else if (heightl.getText().toString().equals("") && Integer.parseInt(widthl.getText().toString()) > 30)
                        {
                            button.setWidth(Integer.parseInt(widthl.getText().toString()));
                        }

                      else if(( Integer.parseInt(widthl.getText().toString()) == 0
                    || Integer.parseInt(heightl.getText().toString()) == 0
                    )){
                        Toast.makeText(MainActivity.this,"Can't let you do that buddy", LENGTH_SHORT).show();
                        }
                    else if(
                            Integer.parseInt(widthl.getText().toString()) <30
                                   || Integer.parseInt(heightl.getText().toString()) <30
                    ){
                        Toast.makeText(MainActivity.this, "Gotta be a bit bigger", LENGTH_SHORT).show();
                    }




                    else{
                        button.setHeight(Integer.parseInt(heightl.getText().toString()));
                        button.setWidth(Integer.parseInt(widthl.getText().toString()));

                        }


                        //add else if for one big one small



                    }
                })
                .setNegativeButton("Remain the Same size", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });


        AlertDialog alertDialog = alertDialogBuilder.show();

    }


public void chooseColour(){
    ColorPickerDialogBuilder
            .with(MainActivity.this)
            .setTitle("Choose Background Color")
            .initialColor(0xFFFF0000)
            .wheelType(ColorPickerView.WHEEL_TYPE.FLOWER)
            .density(12)
            .setOnColorChangedListener(new OnColorChangedListener() {
                @Override
                public void onColorChanged(int selectedColor) {
                    // Handle on color change
                    Log.d("ColorPicker", "onColorChanged: 0x" + Integer.toHexString(selectedColor));
                }
            })
            .setOnColorSelectedListener(new OnColorSelectedListener() {
                @Override
                public void onColorSelected(int selectedColor) {
                    Toast.makeText(MainActivity.this,
                            "You chose: 0x" + Integer.toHexString(selectedColor), LENGTH_SHORT).show();
                    button.setBackgroundColor(selectedColor);

                }
            })
            .setPositiveButton("ok", new ColorPickerClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int selectedColor, Integer[] allColors) {
                    button.setBackgroundColor(selectedColor);
                    if (allColors != null) {
                        StringBuilder sb = null;

                        for (Integer color : allColors) {
                            if (color == null)
                                continue;
                            if (sb == null)
                                sb = new StringBuilder("Color Chosen:");
                            sb.append("\r\n#" + Integer.toHexString(color).toUpperCase());
                        }

                        if (sb != null)
                            Toast.makeText(getApplicationContext(), sb.toString(), Toast.LENGTH_SHORT).show();
                    }
                }
            })
            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            })
            .showColorEdit(true)
            .setColorEditTextColor(ContextCompat.getColor(MainActivity.this, android.R.color.holo_blue_bright))
            .build()
            .show();

}

    private void openFileChooser(){
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, PICK_IMAGE_REQUEST);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if(requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK
                && data != null && data.getData() != null)
        { image = data.getData();


            Picasso.get().load(image).into(imageView);
            imageView.setVisibility(View.VISIBLE);




        }

    }

    public void chooseTextColor(){
        ColorPickerDialogBuilder
                .with(MainActivity.this)
                .setTitle("Choose Text Color")
                .initialColor(0xFFFF0000)
                .wheelType(ColorPickerView.WHEEL_TYPE.FLOWER)
                .density(12)
                .setOnColorChangedListener(new OnColorChangedListener() {
                    @Override
                    public void onColorChanged(int selectedColor) {
                        // Handle on color change
                        Log.d("ColorPicker", "onColorChanged: 0x" + Integer.toHexString(selectedColor));
                    }
                })
                .setOnColorSelectedListener(new OnColorSelectedListener() {
                    @Override
                    public void onColorSelected(int selectedColor) {
                        Toast.makeText(MainActivity.this,
                                "You chose: 0x" + Integer.toHexString(selectedColor), LENGTH_SHORT).show();
                        button.setTextColor(selectedColor);

                    }
                })
                .setPositiveButton("ok", new ColorPickerClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int selectedColor, Integer[] allColors) {
                        button.setTextColor(selectedColor);
                        if (allColors != null) {
                            StringBuilder sb = null;

                            for (Integer color : allColors) {
                                if (color == null)
                                    continue;
                                if (sb == null)
                                    sb = new StringBuilder("Color Chosen:");
                                sb.append("\r\n#" + Integer.toHexString(color).toUpperCase());
                            }

                            if (sb != null)
                                Toast.makeText(getApplicationContext(), sb.toString(), Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .showColorEdit(true)
                .setColorEditTextColor(ContextCompat.getColor(MainActivity.this, android.R.color.holo_blue_bright))
                .build()
                .show();

    }
    public void openDialogTextChanger() {

        final AlertDialog.Builder alertDialogBuilder =
                new AlertDialog.Builder(this);
        final AlertDialog alert = alertDialogBuilder.create();
        LayoutInflater inflater = getLayoutInflater();
        alertDialogBuilder.setView(inflater.inflate(R.layout.change_text, null));
        View v = inflater.inflate(R.layout.change_text, null);
        final EditText numbere = (EditText) findViewById(R.id.numberere);
        textSize = (EditText) v.findViewById(R.id.numberere);

        alertDialogBuilder.setView(v);
        alertDialogBuilder.setMessage("Enter a new Size")
                .setPositiveButton("Edit Size", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        if(textSize.getText().toString().equals("")){
                            Toast.makeText(MainActivity.this, "ahaaha", LENGTH_SHORT).show();

                        }
                        else {
                            int x = Integer.parseInt(textSize.getText().toString());
                            if (x <= 0) {
                                Toast.makeText(MainActivity.this, "HAHA Very funny", LENGTH_SHORT).show();

                            } else if (x > 72) {
                                Toast.makeText(MainActivity.this, "Can't let you do that", LENGTH_SHORT).show();

                            } else {
                                button.setTextSize(x);
                            }


                            //add else if for one big one small


                        }
                    }
                })
                .setNegativeButton("Remain the Same size", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });


        AlertDialog alertDialog = alertDialogBuilder.show();
    }


    public void openButtonLocationChanger() {

        final AlertDialog.Builder alertDialogBuilder =
                new AlertDialog.Builder(this);
        final AlertDialog alert = alertDialogBuilder.create();
        LayoutInflater inflater = getLayoutInflater();
        alertDialogBuilder.setView(inflater.inflate(R.layout.position_changer, null));
        View v = inflater.inflate(R.layout.position_changer, null);
        alertDialogBuilder.setView(v);
        final EditText changexx = (EditText) v.findViewById(R.id.changex);
        final EditText changeyy = (EditText) v.findViewById(R.id.changey);


        alertDialogBuilder.setMessage("Enter a new position")
                .setPositiveButton("Enter new position", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        final String buttonchange_x = changexx.getText().toString();
                        final String buttonchange_y=changeyy.getText().toString();

                        if(buttonchange_x.equals("") && !buttonchange_y.equals("")){
                               button.setX(Integer.parseInt(buttonchange_x));

                        }

                       else if(!buttonchange_x.equals("") && buttonchange_y.equals("")){
                            button.setY(Integer.parseInt(buttonchange_y));

                        }
                       else if(buttonchange_x.equals("") && buttonchange_y.equals("")){
                            Toast.makeText(MainActivity.this, "THIS IS NULLLL", LENGTH_SHORT).show();

                        }
                        else {
                            button.setX((float)Integer.parseInt(buttonchange_x));
                            button.setY((float) Integer.parseInt(buttonchange_y));


                        }

                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });


        AlertDialog alertDialog = alertDialogBuilder.show();
    }

    public void Invisibler() {
        if(hardmodee == 0) {
            final AlertDialog.Builder alertDialogBuilder =
                    new AlertDialog.Builder(this);
            final AlertDialog alert = alertDialogBuilder.create();
            LayoutInflater inflater = getLayoutInflater();
            alertDialogBuilder.setView(inflater.inflate(R.layout.invisible, null));
            View v = inflater.inflate(R.layout.invisible, null);
            SeekBar seekBar = (SeekBar) v.findViewById(R.id.seekBar2);
            final TextView textView = (TextView) v.findViewById(R.id.invisible_textview);
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    textView.setText("Current Opacity: " + String.valueOf((float) progress / (float) 255 * (float) 100) + "%");

                    if (progress == 0) {
                        seekBar.setProgress(50);
                        Toast.makeText(MainActivity.this, "Wouldn't be fun if the color was gone :<"
                                , LENGTH_SHORT).show();


                    } else {
                        button.setAlpha((float) progress / (float) 255);

                        button.getBackground().setAlpha(progress);


                    }


                }

                @RequiresApi(api = Build.VERSION_CODES.KITKAT)
                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                    textView.setText("Current Opacity is " + String.valueOf(button.getBackground().getAlpha() / 255 * 100) + "%");
                    seekBar.setProgress(button.getBackground().getAlpha());


                }

                @TargetApi(Build.VERSION_CODES.KITKAT)
                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                    seekBar.setProgress(button.getBackground().getAlpha());

                }
            });


            alertDialogBuilder.setView(v);
            alertDialogBuilder.setMessage("Change the Opacity")
                    .setPositiveButton("Done?", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();


                        }
                    });


            AlertDialog alertDialog = alertDialogBuilder.show();
        }
        else{
            Toast.makeText(this, "no cheating", LENGTH_SHORT).show();
        }
    }

public void changeText(){
    final AlertDialog.Builder alertDialogBuilder =
            new AlertDialog.Builder(this);
    final AlertDialog alert = alertDialogBuilder.create();
    LayoutInflater inflater = getLayoutInflater();
    alertDialogBuilder.setView(inflater.inflate(R.layout.custom_text, null));
    View v = inflater.inflate(R.layout.custom_text, null);
    final EditText editText = (EditText) v.findViewById(R.id.cocococofjfj);


    alertDialogBuilder.setView(v);
    alertDialogBuilder.setMessage("Set custom Text")
            .setPositiveButton("Done?", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    final String newtext = editText.getText().toString();
                    if(newtext.equals("")){
                        Toast.makeText(MainActivity.this, "nop", LENGTH_SHORT).show();

                    }
                    else{
                        button.setText(newtext);

                    }
                }
            });


    AlertDialog alertDialog = alertDialogBuilder.show();
}

public void scrambler(){
        Random r = new Random();
        button.setAlpha(0);
//        button.setTextColor(0);
        invisbutton = 1;
        button.setX(r.nextFloat() * 400);
        button.setY(r.nextFloat() * 400);
}
public void rickrolled(){
     editor.putInt("rickroll", 1);
     editor.apply();
    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
    startActivity(browserIntent);

}

}
