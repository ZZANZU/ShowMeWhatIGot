package com.tistory.dayglo.showmewhatigot;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tistory.dayglo.showmewhatigot.tflite.Classifier;
import com.wonderkiln.camerakit.CameraView;

public class MainActivity extends AppCompatActivity {
    private static final String MODEL_PATH = "optimized_graph.lite";
    private static final String LABEL_PATH = "retrained_labels.txt";
    private static final int INPUT_SIZE = 224;

    private Classifier classifier;

    private TextView textViewResult;
    private FloatingActionButton btnDetectObject, btnToggleCamera;
    private CameraView cameraView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
