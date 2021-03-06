package cn.intelvision.request.vqds;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vqds.VqdsAddImageResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsAddImageRequest extends ZenoRequest<VqdsAddImageResponse> {

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
        return "/vqds/add_image";
    }
}
