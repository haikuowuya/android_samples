package lecho.sample.rootshell;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edit = (EditText) findViewById(R.id.edit);
        final Button sh = (Button) findViewById(R.id.sh_button);
        sh.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                RootShell.shExecute(new String[] { edit.getText().toString() });

            }
        });
        final Button su = (Button) findViewById(R.id.su_button);
        su.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                RootShell.suExecute(new String[] { edit.getText().toString() });

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}
