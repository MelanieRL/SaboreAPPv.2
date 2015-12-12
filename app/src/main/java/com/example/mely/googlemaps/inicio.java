package com.example.mely.googlemaps;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Mely on 11-Dec-15.
 */
public class inicio extends Activity{

    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

    }
    public void iniciar(View view) {
        Intent mainIntent = new Intent().setClass(
               inicio.this, MainActivity.class);

        startActivity(mainIntent);


        // Close the activity so the user won't able to go back this
        // activity pressing Back button
        finish();
    }


}
