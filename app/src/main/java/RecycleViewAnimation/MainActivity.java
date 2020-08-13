package RecycleViewAnimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.designs.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import RecycleViewAnimation.Adapter.NewsAdapter;
import RecycleViewAnimation.Model.News;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    NewsAdapter adapter;
    List<News> newsList = new ArrayList<>();
    FloatingActionButton fab;
    boolean isdark = false;
    RelativeLayout rootlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab = findViewById(R.id.fnightMode);
        rootlayout = findViewById(R.id.root_layout);

        recyclerView = findViewById(R.id.new_Recycle);
        isdark=getsaveThemePref();
        if (isdark)
        {

            rootlayout.setBackgroundColor(getResources().getColor(R.color.black));
        }else

            {
                rootlayout.setBackgroundColor(getResources().getColor(R.color.white));
            }
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        newsList.add(new News("abc", "sbwbewuiwebiwbeicbeiucbewiu", "12-04-2020", R.drawable.illustration));
        newsList.add(new News("mukul", "sbwbewuiwebiwbeicbeiucbewiu", "12-05-2020", R.drawable.illustration0));
        newsList.add(new News("akshay", "sbwbewuiwebiwbeicbeiucbewiu", "12-06-2020", R.drawable.illustration2));
        newsList.add(new News("salman", "sbwbewuiwebiwbeicbeiucbewiu", "12-07-2020", R.drawable.illustration));
        newsList.add(new News("srk", "sbwbewuiwebiwbeicbeiucbewiu", "12-08-2020", R.drawable.illustration0));
        newsList.add(new News("amir", "sbwbewuiwebiwbeicbeiucbewiu", "12-09-2020", R.drawable.illustration2));
        newsList.add(new News("dhoni", "sbwbewuiwebiwbeicbeiucbewiu", "12-10-2020", R.drawable.illustration));
        newsList.add(new News("virat", "sbwbewuiwebiwbeicbeiucbewiu", "12-11-2020", R.drawable.illustration0));
        newsList.add(new News("hardik", "sbwbewuiwebiwbeicbeiucbewiu", "12-12-2020", R.drawable.illustration2));
        newsList.add(new News("tiger", "sbwbewuiwebiwbeicbeiucbewiu", "12-04-2020", R.drawable.illustration));
        newsList.add(new News("varun", "sbwbewuiwebiwbeicbeiucbewiu", "12-04-2020", R.drawable.illustration0));
        newsList.add(new News("abc", "sbwbewuiwebiwbeicbeiucbewiu", "12-04-2020", R.drawable.illustration));
        newsList.add(new News("mukul", "sbwbewuiwebiwbeicbeiucbewiu", "12-05-2020", R.drawable.illustration0));
        newsList.add(new News("akshay", "sbwbewuiwebiwbeicbeiucbewiu", "12-06-2020", R.drawable.illustration2));
        newsList.add(new News("salman", "sbwbewuiwebiwbeicbeiucbewiu", "12-07-2020", R.drawable.illustration));
        newsList.add(new News("srk", "sbwbewuiwebiwbeicbeiucbewiu", "12-08-2020", R.drawable.illustration0));
        newsList.add(new News("amir", "sbwbewuiwebiwbeicbeiucbewiu", "12-09-2020", R.drawable.illustration2));
        newsList.add(new News("dhoni", "sbwbewuiwebiwbeicbeiucbewiu", "12-10-2020", R.drawable.illustration));
        newsList.add(new News("virat", "sbwbewuiwebiwbeicbeiucbewiu", "12-11-2020", R.drawable.illustration0));
        newsList.add(new News("hardik", "sbwbewuiwebiwbeicbeiucbewiu", "12-12-2020", R.drawable.illustration2));
        newsList.add(new News("tiger", "sbwbewuiwebiwbeicbeiucbewiu", "12-04-2020", R.drawable.illustration));
        newsList.add(new News("varun", "sbwbewuiwebiwbeicbeiucbewiu", "12-04-2020", R.drawable.illustration0));
        adapter = new NewsAdapter(MainActivity.this, newsList, isdark);
        recyclerView.setAdapter(adapter);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isdark = !isdark;
                if (isdark) {
                    rootlayout.setBackgroundColor(getResources().getColor(R.color.black));
                } else {
                    rootlayout.setBackgroundColor(getResources().getColor(R.color.black));
                }
                adapter = new NewsAdapter(MainActivity.this, newsList, isdark);
                recyclerView.setAdapter(adapter);
            }
        });
    }

    private void saveThemeStatePref(boolean isdark) {

        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("mypref", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("isdark", isdark);
        editor.commit();
    }
    private  boolean getsaveThemePref()
    {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("mypref", MODE_PRIVATE);
        boolean isdark=sharedPreferences.getBoolean("isdark",false);
        return isdark;

    }
}