# -*- coding:UTF-8 -*-
from com.utils.py_env import HIVE_PATH
import subprocess


class HiveUtil(object):

    def __init__(self):
        pass

    def execute_shell(hql,hive_path=HIVE_PATH):
        status, output = subprocess.getstatusoutput(cmd=hive_path + "hive -S -e " + hql)
        if status != 0:
            print("failed:the number is " + str(status))
            print(output)
            return None
        else:
            print("success")
            output = str(output).split("\n")
        return output


