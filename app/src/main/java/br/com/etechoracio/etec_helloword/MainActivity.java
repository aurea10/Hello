package br.com.etechoracio.etec_helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onOK(View View){

        Toast msg= Toast.makeText(this,"FINALMANTE  PROGRAMANDO   EM ! KKKKK!",Toast.LENGTH_LONG);

        msg.show();


    }




}
