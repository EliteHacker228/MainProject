package ru.samsung.itschool.book.normalniy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MapFragment extends Fragment {


    public MapFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //getView();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_map, container, false);
    }

    // ((ImageView) convertView.findViewById(R.id.map_view)).setImageResource(R.drawable.tutor_ekb);


//    public View getView(int position, View convertView, ViewGroup parent) {
//        ((ImageView) convertView.findViewById(R.id.map_view)).setImageResource(R.drawable.tutor_ekb);
//        return convertView;
//    }



}
