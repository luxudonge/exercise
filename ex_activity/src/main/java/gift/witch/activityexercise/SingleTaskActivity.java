package gift.witch.activityexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/***
 * SingleTask模式
 * 如果任务栈中存在该模式的Activity实例，则把栈中该实例以上的
 * Activity实例全部移除，调用该实例的newInstance()方法重用该
 * Activity，使该实例处於栈顶位置，否则就重新创建一个新的Activity实例。
 */
public class SingleTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);
        TextView mText = (TextView)findViewById(R.id.text);
        mText.setText(String.format("taskId:%s\nActivity:%s",getTaskId(),toString()));

        findViewById(R.id.standardActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SingleTaskActivity.this, StartmodeActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.singleInstanceActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SingleTaskActivity.this, SingleInstanceActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.singleTaskActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SingleTaskActivity.this, SingleTaskActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.singleTopActivit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SingleTaskActivity.this, SingleTopActivity.class);
                startActivity(intent);
            }
        });


    }
}
