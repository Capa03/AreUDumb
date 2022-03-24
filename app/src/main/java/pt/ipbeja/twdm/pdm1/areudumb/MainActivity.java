package pt.ipbeja.twdm.pdm1.areudumb;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void yesButton(View view) {

        Intent nextActivity = new Intent(this, MainActivity2.class);
        startActivity(nextActivity);

    }

    public void noButton(View view) {
        count++;

        Random generator = new Random();
        int x = generator.nextInt(1800);
        int y = generator.nextInt(750);

        if(count==5){
            x = 3000;
            y = 3000;

        }
        Button myBtn;
        myBtn = (Button) findViewById(R.id.NoButton);
        myBtn.setBottom(x+150);
        myBtn.setTop(x);
        myBtn.setLeft(y);
        myBtn.setRight(y+250);

    }
}