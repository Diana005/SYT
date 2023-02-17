package com.example.syt.Activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.syt.Class.CourseClass;
import com.example.syt.R;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.io.ByteArrayOutputStream;

public class RandomActivity extends AppCompatActivity {

    private EditText name,text;
    private Button addImage;
    private ImageView imageView;
    private Uri uploadUri;
    private StorageReference mStorageRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        init();
        addImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CourseClass courseClass;

                if(uploadUri == null){
                    courseClass = new CourseClass(name.toString(),text.toString(),"notImage");
                }
                else{
                    String uri = uploadUri.toString();
                    courseClass = new CourseClass(name.toString(),text.toString(),uri);
                }
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Courses").child(String.valueOf(System.currentTimeMillis()));
                reference.setValue(courseClass);
                Toast.makeText(RandomActivity.this, "Your comment send", Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void init(){
        name = findViewById(R.id.name);
        text = findViewById(R.id.text);
        addImage = findViewById(R.id.addImage);
        imageView = findViewById(R.id.image);
        mStorageRef = FirebaseStorage.getInstance().getReference("ImageDB");
    }



    public void onClickChooseImage(View view){
        getImage();
    }

    private void uploadImage(){
        Bitmap bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG,100,byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        StorageReference mRef = mStorageRef.child(System.currentTimeMillis() + "my_image");
        final UploadTask uploadTask = mRef.putBytes(byteArray);
        Task<Uri> task = uploadTask.continueWithTask(new Continuation<UploadTask.TaskSnapshot, Task<Uri>>() {
            @Override
            public Task<Uri> then(@NonNull Task<UploadTask.TaskSnapshot> task) throws Exception {
                return mRef.getDownloadUrl();
            }
        }).addOnCompleteListener(new OnCompleteListener<Uri>() {
            @Override
            public void onComplete(@NonNull Task<Uri> task) {
                uploadUri = task.getResult();
                Toast.makeText(RandomActivity.this, "Loading is complete", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void getImage(){
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,1);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode, data);
        if (requestCode == 1 && data != null && data.getData() != null){
            if(resultCode == RESULT_OK){
                imageView.setImageURI(data.getData());
                uploadImage();
            }
        }
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode,resultCode,data);
        if(result != null){
            if(result.getContents() != null) {
                Toast.makeText(this, result.getContents().toString(), Toast.LENGTH_SHORT).show();

            }
            else{
                Toast.makeText(this, "No results", Toast.LENGTH_SHORT).show();
            }
        }else{
            super.onActivityResult(requestCode,resultCode,data);
        }

    }
}