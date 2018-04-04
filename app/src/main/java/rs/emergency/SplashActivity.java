package rs.emergency;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class SplashActivity extends AppCompatActivity {
    Animation upAnim, fadeOut, fadeIn, backFadeIn, myAnimation;
    RelativeLayout layout, mountainLayout, lightMountain, yellowBackground;
    AnimationDrawable trans;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        img = (ImageView) findViewById(R.id.sun);
        layout = (RelativeLayout) findViewById(R.id.layout);
        mountainLayout = (RelativeLayout) findViewById(R.id.mountains);
        lightMountain = (RelativeLayout) findViewById(R.id.mountains_light);
        yellowBackground = (RelativeLayout) findViewById(R.id.yellow_back);

               trans = (AnimationDrawable) layout.getBackground();
     trans.setEnterFadeDuration(1000);
     trans.setExitFadeDuration(1000);
      trans.start();
        fadeOut = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        mountainLayout.startAnimation(fadeOut);


        fadeIn = AnimationUtils.loadAnimation(this, R.anim.fadein);
        lightMountain.startAnimation(fadeIn);



        upAnim = AnimationUtils.loadAnimation(this, R.anim.up_anim);
        img.startAnimation(upAnim);
        upAnim.setFillAfter(true);

        backFadeIn = AnimationUtils.loadAnimation(this, R.anim.background_fadein);
        yellowBackground.startAnimation(backFadeIn);
        Intent i = new Intent(SplashActivity.this, MainActivity.class);
        SplashActivity.this.startActivity(i);
    }
}