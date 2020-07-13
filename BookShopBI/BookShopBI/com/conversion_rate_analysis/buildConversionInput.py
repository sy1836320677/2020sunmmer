
from com.utils import HiveUtil
from com.utils.py_env import HIVE_PATH

def extract_data(start, end):
    hql = "\"use summer;insert into conversion_input partition (dt='" + start + "-" + end + "') " \
        "select url,uniqueId,sessionid,csvp from clickstream_log where dt>= " + start + " and dt<= " + end+"\""
    HiveUtil.execute_shell(hql)
