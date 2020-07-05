import os

from com.utils.py_env import HADOOP_PATH, PROJECT_LIB_DIR


def count_urls(start, end, urls):
   
    inputPath = "/user/hive/warehouse/summer.db/conversion_input/dt=" + start + "-" + end
   
    outputPath = "/user/hive/warehouse/summer.db/conversion_out"
   
    os.system(HADOOP_PATH + "hadoop dfs -rm -r " + outputPath)
    print("syyyyy")
    urlstr = ""
    for i in range(len(urls)):
        if (i == len(urls) - 1):
            urlstr += urls[i]
        else:
            urlstr += urls[i] + " "

 
    shell = HADOOP_PATH + "hadoop jar " + PROJECT_LIB_DIR + "conversion.jar com.conversion.mr.Driver " + inputPath + " " + outputPath + " " + urlstr
    os.system(shell)
