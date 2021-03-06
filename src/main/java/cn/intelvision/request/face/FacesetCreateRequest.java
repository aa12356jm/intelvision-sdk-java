package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.FacesetCreateResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class FacesetCreateRequest extends ZenoRequest<FacesetCreateResponse> {

    @Param(name = "faceset_name")
    private String facesetName;

    @Param(name = "tag")
    private String tag;

    public void setFacesetName(String facesetName) {
        this.facesetName = facesetName;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getApi() {
        return "/v2/faceset/create";
    }
}
