# Locker

## 开发环境
 - JDK1.8+
 
## 业务需求

需求描述：作为一个初级储物柜机器人，我能够按储物柜的顺序来存包，也能取包
[locker](./locker.png)

评分标准：参考Classroom中的评分标准Excel文档

### 需求澄清总结：
1. PrimaryLockerRobot存包是按照locker顺序存包
2. PrimaryLockerRobot在某个Locker内存包的位置是随机的
3. 报错信息和Locker是一致的
4. PrimaryLockerRobot至少管理一个Locker
5. PrimaryLockerRobot会回收取过包的票据
6. Locker的容量不会为0
7. 不要脑补需求，及时和PO确认
8. 不考虑并发
