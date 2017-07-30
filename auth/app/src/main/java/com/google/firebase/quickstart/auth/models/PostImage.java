package com.google.firebase.quickstart.auth.models;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

// [START post_class]
@IgnoreExtraProperties
public class PostImage {

    public String uid;
    public String author;
    public String title;
    public String body;
    public String etc;
    public String imageURL;
    public int starCount = 0;
    public Map<String, Boolean> stars = new HashMap<>();

    public PostImage() {
        // Default constructor required for calls to DataSnapshot.getValue(Post.class)
    }

    public PostImage(String uid, String author, String title, String body, String etc, String imageURL ) {
        this.uid = uid;
        this.author = author;
        this.title = title;
        this.body = body;
        this.etc = etc;
        this.imageURL=imageURL;
    }

/*
    public String getImageUrl() {
        return imageURL;
    }

    public void setImageUrl(String imageUrl) {
        this.imageURL = imageUrl;
    }
*/

    // [START post_to_map]
    @Exclude
    public Map<String, Object> toMapImage() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("author", author);
        result.put("title", title);
        result.put("body", body);
        result.put("starCount", starCount);
        result.put("stars", stars);
        result.put("etc", etc);
        result.put("imageURL",imageURL);

        return result;
    }
    // [END post_to_map]

}
// [END post_class]
