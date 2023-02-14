# 远程RFID标签系统

该工程主要功能为标签管理。标签通过远程RFID接收器识别，定时采集发送到服务器，服务器对标签进行管理。

RFID接收器可以定时采集，获取标签距离信息，通过该信息，该系统理论可以实现功能：

* 物品管理：如教室公共设备的维护，防丢失，丢失报警功能。

技术点：
采用微服务架构，SpringCloud Alibaba+Nacos+SpringCloud Gateway+Sentinel

中间件：Redis，Mysql，ElasticSearch，xxjob，Rabbitmq

项目亮点：
* 使用Netty实现Mqtt协议服务器，实现和硬件通信
* xxjob分布式任务调度框架，实现分布式情况下的定时任务


*****
## 注
3个RFID接收器，就可以实现室内的精准定位，由于资金有钱，时间有限，该功能保留给更有创造力的各位大佬学弟学妹们。
室内进准定位，意味着你可以通过标签的移动和位置，应用在各种各样有趣的场景中。通过对室内布局的设计，你甚至可以记录一天内你在室内的活动轨迹。通过位置信息，提供更有趣的功能。
如久坐提醒，室内活动距离，打水次数等等等。
（一套下来的资金需求大概为500元，还是比较实惠的）
