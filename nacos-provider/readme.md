# 使用curl增加配置参数
```shell script
# 注意下面的dataId=nacos-demo 默认就是 spring.application.name 中的值
curl -X POST "http://127.0.0.1:8848/nacos/v1/cs/configs?dataId=nacos-demo.properties&group=DEFAULT_GROUP&content=useLocalCache=true"
```