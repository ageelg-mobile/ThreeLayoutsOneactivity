package com.ageelg.ThreeLayoutsOneactivity;




import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstFragment extends Fragment {

    
	public FirstFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment1, container, false);   
        
        Button next = (Button) rootView.findViewById(R.id.button1);
        next.setOnClickListener(mNextClickListener);
       
        return rootView;
    }
	
	OnClickListener mNextClickListener = new OnClickListener() {
		public void onClick(View v) {
        	        	
			Fragment fragment = new SecondFragment();
			if (fragment != null) {

				FragmentManager fragmentManager = getActivity().getSupportFragmentManager();	
				fragmentManager.beginTransaction()
						.replace(R.id.frame_container, fragment,"SecondFragment").addToBackStack("FirstFragment").commit();
				
			}
        	
        }
    };
}
