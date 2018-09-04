package com.tistory.dayglo.showmewhatigot.tflite;

import android.graphics.Bitmap;

import org.tensorflow.lite.Interpreter;

import java.util.List;

public class TensorFlowImageClassifier implements Classifier {
    private static final int MAX_RESULTS = 3;
    private static final int BATCH_SIZE = 1;
    private static final int PIXEL_SIZE = 3;
    private static final float THRESHOLD = 0.1f;

    private static final int IMAGE_MEAN = 128;
    private static final float IMAGE_STD = 128.0f;

    private Interpreter interpreter;
    private int inputSize;
    private List<String> labelList;

    @Override
    public List<Recognition> recognizeImage(Bitmap bitmap) {
        return null;
    }

    @Override
    public void close() {

    }
}
