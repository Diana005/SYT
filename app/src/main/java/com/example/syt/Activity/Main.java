package com.example.syt.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.syt.Activity.Courses.CoursesActivity;
import com.example.syt.Activity.Resources.Resources;
import com.example.syt.Class.CourseClass;
import com.example.syt.Class.ResourcesClass;
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
                " The priority matrix from the previous section also helps here: if you have a list of smaller, non-urgent but important tasks, you can always pick from them when you have a moment of spare time, but feel unable to do anything complex.\n","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/courses02%2Fdistributed_removebg_preview__1__21.PNG?alt=media&token=088ac19f-e719-4cc8-bdda-8c7f6b12130c"));
        DatabaseReference r3 = reference.child("Das3");
        r3.setValue(new CourseClass("Stick to a Schedule and Don’t Miss Deadlines"," Keith Wilcox, a researcher out of Columbia University, analyzed half a million tasks entered into a popular to-do list app to check the users’ behavior. He found that when they changed the deadline for a task, it took them an average of 16 more days to complete the task than when they kept the original deadline. Missing deadlines is not a once in a while occurrence either—users changed deadlines on 51% of tasks. Creating a schedule for your whole week, in turn, helps you save time you’d spend deciding what task to do next. It’s best to use a to-do list to schedule out everything we’re going to do each week (and day) into our calendar and then just let the calendar direct us.at you can make the most of your working hours.","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/courses02%2Fdeadline_removebg_preview_2.PNG?alt=media&token=785f2790-6a29-41ee-8640-f16e2f2dc4db"));
        DatabaseReference r4 = reference.child("Das4");
        r4.setValue(new CourseClass("Goal setting","The most successful \"time managers\" have clear targets to aim for. They develop SMART Goals, allowing them to allocate their time effectively.","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/courses02%2Fgoal_removebg_preview_2.PNG?alt=media&token=9c7d01a7-18b0-4166-a281-00e4d48fe472"));
        DatabaseReference r5 = reference.child("Das5");
        r5.setValue(new CourseClass("Concentration and focus","It's no good just making the time to pursue your priorities. You have to use that time well, too. You have to be focused.\n" +
                "\n" +
                "\n","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/courses02%2Fconcentration_removebg_preview_2.PNG?alt=media&token=afa3af0d-cef0-45b5-a49a-98bcc28844bb"));

        DatabaseReference reference_rec = FirebaseDatabase.getInstance().getReference("Resources");
        DatabaseReference res1 = reference_rec.child("Res1");
        res1.setValue(new ResourcesClass("Books",
                "https://www.amazon.co.uk/Time-Management-Book-Productivity-Effectivity-ebook/dp/B081Y5BYLX",
                "https://www.theexceptionalskills.com/best-time-management-books/",
                "https://www.linkedin.com/pulse/19-effective-time-management-books-you-should-read-2018-carey-bentley/",
                "https://www.theexceptionalskills.com/best-time-management-books/",
                "https://fivebooks.com/best-books/time-management-oliver-burkeman/",
                "https://www.amazon.in/Time-Management-Sudhir-Dixit/dp/938824110X",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Books%2Fbook1.jpg?alt=media&token=d82fadc3-f3af-4572-9618-69f5896824ca",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Books%2Fbook2.jpg?alt=media&token=f6f578ed-973e-45ec-9901-eaaec9045ba6",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Books%2Fbook3.jpg?alt=media&token=a1847b2a-a9b6-407c-9596-bc9173286070",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Books%2Fbook4.jpg?alt=media&token=6e7bf469-7332-42d8-a2ca-d8356cf61c14",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Books%2Fbook5.jpg?alt=media&token=2ca1bf2f-e11a-47bc-aa80-0b96db78aa60",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Books%2Fbook6.jpg?alt=media&token=54c8435c-7f91-486c-b35e-d72622ef796d"));


        DatabaseReference res2 = reference_rec.child("Res2");
        res2.setValue(new ResourcesClass("Articles",
                "https://hbr.org/2020/01/time-management-is-about-more-than-life-hacks",
                "https://www.wsj.com/articles/how-to-create-a-work-schedule-that-helps-you-succeed-11609265688",
                "https://mcgraw.princeton.edu/undergraduates/resources/resource-library/effective-time-management",
                "https://blog.proofhub.com/work-smarter-not-harder-9-time-management-tips-that-will-change-your-life-f2292f3d0044",
                "https://www.fastcompany.com/90357248/procrastination-is-an-emotional-problem",
                "https://www.proofhub.com/articles/time-management",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Articles%2Farticles1.png?alt=media&token=1d1dec1e-6d9f-4835-ae08-82ade3c492c7",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Articles%2Farticles2.png?alt=media&token=ff9a63fb-c7f1-43f9-81c3-1c80d2b0940d",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Articles%2Farticles3.png?alt=media&token=8428bf27-cbe0-4439-b967-5d018017974b",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Articles%2Farticles4.png?alt=media&token=18b78771-ddce-4860-8a50-0724cbc3a572",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Articles%2Farticles6.png?alt=media&token=29d278fd-e23f-44d1-9e69-f885457c5302",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Articles%2Farticles5.png?alt=media&token=671c613f-94ca-4839-8b70-b104a93f77c9"));
         DatabaseReference res3= reference_rec.child("Res3");
        res3.setValue(new ResourcesClass("Podcasts",
                "https://www.feedspot.com/infiniterss.php?_src=feed_title&followfeedid=5119389&q=site:https%3A%2F%2Fwww.podetize.com%2Ftake-back-time%2Ffeed",
                "https://www.feedspot.com/infiniterss.php?_src=feed_title&followfeedid=5119406&q=site:https%3A%2F%2Ffeeds.megaphone.fm%2FHSW9585037545",
                "https://www.feedspot.com/infiniterss.php?_src=feed_title&followfeedid=5119416&q=site:https%3A%2F%2Fcaptaintime.com%2Ffeed%2Fpodcast",
                "https://www.feedspot.com/infiniterss.php?_src=feed_title&followfeedid=5070017&q=site:https%3A%2F%2Fhelenesegura.libsyn.com%2Frss",
                "https://www.feedspot.com/infiniterss.php?_src=feed_title&followfeedid=5038741&q=site:https%3A%2F%2Ffeeds.transistor.fm%2Fthe-productivityist-podcast",
                "https://www.feedspot.com/infiniterss.php?_src=feed_title&followfeedid=5394465&q=site:https%3A%2F%2Fanchor.fm%2Fs%2F8373e6b8%2Fpodcast%2Frss",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Podcasts%2Fpodcasts1.png?alt=media&token=c8987bc0-5488-4560-a153-87f58e2f00bd",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Podcasts%2Fpodcasts2.png?alt=media&token=c494430d-e73f-4fa4-96b6-a039de3ad933",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Podcasts%2Fpodcast3.png?alt=media&token=0a23e9c5-cdea-478b-8e15-977f658a7fa7",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Podcasts%2Fpodcasts4.png?alt=media&token=6c9037b6-4c54-4d6f-8852-880e2ebcc8fd",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Podcasts%2Fpodcasts50.png?alt=media&token=39d1ba45-131b-42dd-8b4d-266cc5517538",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Podcasts%2Fpodcasts6.png?alt=media&token=cfe5c642-5f33-401e-9c9f-609a62fcac0f"));
        DatabaseReference res4= reference_rec.child("Res4");
        res4.setValue(new ResourcesClass("Tools",
                "https://www.nutcache.com/",
                "https://www.timecamp.com/",
                "https://www.replicon.com/",
                "https://toggl.com/",
                "https://www.getharvest.com/",
                "https://activecollab.com/",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Tools%2Ftool1.png?alt=media&token=11bd5130-8c19-4c88-8cc7-4aa9516604a2",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Tools%2Ftool2.png?alt=media&token=8b1c3609-aefb-49db-a156-2959874fbf09",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Tools%2Ftool3.png?alt=media&token=b9768d21-004e-41e0-a339-a27186f492be",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Tools%2Ftool4.png?alt=media&token=c91d1d26-28a1-44c4-afd9-fa7892140db4",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Tools%2Ftool5.png?alt=media&token=9c9c2903-ad8c-4bdb-9ff9-ecd8443961a4",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Tools%2Ftool6.png?alt=media&token=41bede72-36da-4aa6-94be-c39be116e94a"));
        DatabaseReference res5= reference_rec.child("Res5");
        res5.setValue(new ResourcesClass("Songs",
                "https://open.spotify.com/album/2JftMi4sAyPY2tqewM2gdG?si=WwYljoTMSbSiF9w0-TAlBA",
                "https://open.spotify.com/track/2Skgs772ea7l7YoGZKUPtt?si=cacd338d9bf844aa",
                "https://open.spotify.com/artist/1iE73mLMih4MkiPaQDXsjU?si=pZXuVdG1RaqgKi6f0NJclQ",
                "https://open.spotify.com/track/5QvQHLMHuZ80UdbsGkEZVQ?si=8f82ea6ac0424a8f",
                "https://open.spotify.com/album/213BFXr0N2hXiuE9kxZQgl?si=SElrUjwiR_WF5uMdm7wyNQ",
                "https://open.spotify.com/track/5nTs63Bs41ukvEskWzumaz?si=76aaaf2ecb3f45ad",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Songs%2Fsong1.png?alt=media&token=183dcdfd-78bc-4eb0-a023-9967c08e7c55",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Songs%2Fsong2.png?alt=media&token=35bfefc3-3753-42d9-b60c-6132acb2321d",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Songs%2Fsong3.png?alt=media&token=2fbaeb57-2911-49f5-8fa0-6b5987e12e8b",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Songs%2Fsong4.png?alt=media&token=f7013a09-13ae-4769-87d2-80a386a39ee3",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Songs%2Fsong5.png?alt=media&token=58ef6cb6-3a0a-4f7f-bfa0-e4b5acfac2fe",
                "https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Songs%2Fsong6.png?alt=media&token=39aedc72-7ec5-4331-8e64-7c10ceeafa7c"));



    }
}