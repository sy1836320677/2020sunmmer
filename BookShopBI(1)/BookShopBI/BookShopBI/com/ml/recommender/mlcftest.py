import os
from com.utils.HiveUtil import HiveUtil
from com.utils.py_env import HADOOP_PATH, PROJECT_LIB_DIR, PROJECT_TMP_DIR

def mlcftest():
    itemcftestin = "/user/hadoop/clusterOutput"
    shell = HADOOP_PATH + "hadoop jar " + PROJECT_LIB_DIR + "userhadoop.jar com.recommender.cf_hadoop.ItemCFHadoop"
    os.system(shell)