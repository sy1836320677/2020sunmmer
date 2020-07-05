# -*- coding:UTF-8 -*-
from com.utils.py_env import PROJECT_CONF_DIR

import xml.etree.ElementTree as ET


def resolve_conf():
 
    confFile = PROJECT_CONF_DIR + "conversion.xml"

 
    xmlTree = ET.parse(confFile)
    eles = xmlTree.findall('./urls')
    rootEle = eles[0]

    urls = []

    for ele in rootEle.getchildren():
        if ele.tag == 'url':
            url = ele.text.strip()
            if url != None or url != '':
                print(url)
                urls.append(url)

    if len(urls) == 0:
        raise Exception('leakage of data .stop')
    print (urls) 
    return urls
