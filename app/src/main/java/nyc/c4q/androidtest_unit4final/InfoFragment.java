//package nyc.c4q.androidtest_unit4final;
//
//import android.app.Fragment;
//import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
///**
// * Created by justiceo on 1/9/18.
// */
//
//public class InfoFragment extends Fragment {
//
//    private Bundle bundle;
//
//    public InfoFragment(){}
//
//
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        bundle = getArguments();
//    }
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//        View v = inflater.inflate(R.layout.info_fragment, container, false);
//        return v;
//    }
//
//    @Override
//    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        TextView infoText = view.findViewById(R.id.info_view);
//        String info = bundle.getString("info");
//        infoText.setText(info);
//    }
//}

package nyc.c4q.androidtest_unit4final;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by justiceo on 1/9/18.
 */

public class InfoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.info_fragment, container, false);
        return v;
    }
}

