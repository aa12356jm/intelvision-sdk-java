package cn.intelvision.response;

import cn.intelvision.model.Faceset;

import java.util.List;

/**
 * Created by pc on 2016/3/15.
 */
public class FaceGetFacesetResponse extends ZenoResponse{
    private List<Faceset> facesets;

    public List<Faceset> getFacesets() {
        return facesets;
    }

    public void setFacesets(List<Faceset> facesets) {
        this.facesets = facesets;
    }
}