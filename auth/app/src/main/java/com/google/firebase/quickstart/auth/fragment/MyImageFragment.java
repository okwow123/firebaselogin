package com.google.firebase.quickstart.auth.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class MyImageFragment extends PostListFragment {

    public MyImageFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // All my posts
        Query query=databaseReference.child("posts-image").child(getUid());
        return databaseReference.child("posts-image")
                .child(getUid());
    }
}
