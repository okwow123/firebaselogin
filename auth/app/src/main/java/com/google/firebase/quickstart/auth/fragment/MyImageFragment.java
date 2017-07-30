package com.google.firebase.quickstart.auth.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class MyImageFragment extends PostListFragment {

    public MyImageFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // All my posts
        return databaseReference.child("posts-image")
                .child(getUid());
    }
}
