package tw.brad.myfragmenttest1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class F2Fragment extends Fragment {
    private View mainView;
    private TextView title;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mainView == null){
            mainView = inflater.inflate(R.layout.fragment_f2, container, false);
            title = mainView.findViewById(R.id.f2_title);

        }
        return mainView;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    // 相同Activity下各自Fragment之間的互動
    public void chageTitle(){
        title.setText("F2: " + (int)(Math.random()*49+1));
    }
}
