package gift.witch.activityexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/**
 *
 *
 * 标准模式下的Activity
 *
 *
 */
public class StartmodeActivity extends AppCompatActivity {

    private final String TAG = "StartmodeActivity";

    private TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startmode);

        mText = (TextView)findViewById(R.id.text);
        mText.setText(String.format("taskId:%s\nActivity:%s",getTaskId(),toString()));

        findViewById(R.id.standardActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(StartmodeActivity.this, StartmodeActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.singleInstanceActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(StartmodeActivity.this, SingleInstanceActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.singleTaskActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(StartmodeActivity.this, SingleTaskActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.singleTopActivit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(StartmodeActivity.this, SingleTopActivity.class);
                startActivity(intent);
            }
        });



    }
}
