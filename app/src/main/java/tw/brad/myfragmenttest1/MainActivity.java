package tw.brad.myfragmenttest1;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private F1Fragment f1Fragment;
    private F2Fragment f2Fragment;
    private FragmentManager fmgr;
    private FragmentTransaction transaction;
    private boolean isF1;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.main_title);

        f1Fragment = new F1Fragment(); f2Fragment = new F2Fragment();
        fmgr = getSupportFragmentManager();

    }

    @Override
    protected void onStart() {
        super.onStart();

        transaction = fmgr.beginTransaction();
        transaction.add(R.id.main_container, f1Fragment);
        transaction.commit();
        isF1 = true;

    }

    @Override
    protected void onPause() {
        super.onPause();
        transaction = fmgr.beginTransaction();
        transaction.remove(isF1?f1Fragment:f2Fragment);
        transaction.commit();

    }

    public void change(View view) {
        isF1 = !isF1;

        transaction = fmgr.beginTransaction();
        transaction.replace(R.id.main_container, isF1?f1Fragment:f2Fragment);
        transaction.commit();

    }

    public void changeMainTitle(){
        title.setText("Main: " + (int)(Math.random()*49+1));
    }

    public void changeF1Title(View view) {
        f1Fragment.setTitle();
    }

    public void changeF2Title(){
        f2Fragment.chageTitle();
    }
}
