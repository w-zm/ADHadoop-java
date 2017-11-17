package cn.edu.wzm;

import com.spotify.docker.client.DefaultDockerClient;
import com.spotify.docker.client.DockerClient;
import com.spotify.docker.client.exceptions.DockerException;
import com.spotify.docker.client.messages.Container;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/16.
 */
public class DockerClientRemote {
//    private List<DockerClient> dockerClientList = new ArrayList<DockerClient>();

    public static void main(String[] args) {
        final DockerClient docker = new DefaultDockerClient("http://192.168.152.164:2376");
        List<Container> containers = null;
        try {
            containers = docker.listContainers();
        } catch (DockerException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(containers.size());

//        try {
//            final List<Container> containers = docker.listContainers(DockerClient.ListContainersParam.allContainers());
//        } catch (DockerException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
