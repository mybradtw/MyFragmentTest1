package tw.brad.myfragmenttest1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class F1Fragment extends Fragment {
    private View mainView;
    private TextView title;
    private Button btn, btn2, btn3;
    private MainActivity activity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activity = (MainActivity) getActivity();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mainView == null) {
            mainView = inflater.inflate(R.layout.fragment_f1, container, false);

            title = mainView.findViewById(R.id.f1_title);
            btn = mainView.findViewById(R.id.f1_btn);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    doF1Btn();
                }
            });

            btn2 = mainView.findViewById(R.id.f1_btn2);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    doF1Btn2();
                }
            });

            btn3 = mainView.findViewById(R.id.f1_btn3);
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    doF1Btn3();
                }
            });
        }
        return mainView;
    }

    private void doF1Btn(){
        title.setText("F1: " + (int)(Math.random()*49+1));
    }

    public void setTitle(){
        title.setText("F1: " + (int)(Math.random()*49+1));
    }

    private void doF1Btn2(){
        activity.changeMainTitle();
    }

    private void doF1Btn3(){
        activity.changeF2Title();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

}
