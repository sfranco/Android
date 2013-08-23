package com.example.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	TextView tw1;
	TextView tw2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
		
	public double suma(double num1, double num2)
	{
		double suma=0;
		suma= num1+num2;
		return suma;
	}
	
	public double division(double num1, double num2)
	{
		double division=0;
		division=num1/num2;
		return division;
	}
	
	public double resta(double num1, double num2)
	{
		double resta=0;
		resta=num1-num2;
		return resta;
	}
	
	public double multi(double num1, double num2)
	{
		double multi=0;
		multi=num1*num2;
		return multi;
	}

}
