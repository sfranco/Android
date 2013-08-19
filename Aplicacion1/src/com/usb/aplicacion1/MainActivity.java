package com.usb.aplicacion1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	TextView tw4;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout;
        layout = new LinearLayout(this);
        
        EditText e1;
        EditText e2;
        
        e1=new EditText(this);
        e2=new EditText(this);
        int num1,num2, suma;
        
        Button b1;
        b1=new Button(this);
        b1.setText("Solucionar");
        b1.setOnClickListener(this);
        
        layout.addView(e1);
        layout.addView(e2);
        layout.addView(b1);
        layout.addView(tw4);
        
        num1 = Integer.parseInt(e1.getText().toString());
        num2= Integer.parseInt(e2.getText().toString());
        suma= num1 + num2;
        
        TextView tw4;
        tw4 = new TextView(this);
        tw4.setText(suma);
        
        layout.setOrientation(LinearLayout.VERTICAL);
        this.setContentView(layout);
    }

	@Override
	public void onClick(View arg0) {
		tw4.setText("Button");
		// TODO Auto-generated method stub
		
	}

 
    
}

