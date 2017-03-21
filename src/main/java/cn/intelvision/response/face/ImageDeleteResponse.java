package cn.intelvision.response.face;

import cn.intelvision.response.ZenoResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class ImageDeleteResponse extends ZenoResponse {

    private boolean success;
    private Integer deleted;

    public boolean isSuccess() {
        return success;
    }

    public Integer getDeleted() {
        return deleted;
    }

}
