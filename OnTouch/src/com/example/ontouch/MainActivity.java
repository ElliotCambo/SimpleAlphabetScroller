package com.example.ontouch;

import java.util.ArrayList;
import java.util.List;




import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.text.Spannable;
import android.text.method.Touch;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnTouchListener{

	public ArrayList<String> names = new ArrayList<String>();
	public ListView list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
	
		names.add("Alice");names.add("Adrian");names.add("Adam");names.add("Amapal");names.add("Anker");names.add("Antal");names.add("Aabuh hamza");names.add("Afed");names.add("Ader");
		names.add("Bob");names.add("Bab");names.add("Bfb");names.add("Bhb");names.add("Bjb");names.add("Byb");names.add("Brb");names.add("Bwb");names.add("Bwb");
		names.add("Clare");names.add("Ceiare");names.add("Ceriare");names.add("Care");names.add("Cleryre");names.add("Cqwre");names.add("Clerty");names.add("Chde");names.add("Cldfe");
		names.add("Daym");names.add("Daym");names.add("Daym");names.add("Daym");names.add("Daym");names.add("Daym");names.add("Daym");names.add("Daym");names.add("Daym");
		names.add("Elliot");names.add("Elliot");names.add("Elliot");names.add("Elliot");names.add("Elliot");names.add("Elliot");names.add("Elliot");names.add("Elliot");names.add("Elliot");
		names.add("fred");names.add("fred");names.add("fred");names.add("fred");names.add("fred");names.add("fred");names.add("fred");names.add("fred");names.add("fred");
		names.add("greg");names.add("greg");names.add("greg");names.add("greg");names.add("greg");names.add("greg");names.add("greg");names.add("greg");names.add("greg");
		names.add("Harvey");names.add("Harvey");names.add("Harvey");names.add("Harvey");names.add("Harvey");names.add("Harvey");names.add("Harvey");names.add("Harvey");names.add("Harvey");names.add("Harvey");
		names.add("India");names.add("India");names.add("India");names.add("India");names.add("India");names.add("India");names.add("India");names.add("India");names.add("India");
		names.add("JEFF");names.add("JEFF");names.add("JEFF");names.add("JEFF");names.add("JEFF");names.add("JEFF");names.add("JEFF");names.add("JEFF");names.add("JEFF");names.add("JEFF");
		names.add("Kim");names.add("Kim");names.add("Kim");names.add("Kim");names.add("Kim");names.add("Kim");names.add("Kim");names.add("Kim");names.add("Kim");
		names.add("Len");names.add("Len");names.add("Len");names.add("Len");names.add("Len");names.add("Len");names.add("Len");names.add("Len");names.add("Len");
		names.add("Men");names.add("Men");names.add("Men");names.add("Men");names.add("Men");names.add("Men");names.add("Men");names.add("Men");names.add("Men");
		names.add("Nicola");names.add("Nicola");names.add("Nicola");names.add("Nicola");names.add("Nicola");names.add("Nicola");names.add("Nicola");names.add("Nicola");names.add("Nicola");
		names.add("Olivia");names.add("Olivia");names.add("Olivia");names.add("Olivia");names.add("Olivia");names.add("Olivia");names.add("Olivia");names.add("Olivia");names.add("Olivia");	
		names.add("Peter");names.add("Peter");names.add("Peter");names.add("Peter");names.add("Peter");names.add("Peter");names.add("Peter");names.add("Peter");names.add("Peter");
		names.add("Qwary");names.add("Qwary");names.add("Qwary");names.add("Qwary");names.add("Qwary");names.add("Qwary");names.add("Qwary");names.add("Qwary");names.add("Qwary");
		names.add("Undula");names.add("Undula");names.add("Undula");names.add("Undula");names.add("Undula");names.add("Undula");names.add("Undula");names.add("Undula");names.add("Undula");
		names.add("Vince");names.add("Vince");names.add("Vince");names.add("Vince");names.add("Vince");names.add("Vince");names.add("Vince");names.add("Vince");names.add("Vince");names.add("Vince");
		names.add("William");names.add("William");names.add("William");names.add("William");names.add("William");names.add("William");names.add("William");names.add("William");names.add("William");names.add("William");
		names.add("Xamp");names.add("Xamp");names.add("Xamp");names.add("Xamp");names.add("Xamp");names.add("Xamp");names.add("Xamp");names.add("Xamp");names.add("Xamp");names.add("Xamp");
		names.add("Yerr");names.add("Yerr");names.add("Yerr");names.add("Yerr");names.add("Yerr");names.add("Yerr");names.add("Yerr");names.add("Yerr");names.add("Yerr");names.add("Yerr");
		names.add("Zuckerberg");names.add("Zuckerberg");names.add("Zuckerberg");names.add("Zuckerberg");names.add("Zuckerberg");names.add("Zuckerberg");names.add("Zuckerberg");names.add("Zuckerberg");names.add("Zuckerberg");
		
		
		
		
		
		
		TextView a = (TextView)findViewById(R.id.A); a.setOnTouchListener(this);
		TextView b = (TextView)findViewById(R.id.B); b.setOnTouchListener(this);
		TextView c = (TextView)findViewById(R.id.C); c.setOnTouchListener(this);
		TextView d = (TextView)findViewById(R.id.D); d.setOnTouchListener(this);
		TextView e = (TextView)findViewById(R.id.E); e.setOnTouchListener(this);
		TextView f = (TextView)findViewById(R.id.F); f.setOnTouchListener(this);
		TextView g = (TextView)findViewById(R.id.G); g.setOnTouchListener(this);
		TextView h = (TextView)findViewById(R.id.H); h.setOnTouchListener(this);
		TextView i = (TextView)findViewById(R.id.I); i.setOnTouchListener(this);
		TextView j = (TextView)findViewById(R.id.J); j.setOnTouchListener(this);
		TextView k = (TextView)findViewById(R.id.K); k.setOnTouchListener(this);
		TextView l = (TextView)findViewById(R.id.L); l.setOnTouchListener(this);
		TextView m = (TextView)findViewById(R.id.M); m.setOnTouchListener(this);
		TextView n = (TextView)findViewById(R.id.N); n.setOnTouchListener(this);
		TextView o = (TextView)findViewById(R.id.O); o.setOnTouchListener(this);
		TextView p = (TextView)findViewById(R.id.P); p.setOnTouchListener(this);
		TextView q = (TextView)findViewById(R.id.Q); q.setOnTouchListener(this);
		TextView r = (TextView)findViewById(R.id.R); r.setOnTouchListener(this);
		TextView s = (TextView)findViewById(R.id.S); s.setOnTouchListener(this);
		TextView t = (TextView)findViewById(R.id.T); t.setOnTouchListener(this);
		TextView u = (TextView)findViewById(R.id.U); u.setOnTouchListener(this);
		TextView v = (TextView)findViewById(R.id.V); v.setOnTouchListener(this);
		TextView w = (TextView)findViewById(R.id.W); w.setOnTouchListener(this);
		TextView x = (TextView)findViewById(R.id.X); x.setOnTouchListener(this);
		TextView y = (TextView)findViewById(R.id.Y); y.setOnTouchListener(this);
		TextView z = (TextView)findViewById(R.id.Z); z.setOnTouchListener(this);
		
		
		
	
		list = (ListView) findViewById(R.id.listview);
		//list = getListView();
    	ArrayAdapter<String> returnedContnet = new AdriansListAdapter(MainActivity.this, android.R.layout.simple_list_item_1, R.id.text, names);
    	list.setAdapter(returnedContnet);
	
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	public void onTouch(View v) {
	    String firstLetter = (String) v.getTag();
	    int index = 0;
	    Context context = getApplicationContext();
	    int duration = Toast.LENGTH_SHORT;
	    Toast toast = Toast.makeText(context, "was tapped " + firstLetter, duration);
	    toast.show();
	    if (names != null) {
	        for (String string : names) {
	            if (string.startsWith(firstLetter)) {
	                index = names.indexOf(string);
	                break;
	            }
	        }
	    }
	    list.setSelectionFromTop(index, 0);
	}


	
	private class AdriansListAdapter extends ArrayAdapter<String>{

		public AdriansListAdapter(Context context, int resource, int textViewResourceId, 
				List<String> objects) {
			super(context, resource, textViewResourceId, objects);
			// TODO Auto-generated constructor stub
		}
		@Override
		public View getView(int position, View convertView, ViewGroup parent){
			
			LayoutInflater inflater1 = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View row = inflater1.inflate(R.layout.row_layout, parent, false);
		
			String[] IDs = new String[names.size()];
		    IDs = names.toArray(IDs);
			
			TextView names_tv = (TextView) row.findViewById(R.id.text);
			
			names_tv.setText(IDs[position]);
	
			return row;
		}
	
		
}


	@Override
	public boolean onTouch(View v, MotionEvent arg1) {
		// TODO Auto-generated method stub
		
		
     // String firstLetter = (String) v.getTag();
		
//	    int index = 0;
//	    Context context = getApplicationContext();
//	    Toast toast = new Toast(context);
//	    toast.setDuration(Toast.LENGTH_SHORT);
//	    toast.setGravity(Gravity.CENTER,0,0);
//	    
//	    LayoutInflater inflater = getLayoutInflater();
//	    View appearance = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.layout_holder));
//	    appearance.findViewById(R.id.toast_text_view);
//	    toast.setText(firstLetter); 
//	    toast.setView(appearance);
//
//	   
//	    toast.show();
		
		
		String firstLetter = (String) v.getTag();
		
	    int index = 0;
	    Context context = getApplicationContext();
	    int duration = Toast.LENGTH_SHORT;
	    Toast toast = Toast.makeText(context, firstLetter, duration);
	    toast.show();
	    if (names != null) {
	        for (String string : names) {
	            if (string.startsWith(firstLetter)) {
	                index = names.indexOf(string);
	                break;
	            }
	        }
	    }
	    list.setSelectionFromTop(index, 0);
		
		
		
		return false;
	}
	
}
