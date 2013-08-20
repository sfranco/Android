package com.example.aplicacion2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	TextView tw;
	EditText b1;
	EditText b2;
	int a1;
	int a2;
	int suma;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tw= (TextView) this.findViewById(R.id.aviso);
		
		
		b1 = (EditText) this.findViewById(R.id.n1);
		b2 = (EditText) this.findViewById(R.id.n2);
		/*a1 = Integer.parseInt(b1.getText().toString());
		a2 = Integer.parseInt(b2.getText().toString());
		suma=a1+a2;*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void metodo(View argu)
	{
		tw.setText("Cambio el texto");
	}

}
