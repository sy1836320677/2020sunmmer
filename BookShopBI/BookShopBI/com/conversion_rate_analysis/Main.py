import sys

from com.conversion_rate_analysis import buildConversion, buildConversionInput, buildConversionHadoopShell, \
    buildConversionResult

if __name__ == '__main__':
   
    start = sys.argv[1]
   
    end = sys.argv[2]

    urls = buildConversion.resolve_conf()

    buildConversionInput.extract_data(start, end)

    buildConversionHadoopShell.count_urls(start, end, urls)

    buildConversionResult.get_result(start, end,output="/user/hive/warehouse/summer.db/conversion_out")
