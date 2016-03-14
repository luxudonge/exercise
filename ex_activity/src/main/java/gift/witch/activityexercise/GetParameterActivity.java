package gift.witch.activityexercise;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.Serializable;

public class GetParameterActivity extends AppCompatActivity {


    private final static String TAG = "GetParameterActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_parameter);
        String string = this.getIntent().getStringExtra("STRING_DATA");
        GetParameterData data = (GetParameterData)this.getIntent().getSerializableExtra("DATA");
        GetParameterData1 data1 = (GetParameterData1)this.getIntent().getParcelableExtra("DATA1");
        TextView stringTV = (TextView)findViewById(R.id.string_tv);
        stringTV.setText(String.format("String: %s",string));
        TextView dataTV = (TextView)findViewById(R.id.data_tv);
        dataTV.setText(String.format("DATA: %s",data.aShort));
        TextView data1TV = (TextView)findViewById(R.id.data1_tv);
        data1TV.setText(String.format("DATA1: age:%d name:%s ",data1.getAge(),data1.getName()));
        Log.d(TAG,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d(TAG, "onConfigurationChanged");
    }



    public static class GetParameterData implements Serializable{

        private short aShort = 1;

        public short getaShort() {
            return aShort;
        }

        public void setaShort(short aShort) {
            this.aShort = aShort;
        }
    }


    public static class GetParameterData1 implements Parcelable{

        private String name;
        private int age;


        protected GetParameterData1() {
        }


        protected GetParameterData1(Parcel in) {
            name = in.readString();
            age = in.readInt();
        }



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(name);
            dest.writeInt(age);

        }


        public static final Creator<GetParameterData1> CREATOR = new Creator<GetParameterData1>() {
            @Override
            public GetParameterData1 createFromParcel(Parcel in) {
                return new GetParameterData1(in);
            }

            @Override
            public GetParameterData1[] newArray(int size) {
                return new GetParameterData1[size];
            }
        };
    }

}
