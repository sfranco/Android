package com.example.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	TextView tw;
	EditText b0,b1,b2,b3,b4,b5,b,b6,b7,b8,b9;
	int a1,a2,a3,a4,a5,a6,a7,a8,a9,a0;
	int suma,resta,multiplicacion;
	float division;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tw= (TextView) this.findViewById(R.id.solucion);
		
		
		b0 = (EditText) this.findViewById(R.id.num0);
		b1 = (EditText) this.findViewById(R.id.num1);
		b2 = (EditText) this.findViewById(R.id.num2);
		b3 = (EditText) this.findViewById(R.id.num3);
		b4 = (EditText) this.findViewById(R.id.num4);
		b5 = (EditText) this.findViewById(R.id.num5);
		b6 = (EditText) this.findViewById(R.id.num6);
		b7 = (EditText) this.findViewById(R.id.num7);
		b8 = (EditText) this.findViewById(R.id.num8);
		b9 = (EditText) this.findViewById(R.id.num9);
		/*a1 = Integer.parseInt(b1.getText().toString());
		a2 = Integer.parseInt(b2.getText().toString());
		suma=a1+a2;*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.layout.activity_main, menu);
		return true;
	}
	
	public void metodo(View argu)
	{
		tw.setText("Cambio el texto");
	}

}
