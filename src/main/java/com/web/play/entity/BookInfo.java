package com.web.play.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (BookInfo)实体类
 *
 * @author makejava
 * @since 2020-07-10 11:18:23
 */
public class BookInfo implements Serializable {
    private static final long serialVersionUID = 224098486102243182L;
    
    private Long bookId;
    
    private Integer bookCategoryId;
    
    private Integer storeId;
    
    private String name;
    /**
    * 简介
    */
    private String outline;
    /**
    * 商品详情
    */
    private String detail;
    /**
    * 出版社
    */
    private String press;
    
    private String publishDate;
    
    private String size;
    
    private String version;
    
    private String author;
    /**
    * 翻译者
    */
    private String translator;
    
    private String isbn;
    
    private Double price;
    /**
    * 总页数
    */
    private Integer pages;
    /**
    * 目录
    */
    private String catalog;
    /**
    * 市场价\定价
    */
    private Double marketPrice;
    /**
    * 会员价格
    */
    private Double memberPrice;
    /**
    * 成交量
    */
    private Integer dealMount;
    /**
    * 浏览量
    */
    private Integer lookMount;
    
    private Double discount;
    /**
    * 版面图片
    */
    private String imageUrl;
    /**
    * 库存数量
    */
    private Integer storeMount;
    /**
    * 入库时间
    */
    private Date storeTime;
    /**
    * 封装方式
    */
    private String packStyle;
    /**
    * 是否上架
    */
    private Integer isShelf;
    /**
    * 类别名称
    */
    private String cname;
    
    private String description;
    
    private String cata;
    
    private String content;


    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Integer getBookCategoryId() {
        return bookCategoryId;
    }

    public void setBookCategoryId(Integer bookCategoryId) {
        this.bookCategoryId = bookCategoryId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(Double memberPrice) {
        this.memberPrice = memberPrice;
    }

    public Integer getDealMount() {
        return dealMount;
    }

    public void setDealMount(Integer dealMount) {
        this.dealMount = dealMount;
    }

    public Integer getLookMount() {
        return lookMount;
    }

    public void setLookMount(Integer lookMount) {
        this.lookMount = lookMount;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getStoreMount() {
        return storeMount;
    }

    public void setStoreMount(Integer storeMount) {
        this.storeMount = storeMount;
    }

    public Date getStoreTime() {
        return storeTime;
    }

    public void setStoreTime(Date storeTime) {
        this.storeTime = storeTime;
    }

    public String getPackStyle() {
        return packStyle;
    }

    public void setPackStyle(String packStyle) {
        this.packStyle = packStyle;
    }

    public Integer getIsShelf() {
        return isShelf;
    }

    public void setIsShelf(Integer isShelf) {
        this.isShelf = isShelf;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCata() {
        return cata;
    }

    public void setCata(String cata) {
        this.cata = cata;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}