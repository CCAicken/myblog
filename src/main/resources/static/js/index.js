
new Vue({
    el: '#box',
    data: {
        headlist: [],
        activeIndex: '999',
        mainlist:[],
        searchtext:'',
    },
    created: function () {
        this.getAllType();
        this.getTop5();
    },
    methods: {
        search(){
            let _this=this;
            sessionStorage.setItem("strWhere",_this.searchtext );
            window.location.href="search.html";
        },
        getAllType() {
            let  _this = this;
            axios.post('tForumtype/selectall', {})
                .then(function (response) {
                    _this.mainlist = response.data;
                })
                .catch(function (error) {
                    _this.$notify.error({
                        title: '错误',
                        position: 'bottom-right',
                        message: '内容信息请求出错！'
                    });
                });
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
        toList(forumtype){
            sessionStorage.setItem("forumtype",forumtype);
            this.activeIndex=sessionStorage.getItem("forumtype");
            window.location.href="/forumlist.html";
        }
    },

})