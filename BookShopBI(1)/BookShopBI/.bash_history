#1593489736
cat /etc/hostname
#1593489781
ssh root@ecs-hadoop-slave1
#1593489919
ping 192.168.0.181
#1593489946
cd /etc/cloud/cloud.cfg
#1593489952
vim /etc/cloud/cloud.cfg
#1593490021
cat /etc/hosts
#1593490029
ssh root@ecs-hadoop-slave1
#1593490451
cat /etc/hosts
#1593490464
vim /etc/hosts
#1593490473
ssh root@ecs-hadoop-slave1
#1593488000
cat /etc/hostname
#1593488179
# managet_etc_hosts: localhost
#1593488196
managet_etc_hosts: localhost
#1593488219
vi /etc/cloud/cloud.cfg
#1593488377
vim /etc/hosts
#1593488734
ping 192.168.0.120
#1593488882
ping 192.168.0.185
#1593488923
vim /etc/hosts
#1593488980
ping 192.168.0.185
#1593489266
vim /etc/hosts
#1593489729
ping
#1593489736
 ping 192.168.0.120
#1593489742
 ping 192.168.0.185
#1593489781
vim /etc/hosts
#1593492406
exit
#1593491379
# rm -rf ~/.ssh/known_hos
#1593491384
# rm -rf ~/.ssh/known_hosts
#1593491394
cd  ~/.ssh/known_hosts
#1593491406
cd /.ssh/known_hosts
#1593491411
ls
#1593492054
ping 192.168.0.120
#1593492060
ping 192.168.0.185
#1593492139
ssh-keygen -t rsa -b 2048
#1593492167
cd .ssh
#1593492169
ls
#1593492228
cd ..
#1593492318
ssh-copy-id root@ecs-hadoop-master
#1593492402
ssh root@ecs-hadoop-master
#1593492414
ssh root@ecs-hadoop-slave1
#1593492585
exit
#1593492700
ping
#1593492706
ping 192.168.0.120
#1593492711
ping 192.168.0.185
#1593492724
ssh-copy-id root@ecs-hadoop-slave1
#1593492736
ssh-copy-id root@ecs-hadoop-slave2
#1593492760
ssh root@ecs-hadoop-master
#1593492772
ssh root@ecs-hadoop-slave1
#1593492781
ssh root@ecs-hadoop-slave2
#1593492812
yum install -y java-1.8.0-openjdk-devel
#1593492925
vim /etc/profile
#1593493033
source /etc/profile
#1593493125
ls
#1593493274
cd /home
#1593493274
mkdir hadoop
#1593493281
ls
#1593493349
cd hadoop
#1593493351
ls
#1593493370
wget http://124.70.73.94/compile/centos7/aarch64/hadoop/hadoop-3.1.3.tar.gz
#1593493401
ls
#1593493411
tar -zxvf hadoop-3.1.3.tar.gz
#1593493414
cd hadoop-3.1.3
#1593493427
mkdir tmp
#1593493427
mkdir -p dfs/data
#1593493428
mkdir -p dfs/name
#1593493430
ls
#1593493446
cd dfs
#1593493448
ls
#1593493450
cd..
#1593493452
cd ..
#1593493473
vim /etc/profile
#1593493574
ls
#1593493591
vim /etc/profile
#1593493607
source /etc/profile
#1593493680
cd /home/hadoop/hadoop-3.1.3
#1593493697
cd /etc/hadoop/
#1593493701
cd etv
#1593493706
cd etc
#1593493711
cd hadoop
#1593493738
vi core-site.xml
#1593493892
cd /home/hadoop/hadoop-3.1.3/etc/hadoop/
#1593493904
vi core-site.xml
#1593493963
vihdfs-site.xml
#1593493973
vi hdfs-site.xml
#1593494137
vi mapred-site.xml
#1593494253
vi yarn-site.xml
#1593494421
vi hadoop-env.s
#1593494440
vi hadoop-env.sh
#1593494530
vi mapred-site.xml
#1593494553
vi hadoop-env.sh
#1593494707
vim workers
#1593494826
vim masters
#1593494922
rm master
#1593494929
rm masters
#1593494935
ls
#1593494946
vim masters
#1593495016
rm masters
#1593495030
vim masters
#1593495069
cd /home/hadoop/hadoop-3.1.3/sbin
#1593495099
vi start-dfs.sh
#1593495202
vi stop-dfs.sh
#1593495241
vi start-yarn.sh
#1593495285
vi stop-yarn.sh
#1593495325
scp -r /home/hadoop/ root@ecs-hadoop-slave1:/home
#1593495341
scp -r /home/hadoop/ root@ecs-hadoop-slave2:/home
#1593495383
hdfs namenode -format
#1593495494
ls
#1593495549
start-dfs.sh
#1593495601
cd /home/hadoop/hadoop-3.1.3/etc/hadoop/
#1593495608
vim hadoop-env.sh
#1593495684
cd /home/hadoop/hadoop-3.1.3/sbin
#1593495702
start-dfs.sh
#1593495875
scp -r /home/hadoop/ root@ecs-hadoop-slave1:/home
#1593495881
scp -r /home/hadoop/ root@ecs-hadoop-slave2:/home
#1593495905
hdfs namenode -format
#1593495915
start-dfs.sh
#1593495935
start-yarn.sh
#1593495959
jsp
#1593495978
jsp master
#1593496023
jps
#1593496044
Jps
#1593496068
ls
#1593496081
Jps master
#1593496089
jps master
#1593496142
jps datanode
#1593496181
start-yarn.sh
#1593496188
jps
#1593496392
ls
#1593496397
cd ..
#1593496399
ls
#1593496408
rm -rf tmp
#1593496410
ls
#1593496463
cd  sbin
#1593496474
hdfs namenode -format
#1593496485
start-dfs.sh
#1593496499
start-yarn.sh
#1593496537
jps
#1593496617
stop-all.sh
#1593496631
cd ..
#1593496633
ls
#1593496671
cd  sbin
#1593496672
ls
#1593496687
start-dfs.sh
#1593496705
start-yarn.sh
#1593496713
jps
#1593496743
ls
#1593496747
csd ..
#1593496750
cd ..
#1593496751
ls
#1593496865
cd tem
#1593496869
cd tmp
#1593496870
ls
#1593496971
cd dfs
#1593496973
ls
#1593496977
cd ..
#1593496979
cd..
#1593496981
cd ..
#1593496988
cd dfs
#1593496990
ls
#1593496999
cd data
#1593497001
ls
#1593497009
cd ..
#1593497012
cd name
#1593497013
ls
#1593497039
cd ..
#1593497045
cd tmp
#1593497049
ls
#1593497052
cd dfsa
#1593497055
cd dfs
#1593497057
ls
#1593497065
cd namesecondary
#1593497067
ls
#1593497198
cd.
#1593497200
cd ..
#1593497208
cd sbin
#1593497241
stop-all.sh
#1593497371
cd ..
#1593497379
rm -rf tmp
#1593497382
cd sbin
#1593497404
hdfs namenode -format
#1593497436
start-dfs.sh
#1593497455
start-yarn.sh
#1593497467
cd ..
#1593497469
ls
#1593497476
rtttttttmp
#1593497479
cd tmp
#1593497481
ls
#1593497485
cd ..
#1593497488
jps
#1593498029
stop-all.sh
#1593498084
ls
#1593498314
rm -rf logs
#1593498318
rm -rf tmp
#1593498331
mkdir tmp
#1593498338
mkdir logs
#1593498343
hdfs namenode -format
#1593498478
start-all.sh
#1593498670
jps
#1593498724
cd /etc/cloud/cloud.cfg
#1593498730
cd ..
#1593498753
cd  ~
#1593498761
/etc/cloud/cloud.cfg
#1593498767
cd /etc/cloud/cloud.cfg
#1593498773
ls
#1593498811
vim /etc/profile
#1593498846
cd /home
#1593498862
cd hadoop
#1593498864
ls
#1593498872
cd hadoop-3.1.3
#1593498894
vi core-site.xml
#1593498927
cd /etc/hadoop
#1593498949
cd etc/hadoop
#1593498964
vi core-site.xml
#1593499057
vi hdfs-site.xml
#1593499101
vi mapred-site.xml
#1593499285
vi yarn-site.xml
#1593499354
vi mapred-site.xml
#1593499374
vi yarn-site.xml
#1593499436
vi hadoop-env.sh
#1593499507
cd /home/hadoop/hadoop-3.1.3/etc/hadoop/
#1593499516
vim workers
#1593499531
vim masters
#1593499561
cd /home/hadoop/hadoop-3.1.3/sbin
#1593499577
vi start-dfs.sh
#1593499615
vi stop-dfs.sh
#1593499634
vi start-yarn.sh
#1593499648
vi stop-yarn.sh
#1593499674
scp -r /home/hadoop/ root@ecs-hadoop-slave1:/home
#1593499680
scp -r /home/hadoop/ root@ecs-hadoop-slave2:/home
#1593499742
start-all.sh
#1593499755
jps
#1593499836
cd ..
#1593499841
cd ...
#1593499843
cd ..
#1593499850
ls
#1593499860
cd ~
#1593499861
ls
#1593499872
cd /
#1593499883
rm -rf home
#1593499885
ls
#1593500006
yum install -y java-1.8.0-openjdk-devel
#1593500017
cd /home
#1593500017
mkdir hadoop
#1593500037
cd /home/hadoop
#1593500042
cd home
#1593500045
ls
#1593500067
mekir home
#1593500074
mkdir home
#1593500075
ls
#1593500100
cd /home
#1593500101
mkdir hadoop
#1593500108
cd hadoop
#1593500143
wget http://124.70.73.94/compile/centos7/aarch64/hadoop/hadoop-3.1.3.tar.gz
#1593500235
tar -zxvf hadoop-3.1.3.tar.gz
#1593500238
cd hadoop-3.1.3
#1593500302
mkdir tmp
#1593500302
mkdir -p dfs/data
#1593500303
mkdir -p dfs/name
#1593500317
vim /etc/profile
#1593500345
source /etc/profile
#1593500374
cd /home/hadoop/hadoop-3.1.3
#1593500387
vim core-site.xml
#1593500408
ls
#1593500418
rm core-site.xml
#1593500426
/home/hadoop/hadoop-3.1.3/etc/hadoop/
#1593500436
cd /home/hadoop/hadoop-3.1.3/etc/hadoop/
#1593500452
vim core-site.xml
#1593500490
vim hdfs-site.xml
#1593500541
vim mapred-site.xml
#1593500648
vim yarn-site.xml
#1593500759
vi yarn-site.xml
#1593500777
vim hadoop-env.sh
#1593500809
vim workers
#1593500847
vim masters
#1593500949
cd /home/hadoop/hadoop-3.1.3/sbin
#1593500962
vim start-dfs.sh
#1593500995
vim stop-dfs.sh
#1593501023
vim start-yarn.sh
#1593501060
vim stop-yarn.sh
#1593501086
scp -r /home/hadoop/ root@ecs-hadoop-slave1:/home
#1593501093
scp -r /home/hadoop/ root@ecs-hadoop-slave2:/home
#1593501142
hdfs namenode -format
#1593501171
cd ..
#1593501173
ls
#1593501184
hdfs namenode -format
#1593501226
stop-all.sh
#1593501252
hdfs namenode -format
#1593501310
cd /home/hadoop/hadoop-3.1.3/etc/hadoop/
#1593501322
vim yarn-site.xml
#1593501362
cd /home/hadoop/hadoop-3.1.3/sbin
#1593501371
hdfs namenode -format
#1593501385
start-all.sh
#1593501410
jsp
#1593501412
jps
#1593501685
stop-all.sh
#1593501753
cd ..
#1593501761
rm -rf hadoop
#1593501788
cd /home
#1593501788
mkdir hadoop
#1593501799
cd hadoop
#1593501821
wget http://124.70.73.94/compile/centos7/aarch64/hadoop/hadoop-3.1.3.tar.gz
#1593501883
tar -zxvf hadoop-3.1.3.tar.gz
#1593501886
cd hadoop-3.1.3
#1593501896
mkdir tmp
#1593501897
mkdir -p dfs/data
#1593501897
mkdir -p dfs/name
#1593501909
vim mkdir tmp
#1593501920
ls
#1593501937
vim /etc/profile
#1593502008
source /etc/profile
#1593502016
cd /home/hadoop/hadoop-3.1.3
#1593502044
vim /home/hadoop/hadoop-3.1.3/etc/hadoop/]
#1593502051
ls
#1593502068
cd /home/hadoop/hadoop-3.1.3/etc/hadoop/
#1593502083
vim core-site.xml
#1593502176
vim hdfs-site.xml
#1593502215
vim mapred-site.xml
#1593502255
vim yarn-site.xml
#1593502365
vim hadoop-env.sh
#1593502406
vim workers
#1593502441
vim masters
#1593502485
rm asters
#1593502491
rm masters
#1593502503
vim masters
#1593502537
cd /home/hadoop/hadoop-3.1.3/sbin
#1593502548
vim start-dfs.sh
#1593502579
vim stop-dfs.sh
#1593502610
vim start-yarn.sh
#1593502636
stop-yarn.sh
#1593502653
vim stop-yarn.sh
#1593502712
vim start-yarn.sh
#1593502739
scp -r /home/hadoop/ root@ecs-hadoop-slave1:/home
#1593502746
scp -r /home/hadoop/ root@ecs-hadoop-slave2:/home
#1593502772
cd ..
#1593502778
hdfs namenode -format
#1593502793
start-all.sh
#1593502826
ls
#1593502845
cd sbin
#1593502846
ls
#1593502855
yes
#1593502868
jps
#1593503263
cd /home/hadoop/hadoop-3.1.3/sbin
#1593503348
stop-all.sh
#1593503451
/home/hadoop/hadoop-3.1.3/sbin
#1593503460
cd /home/hadoop/hadoop-3.1.3/sbin
#1593503472
start-all.sh
#1593503875
cd ..
#1593503885
cd ~
#1593503887
ls
#1593509667
vim ~/nohup.out
#1593509792
ps
#1593509800
ps -aux
#1593509814
ps -aux | vim
#1593509832
ps -aux | nohup.out
#1593509845
ps -aux |grep  nohup.out
#1593509875
kill -9 3589 3879 4113
#1593509877
ps -aux |grep  nohup.out
#1593509883
vim ~/nohup.out
#1593509941
cd ~
#1593509946
nohup hive --service metastore &
#1593509966
hive
#1593510040
cd /home/hive/apache-hive-3.1.2-bin/conf
#1593510050
ls
#1593510060
vim hive-site.xml
#1593510137
vim hive-env.sh
#1593510164
cd /home/hive/apache-hive-3.1.2-bin
#1593510165
ls
#1593510174
cd iom
#1593510178
cd iotmp/
#1593510179
ls
#1593510182
cd ..
#1593510191
ls
#1593510200
cd /home/hive/apache-hive-3.1.2-bin/bin
#1593510201
ls
#1593510216
vim hive-config.sh 
#1593510391
jps
#1593510403
stop-all
#1593510406
stop-all.sh
#1593510452
start-all.sh
#1593510476
jps
#1593510503
ps -aux | grep RunJar
#1593510523
kill -9 3739 4151
#1593510525
jps
#1593510539
cd ~
#1593510545
nohup hive --service metastore &
#1593510550
hive
#1593510734
systemctl enable mariadb
#1593510745
systemctl start mariadb
#1593510749
hive
#1593507687
vim /home/hive/apache-hive-3.1.2-bin/conf
#1593507733
cd /home/hive/apache-hive-3.1.2-bin/conf
#1593507748
vim hive-site.xml
#1593507781
ssh root@ecs-hadoop-slave2
#1593507987
cd /home/hive
#1593507988
tar -zcvf apache-hive-3.1.2-bin.tar.gz ./apache-hive-3.1.2-bin/
#1593508003
scp apache-hive-3.1.2-bin.tar.gz root@ecs-hadoop-slave2:/root/
#1593508005
rm -rf apache-hive-3.1.2-bin.tar.gz
#1593508014
ssh root@ecs-hadoop-slave2
#1593508194
/home/hive/apache-hive-3.1.2-bin/bin
#1593508203
cd /home/hive/apache-hive-3.1.2-bin/bin
#1593508205
ls
#1593508223
start-all.sh
#1593508259
cd ..
#1593508274
schematool -initSchema -dbType mysql
#1593508303
cd ~
#1593508304
nohup hive --service metastore &
#1593508399
cd ~/nohup.out
#1593508416
ls
#1593508437
vim nohup.out
#1593509022
ps -aux | grep hive
#1593509037
kill -9 3313
#1593509209
nohup hive --service metastore
#1593509254
ps -aux | grep hive
#1593509265
kill -9 3452
#1593509271
nohup hive --service metastore &
#1593509278
12222
#1593509300
ls
#1593509312
nohup.out
#1593509323
vim nohup.out
#1593509365
$ hive
#1593509456
hibe
#1593509458
hive
#1593509539
nohup.out
#1593509543
hive
#1593509562
vim nohup.out
#1593510877
hive
#1593503949
yum install -y mariadb-server
#1593504010
vim /etc/my.cnf
#1593504223
systemctl enable mariadb
#1593504223
emctl start mariadb
#1593504238
systemctl enable mariadb
#1593504246
systemctl start mariadb
#1593504297
mysql_secure_installation
#1593504448
mysqladmin -u root -p version
#1593504929
cd /home
#1593504929
mkdir hive
#1593504936
cd hive
#1593505053
wget http://124.70.73.94/compile/centos7/aarch64/hive/
#1593505072
ls
#1593505109
wget
#1593505112
http://124.70.73.94/compile/centos7/aarch64/hive/
#1593505124
ls
#1593505139
rm index.html
#1593505242
wget http://124.70.73.94/compile/centos7/aarch64/hive/apache-hive-3.1.2-bin.tar.gz
#1593505292
tar -zxvf apache-hive-3.1.2-bin.tar.gz
#1593505375
mysql -u root -p
#1593505428
vim /etc/profile
#1593505465
source /etc/profile
#1593505576
cd ~
#1593505578
wget https://cdn.mysql.com/archives/mysql-connector-java-5.1/mysql-connector-java-5.1.48.tar.gz
#1593505581
tar zxvf mysql-connector-java-5.1.48.tar.gz
#1593505581
cd mysql-connector-java-5.1.48
#1593505581
cp mysql-connector-java-5.1.48-bin.jar /home/hive/apache-hive-3.1.2-bin/lib
#1593505581
cd ~
#1593505604
cd /home/hive/ apache-hive-3.1.2-bin/lib
#1593505610
ls
#1593505627
cd apache-hive-3.1.2-bin/lib
#1593505629
ls
#1593505666
cd ~
#1593505798
cd /home/hive/apache-hive-3.1.2-bin/conf
#1593505799
cp hive-env.sh.template hive-env.sh
#1593505800
cp hive-default.xml.template hive-site.xml
#1593505825
vim hive-env.sh
#1593505918
vim hive-site.xml
#1593507022
cd /home/hive/apache-hive-3.1.2-bin
#1593507022
mkdir iotmp
#1593507031
ls
#1593507055
cd /home/hive/apache-hive-3.1.2-bin/bin
#1593507062
ls
#1593507076
vim hive-config.sh
#1593507120
rm /home/hive/apache-hive-3.1.2-bin/lib/guava-19.0.jar
#1593507123
cp guava-27.0-jre.jar /home/hive/apache-hive-3.1.2-bin/lib/
#1593507154
rm /home/hive/apache-hive-3.1.2-bin/lib/guava-19.0.jar
#1593507167
cd /home/hadoop/hadoop-3.1.3/share/hadoop/hdfs/lib/
#1593507182
cp guava-27.0-jre.jar/home/hive/apache-hive-3.1.2-bin/lib/
#1593507215
cp guava-27.0-jre.jar /home/hive/apache-hive-3.1.2-bin/lib/
#1593507230
ls
#1593507352
cd /home/hive
#1593507364
tar -zcvf apache-hive-3.1.2-bin.tar.gz ./apache-hive-3.1.2-bin/
#1593507391
scp apache-hive-3.1.2-bin.tar.gz root@ecs-hadoop-slave1:/root/
#1593507403
rm -rf apache-hive-3.1.2-bin.tar.gz
#1593507418
ssh root@ecs-hadoop-slave1
#1593511588
cd ~
#1593511588
nohup hive --service metastore &
#1593511601
hive
#1593512662
cd ~
#1593512663
nohup hive --service metastore &
#1593512677
hive
#1593512703
ps -aux | grep hive
#1593512725
kill -9 1829
#1593512731
kill -9 2081
#1593512747
cd ~
#1593512748
nohup hive --service metastore &
#1593512765
hive
#1593512781
ps -aux | grep hive
#1593512804
kill -9 2335
#1593512810
hive
#1593512863
jps
#1593512909
ps -aux | grep hive
#1593512923
kill -9 2082
#1593512927
hiven
#1593512973
kill Rundar
#1593512983
kill RunJar
#1593513110
start-all.sh
#1593513130
jps
#1593513147
ps -aux | grep hive
#1593513164
nohup hive --service metastore &
#1593513193
hive
#1593513326
ps -aux | grep hive
#1593513355
kill -9 3537
#1593513491
start all.sh
#1593513547
start-all.sh
#1593513705
cd ~
#1593513706
nohup hive --service metastore &
#1593513714
hive
#1593513772
ps -aux | grep hive
#1593513795
kill -9 2893
#1593513800
hive
#1593513815
ps -aux | grep hive
#1593513826
jps
#1593513852
nohup hive --service metastore &
#1593513910
hive
#1593514155
JPS
#1593514157
jps
#1593514176
start-all.sh
#1593514215
nohup hive --service metastore &
#1593514229
ps -aux | grep hive
#1593514236
hive
#1593596380
exit
#1593596497
exitssh root@ecs-hadoop-slave1
#1593596497
exit
#1593573471
start_all.sh
#1593573479
start-all.sh
#1593573524
nohup hive --service metastore &
#1593573544
hive
#1593573563
jps
#1593573755
wget http://124.70.73.94/compile/centos7/aarch64/sqoop/sqoop-1.4.7-cdh6.3.2.tar.gz
#1593573800
ls
#1593573818
rm sqoop-1.4.7-cdh6.3.2.tar.gz
#1593573828
cd /home
#1593573828
mkdir sqoop
#1593573836
cd sqoop
#1593573866
wget http://124.70.73.94/compile/centos7/aarch64/sqoop/sqoop-1.4.7-cdh6.3.2.tar.gz
#1593573880
tar -zxvf sqoop-1.4.7-cdh6.3.2.tar.gz
#1593573899
cd ~
#1593573901
wget https://cdn.mysql.com/archives/mysql-connector-java-5.1/mysql-connector-java-5.1.48.tar.gz
#1593573904
tar zxvf mysql-connector-java-5.1.48.tar.gz
#1593573904
cd mysql-connector-java-5.1.48
#1593573904
cp mysql-connector-java-5.1.48-bin.jar /home/sqoop/sqoop-1.4.7-cdh6.3.2/lib
#1593573905
cd ~
#1593573917
wget http://www.java2s.com/Code/JarDownload/java-json/java-json.jar.zip
#1593573923
unzip java-json.jar.zip
#1593573923
cp java-json.jar /home/sqoop/sqoop-1.4.7-cdh6.3.2/lib/
#1593573923
cd ~
#1593573933
vim /etc/profile
#1593573959
source /etc/profile
#1593573988
cd /home/sqoop/sqoop-1.4.7-cdh6.3.2/conf
#1593573988
cp sqoop-env-template.sh sqoop-env.sh
#1593574003
cd /home/sqoop/sqoop-1.4.7-cdh6.3.2/conf
#1593574014
vi sqoop-env.sh
#1593574085
mysql -u root -p
#1593574135
mysql -u sqoop -p
#1593574145
show databases;
#1593574154
mysql -u sqoop -p
#1593574400
sqoop import --connect jdbc:mysql://ecs-hadoop-master:3306/sqooptest --username sqoop --password sqooppwd --table student -m 1 --target-dir /user/sqooptest/input/student/
#1593574435
hadoop fs -cat /user/sqooptest/input/student/*
#1593574514
hadoop fs -mkdir -p /user/sqooptest/output/
#1593574516
hadoop fs -touchz /user/sqooptest/output/student.txt
#1593574518
echo "null,liuyi,0,4,2016-01-01 12:12:12.0" | hadoop fs -appendToFile - /user/sqooptest/output/student.txt
#1593574520
echo "null,chener,0,3,2017-01-01 12:12:12.0" | hadoop fs -appendToFile - /user/sqooptest/output/student.txt
#1593574522
hadoop fs -cat /user/sqooptest/output/student.txt
#1593574550
sqoop export --connect jdbc:mysql://ecs-hadoop-master:3306/sqooptest --username sqoop --password sqooppwd --table student -m 1 --export-dir /user/sqooptest/output/
#1593574581
mysql -u sqoop -p
#1593575066
cd ~
#1593595983
vim /etc/hosts
#1593596275
ssh root@ecs-hadoop-master
#1593596287
ssh root@ecs-hadoop-slave1
#1593596307
ssh root@ecs-hadoop-slave2
#1593596615
yum install -y java-1.8.0-openjdk-devel
#1593596916
start-all.sh
#1593596959
jps
#1593597703
systemctl start mariadb
#1593597777
mysqladmin -u root -p version
#1593597962
/home/hive
#1593597968
cd /home/hive
#1593597970
ls
#1593598332
cd ~
#1593598332
nohup hive --service metastore &
#1593598349
ps -aux | grep hive
#1593598404
hive
#1593598851
cd /home/sqoop
#1593598853
ls
#1593598984
mysql -u sqoop -p
#1593599195
sqoop import --connect jdbc:mysql://ecs-hadoop-master:3306/sqooptest --username sqoop --password sqooppwd --table student -m 1 --target-dir /user/sqooptest/input/student/
#1593599215
hadoop fs -cat /user/sqooptest/input/student/*
#1593599288
sqoop import --connect jdbc:mysql://ecs-hadoop-master:3306/sqooptest --username sqoop --password sqooppwd --table student -m 1 --target-dir /user/sqooptest/input/student/
#1593599310
hadoop fs -cat /user/sqooptest/input/student/*
#1593599413
hadoop fs -mkdir -p /user/sqooptest/output/
#1593599415
hadoop fs -touchz /user/sqooptest/output/student.txt
#1593599417
echo "null,liuyi,0,4,2016-01-01 12:12:12.0" | hadoop fs -appendToFile - /user/sqooptest/output/student.txt
#1593599420
echo "null,chener,0,3,2017-01-01 12:12:12.0" | hadoop fs -appendToFile - /user/sqooptest/output/student.txt
#1593599422
hadoop fs -cat /user/sqooptest/output/student.txt
#1593600040
stop-all.sh
#1593600056
jps
#1593600149
ps -aux | grep hive
#1593600183
kill -9 2910
#1593600195
kill -9 7317
#1593600208
kill -9 7484
#1593600224
jps
#1593600252
start-all.sh
#1593600273
jps
#1593600295
nohup hive --service metastore &
#1593600306
ps -aux | grep hive
#1593600316
hive
#1593600340
kill -9 10321
#1593600352
kill -9 10183
#1593600359
stop-all.sh
#1593600383
jps
#1593661732
cd /home/hadoop/hadoop-3.1.3/etc/
#1593661761
vim yarn-site.xml
#1593661769
ls
#1593661782
rm yarn-site.xml
#1593661789
cd hadoop
#1593661801
vim yarn-site.xml
#1593661991
cd ~
#1593662042
ls
#1593662058
home
#1593662061
cd home
#1593662070
cd \home
#1593662075
cd /home
#1593662077
ls
#1593662172
start-all.sh
#1593662195
jps
#1593662340
hadoop fs -mkdir -p /weblog/coollogs/in
#1593662352
hadoop fs -mkdir -p /weblog/coollogs/out
#1593662366
hadoop fs -ls /weblog/coollogs/in 
#1593662407
cd ..
#1593662412
cd home
#1593662415
cd  hadoop
#1593662417
ls
#1593662442
cd ~
#1593662456
wget http://124.70.73.94/logs/coollogs/
#1593662460
ls
#1593662482
rm index.html
#1593662532
wget http://124.70.73.94/logs/coollogs/coolshell_20140212.log
#1593662619
hadoop fs -put coolshell_20140212.log /weblog/coollogs/in/
#1593662630
hadoop fs -ls /weblog/coollogs/in
#1593662650
cd /home/hadoop
#1593662667
cd /weblog/coollogs/in
#1593662670
ls
#1593662825
cd ..
#1593666339
cd ~
#1593666341
ls
#1593666369
zip -d weblog.jar 'META-INF/.SF' 'META-INF/.RSA' 'META-INF/*SF'
#1593666377
pip install zip
#1593668085
pip install -upgrade pip
#1593668112
pip install --upgarde pip
#1593668134
pip install --upgrade pip
#1593668266
pip install zip
#1593668420
yum install zip
#1593668488
zip -d weblog.jar 'META-INF/.SF' 'META-INF/.RSA' 'META-INF/*SF'
#1593668545
hadoop jar weblog.jar weblog.WebLogDriver
#1593670683
vim /etc/mysql/my.cnf
#1593670703
cd /etc/mysql
#1593670709
cd /
#1593670710
ls
#1593670716
cd etc
#1593670718
ls
#1593670761
vim my.cnf
#1593670801
service mysql restart
#1593670828
cd /bin
#1593670829
ls
#1593670837
cd mysql
#1593670856
cd /mysql
#1593670858
ls
#1593670924
mysql -u root -p
#1593670940
cd /etc/
#1593670947
vim my.cnf
#1593670970
service mysql restart
#1593670987
vim my.cnf
#1593671006
mysql -u root -p
#1593671876
cd ssh/
#1593671890
vim sshd.config
#1593671907
ls
#1593671930
vim sshd.config
#1593672025
vim sshd_config
#1593672155
mysql -u root -p 
#1593672542
cd /etc
#1593672550
vim my.cnf
#1593673246
mysql -u root -p
#1593673379
grant all privileges on *.* to 'root'@192.168.124.3'' identified by '123456';
#1593673392
mysql -u root -p
#1593673772
net stop mysql
#1593673828
service mysqld stop
#1593673836
cd ..cd ..cd ..cd
#1593673838
cd ..
#1593673843
service mysqld stop
#1593673883
service mysqld restart
#1593674045
ll /etc/init.d/ | grep mysqld
#1593674060
find / -name mysqld
#1593674114
cp /usr/lixexec/mysql/support-files/mysqld /etc/init.d/mysqld
#1593674132
cp /usr/lixexec/mysql /etc/init.d/mysqld
#1593674201
cp /usr/libexec/mysql/support-files/mysqld /etc/init.d/mysqld
#1593674222
cp /usr/libexec/mysqld /etc/init.d/mysqld
#1593674251
service mysqld restart
#1593675276
mysql -u root -p
#1593676861
jps
#1593676905
nohup hive --service metastore &
#1593676909
hive
#1593682746
hadoop fs -mkdir -p /weblog/apachelogs/in
#1593682768
hadoop fs -mkdir -p /weblog/apachelogs/out
#1593682806
hadoop fs -ls /weblog/coollogs/in 
#1593683023
hadoop fs -ls /weblog//in 
#1593683030
hive
#1593683067
cd user
#1593683072
cd ~
#1593683075
cd  user
#1593683094
hive
#1593683573
hadoop fs -ls /weblog/coollogs/in
#1593683597
hadoop fs -mkdir -p /weblog/apachelogs/in
#1593683669
wget http://124.70.73.94/logs/apachelogs/localhost_access_log.2019-06-12.txt
#1593683717
hadoop fs -put localhost_access_log.2019-06-12.txt /apachelogs/in/
#1593683741
hadoop fs -put localhost_access_log.2019-06-12.txt /weblog/apachelogs/in/
#1593683764
hadoop fs -ls /weblog/apachelogs/in
#1593684691
ls
#1593684747
zip -d weblog_et1.jar 'META-INF/.SF' 'META-INF/.RSA' 'META-INF/*SF'
#1593684980
hadoop jar weblog_et1.jar weblog_et1.clean.Driver
#1593685048
zip -d weblog_et1.jar 'META-INF/.SF' 'META-INF/.RSA' 'META-INF/*SF'
#1593685067
zip -d weblog.jar 'META-INF/.SF' 'META-INF/.RSA' 'META-INF/*SF'
#1593685099
zip -d weblog_et1.jar
#1593685126
ls
#1593685143
zip -d weblog_etl.jar 'META-INF/.SF' 'META-INF/.RSA' 'META-INF/*SF'
#1593685162
hadoop jar weblog_etl.jar weblog_etl.clean.Driver
#1593685209
hadoop jar weblog_etl.jar etl.clean.Driver
#1593685913
ls
#1593685955
rm weblog_etl.jar
#1593685961
ls
#1593686275
zip -d weblog_etl.jar 'META-INF/.SF' 'META-INF/.RSA' 'META-INF/*SF'
#1593686437
hadoop jar weblog_etl.jar etl.clean.Driver
#1593686603
hadoop  fs -ls /weblog/coollogs/out
#1593687354
ls
#1593687365
rm weblog_et1.jar
#1593687372
zip -d weblog_etl.jar
#1593687386
rm weblog_etl.jar
#1593688368
ls
#1593688456
rm weblog_etl.jar
#1593688739
ls
#1593688742
rm weblog_etl.jar
#1593689183
ls
#1593691737
zip -d weblog_etl.jar 'META-INF/.SF' 'META-INF/.RSA' 'META-INF/*SF'
#1593691752
hadoop jar weblog_etl.jar etl.clean.Dri
#1593691890
ls
#1593691894
rm weblog_etl.jar
#1593691918
stop-all.sh
