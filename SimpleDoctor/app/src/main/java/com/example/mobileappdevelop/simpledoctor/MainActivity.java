package com.example.mobileappdevelop.simpledoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView isMemberTv;
    private  TextView newMemberTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        isMemberTv = (TextView) findViewById(R.id.isMember);
        newMemberTv = (TextView) findViewById(R.id.newMember);

    }

    //region functions
    public void ismemberFunc(View view) {
        Intent intent  = new Intent(MainActivity.this,Login.class);

    }

    public void newMemberFunc(View view) {
        //Intent intent  = new Intent(MainActivity.this,Register.class);
    }
    //endregion
}
