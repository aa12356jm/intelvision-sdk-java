package cn.intelvision.response.face;

import cn.intelvision.response.ZenoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class InfoGetAppResponse extends ZenoResponse {

    private String name;
    private String description;

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

}
