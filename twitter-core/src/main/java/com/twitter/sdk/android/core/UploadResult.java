package com.twitter.sdk.android.core;

import com.google.gson.annotations.SerializedName;

public class UploadResult {

    @SerializedName("media_id")
    public long mediaId;
    @SerializedName("media_id_string")
    public String mediaIdString;
    public long size;
    public Image image;

    public class Image {

        public long w;
        public long h;
        @SerializedName("image_type")
        public String imageType;
    }
}
