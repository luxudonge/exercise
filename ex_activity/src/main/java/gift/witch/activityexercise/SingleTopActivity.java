package gift.witch.activityexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/***
 *
 * SingleTop模式
 *
 * 这种模式会考虑当前要激活的Activity实例在任务栈中是否正处于栈顶，
 * 如果处于栈顶则无需重新创建新的实例，会重用已存在的实例，否则会在任务栈中创建新的实例。
 *
 */
public class SingleTopActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top);
        TextView mText = (TextView)findViewById(R.id.text);
        mText.setText(String.format("taskId:%s\nActivity:%s",getTaskId(),toString()));

        findViewById(R.id.standardActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SingleTopActivity.this, StartmodeActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.singleInstanceActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SingleTopActivity.this, SingleInstanceActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.singleTaskActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SingleTopActivity.this, SingleTaskActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.singleTopActivit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SingleTopActivity.this, SingleTopActivity.class);
                startActivity(intent);
            }
        });

    }


}
