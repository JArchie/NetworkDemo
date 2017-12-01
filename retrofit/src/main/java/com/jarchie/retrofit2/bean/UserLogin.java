package com.jarchie.retrofit2.bean;

import java.util.List;

/**
 * Created by Administrator on 2017\12\1 0001.
 */

public class UserLogin {

    /**
     * msg : success
     * info : {"userName":"gwc1234","userPsw":"","userDisplayName":"处室B","userMobilephone":"111111","userUnitId":"451","userUnitName":"工务处","userUnitType":"jgcs","userDeptName":"工务处","userAuthority":"14","userMenuAuthority":[{"menuCode":"ljyyx_xtsy","menuName":"系统首页","children":[{"menuCode":"ljyyx_qxgl_web_xthyjm","menuName":"欢迎界面","children":[]}]},{"menuCode":"ljyyx_sgyjh","menuName":"施工月计划","children":[{"menuCode":"ljyyx_sh_ydjdjhb","menuName":"审核月计划","children":[]},{"menuCode":"ljyyx_ydjdjhbshwc","menuName":"审核已完成","children":[]},{"menuCode":"ljyyx_ydjdjhbdcx","menuName":"月计划查询","children":[]}]},{"menuCode":"ljyyx_sgzjh","menuName":"施工周计划","children":[{"menuCode":"ljyyx_zjdjhbdcx","menuName":"周计划查询","children":[]}]},{"menuCode":"ljyyx_sgrjh","menuName":"施工日计划","children":[{"menuCode":"ljyyx_rjdjhbdcx","menuName":"日计划查询","children":[]}]},{"menuCode":"ljyyx_rjdjc","menuName":"监督检查","children":[{"menuCode":"ljyyx_rjdjc_jhrap","menuName":"施工监护人员安排","children":[]},{"menuCode":"ljyyx_rjdjc_jhrcx","menuName":"施工监护人员查询","children":[]},{"menuCode":"ljyyx_rjdjc_jdjc","menuName":"监督检查录入信息","children":[]},{"menuCode":"ljyyx_rjdjc_dcl","menuName":"监督检查待处理","children":[]},{"menuCode":"ljyyx_rjdjc_ycl","menuName":"监督检查已处理","children":[]},{"menuCode":"ljyyx_rjdjc_jccx","menuName":"监督检查信息查询","children":[]}]},{"menuCode":"ljyyx_zsjh","menuName":"正式计划","children":[{"menuCode":"ljyyx_zsydjdjhb","menuName":"正式月计划","children":[]},{"menuCode":"ljyyx_zbydjdjhb","menuName":"正式增补月计划","children":[]},{"menuCode":"ljyyx_zsrjdjhb","menuName":"正式周计划","children":[]},{"menuCode":"ljyyx_zszjdjhb","menuName":"正式日计划","children":[]}]}]}
     */

