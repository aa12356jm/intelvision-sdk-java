package cn.intelvision.response;

import cn.intelvision.model.Group;

/**
 * Created by pc on 2016/3/16.
 */
public class GroupSetInfoResponse extends ZenoResponse {
    private Group group;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}