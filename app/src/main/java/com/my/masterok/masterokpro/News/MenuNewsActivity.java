package com.my.masterok.masterokpro.News;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.my.masterok.masterokpro.R;


public class MenuNewsActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_news);



    }



    public void onClickNewInovation(View view) {
        Intent a = new Intent(this,NewInoMaterialActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        Animation anim1 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.sms_anim);
        final TextView button1 = (TextView) findViewById(R.id.textViewN1);
        button1.startAnimation(anim1);
    }

    public void onClickEkoStroyka(View view) {
        Intent a = new Intent(this,EkoStroykaActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        Animation anim2 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.sms_anim);
        final TextView button2 = (TextView) findViewById(R.id.textViewN2);
        button2.startAnimation(anim2);
    }

    public void onClickStroimDom(View view) {
        Intent a = new Intent(this,StroimDomActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        Animation anim3 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.sms_anim);
        final TextView button3 = (TextView) findViewById(R.id.textViewN3);
        button3.startAnimation(anim3);
    }

    public void onClickInoStroy(View view) {
        Intent a = new Intent(this,InoStroykaActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        Animation anim4 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.sms_anim);
        final TextView button4 = (TextView) findViewById(R.id.textViewN4);
        button4.startAnimation(anim4);
    }

    public void onClickEnergo(View view) {
        Intent a = new Intent(this,EnergoEfektActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        Animation anim5 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.sms_anim);
        final TextView button5 = (TextView) findViewById(R.id.textViewN5);
        button5.startAnimation(anim5);
    }

}
