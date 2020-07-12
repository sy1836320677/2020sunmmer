package com.web.play.controller;

import com.alibaba.fastjson.JSON;
import com.web.play.entity.BookInfo;
import com.web.play.recommendTool.BaseItemutil;
import com.web.play.service.BookInfoService;
import com.web.play.util.TokenUtil;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.TanimotoCoefficientSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.EuclideanDistanceSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.similarity.ItemSimilarity;
import org.apache.mahout.cf.taste.similarity.precompute.example.GroupLensDataModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.web.play.entity.Orders;
import com.web.play.service.OrdersService;

import javax.annotation.Resource;
import java.io.File;
import java.util.*;

@RestController
public class TestController {

    @Resource
    private OrdersService ordersService;
    private BookInfoService bookInfoService;
    public TestController(BookInfoService bookInfoService) {
        this.bookInfoService = bookInfoService;
    }


    @RequestMapping("/test")
    public Orders test(){
        Orders an = this.ordersService.queryById(String.valueOf(10000002));

        //return "Test";
        return an;
    }


        @RequestMapping("/test1")
    public String test1(@RequestParam("bookid") String bookid){
        String userId = TokenUtil.getTokenUserId();
        BookInfo bookInfo1= bookInfoService.queryById(Long.parseLong(bookid));


        List<BookInfo> catelist = bookInfoService.queryByCateId(bookInfo1.getBookCategoryId());

        List<RecommendedItem> list1 = itemrecommend(Integer.parseInt(userId),Integer.parseInt(bookid));
        List<BookInfo> list=new ArrayList<>();
        HashMap<String,Object> res= new HashMap<>();
        for(RecommendedItem rd :list1){
            BookInfo bookInfo  =this.bookInfoService.queryById(rd.getItemID());
            list.add(bookInfo);
        }

        List<BookInfo> listRandom = new ArrayList<>();
        String res_json=null;
        if(list.size()>=4) {
            for (int i = 4; i >= 1; i--) {
                Random random = new Random();
                Math.random();
                //在数组大小之间产生一个随机数 j
                int j = random.nextInt(list.size() - 1);
                //取得list 中下标为j 的数据存储到 listRandom 中
                listRandom.add(list.get(j));
                res.put("list", listRandom);
                //把已取到的数据移除,避免下次再次取到出现重复
                list.remove(j);
                if (list.size() <= 0) {
                    break;
                }
            }
            res_json= JSON.toJSONString(res);
            return res_json;
        }
        else{
            for (int i = 0; i <= 4; i++) {
                Random random = new Random();
                Math.random();
                //在数组大小之间产生一个随机数 j
                int j = random.nextInt(catelist.size() - 1);
                //取得list 中下标为j 的数据存储到 listRandom 中
                listRandom.add(catelist.get(j));
                res.put("list", listRandom);

            }

            return JSON.toJSONString(res);
        }

    }

     public List<RecommendedItem> itemrecommend(int userID, long itemID){
        List<RecommendedItem> recommendedItemList = null;
        try {
            File file = new File(
                    "/root/bx_ratings.csv");
            // DataModel dataModel = new GroupLensDataModel(file);
            DataModel dataModel1= new FileDataModel(file);
            // 计算相似度，相似度算法有很多种，欧几里得、皮尔逊等等。
            ItemSimilarity itemSimilarity = new TanimotoCoefficientSimilarity(dataModel1);
            ItemSimilarity itemSimilarity1 = new PearsonCorrelationSimilarity(dataModel1);
            ItemSimilarity itemSimilarity2=new EuclideanDistanceSimilarity(dataModel1);
            // 构建推荐器，协同过滤推荐有两种，分别是基于用户的和基于物品的，这里使用基于物品的协同过滤推荐
            int[] temp = { 1, 2, 3};

            int index = (int) (Math.random() * temp.length);
            GenericItemBasedRecommender recommender;
            if(index==1) {
                recommender = new GenericItemBasedRecommender(dataModel1, itemSimilarity);
            }else if (index==2) {
               recommender =new GenericItemBasedRecommender(dataModel1,itemSimilarity1);
            }else {
             recommender =new GenericItemBasedRecommender(dataModel1,itemSimilarity2);
            }
            int howmany=10;
            recommendedItemList= recommender.recommendedBecause(userID,itemID,howmany);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return recommendedItemList;
    }


}
