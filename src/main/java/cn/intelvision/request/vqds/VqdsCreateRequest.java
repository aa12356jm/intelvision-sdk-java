package cn.intelvision.request.vqds;

import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vqds.VqdsCreateResponse;
import cn.intelvision.annotation.Param;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsCreateRequest extends ZenoRequest<VqdsCreateResponse> {

    @Param(name = "name")
    private String name;

    @Param(name = "tag")
    private String tag;

    @Param(name = "image_ids")
    private String imageIds;

    public void setName(String name) {
        this.name = name;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setImageIds(String imageIds) {
        this.imageIds = imageIds;
    }

    @Override
    public String getApi() {
        return "/vqds/create";
    }
}
