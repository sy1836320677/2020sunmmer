import os

from com.utils.HiveUtil import HiveUtil
from com.utils.py_env import HADOOP_PATH


def get_result(start, end, output):
    # 最终结果表的分区
    dt = start + "-" + end

    # 删除作业成功的标志文件和作业的日志文件
    shell = HADOOP_PATH + "hadoop dfs -rm " + output + "/_SUCCESS"
    os.system(shell)
    shell = HADOOP_PATH + "hadoop dfs -rmr " + output + "/_logs"
    os.system(shell)

    # 将临时结果加载到中间结果表
    hql = "\"load data inpath '" + output + "' overwrite into table conversion_middle_result partition (dt='" +start + "-" + end + "')\""
    HiveUtil.execute_shell(hql)

    hql = "\"insert into table conversion_result partition (dt='"+start + "-" + end + "')" \
                 "select process,count(process),count(distinct(uuid)) from conversion_middle_result where dt >= " + dt + " group by process\""
    HiveUtil.execute_shell(hql)


