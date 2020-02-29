new Vue({
    el: '#box',
    data: {
        headlist: [],
        activeIndex: '999',
        mainlist:[],
        searchtext:'',
    },
    created: function () {
        if(sessionStorage.getItem("strWhere")==null){
            history.back();
        }
        this.searchtext=sessionStorage.getItem("strWhere")
        this.search();
        this.getTop5();
    },
    methods: {
        search(){
            let _this=this;
            sessionStorage.setItem("strWhere",_this.searchtext)
            axios.post('vForum/queryforumbytitleordesc', "strWhere="+_this.searchtext)
                .then(function (response) {
                    _this.mainlist = response.data.data;
                })
                .catch(function (error) {
                    _this.$notify.error({
                        title: '错误',
                        position: 'bottom-right',
                        message: '搜索信息请求出错！'
                    });
                });
            sessionStorage.setItem("strWhere","")
        },
        getTop5(){
            let  _this = this;
            axios.post('tForumtype/selecttop5', {})
                .then(function (response) {
                    _this.headlist = response.data;
                })
                .catch(function (error) {
                    _this.$notify.error({
                        title: '错误',
                        position: 'bottom-right',
                        message: '头部信息请求出错！'
                    });
                });
        },
        handleSelect(key, keyPath) {
            if (key=="999"){
                window.location.href="/index.html";
            }else
            {
                sessionStorage.setItem("forumtype",key);
                this.activeIndex=sessionStorage.getItem("forumtype");
                window.location.href="/forumlist.html";
            }
        },
        toforuminfo(forumid) {
            sessionStorage.setItem("forumid", forumid);
            window.location.href = "foruminfo.html";
        }
    },

})