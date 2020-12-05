activity_main.xml

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tool="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#310F0C"
    android:gravity="center"
    android:orientation="vertical">

    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="300dp">

        <ImageView
            android:id="@+id/imageView"
            android:layout_width="69dp"
            android:layout_height="48dp"
            android:elevation="10dp"
            app:layout_constraintBottom_toBottomOf="@+id/progressbar"
            app:layout_constraintEnd_toEndOf="@+id/progressbar"
            app:layout_constraintStart_toStartOf="@+id/progressbar"
            app:layout_constraintTop_toTopOf="@+id/progressbar"
            app:layout_constraintVertical_bias="0.193"
            app:srcCompat="@drawable/foot" />

        <ProgressBar
            android:id="@+id/progressbar"
            android:layout_width="300dp"
            android:layout_height="250dp"
            android:elevation="10dp"
            android:fontFamily="sans-serif"
            android:gravity="center"
            android:indeterminateOnly="false"
            android:max="1000"
            android:progressDrawable="@drawable/progress"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.495"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintVertical_bias="1.0"
            tool:progress="40" />

        <TextView
            android:id="@+id/tv_steps"
            android:layout_width="162dp"
            android:layout_height="111dp"
            android:layout_marginBottom="56dp"
            android:elevation="18dp"
            android:fontFamily="sans-serif"
            android:gravity="center"
            android:text="0"
            android:textColor="#FFFF"
            android:textSize="40sp"
            android:textStyle="bold"
            app:layout_constraintBottom_toBottomOf="@+id/progressbar"
            app:layout_constraintEnd_toEndOf="@+id/progressbar"
            app:layout_constraintHorizontal_bias="0.511"
            app:layout_constraintStart_toStartOf="@+id/progressbar" />

        <ImageView
            android:id="@+id/imageView2"
            android:layout_width="51dp"
            android:layout_height="33dp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.045"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintVertical_bias="0.039"
            app:srcCompat="@drawable/target" />

        <TextView
            android:id="@+id/textView"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Walk 3 Hours Daily"
            android:textColor="#FFFFFF"
            android:textSize="15sp"
            android:textStyle="bold"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.47"
            app:layout_constraintStart_toStartOf="@+id/imageView2"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintVertical_bias="0.057" />

    </androidx.constraintlayout.widget.ConstraintLayout>

    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#FFFFFF">


        <ImageView
            android:id="@+id/imageView6"
            android:layout_width="404dp"
            android:layout_height="389dp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.465"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/secondback" />

    </androidx.constraintlayout.widget.ConstraintLayout>


</LinearLayout>




MainActivity.java


package com.example.fitbit;

import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private double MagnitudePrevious = 0;
    private Integer stepCount = 0;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv_steps);
        progressBar = findViewById(R.id.progressbar);


        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        Sensor sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        SensorEventListener stepDetector = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                if (sensorEvent != null) {
                    //accelaration in three coordinates
                    float x_acceleration = sensorEvent.values[0];
                    float y_acceleration = sensorEvent.values[1];
                    float z_acceleration = sensorEvent.values[2];
                    double Magnitude = Math.sqrt(x_acceleration * x_acceleration + y_acceleration * y_acceleration + z_acceleration * z_acceleration);
                    double MagnitudeDelta = Magnitude - MagnitudePrevious;
                    MagnitudePrevious = Magnitude;

                    if (MagnitudeDelta > 6) {
                        //To change progressbar as according to stepcounts
                        progressBar.setProgress(stepCount);
                        stepCount++;

                    }
                    textView.setText(stepCount.toString());
                    progressBar.setProgress(stepCount);
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {
            }
        };
//Registering the sonsor to listner
        sensorManager.registerListener(stepDetector, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    //sharedpreference has been used to keep the previous data in app
    //whenever we user will pause the app due to any reason, onPause() will be called which ensure
    // that whatever the steps user took till that time that will store in app
    protected void onPause() {
        super.onPause();

        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        //clearing any old present data
        editor.clear();
        //keeping the count of the steps which user has walked
        editor.putInt("stepCount", stepCount);
        editor.apply();
    }

    protected void onStop() {
        super.onStop();
        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.putInt("stepCount", stepCount);
        editor.apply();
    }

    //on reopening the app this method is responsible to return the data stored in sharedpreference
    protected void onResume() {
        super.onResume();

        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        stepCount = sharedPreferences.getInt("stepCount", 0);
    }


}

//Custom progressbar

progress.xml

<?xml version="1.0" encoding="utf-8"?>
<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
    <item>


        <shape
            android:shape="ring"
            android:thicknessRatio="20"
            android:useLevel="false">
            <solid android:color="#FBFBFA" />
        </shape>

    </item>

    <item>
        <rotate
            android:fromDegrees="270"
            android:toDegrees="270">
            <shape
                android:shape="ring"
                android:thicknessRatio="16"
                android:useLevel="true">
                <gradient
                    android:endColor="#571F1A"
                    android:startColor="#672924">

                </gradient>
            </shape>
        </rotate>
    </item>
</layer-list>

//Menifest file

AndroidMenifest.xml

<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.fitbit">
<uses-permission android:name="android.permission.WAKE_LOCK"/>

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.FitBit">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>
