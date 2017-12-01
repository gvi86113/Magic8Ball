package yukai.magic8ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Button;
import android.view.View;
import android.util.Log;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ball = (ImageView) findViewById(R.id.image_ball);
        Button button = (Button) findViewById(R.id.button);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Random random = new Random();
                int num = random.nextInt(5);
                Log.d("Magic8Ball","The button has been pressed, and the ball of number " +num +" has been printed.");

                ball.setImageResource(ballArray[num]);
            }
        });
    }
}
