package com.zeno.intelvision.response;

import com.zeno.intelvision.model.Face;

import java.util.List;

/**
 * Created by pc on 2016/3/16.
 */
public class ImageFacesResponse extends ZenoResponse {
    private List<Face> faces;

    public List<Face> getFaces() {
        return faces;
    }

    public void setFaces(List<Face> faces) {
        this.faces = faces;
    }
}
