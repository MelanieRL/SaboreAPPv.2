package com.example.mely.googlemaps;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity  extends ActionBarActivity {
    private final LatLng temuco = new LatLng(-38.7359552, -72.5903148);
    private final LatLng local1 = new LatLng(-38.7519663, -72.6174443);
    private final LatLng local2 = new LatLng(-38.744319, -72.616394);

    private GoogleMap mapa;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapa = ((SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map)).getMap();
        mapa.setMapType(GoogleMap.MAP_TYPE_NORMAL);


        mapa.setMyLocationEnabled(true);
        mapa.getUiSettings().setZoomControlsEnabled(false);
        mapa.getUiSettings().setCompassEnabled(true);
        mapa.moveCamera(CameraUpdateFactory.newLatLngZoom(temuco, 15));


        mapa.addMarker(new MarkerOptions()
                .position(local1)
                .title("La Barricada")
                .snippet("Fono: 749933 ")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.burger))
                .anchor(0.5f, 0.5f));
       mapa.addMarker(new MarkerOptions()
               .position(local2)
               .title("La Picá de Uruguay")
               .snippet("Fono")
               .icon(BitmapDescriptorFactory
                       .fromResource(R.drawable.burger))
               .anchor(0.5f, 0.5f));


    }










}