    private String msg;
    private InfoBean info;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public static class InfoBean {
        /**
         * userName : gwc1234
         * userPsw :
         * userDisplayName : 处室B
         * userMobilephone : 111111
         * userUnitId : 451
         * userUnitName : 工务处
         * userUnitType : jgcs
         * userDeptName : 工务处
         * userAuthority : 14
         * userMenuAuthority : [{"menuCode":"ljyyx_xtsy","menuName":"系统首页","children":[{"menuCode":"ljyyx_qxgl_web_xthyjm","menuName":"欢迎界面","children":[]}]},{"menuCode":"ljyyx_sgyjh","menuName":"施工月计划","children":[{"menuCode":"ljyyx_sh_ydjdjhb","menuName":"审核月计划","children":[]},{"menuCode":"ljyyx_ydjdjhbshwc","menuName":"审核已完成","children":[]},{"menuCode":"ljyyx_ydjdjhbdcx","menuName":"月计划查询","children":[]}]},{"menuCode":"ljyyx_sgzjh","menuName":"施工周计划","children":[{"menuCode":"ljyyx_zjdjhbdcx","menuName":"周计划查询","children":[]}]},{"menuCode":"ljyyx_sgrjh","menuName":"施工日计划","children":[{"menuCode":"ljyyx_rjdjhbdcx","menuName":"日计划查询","children":[]}]},{"menuCode":"ljyyx_rjdjc","menuName":"监督检查","children":[{"menuCode":"ljyyx_rjdjc_jhrap","menuName":"施工监护人员安排","children":[]},{"menuCode":"ljyyx_rjdjc_jhrcx","menuName":"施工监护人员查询","children":[]},{"menuCode":"ljyyx_rjdjc_jdjc","menuName":"监督检查录入信息","children":[]},{"menuCode":"ljyyx_rjdjc_dcl","menuName":"监督检查待处理","children":[]},{"menuCode":"ljyyx_rjdjc_ycl","menuName":"监督检查已处理","children":[]},{"menuCode":"ljyyx_rjdjc_jccx","menuName":"监督检查信息查询","children":[]}]},{"menuCode":"ljyyx_zsjh","menuName":"正式计划","children":[{"menuCode":"ljyyx_zsydjdjhb","menuName":"正式月计划","children":[]},{"menuCode":"ljyyx_zbydjdjhb","menuName":"正式增补月计划","children":[]},{"menuCode":"ljyyx_zsrjdjhb","menuName":"正式周计划","children":[]},{"menuCode":"ljyyx_zszjdjhb","menuName":"正式日计划","children":[]}]}]
         */

        private String userName;
        private String userPsw;
        private String userDisplayName;
        private String userMobilephone;
        private String userUnitId;
        private String userUnitName;
        private String userUnitType;
        private String userDeptName;
        private String userAuthority;
        private List<UserMenuAuthorityBean> userMenuAuthority;

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserPsw() {
            return userPsw;
        }

        public void setUserPsw(String userPsw) {
            this.userPsw = userPsw;
        }

        public String getUserDisplayName() {
            return userDisplayName;
        }

        public void setUserDisplayName(String userDisplayName) {
            this.userDisplayName = userDisplayName;
        }

        public String getUserMobilephone() {
            return userMobilephone;
        }

        public void setUserMobilephone(String userMobilephone) {
            this.userMobilephone = userMobilephone;
        }

        public String getUserUnitId() {
            return userUnitId;
        }

        public void setUserUnitId(String userUnitId) {
            this.userUnitId = userUnitId;
        }

        public String getUserUnitName() {
            return userUnitName;
        }

        public void setUserUnitName(String userUnitName) {
            this.userUnitName = userUnitName;
        }

        public String getUserUnitType() {
            return userUnitType;
        }

        public void setUserUnitType(String userUnitType) {
            this.userUnitType = userUnitType;
        }

        public String getUserDeptName() {
            return userDeptName;
        }

        public void setUserDeptName(String userDeptName) {
            this.userDeptName = userDeptName;
        }

        public String getUserAuthority() {
            return userAuthority;
        }

        public void setUserAuthority(String userAuthority) {
            this.userAuthority = userAuthority;
        }

        public List<UserMenuAuthorityBean> getUserMenuAuthority() {
            return userMenuAuthority;
        }

        public void setUserMenuAuthority(List<UserMenuAuthorityBean> userMenuAuthority) {
            this.userMenuAuthority = userMenuAuthority;
        }

        public static class UserMenuAuthorityBean {
            /**
             * menuCode : ljyyx_xtsy
             * menuName : 系统首页
             * children : [{"menuCode":"ljyyx_qxgl_web_xthyjm","menuName":"欢迎界面","children":[]}]
             */

            private String menuCode;
            private String menuName;
            private List<ChildrenBean> children;

            public String getMenuCode() {
                return menuCode;
            }

            public void setMenuCode(String menuCode) {
                this.menuCode = menuCode;
            }

            public String getMenuName() {
                return menuName;
            }

            public void setMenuName(String menuName) {
                this.menuName = menuName;
            }

            public List<ChildrenBean> getChildren() {
                return children;
            }

            public void setChildren(List<ChildrenBean> children) {
                this.children = children;
            }

            public static class ChildrenBean {
                /**
                 * menuCode : ljyyx_qxgl_web_xthyjm
                 * menuName : 欢迎界面
                 * children : []
                 */

                private String menuCode;
                private String menuName;
                private List<?> children;

                public String getMenuCode() {
                    return menuCode;
                }

                public void setMenuCode(String menuCode) {
                    this.menuCode = menuCode;
                }

                public String getMenuName() {
                    return menuName;
                }

                public void setMenuName(String menuName) {
                    this.menuName = menuName;
                }

                public List<?> getChildren() {
                    return children;
                }

                public void setChildren(List<?> children) {
                    this.children = children;
                }
            }
        }
    }
}
