package ru.samsung.itschool.book.normalniy;



import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import ru.samsung.itschool.book.normalniy.dummy.DummyContent;
import ru.samsung.itschool.book.normalniy.dummy.DummyContent.DummyItem;

import java.util.List;

public class NewsListFragment extends ListFragment {


        // определяем массив типа String
        final String[] newsList = new String[]{"Открылась выставка бронетехники", "Музей истории кочевников открылся," +
                "и сразу переехал на два этажа ниже", "Новая выставка",
                "Музей гитар", "Искусство востока", "Оружие 12 века", "Вычислительная техника", "Электроника", "Уральский промысел",
                "Винная галерея", "Краеведческий музей", "Писатель 20 века", "История Урала"};

        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);

            ListAdapter adapter = new ArrayAdapter<>(getActivity(),
                    android.R.layout.simple_list_item_1, newsList);
            setListAdapter(adapter);
        }

}
