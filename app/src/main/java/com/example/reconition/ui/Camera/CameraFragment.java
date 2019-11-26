package com.example.reconition.ui.Camera;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.reconition.R;

public class CameraFragment extends Fragment {

    private CameraViewModel importViewModel;
    private int REQUEST_IMAGE_CAPTURE =101;
    private ImageView imagePlace;


    @Override


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        importViewModel = ViewModelProviders.of(this).get(CameraViewModel.class);
        View root = inflater.inflate(R.layout.fragment_camera, container, false);
        imagePlace = (ImageView)root.findViewById(R.id.imageView);
        Intent imageTakeIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(imageTakeIntent, REQUEST_IMAGE_CAPTURE);
        return root;
    }
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_IMAGE_CAPTURE ){
            Bundle extras = data.getExtras();
            Bitmap photo =  (Bitmap) extras.get("data");
            imagePlace.setImageBitmap(photo);

        }
    }



}