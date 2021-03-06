package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.GroupCreateResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class GroupCreateRequest extends ZenoRequest<GroupCreateResponse> {

    @Param(name = "group_name")
    private String groupName;

    @Param(name = "tag")
    private String tag;

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getApi() {
        return "/v2/group/create";
    }
}
