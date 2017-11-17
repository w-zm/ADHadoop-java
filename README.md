# ADHadoop-java
1. 通过java实现远程主机的hadoop集群的动态增加和删除节点；
2. hadoop运行在docker容器中；
3. 容器中的文件可以通过`docker inspect`命令获取到里面的"MergedDir"路径，通过此路径即可访问到docker容器里面的文件。

## 依赖库
- [jcsh](https://github.com/is/jsch)
- [docker-client](https://github.com/spotify/docker-client)

## 进展
1. 目前只完成了使用jcsh库对远程主机上的操控；
2. ......

## 工作
1. 完成对hadoop容器的部署；
2. 完成对hadoop集群的动态添加；
3. 完成对hadoop集群的动态删除。
