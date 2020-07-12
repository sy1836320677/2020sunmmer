import os
import sys

from com.utils.py_env import HADOOP_PATH, PROJECT_LIB_DIR

if __name__ == '__main__':
    # 由日志服务器上传至HDFS的目录下，按照时间进行存储
    # argv[0]为调度模块出入的时间，为前一天的日期，也就是说功能会每天执行一次，将前一天的点击流日志进行数据清洗并输出至clickstream_log表对应的HDFS路径下
    #HDFS = "hdfs://ecs-hadoop-master:9000/"
    #inputPath = "/tmp/apache_log/" + sys.argv[1]
    #inputPath = HDFS + "weblog/apachelogs/in/" + sys.argv[1]
    inputPath = sys.argv[1]

    # 输出目录为clickstream_log表的分区目录
    #outputPath = HDFS + "/user/hive/warehouse/clickstream_log/dt=" + sys.argv[2]
    outputPath =sys.argv[2]

    shell = HADOOP_PATH + "hadoop jar " + PROJECT_LIB_DIR + "etl_good.jar etl.clean.Driver " + inputPath + " " + outputPath
    os.system(shell)
