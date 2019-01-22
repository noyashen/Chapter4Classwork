package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {

    // TODO-C1 (1) Implement your Cat Bean here according to the response json
    @SerializedName("id") private String id;
    @SerializedName("url") private String url;
    @SerializedName("breeds") private List<String> breeds;

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public List<String> getBreeds() {
        return breeds;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setBreeds(List<String> breeds) {
        this.breeds = breeds;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", breeds=" + breeds +
                '}';
    }


}
