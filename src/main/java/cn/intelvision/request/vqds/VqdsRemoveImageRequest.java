package cn.intelvision.request.vqds;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vqds.VqdsRemoveImageResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsRemoveImageRequest extends ZenoRequest<VqdsRemoveImageResponse> {

    @Param(name = "name")
    private String vqdsName;

    @Param(name = "vqds_id")
    private String vqdsId;

    @Param(name = "image_ids")
    private String imageIds;

    public void setVqdsName(String vqdsName) {
        this.vqdsName = vqdsName;
    }

    public void setVqdsId(String vqdsId) {
        this.vqdsId = vqdsId;
    }

    public void setImageIds(String imageIds) {
        this.imageIds = imageIds;
    }

    @Override
    public String getApi() {
        return "/vqds/remove_image";
    }
}
