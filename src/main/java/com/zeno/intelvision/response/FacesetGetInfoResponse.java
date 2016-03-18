package com.zeno.intelvision.response;

import com.zeno.intelvision.model.Faceset;

/**
 * Created by pc on 2016/3/16.
 */
public class FacesetGetInfoResponse extends ZenoResponse {
    private Faceset faceset;

    public Faceset getFaceset() {
        return faceset;
    }

    public void setFaceset(Faceset faceset) {
        this.faceset = faceset;
    }
}
