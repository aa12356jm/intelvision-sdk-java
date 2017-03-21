package cn.intelvision.response.face;

import cn.intelvision.model.Faceset;
import cn.intelvision.response.ZenoResponse;

import java.util.List;

/**
 * Created by pc on 2016/3/16.
 */
public class InfoGetFacesetListResponse extends ZenoResponse {

    private List<Faceset> facesets;

    public List<Faceset> getFacesets() {
        return facesets;
    }

}
