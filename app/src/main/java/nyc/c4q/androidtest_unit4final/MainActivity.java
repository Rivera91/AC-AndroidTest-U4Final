//package nyc.c4q.androidtest_unit4final;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.PopupMenu;
//import android.support.v7.widget.RecyclerView;
//import android.util.Log;
//import android.view.Menu;
//import android.view.MenuInflater;
//import android.view.MenuItem;
//import android.view.View;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
//
//public class MainActivity extends AppCompatActivity {//implements PopupMenu.OnMenuItemClickListener {
//
//    private final String TAG = getClass().getSimpleName();
//    private String BASE_URL = "https://raw.githubusercontent.com/";
//
//    private ColorAdapter adapter;
//    protected HashMap<String, String> colorDict;
//    protected ArrayList<String> colorsList;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        colorDict = new HashMap<>();
//        colorDict.put("indigo", "#4b0082");
//        colorDict.put("green", "#00ff00");
//        colorDict.put("blue", "#0000ff");
//        colorDict.put("red", "#ff0000");
//        // TODO: adding all the colors and their values would be tedious, instead fetch it from the url below
//        // https://raw.githubusercontent.com/operable/cog/master/priv/css-color-names.json
//
//        colorsList = new ArrayList<String>();
//        String[] names = new String[] {"blue", "red", "purple", "indigo", "orange", "brown", "black", "green"};
//        for(String n: names) colorsList.add(n);
//
//        final RecyclerView recyclerView = findViewById(R.id.rv);
//        adapter = new ColorAdapter(colorsList, colorDict);
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//
////        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
////        ColorService service = retrofit.create(ColorService.class);
////
////        Call<ColorResponses> call = service.getResults();
////        Log.d("CALL REQUEST", "onCreate: " + call.request());
////        call.enqueue(new Callback<ColorResponses>() {
////            @Override
////            public void onResponse(Call<ColorResponses> call, Response<ColorResponses> response) {
////
////                Log.e("RESPONSE", "onResponse: " +response.toString());
////
////                colorsList = response.body().getResults();
////
////                recyclerView.setAdapter(new ColorAdapter(colorsList));
////            }
////
////            @Override
////            public void onFailure(Call<ColorResponses> call, Throwable t) {
////                t.printStackTrace();
////
////            }
////        });
//    }
//
//
//
//
//    // TODO: Add options menu with the item "Info" which is always visible
//    // TODO: When "Info" menu item is clicked, display the fragment InfoFragment
//    // TODO: If InfoFragment is already visible and I click "Info", remove InfoFragment from the view.
//    // Link to creating options menu: https://github.com/C4Q/AC-Android/tree/v2/Android/Lecture-9-Menus-and-Navigation#anatomy-of-menu-xml
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.options_menu, menu);
//        return true;
//    }
////
////    public void onCreatePopupMenu(View v){
////        PopupMenu popup = new PopupMenu(this,v);
////        MenuInflater inflater= popup.getMenuInflater();
////        popup.setOnMenuItemClickListener(this);
////        inflater.inflate(R.menu.options_menu, popup.getMenu());
////        popup.show();
////
////    }
//
//
//   // @Override
////    public boolean onMenuItemClick(MenuItem item) {
////        switch(item.getItemId()){
////            case R.id.info:
////                Log.e(TAG, "Info was clicked");
////                break;
////
////            default:
////                Log.e(TAG, "Fragment was not clicked");
////                break;
////        }
////        return true;
////    }
////
////    @Override
////    public void onPointerCaptureChanged(boolean hasCapture) {
////
////    }
//}


package nyc.c4q.androidtest_unit4final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ColorAdapter adapter;
    protected HashMap<String, String> colorDict;
    protected List<String> colorsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorDict = new HashMap<>();
        colorDict.put("indigo", "#4b0082");
        colorDict.put("green", "#00ff00");
        colorDict.put("blue", "#0000ff");
        colorDict.put("red", "#ff0000");
        // TODO: adding all the colors and their values would be tedious, instead fetch it from the url below
        // https://raw.githubusercontent.com/operable/cog/master/priv/css-color-names.json

        colorsList = new ArrayList<>();
        String[] names = new String[] {"blue", "red", "purple", "indigo", "orange", "brown", "black", "green"};
        for(String n: names) colorsList.add(n);

        RecyclerView recyclerView = findViewById(R.id.rv);
        adapter = new ColorAdapter(colorsList, colorDict);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    // TODO: Add options menu with the item "Info" which is always visible
    // TODO: When "Info" menu item is clicked, display the fragment InfoFragment
    // TODO: If InfoFragment is already visible and I click "Info", remove InfoFragment from the view.
    // Link to creating options menu: https://github.com/C4Q/AC-Android/tree/v2/Android/Lecture-9-Menus-and-Navigation#anatomy-of-menu-xml
}
