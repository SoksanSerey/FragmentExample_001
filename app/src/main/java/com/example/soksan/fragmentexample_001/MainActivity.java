package com.example.soksan.fragmentexample_001;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        Configuration config =getResources().getConfiguration();
        if(config.orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            LandscapeView landscapeView=new LandscapeView();
            fragmentTransaction.replace(android.R.id.content,landscapeView);
        }
        else{
            PortraitView portrait=new PortraitView();
            fragmentTransaction.replace(android.R.id.content,portrait);
        }

        fragmentTransaction.commit();
    }
}