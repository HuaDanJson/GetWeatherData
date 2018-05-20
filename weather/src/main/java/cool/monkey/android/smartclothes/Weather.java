package cool.monkey.android.smartclothes;

import com.google.gson.annotations.SerializedName;

public class Weather {


    /**
     * now : {"cloud":"0","cond_code":"100","cond_txt":"晴","fl":"22","hum":"44","pcpn":"0.0","pres":"1012","tmp":"23","vis":"10","wind_deg":"169","wind_dir":"南风","wind_sc":"2","wind_spd":"8"}
     * basic : {"admin_area":"北京","cid":"CN101010100","cnty":"中国","lat":"39.90498734","location":"北京","lon":"116.4052887","parent_city":"北京","tz":"+8.00"}
     * status : ok
     * update : {"loc":"2018-05-18 21:47","utc":"2018-05-18 13:47"}
     */

    @SerializedName("now")   private NowBean now;
    @SerializedName("basic")  private BasicBean basic;
    @SerializedName("status")   private String status;
    @SerializedName("update")  private UpdateBean update;

    public NowBean getNow() { return now;}

    public void setNow(NowBean now) { this.now = now;}

    public BasicBean getBasic() { return basic;}

    public void setBasic(BasicBean basic) { this.basic = basic;}

    public String getStatus() { return status;}

    public void setStatus(String status) { this.status = status;}

    public UpdateBean getUpdate() { return update;}

    public void setUpdate(UpdateBean update) { this.update = update;}

    @Override
    public String toString() {
        return "Weather{" +
                "now=" + now +
                ", basic=" + basic +
                ", status='" + status + '\'' +
                ", update=" + update +
                '}';
    }

    public static class NowBean {
        /**
         * cloud : 0
         * cond_code : 100
         * cond_txt : 晴
         * fl : 22
         * hum : 44
         * pcpn : 0.0
         * pres : 1012
         * tmp : 23
         * vis : 10
         * wind_deg : 169
         * wind_dir : 南风
         * wind_sc : 2
         * wind_spd : 8
         */

        @SerializedName("cloud")  private String cloud;
        @SerializedName("cond_code")  private String cond_code;
        @SerializedName("cond_txt")  private String cond_txt;
        @SerializedName("fl") private String fl;
        @SerializedName("hum") private String hum;
        @SerializedName("pcpn") private String pcpn;
        @SerializedName("pres")private String pres;
        @SerializedName("tmp") private String tmp;
        @SerializedName("vis") private String vis;
        @SerializedName("wind_deg")  private String wind_deg;
        @SerializedName("wind_dir") private String wind_dir;
        @SerializedName("wind_sc") private String wind_sc;
        @SerializedName("wind_spd") private String wind_spd;

        public String getCloud() { return cloud;}

        public void setCloud(String cloud) { this.cloud = cloud;}

        public String getCond_code() { return cond_code;}

        public void setCond_code(String cond_code) { this.cond_code = cond_code;}

        public String getCond_txt() { return cond_txt;}

        public void setCond_txt(String cond_txt) { this.cond_txt = cond_txt;}

        public String getFl() { return fl;}

        public void setFl(String fl) { this.fl = fl;}

        public String getHum() { return hum;}

        public void setHum(String hum) { this.hum = hum;}

        public String getPcpn() { return pcpn;}

        public void setPcpn(String pcpn) { this.pcpn = pcpn;}

        public String getPres() { return pres;}

        public void setPres(String pres) { this.pres = pres;}

        public String getTmp() { return tmp;}

        public void setTmp(String tmp) { this.tmp = tmp;}

        public String getVis() { return vis;}

        public void setVis(String vis) { this.vis = vis;}

        public String getWind_deg() { return wind_deg;}

        public void setWind_deg(String wind_deg) { this.wind_deg = wind_deg;}

        public String getWind_dir() { return wind_dir;}

        public void setWind_dir(String wind_dir) { this.wind_dir = wind_dir;}

        public String getWind_sc() { return wind_sc;}

        public void setWind_sc(String wind_sc) { this.wind_sc = wind_sc;}

        public String getWind_spd() { return wind_spd;}

        public void setWind_spd(String wind_spd) { this.wind_spd = wind_spd;}

        @Override
        public String toString() {
            return "NowBean{" +
                    "cloud='" + cloud + '\'' +
                    ", cond_code='" + cond_code + '\'' +
                    ", cond_txt='" + cond_txt + '\'' +
                    ", fl='" + fl + '\'' +
                    ", hum='" + hum + '\'' +
                    ", pcpn='" + pcpn + '\'' +
                    ", pres='" + pres + '\'' +
                    ", tmp='" + tmp + '\'' +
                    ", vis='" + vis + '\'' +
                    ", wind_deg='" + wind_deg + '\'' +
                    ", wind_dir='" + wind_dir + '\'' +
                    ", wind_sc='" + wind_sc + '\'' +
                    ", wind_spd='" + wind_spd + '\'' +
                    '}';
        }
    }

    public static class BasicBean {
        /**
         * admin_area : 北京
         * cid : CN101010100
         * cnty : 中国
         * lat : 39.90498734
         * location : 北京
         * lon : 116.4052887
         * parent_city : 北京
         * tz : +8.00
         */

        @SerializedName("admin_area")  private String admin_area;
        @SerializedName("cid") private String cid;
        @SerializedName("cnty") private String cnty;
        @SerializedName("lat")  private String lat;
        @SerializedName("location") private String location;
        @SerializedName("lon")private String lon;
        @SerializedName("parent_city")  private String parent_city;
        @SerializedName("tz") private String tz;

        public String getAdmin_area() { return admin_area;}

        public void setAdmin_area(String admin_area) { this.admin_area = admin_area;}

        public String getCid() { return cid;}

        public void setCid(String cid) { this.cid = cid;}

        public String getCnty() { return cnty;}

        public void setCnty(String cnty) { this.cnty = cnty;}

        public String getLat() { return lat;}

        public void setLat(String lat) { this.lat = lat;}

        public String getLocation() { return location;}

        public void setLocation(String location) { this.location = location;}

        public String getLon() { return lon;}

        public void setLon(String lon) { this.lon = lon;}

        public String getParent_city() { return parent_city;}

        public void setParent_city(String parent_city) { this.parent_city = parent_city;}

        public String getTz() { return tz;}

        public void setTz(String tz) { this.tz = tz;}

        @Override
        public String toString() {
            return "BasicBean{" +
                    "admin_area='" + admin_area + '\'' +
                    ", cid='" + cid + '\'' +
                    ", cnty='" + cnty + '\'' +
                    ", lat='" + lat + '\'' +
                    ", location='" + location + '\'' +
                    ", lon='" + lon + '\'' +
                    ", parent_city='" + parent_city + '\'' +
                    ", tz='" + tz + '\'' +
                    '}';
        }
    }

    public static class UpdateBean {
        /**
         * loc : 2018-05-18 21:47
         * utc : 2018-05-18 13:47
         */

        @SerializedName("loc") private String loc;
        @SerializedName("utc")  private String utc;

        public String getLoc() { return loc;}

        public void setLoc(String loc) { this.loc = loc;}

        public String getUtc() { return utc;}

        public void setUtc(String utc) { this.utc = utc;}

        @Override
        public String toString() {
            return "UpdateBean{" +
                    "loc='" + loc + '\'' +
                    ", utc='" + utc + '\'' +
                    '}';
        }
    }
}
