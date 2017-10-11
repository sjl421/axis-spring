该工程是使用Spring 和axis2 发布webservice 的一个简单实例

以下几点需要注意: 
	以下提出的工程结构目录是固定的,不能修改 WEB-INF/services/SimpleService/META-INF/services.xml 其中除了axis 这个文件夹的名字可以改以外,其他的都不能改
	生成客户端的访问路径为http://ip:port/services/xxx?wsdl
	整合注意两点:
	1在spring中将需要发布的类 注入到spring容器中
	2在services.xml 中去应用bean
