package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;

import java.util.ArrayList;

public class hubActivity extends AppCompatActivity {

    private static final String TAG = "hubActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    //List that references quiz answers
    ArrayList<String> res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub);

        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();

        Intent intent = getIntent();
        res = intent.getStringArrayListExtra("Results");
        Log.i("results", res + " in Hub Activity");


    }

    private void initImageBitmaps(){


        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        //ImageUrl's
//        mImageUrls.add("https://sanfrancisco.cbslocal.com/wp-content/uploads/sites/15116056/2013/07/fast-food.jpg?w=625");
//        mNames.add("Fast Food");

        mImageUrls.add("https://www.supermarketnews.com/sites/supermarketnews.com/files/styles/article_featured_retina/public/Grocery_center_store_aisle_offcenter_0.png?itok=jYqbjNCZ");
        mNames.add("Grocery Shopping");

//        mImageUrls.add("https://static01.nyt.com/images/2017/11/05/magazine/05eat1/05eat1-articleLarge.jpg");
//        mNames.add("Breakfast Cooking");
//
        mImageUrls.add("https://i2.wp.com/wellplated.com/wp-content/uploads/2018/10/Healthy-Instant-Pot-Beef-Stew-600x764.jpg");
        mNames.add("Dinner Cooking");

        mImageUrls.add("https://images.theconversation.com/files/229615/original/file-20180727-106511-18ssguj.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=926&fit=clip");
        mNames.add("Vegetarian diet");

        mImageUrls.add("https://t.scdn.co/media/links/workout-274x274.png");
        mNames.add("Workout");

        mImageUrls.add("https://ae01.alicdn.com/kf/HTB1fNp_PFXXXXXVXVXXq6xXFXXXx/13-6cm-11-4cm-Fork-Knife-Plate-Vinyl-Car-Sticker-Car-Styling-Decal-Black-Silver-S3.jpg_q50.jpg");
        mNames.add("Meal Prep");

        mImageUrls.add("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/food-recomended-on-low-carb-diet-or-ketogenic-diet-royalty-free-image-1013107176-1546025560.jpg?resize=480:*");
        mNames.add("Healthy Food");
//
        mImageUrls.add("https://cdn1.thr.com/sites/default/files/imagecache/landscape_928x523/2011/08/main_dining_room_a_l.jpg");
        mNames.add("High End Restaurant");

        initRecyclerView();

//        int aNumb = 1;

//        if (!res.equals(null)){
//            aNumb += 1;
//        }

//        mNames.set(0, "Not Available");
//        mImageUrls.set(0, "https://image.shutterstock.com/image-vector/not-available-grunge-rubber-stamp-260nw-549465907.jpg");
    }



    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.myRecyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void goToResults(View view){
        Intent resultsIntent = new Intent(this, Results.class);
        resultsIntent.putStringArrayListExtra("Results", res);
        startActivity(resultsIntent);

        //resultsIntent.
    }


    //NotebookBG source
    //https://download.hipwallpaper.com/desktop/1600/900/57/21/EvN05x.jpg

}
