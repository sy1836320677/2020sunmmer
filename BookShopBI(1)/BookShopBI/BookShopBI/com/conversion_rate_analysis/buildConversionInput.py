import os
from com.utils.HiveUtil import HiveUtil
from com.utils.py_env import HIVE_PATH

def extract_data(start, end):
    hql = "\"use summer;insert into conversion_input partition (dt='" + start + "-" + end + "') "\
            "select url,uniqueid,sessionid,csvp from clickstream_log where dt>= '" + start + "' and dt<= '" + end+"'\""
    #hql = "\"use summer;insert into conversion_input1 values('s','s','s',1,'2019-01-01') partition (dt='" + start + "-" + end + "') \""
    #insert into summer.conversion_input1 partition (dt='2019-06-12-2019-6-15') select url,uniqueid,sessionid,csvp from summer.clickstream_log where dt>= '2019-06-12' and dt<= '2019-06-14'
    HiveUtil.execute_shell(hql,hive_path=HIVE_PATH)
