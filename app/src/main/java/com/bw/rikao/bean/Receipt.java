package com.bw.rikao.bean;

import java.util.List;

public class Receipt {

    /**
     * result : [{"address":"粪坑","createTime":1578518600000,"id":38215,"phone":"16623456789","realName":"王楚","userId":10931,"whetherDefault":1,"zipCode":"100010"},{"address":"粪坑","createTime":1578518624000,"id":38218,"phone":"16623456789","realName":"王楚","userId":10931,"whetherDefault":2,"zipCode":"100010"},{"address":"粪坑","createTime":1578518632000,"id":38219,"phone":"16623456789","realName":"王楚","userId":10931,"whetherDefault":2,"zipCode":"100010"},{"address":"北京 天安门","createTime":1578518837000,"id":38234,"phone":"16612345678","realName":"杜凯宾","userId":10931,"whetherDefault":2,"zipCode":"100000"},{"address":"北京 天安门","createTime":1578581149000,"id":38377,"phone":"16612345678","realName":"杜凯宾","userId":10931,"whetherDefault":2,"zipCode":"100000"}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * address : 粪坑
         * createTime : 1578518600000
         * id : 38215
         * phone : 16623456789
         * realName : 王楚
         * userId : 10931
         * whetherDefault : 1
         * zipCode : 100010
         */

        private String address;
        private long createTime;
        private int id;
        private String phone;
        private String realName;
        private int userId;
        private int whetherDefault;
        private String zipCode;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getRealName() {
            return realName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getWhetherDefault() {
            return whetherDefault;
        }

        public void setWhetherDefault(int whetherDefault) {
            this.whetherDefault = whetherDefault;
        }

        public String getZipCode() {
            return zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }
    }
}
