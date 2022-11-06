package com.example.birianirecipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("বিরিয়ানির রেসিপি");
    }

    public void kacchi(View view) {
        kacchiFragment kac=new kacchiFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame,kac);

        ft.commit();
    }

    public void hydrabadi(View view) {
        hydrabadiFragment hyd=new hydrabadiFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame,hyd);

        ft.commit();
    }

    public void dubai(View view) {
        dubaiFragment dub=new dubaiFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame,dub);

        ft.commit();
    }

    public void srilonkan(View view) {
        srilonkanFragment sri=new srilonkanFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame,sri);

        ft.commit();
    }

    public void thalesshori(View view) {
        thalesshoriFragment tha=new thalesshoriFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame,tha);

        ft.commit();
    }

    public void mughlai(View view) {
        mughlaiFragment mug=new mughlaiFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame,mug);

        ft.commit();
    }

    public void bombai(View view) {
        bombaiFragment bom=new bombaiFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame,bom);

        ft.commit();
    }

    public void barmidge(View view) {
        barmidgeFragment bar=new barmidgeFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame,bar);

        ft.commit();
    }
}