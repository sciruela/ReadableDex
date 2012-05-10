package mob.readabledex;

import hu.uw.pallergabor.dedexer.Dedexer;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.readabledex.R;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;

public class Main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
          
        try {

        	      
        	
        	String[] arguments={"-d","/mnt/sdcard/","/data/dalvik-cache/data@app@org.readabledex-1.apk@classes.dex"};
        	Dedexer dedexer=new Dedexer(arguments);
        	
        	FileInputStream fstream = new FileInputStream("/mnt/sdcard/mob/readabledex/Proof.ddx");
        	
        	DataInputStream in = new DataInputStream(fstream);
        	BufferedReader br = new BufferedReader(new InputStreamReader(in));
        	String strLine;
        	int count=0;
        	while ((strLine = br.readLine()) != null)   {
        		 
        		  if(strLine.contains("if-eqz")){
        			  count++;
        		  }
        		  
            }
     
            in.close();
        	
            
            
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Number of IF's");
            alertDialog.setMessage("The total of IF's is: "+count);
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialog, int which) {
                  // here you can add functions
               }
            });
            alertDialog.setIcon(R.drawable.icon);
            alertDialog.show();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
        
    }
}