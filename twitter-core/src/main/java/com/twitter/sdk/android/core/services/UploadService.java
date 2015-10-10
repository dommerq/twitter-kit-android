package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.UploadResult;

import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.mime.TypedFile;

public interface UploadService {
    @Multipart
    @POST("/1.1/media/upload.json")
    void upload(@Part("media") TypedFile media, Callback<UploadResult> callback);

    @Multipart
    @POST("/1.1/media/upload.json")
    void upload(@Part("media_data") String mediaData, Callback<UploadResult> callback);
}
