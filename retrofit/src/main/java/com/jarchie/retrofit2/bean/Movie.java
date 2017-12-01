package com.jarchie.retrofit2.bean;

import java.util.List;

/**
 * Created by Jarchie on 2017\12\1 0001.
 */

public class Movie {

    /**
     * control : {"expires":1800}
     * status : 0
     * data : {"hasNext":true,"movies":[{"showInfo":"今天130家影院放映1534场","cnms":0,"late":false,"sn":0,"src":"","nm":"烟花","scm":"","showDate":"","dur":91,"img":"http://p1.meituan.net/165.220/movie/3859caea55aa28b7a0414f88bd2b8f21702211.jpg","sc":5.8,"ver":"2D/中国巨幕","rt":"本周五上映","preSale":0,"vd":"","dir":"新房昭之","star":"广濑铃,菅田将晖,松隆子","cat":"爱情,动画,奇幻","wish":122693,"3d":false,"pn":30,"imax":false,"snum":5676,"time":"","id":1198813},{"showInfo":"今天129家影院放映1356场","cnms":0,"late":false,"sn":0,"src":"","nm":"寻梦环游记","scm":"","showDate":"","dur":105,"img":"http://p1.meituan.net/165.220/movie/4ba0ebccc0e3115911bfecdcfbbafa1a5114683.jpg","sc":9.6,"ver":"2D/3D","rt":"2017-11-24上映","preSale":0,"vd":"","dir":"李·昂克里奇,阿德里安.莫利纳","star":"安东尼·冈萨雷斯,本杰明·布拉特,盖尔·加西亚·贝纳尔","cat":"动画,冒险,家庭","wish":16241,"3d":true,"pn":52,"imax":false,"snum":87350,"time":"","id":342068},{"showInfo":"2017-12-15上映","cnms":0,"late":false,"sn":0,"src":"","nm":"芳华","scm":"少年文工团，青春很茫然","showDate":"","dur":136,"img":"http://p1.meituan.net/165.220/movie/00c8f4268808b89ff4adb667af7e58651038010.jpg","sc":0,"ver":"2D/中国巨幕","rt":"2017-12-15上映","preSale":1,"vd":"","dir":"冯小刚","star":"黄轩,苗苗,钟楚曦","cat":"剧情,爱情,战争","wish":111794,"3d":false,"pn":365,"imax":false,"snum":2431,"time":"","id":1170264},{"showInfo":"今天127家影院放映669场","cnms":0,"late":false,"sn":0,"src":"","nm":"维京:王者之战","scm":"","showDate":"","dur":128,"img":"http://p1.meituan.net/165.220/movie/533ff887dcce94bd82b2e9fa40a4ca892152360.jpg","sc":0,"ver":"2D/中国巨幕/全景声","rt":"本周五上映","preSale":0,"vd":"","dir":"安德烈·克拉夫丘克","star":"丹尼拉·科兹洛夫斯基,斯维特拉纳·库德钦科娃,乔金·奈特奎斯特","cat":"动作,战争","wish":7784,"3d":false,"pn":130,"imax":false,"snum":665,"time":"","id":438338},{"showInfo":"今天121家影院放映646场","cnms":0,"late":false,"sn":0,"src":"","nm":"相声大电影之我要幸福","scm":"于谦郭德纲，笑到你癫狂","showDate":"","dur":92,"img":"http://p1.meituan.net/165.220/movie/2a781edb2544c60182feac6fe8b23f27275081.jpg","sc":0,"ver":"2D","rt":"本周五上映","preSale":0,"vd":"","dir":"张鹤栾","star":"郭德纲,于谦,岳云鹏","cat":"剧情,喜剧","wish":72402,"3d":false,"pn":33,"imax":false,"snum":1346,"time":"","id":342362},{"showInfo":"今天117家影院放映539场","cnms":0,"late":false,"sn":0,"src":"","nm":"正义联盟","scm":"","showDate":"","dur":120,"img":"http://p1.meituan.net/165.220/movie/8798032469af2faf18e531f7cdedc39e998644.jpg","sc":9,"ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"2017-11-17上映","preSale":0,"vd":"","dir":"扎克·施奈德","star":"本·阿弗莱克,亨利·卡维尔,盖尔·加朵","cat":"动作,冒险,科幻","wish":176293,"3d":true,"pn":286,"imax":true,"snum":196866,"time":"","id":341195},{"showInfo":"2017-12-15上映","cnms":0,"late":false,"sn":0,"src":"","nm":"奇门遁甲","scm":"天地有妖气，逗逼救地球","showDate":"","dur":113,"img":"http://p0.meituan.net/165.220/movie/63645fbe250617e4f2e6b40c51223a77932075.png","sc":0,"ver":"2D/3D/IMAX 3D","rt":"2017-12-15上映","preSale":1,"vd":"","dir":"袁和平","star":"大鹏,倪妮,李治廷","cat":"奇幻,喜剧,动作","wish":115963,"3d":true,"pn":88,"imax":true,"snum":11163,"time":"","id":344183},{"showInfo":"今天106家影院放映367场","cnms":0,"late":false,"sn":0,"src":"","nm":"这就是命","scm":"","showDate":"","dur":98,"img":"http://p1.meituan.net/165.220/movie/e4939923185c102b559c369d5db08fa1778605.jpg","sc":8.2,"ver":"2D","rt":"本周五上映","preSale":0,"vd":"","dir":"王丹","star":"王迅,曾志伟,梁超","cat":"喜剧,犯罪","wish":11588,"3d":false,"pn":159,"imax":false,"snum":1168,"time":"","id":672281},{"showInfo":"今天110家影院放映355场","cnms":0,"late":false,"sn":0,"src":"","nm":"至暗时刻","scm":"","showDate":"","dur":125,"img":"http://p1.meituan.net/165.220/movie/6617ca11895da44065e9bcf378d0f62c252496.jpg","sc":0,"ver":"2D/中国巨幕","rt":"本周五上映","preSale":0,"vd":"","dir":"乔·赖特","star":"加里·奥德曼,克里斯汀·斯科特·托马斯,莉莉·詹姆斯","cat":"剧情,历史,传记","wish":5423,"3d":false,"pn":34,"imax":false,"snum":174,"time":"","id":346625},{"showInfo":"2017-12-08 下周五上映","cnms":0,"late":false,"sn":0,"src":"","nm":"帕丁顿熊2","scm":"","showDate":"","dur":103,"img":"http://p1.meituan.net/165.220/movie/851aebfbb2558836abe57f894173bf78525033.png","sc":0,"ver":"2D/IMAX 2D/中国巨幕","rt":"下周五上映","preSale":1,"vd":"","dir":"保罗·金","star":"本·威士肖,休·博内威利,休·格兰特","cat":"喜剧,动画,冒险","wish":17581,"3d":false,"pn":53,"imax":true,"snum":129,"time":"","id":343905}]}
     */

