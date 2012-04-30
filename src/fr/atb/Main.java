package fr.atb;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class Main extends TabActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Resources res = getResources(); // Resource object to get Drawables
		TabHost tabHost = getTabHost(); // The activity TabHost
		TabHost.TabSpec spec; // Resusable TabSpec for each tab
		Intent intent; // Reusable Intent for each tab

		// Create an Intent to launch an Activity for the tab (to be reused)
		intent = new Intent().setClass(this, Bienvenue.class);

		spec = tabHost
				.newTabSpec("bienvenue")
				.setIndicator("Accueil",
						res.getDrawable(R.drawable.selection_bienvenue))
				.setContent(intent);
		tabHost.addTab(spec);

		intent = new Intent().setClass(this, Programme.class);
		spec = tabHost
				.newTabSpec("proramme")
				.setIndicator("Programme",
						res.getDrawable(R.drawable.selection_bienvenue))
				.setContent(intent);
		tabHost.addTab(spec);

	}
}