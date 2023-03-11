package com.example.syt.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.syt.Class.CourseClass;
import com.example.syt.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main extends AppCompatActivity {
    private Button s,i;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s=findViewById(R.id.rectangle_32);

        i=findViewById(R.id.rectangle_33);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Main.this, Resources.class);
                startActivity(p);
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Main.this, CoursesActivity.class);
                startActivity(p);
            }
        });


        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Lessons");
        DatabaseReference r1 = reference.child("Das1");
        r1.setValue(new CourseClass("Understand the Difference Between Urgent and Important","Urgent things require your immediate attention. But just because something is urgent, doesn’t mean it’s important.\n" +
                "Doing things that seem urgent but are actually of little significance costs us all a lot of time.\n" +
                "You should always focus on what’s important: starting with urgent issues, and following with less urgent ones.\n" +
                "For things that are urgent, but not important: try and delegate if there’s someone who can do them for you. If not, come back to them later (if necessary at all).\n" +
                " Things that are neither urgent nor important? Ignore them. Or save them for last if they’re your guilty pleasures like playing video games.\n ","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/courses02%2Femail_removebg_preview_21.PNG?alt=media&token=ae216ef8-a5ef-421a-99a0-f82d74c2e809"));
        DatabaseReference r2 = reference.child("Das2");
        r2.setValue(new CourseClass("Do Difficult Work When You Know You’re Most Productive","All of us have certain times of day when we’re most productive. Schedule difficult tasks that require full focus for these times, if possible.\n" +
                " Personally, I’m the exact opposite of a morning person. I know I can’t write for the first 2 to 3 hours after waking up. So I fill this time with smaller tasks such as replying to emails, taking care of the proper documentation of my work and so on.\n" +
                " The priority matrix from the previous section also helps here: if you have a list of smaller, non-urgent but important tasks, you can always pick from them when you have a moment of spare time, but feel unable to do anything complex.\n","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/courses02%2Fdistributed_removebg_preview__1__21.PNG?alt=media&token=088ac19f-e719-4cc8-bdda-8c7f6b12130chttps://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/courses02%2Fdistributed_removebg_preview__1__21.PNG?alt=media&token=088ac19f-e719-4cc8-bdda-8c7f6b12130c"));
        DatabaseReference r3 = reference.child("Das3");
        r3.setValue(new CourseClass("Stick to a Schedule and Don’t Miss Deadlines"," Keith Wilcox, a researcher out of Columbia University, analyzed half a million tasks entered into a popular to-do list app to check the users’ behavior. He found that when they changed the deadline for a task, it took them an average of 16 more days to complete the task than when they kept the original deadline. Missing deadlines is not a once in a while occurrence either—users changed deadlines on 51% of tasks. Creating a schedule for your whole week, in turn, helps you save time you’d spend deciding what task to do next. It’s best to use a to-do list to schedule out everything we’re going to do each week (and day) into our calendar and then just let the calendar direct us.at you can make the most of your working hours.","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/courses02%2Fdeadline_removebg_preview_2.PNG?alt=media&token=785f2790-6a29-41ee-8640-f16e2f2dc4db"));
        DatabaseReference r4 = reference.child("Das4");
        r4.setValue(new CourseClass("Goal setting","The most successful \"time managers\" have clear targets to aim for. They develop SMART Goals, allowing them to allocate their time effectively.","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/courses02%2Fgoal_removebg_preview_2.PNG?alt=media&token=9c7d01a7-18b0-4166-a281-00e4d48fe472"));
        DatabaseReference r5 = reference.child("Das5");
        r5.setValue(new CourseClass("Concentration and focus","It's no good just making the time to pursue your priorities. You have to use that time well, too. You have to be focused.\n" +
                "\n" +
                "\n","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/courses02%2Fconcentration_removebg_preview_2.PNG?alt=media&token=afa3af0d-cef0-45b5-a49a-98bcc28844bb"));




    }
}