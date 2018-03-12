package com.enicarthage.www.sommededeuxnombres;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSum(View v)
    {
        EditText e1 = (EditText) findViewById(R.id.editText1);
        EditText e2 = (EditText) findViewById(R.id.editText2);

        TextView t1 = (TextView) findViewById(R.id.textView);
        int numb1 = Integer.parseInt(e1.getText().toString());
        int numb2 = Integer.parseInt(e2.getText().toString());

        int somme = numb1 + numb2;
        t1.setText(Integer.toString(somme));

    }

    public void onClickSoustraction(View v)
    {
        EditText e1 = (EditText) findViewById(R.id.editText1);
        EditText e2 = (EditText) findViewById(R.id.editText2);

        TextView t1 = (TextView) findViewById(R.id.textView);
        int numb1 = Integer.parseInt(e1.getText().toString());
        int numb2 = Integer.parseInt(e2.getText().toString());

        int somme = numb1 - numb2;
        t1.setText(Integer.toString(somme));

    }

    public void onClickMultiplication(View v)
    {
        EditText e1 = (EditText) findViewById(R.id.editText1);
        EditText e2 = (EditText) findViewById(R.id.editText2);

        TextView t1 = (TextView) findViewById(R.id.textView);
        int numb1 = Integer.parseInt(e1.getText().toString());
        int numb2 = Integer.parseInt(e2.getText().toString());

        int somme = numb1 * numb2;
        t1.setText(Integer.toString(somme));

    }

    public void onClickDivision(View v)
    {
        EditText e1 = (EditText) findViewById(R.id.editText1);
        EditText e2 = (EditText) findViewById(R.id.editText2);

        TextView t1 = (TextView) findViewById(R.id.textView);
        int numb1 = Integer.parseInt(e1.getText().toString());
        int numb2 = Integer.parseInt(e2.getText().toString());
        if (numb2 != 0)
        {
            int somme = numb1 / numb2;
            t1.setText(Integer.toString(somme));
        }

    }

}
