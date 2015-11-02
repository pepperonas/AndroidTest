package com.pepperonas.drawabletest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.pepperonas.andcommon.base.TextViewUtils;
import com.pepperonas.andcommon.graphic.DrawableCircleLetter;
import com.pepperonas.andcommon.graphic.DrawableSquareLetter;
import com.pepperonas.javabase.div.MaterialColor;

public class MainActivity extends AppCompatActivity {

    private boolean showRect = true;

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("TextView");
        TextViewUtils.resize(textView, "TextViewNew", TextViewUtils.TextSize.LARGE);


        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        ImageView imageView9 = (ImageView) findViewById(R.id.imageView9);
        ImageView imageView11 = (ImageView) findViewById(R.id.imageView11);

        if (showRect) {
            imageView1.setImageDrawable(new DrawableSquareLetter.Builder(120, MaterialColor.PURPLE_400, "A").textSize(72).rounded(4).build());
            imageView4.setImageDrawable(new DrawableSquareLetter.Builder(112, MaterialColor.PURPLE_400, "B").textSize(96).rounded(4).build());
            imageView7.setImageDrawable(new DrawableSquareLetter.Builder(96, MaterialColor.PURPLE_400, "C").textSize(64).rounded(4).build());
            imageView9.setImageDrawable(new DrawableSquareLetter.Builder(48, MaterialColor.PURPLE_400, "D").textSize(32).rounded(2).build());
            imageView11.setImageDrawable(new DrawableSquareLetter.Builder(72, MaterialColor.PURPLE_400, "E").textSize(48).rounded(4).build());
        } else {
            imageView1.setImageDrawable(new DrawableCircleLetter.Builder(120, MaterialColor.RED_400, "A").textSize(72).textColor(MaterialColor.WHITE).build());
            imageView4.setImageDrawable(new DrawableCircleLetter.Builder(112, MaterialColor.LIGHT_BLUE_600, "B").textSize(96).build());
            imageView7.setImageDrawable(new DrawableCircleLetter.Builder(96, MaterialColor.ORANGE_500, "C").textSize(64).build());
            imageView9.setImageDrawable(new DrawableCircleLetter.Builder(48, MaterialColor.PINK_500, "D").textSize(32).build());
            imageView11.setImageDrawable(new DrawableCircleLetter.Builder(72, MaterialColor.YELLOW_400, "E").textSize(48).build());
        }

    }
}
