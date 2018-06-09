package com.example.lizhongxiang.myblogs.model;

import android.os.Message;

import java.util.List;

/**
 * Created by lizhongxiang on
 *
 * @author : lzx
 * &#x65f6;&#x95f4; : 2018/4/12.
 */
public class ZHAbstractModel {

    /**
     * date : 20180609
     * stories : [{"images":["https://pic4.zhimg.com/v2-649b6f5dd4c1a15c81ebe499f68355f7.jpg"],"type":0,"id":9685885,"ga_prefix":"060915","title":"我到底是第一个进入太空的人类，还是最后一个进入太空的狗？"},{"images":["https://pic2.zhimg.com/v2-2a7b0f9fb2ae01f15e553c5d1b198939.jpg"],"type":0,"id":9685670,"ga_prefix":"060914","title":"熬夜熬太多，我的世界变「黄」了"},{"images":["https://pic1.zhimg.com/v2-c1b8b408fc67e3ea4a92df5446490050.jpg"],"type":0,"id":9685957,"ga_prefix":"060913","title":"NBA 总决赛勇士 4:0 横扫骑士四年三冠，杜兰特蝉联 FMVP"},{"images":["https://pic1.zhimg.com/v2-9278372aa51c75922f9abcc7f7b72824.jpg"],"type":0,"id":9685871,"ga_prefix":"060913","title":"「妈宝男」是这样培养出来的"},{"images":["https://pic2.zhimg.com/v2-a8d5cf11c7075ff378c9d07d10ebe145.jpg"],"type":0,"id":9685938,"ga_prefix":"060912","title":"大误 · 假如地球是立方体会怎样？"},{"title":"看完今年得了苹果设计奖的 10 个 app，好想现在就下载来玩玩","ga_prefix":"060910","images":["https://pic3.zhimg.com/v2-dbd0c1ae143dd127bba8ff276ee5213e.jpg"],"multipic":true,"type":0,"id":9685599},{"images":["https://pic2.zhimg.com/v2-0b7baf11c8186eafede01cde7bd5c259.jpg"],"type":0,"id":9685891,"ga_prefix":"060909","title":"一家三口高速服务区自杀之谜"},{"images":["https://pic4.zhimg.com/v2-0e9e53497143fbeedbaa5c4b107f6dff.jpg"],"type":0,"id":9685586,"ga_prefix":"060908","title":"你这哪叫读书啊？这叫给书当奴隶"},{"images":["https://pic1.zhimg.com/v2-5af4ad43979f8dade6ed26113eba88a4.jpg"],"type":0,"id":9685935,"ga_prefix":"060907","title":"那年我高考 · 考完那天晚上，我的高中结束了"},{"images":["https://pic3.zhimg.com/v2-1b5f05a3916343902772eafd7a0c42ce.jpg"],"type":0,"id":9684431,"ga_prefix":"060907","title":"上班好还是做生意好？"},{"images":["https://pic4.zhimg.com/v2-d91cfa046b1d86af351a625d6cd807c3.jpg"],"type":0,"id":9685910,"ga_prefix":"060907","title":"被外派到拉美，发现了另一个世界"},{"images":["https://pic2.zhimg.com/v2-0731122f223f4efc9191483952d07a05.jpg"],"type":0,"id":9685946,"ga_prefix":"060906","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic2.zhimg.com/v2-10c4a5d3c5b573bd659986623f47276d.jpg","type":0,"id":9685957,"ga_prefix":"060913","title":"NBA 总决赛勇士 4:0 横扫骑士四年三冠，杜兰特蝉联 FMVP"},{"image":"https://pic1.zhimg.com/v2-23e6a56b3551dea62db3866093283334.jpg","type":0,"id":9685670,"ga_prefix":"060914","title":"熬夜熬太多，我的世界变「黄」了"},{"image":"https://pic3.zhimg.com/v2-54e272e979727b898812c412c5c45076.jpg","type":0,"id":9685891,"ga_prefix":"060909","title":"一家三口高速服务区自杀之谜"},{"image":"https://pic2.zhimg.com/v2-64af00873c763bbe5b81e1e56b230cdd.jpg","type":0,"id":9685871,"ga_prefix":"060913","title":"「妈宝男」是这样培养出来的"},{"image":"https://pic4.zhimg.com/v2-fb54b8e48cdf4830a52332c6d6240853.jpg","type":0,"id":9685586,"ga_prefix":"060908","title":"你这哪叫读书啊？这叫给书当奴隶"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public ZHAbstractModel() {
    }

    public ZHAbstractModel(String date, List<StoriesBean> stories, List<TopStoriesBean> top_stories) {
        this.date = date;
        this.stories = stories;
        this.top_stories = top_stories;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * images : ["https://pic4.zhimg.com/v2-649b6f5dd4c1a15c81ebe499f68355f7.jpg"]
         * type : 0
         * id : 9685885
         * ga_prefix : 060915
         * title : 我到底是第一个进入太空的人类，还是最后一个进入太空的狗？
         * multipic : true
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private boolean multipic;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public boolean isMultipic() {
            return multipic;
        }

        public void setMultipic(boolean multipic) {
            this.multipic = multipic;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic2.zhimg.com/v2-10c4a5d3c5b573bd659986623f47276d.jpg
         * type : 0
         * id : 9685957
         * ga_prefix : 060913
         * title : NBA 总决赛勇士 4:0 横扫骑士四年三冠，杜兰特蝉联 FMVP
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