    private ControlBean control;
    private int status;
    private DataBean data;

    public ControlBean getControl() {
        return control;
    }

    public void setControl(ControlBean control) {
        this.control = control;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class ControlBean {
        /**
         * expires : 1800
         */

        private int expires;

        public int getExpires() {
            return expires;
        }

        public void setExpires(int expires) {
            this.expires = expires;
        }
    }

    public static class DataBean {
        /**
         * hasNext : true
         * movies : [{"showInfo":"今天130家影院放映1534场","cnms":0,"late":false,"sn":0,"src":"","nm":"烟花","scm":"","showDate":"","dur":91,"img":"http://p1.meituan.net/165.220/movie/3859caea55aa28b7a0414f88bd2b8f21702211.jpg","sc":5.8,"ver":"2D/中国巨幕","rt":"本周五上映","preSale":0,"vd":"","dir":"新房昭之","star":"广濑铃,菅田将晖,松隆子","cat":"爱情,动画,奇幻","wish":122693,"3d":false,"pn":30,"imax":false,"snum":5676,"time":"","id":1198813},{"showInfo":"今天129家影院放映1356场","cnms":0,"late":false,"sn":0,"src":"","nm":"寻梦环游记","scm":"","showDate":"","dur":105,"img":"http://p1.meituan.net/165.220/movie/4ba0ebccc0e3115911bfecdcfbbafa1a5114683.jpg","sc":9.6,"ver":"2D/3D","rt":"2017-11-24上映","preSale":0,"vd":"","dir":"李·昂克里奇,阿德里安.莫利纳","star":"安东尼·冈萨雷斯,本杰明·布拉特,盖尔·加西亚·贝纳尔","cat":"动画,冒险,家庭","wish":16241,"3d":true,"pn":52,"imax":false,"snum":87350,"time":"","id":342068},{"showInfo":"2017-12-15上映","cnms":0,"late":false,"sn":0,"src":"","nm":"芳华","scm":"少年文工团，青春很茫然","showDate":"","dur":136,"img":"http://p1.meituan.net/165.220/movie/00c8f4268808b89ff4adb667af7e58651038010.jpg","sc":0,"ver":"2D/中国巨幕","rt":"2017-12-15上映","preSale":1,"vd":"","dir":"冯小刚","star":"黄轩,苗苗,钟楚曦","cat":"剧情,爱情,战争","wish":111794,"3d":false,"pn":365,"imax":false,"snum":2431,"time":"","id":1170264},{"showInfo":"今天127家影院放映669场","cnms":0,"late":false,"sn":0,"src":"","nm":"维京:王者之战","scm":"","showDate":"","dur":128,"img":"http://p1.meituan.net/165.220/movie/533ff887dcce94bd82b2e9fa40a4ca892152360.jpg","sc":0,"ver":"2D/中国巨幕/全景声","rt":"本周五上映","preSale":0,"vd":"","dir":"安德烈·克拉夫丘克","star":"丹尼拉·科兹洛夫斯基,斯维特拉纳·库德钦科娃,乔金·奈特奎斯特","cat":"动作,战争","wish":7784,"3d":false,"pn":130,"imax":false,"snum":665,"time":"","id":438338},{"showInfo":"今天121家影院放映646场","cnms":0,"late":false,"sn":0,"src":"","nm":"相声大电影之我要幸福","scm":"于谦郭德纲，笑到你癫狂","showDate":"","dur":92,"img":"http://p1.meituan.net/165.220/movie/2a781edb2544c60182feac6fe8b23f27275081.jpg","sc":0,"ver":"2D","rt":"本周五上映","preSale":0,"vd":"","dir":"张鹤栾","star":"郭德纲,于谦,岳云鹏","cat":"剧情,喜剧","wish":72402,"3d":false,"pn":33,"imax":false,"snum":1346,"time":"","id":342362},{"showInfo":"今天117家影院放映539场","cnms":0,"late":false,"sn":0,"src":"","nm":"正义联盟","scm":"","showDate":"","dur":120,"img":"http://p1.meituan.net/165.220/movie/8798032469af2faf18e531f7cdedc39e998644.jpg","sc":9,"ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"2017-11-17上映","preSale":0,"vd":"","dir":"扎克·施奈德","star":"本·阿弗莱克,亨利·卡维尔,盖尔·加朵","cat":"动作,冒险,科幻","wish":176293,"3d":true,"pn":286,"imax":true,"snum":196866,"time":"","id":341195},{"showInfo":"2017-12-15上映","cnms":0,"late":false,"sn":0,"src":"","nm":"奇门遁甲","scm":"天地有妖气，逗逼救地球","showDate":"","dur":113,"img":"http://p0.meituan.net/165.220/movie/63645fbe250617e4f2e6b40c51223a77932075.png","sc":0,"ver":"2D/3D/IMAX 3D","rt":"2017-12-15上映","preSale":1,"vd":"","dir":"袁和平","star":"大鹏,倪妮,李治廷","cat":"奇幻,喜剧,动作","wish":115963,"3d":true,"pn":88,"imax":true,"snum":11163,"time":"","id":344183},{"showInfo":"今天106家影院放映367场","cnms":0,"late":false,"sn":0,"src":"","nm":"这就是命","scm":"","showDate":"","dur":98,"img":"http://p1.meituan.net/165.220/movie/e4939923185c102b559c369d5db08fa1778605.jpg","sc":8.2,"ver":"2D","rt":"本周五上映","preSale":0,"vd":"","dir":"王丹","star":"王迅,曾志伟,梁超","cat":"喜剧,犯罪","wish":11588,"3d":false,"pn":159,"imax":false,"snum":1168,"time":"","id":672281},{"showInfo":"今天110家影院放映355场","cnms":0,"late":false,"sn":0,"src":"","nm":"至暗时刻","scm":"","showDate":"","dur":125,"img":"http://p1.meituan.net/165.220/movie/6617ca11895da44065e9bcf378d0f62c252496.jpg","sc":0,"ver":"2D/中国巨幕","rt":"本周五上映","preSale":0,"vd":"","dir":"乔·赖特","star":"加里·奥德曼,克里斯汀·斯科特·托马斯,莉莉·詹姆斯","cat":"剧情,历史,传记","wish":5423,"3d":false,"pn":34,"imax":false,"snum":174,"time":"","id":346625},{"showInfo":"2017-12-08 下周五上映","cnms":0,"late":false,"sn":0,"src":"","nm":"帕丁顿熊2","scm":"","showDate":"","dur":103,"img":"http://p1.meituan.net/165.220/movie/851aebfbb2558836abe57f894173bf78525033.png","sc":0,"ver":"2D/IMAX 2D/中国巨幕","rt":"下周五上映","preSale":1,"vd":"","dir":"保罗·金","star":"本·威士肖,休·博内威利,休·格兰特","cat":"喜剧,动画,冒险","wish":17581,"3d":false,"pn":53,"imax":true,"snum":129,"time":"","id":343905}]
         */

        private boolean hasNext;
        private List<MoviesBean> movies;

        public boolean isHasNext() {
            return hasNext;
        }

        public void setHasNext(boolean hasNext) {
            this.hasNext = hasNext;
        }

        public List<MoviesBean> getMovies() {
            return movies;
        }

        public void setMovies(List<MoviesBean> movies) {
            this.movies = movies;
        }

        public static class MoviesBean {
            /**
             * showInfo : 今天130家影院放映1534场
             * cnms : 0
             * late : false
             * sn : 0
             * src :
             * nm : 烟花
             * scm :
             * showDate :
             * dur : 91
             * img : http://p1.meituan.net/165.220/movie/3859caea55aa28b7a0414f88bd2b8f21702211.jpg
             * sc : 5.8
             * ver : 2D/中国巨幕
             * rt : 本周五上映
             * preSale : 0
             * vd :
             * dir : 新房昭之
             * star : 广濑铃,菅田将晖,松隆子
             * cat : 爱情,动画,奇幻
             * wish : 122693
             * 3d : false
             * pn : 30
             * imax : false
             * snum : 5676
             * time :
             * id : 1198813
             */

            private String showInfo;
            private int cnms;
            private boolean late;
            private int sn;
            private String src;
            private String nm;
            private String scm;
            private String showDate;
            private int dur;
            private String img;
            private double sc;
            private String ver;
            private String rt;
            private int preSale;
            private String vd;
            private String dir;
            private String star;
            private String cat;
            private int wish;
            private boolean _$3d;
            private int pn;
            private boolean imax;
            private int snum;
            private String time;
            private int id;

            public String getShowInfo() {
                return showInfo;
            }

            public void setShowInfo(String showInfo) {
                this.showInfo = showInfo;
            }

            public int getCnms() {
                return cnms;
            }

            public void setCnms(int cnms) {
                this.cnms = cnms;
            }

            public boolean isLate() {
                return late;
            }

            public void setLate(boolean late) {
                this.late = late;
            }

            public int getSn() {
                return sn;
            }

            public void setSn(int sn) {
                this.sn = sn;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getScm() {
                return scm;
            }

            public void setScm(String scm) {
                this.scm = scm;
            }

            public String getShowDate() {
                return showDate;
            }

            public void setShowDate(String showDate) {
                this.showDate = showDate;
            }

            public int getDur() {
                return dur;
            }

            public void setDur(int dur) {
                this.dur = dur;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public double getSc() {
                return sc;
            }

            public void setSc(double sc) {
                this.sc = sc;
            }

            public String getVer() {
                return ver;
            }

            public void setVer(String ver) {
                this.ver = ver;
            }

            public String getRt() {
                return rt;
            }

            public void setRt(String rt) {
                this.rt = rt;
            }

            public int getPreSale() {
                return preSale;
            }

            public void setPreSale(int preSale) {
                this.preSale = preSale;
            }

            public String getVd() {
                return vd;
            }

            public void setVd(String vd) {
                this.vd = vd;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getStar() {
                return star;
            }

            public void setStar(String star) {
                this.star = star;
            }

            public String getCat() {
                return cat;
            }

            public void setCat(String cat) {
                this.cat = cat;
            }

            public int getWish() {
                return wish;
            }

            public void setWish(int wish) {
                this.wish = wish;
            }

            public boolean is_$3d() {
                return _$3d;
            }

            public void set_$3d(boolean _$3d) {
                this._$3d = _$3d;
            }

            public int getPn() {
                return pn;
            }

            public void setPn(int pn) {
                this.pn = pn;
            }

            public boolean isImax() {
                return imax;
            }

            public void setImax(boolean imax) {
                this.imax = imax;
            }

            public int getSnum() {
                return snum;
            }

            public void setSnum(int snum) {
                this.snum = snum;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
    }
}
