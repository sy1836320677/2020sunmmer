package com.web.play.recommendTool;
import java.io.File;
import java.util.List;

import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.similarity.ItemSimilarity;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
public class BaseItemutil {
    public List<RecommendedItem> itemrecommend(int userID, long itemID){
        List<RecommendedItem> recommendedItemList = null;
        try {
            // 准备数据 这里是电影评分数据
//		 String file = BaseUserRecommender.class.getClassLoader()
//		 .getResource("data/ratings.dat")
//		 .getFile();
//		 System.out.println(file);
            // 准备数据 这里是电影评分数据
            // 将数据加载到内存中，GroupLensDataModel是针对开放电影评论数据的
            DataModel dataModel = new FileDataModel(new File("src/main/resources/bx_ratings.dat"));
            // 计算相似度，相似度算法有很多种，欧几里得、皮尔逊等等。
            ItemSimilarity itemSimilarity = new PearsonCorrelationSimilarity(dataModel);
            // 构建推荐器，协同过滤推荐有两种，分别是基于用户的和基于物品的，这里使用基于物品的协同过滤推荐
            GenericItemBasedRecommender recommender = new GenericItemBasedRecommender(dataModel, itemSimilarity);
            int userid=userID;
            long itemid= itemID;
            int howmany=10;
            // 给用户ID等于5的用户推荐10个与2398相似的商品
            recommendedItemList = recommender.recommendedBecause(userid,itemid, howmany);
            // 打印推荐的结果
            long start = System.currentTimeMillis();
            //System.out.println("使用基于物品的协同过滤算法");
            //System.out.println("根据用户"+userID+"当前浏览的商品"+itemID+"推荐"+howmany+"个相似的商品");

            //for (RecommendedItem recommendedItem : recommendedItemList) {
            //System.out.println(recommendedItem);
            //}
            //System.out.println(System.currentTimeMillis() - start);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return recommendedItemList;
    }
}
