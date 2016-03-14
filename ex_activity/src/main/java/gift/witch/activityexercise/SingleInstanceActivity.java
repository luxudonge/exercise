package gift.witch.activityexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/**
 *
 *
 * SingleInstance模式
 * 当该模式Activity实例在任务栈中创建后，只要该实例还在任务栈中，
 * 即只要激活的是该类型的Activity，都会通过调用实例的newInstance()
 * 方法重用该Activity，此时使用的都是同一个Activity实例，它都会处于任务栈的栈顶。
 * 此模式一般用于加载较慢的，比较耗性能且不需要每次都重新创建的Activity。
 *
 *
 */
public class SingleInstanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);
        TextView mText = (TextView)findViewById(R.id.text);
        mText.setText(String.format("taskId:%s\nActivity:%s",getTaskId(),toString()));

        findViewById(R.id.standardActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SingleInstanceActivity.this, StartmodeActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.singleInstanceActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SingleInstanceActivity.this, SingleInstanceActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.singleTaskActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SingleInstanceActivity.this, SingleTaskActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.singleTopActivit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SingleInstanceActivity.this, SingleTopActivity.class);
                startActivity(intent);
            }
        });

    }
}
