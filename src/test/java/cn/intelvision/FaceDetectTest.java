package cn.intelvision;

import cn.intelvision.model.Point;
import cn.intelvision.request.face.FaceDetectRequest;
import cn.intelvision.request.face.FaceLandmarkRequest;
import cn.intelvision.response.face.FaceDetectResponse;
import cn.intelvision.response.face.FaceLandmarkResponse;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.*;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author lan
 * @since 2016-03-14
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FaceDetectTest extends BaseTest {

    private static String faceId;

    @Test
    public void test1Detect() {
        FaceDetectRequest request = new FaceDetectRequest();
        String path = FaceDetectTest.class.getClassLoader().getResource(".").getPath();
        File file = new File(path, "jordan.jpg");
        assertTrue("image is not exists.", file.exists());
        request.setImg(file);
        String tag = "jordan";
        request.setTag(tag);
        FaceDetectResponse response = zenoClient.execute(request);
        assertNotNull(response.getImageId());
        assertEquals(16, response.getImageId().length());
        assertEquals(tag, response.getTag());
        assertNotNull(response.getFaces().get(0).getFaceId());
        assertEquals(16, response.getFaces().get(0).getFaceId().length());
        faceId = response.getFaces().get(0).getFaceId();
    }

    @Test
    public void test2Landmark() {
        FaceLandmarkRequest landmarkRequest = new FaceLandmarkRequest();
        landmarkRequest.setFaceId(faceId);
        FaceLandmarkResponse landmarkResponse = zenoClient.execute(landmarkRequest);
        List<Point> points = landmarkResponse.getPoints();
        assertEquals(7, points.size());
    }

    @Test
    public void test3Detect() {
        FaceDetectRequest request = new FaceDetectRequest();
        request.setUrl("https://www.intelvision.cn/img/demos/demo-03.jpg");
        String tag = "liusisi";
        request.setTag(tag);
        FaceDetectResponse response = zenoClient.execute(request);
        assertNotNull(response.getImageId());
        assertEquals(16, response.getImageId().length());
        assertEquals(tag, response.getTag());
        assertNotNull(response.getFaces().get(0).getFaceId());
        assertEquals(16, response.getFaces().get(0).getFaceId().length());
        faceId = response.getFaces().get(0).getFaceId();
    }

    @Test
    public void test4Detect() throws FileNotFoundException {
        FaceDetectRequest request = new FaceDetectRequest();
        String path = FaceDetectTest.class.getClassLoader().getResource(".").getPath();
        File file = new File(path, "jordan.jpg");
        assertTrue("image is not exists.", file.exists());
        request.setImg(new FileInputStream(file));
        String tag = "jordan";
        request.setTag(tag);
        FaceDetectResponse response = zenoClient.execute(request);
        assertNotNull(response.getImageId());
        assertEquals(16, response.getImageId().length());
        assertEquals(tag, response.getTag());
        assertNotNull(response.getFaces().get(0).getFaceId());
        assertEquals(16, response.getFaces().get(0).getFaceId().length());
        faceId = response.getFaces().get(0).getFaceId();
    }

    @Test
    public void test5Detect() throws Exception {
        FaceDetectRequest request = new FaceDetectRequest();
        String path = FaceDetectTest.class.getClassLoader().getResource(".").getPath();
        File file = new File(path, "jordan.jpg");
        assertTrue("image is not exists.", file.exists());
        request.setImg(input2byte(new FileInputStream(file)));
        String tag = "jordan";
        request.setTag(tag);
        FaceDetectResponse response = zenoClient.execute(request);
        assertNotNull(response.getImageId());
        assertEquals(16, response.getImageId().length());
        assertEquals(tag, response.getTag());
        assertNotNull(response.getFaces().get(0).getFaceId());
        assertEquals(16, response.getFaces().get(0).getFaceId().length());
        faceId = response.getFaces().get(0).getFaceId();
    }

    private static byte[] input2byte(InputStream inStream) throws IOException {
        if (inStream == null) {
            return new byte[0];
        }
        ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
        byte[] buff = new byte[8192];
        int rc;
        while ((rc = inStream.read(buff, 0, 8192)) > 0) {
            swapStream.write(buff, 0, rc);
        }
        return swapStream.toByteArray();
    }
}
