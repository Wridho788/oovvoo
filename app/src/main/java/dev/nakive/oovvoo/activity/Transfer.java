package dev.nakive.oovvoo.activity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import dev.nakive.oovvoo.R;
import dev.nakive.oovvoo.adapter.TabAdapter;
import dev.nakive.oovvoo.fragment.transfer.Favorit;
import dev.nakive.oovvoo.fragment.transfer.Penerima_baru;

public class Transfer extends AppCompatActivity {
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_transfer);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Top Up");
        final TabLayout tabLayout = findViewById(R.id.tab);
        final ViewPager viewPager = findViewById(R.id.pager);

        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new Penerima_baru(), "Penerima Baru");
        adapter.addFragment(new Favorit(), "Favorit");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}