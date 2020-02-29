new Vue({
    el: '#box',
    data: {
        headlist: [],
        newforumlist: [],
        mainlist: [],
        activeIndex: '1',
        restaurants: [],
        state: '',
        searchtext: ''
    },
    created: function () {
        this.getAllForum();
        this.getTop5();
        this.getnewforum();
        this.activeIndex = sessionStorage.getItem("forumtype");
    },
    methods: {
        search() {
            let _this = this;
            sessionStorage.setItem("strWhere", _this.searchtext);
            window.location.href = "search.html";
        },
        getAllForum() {
            let _this = this;
            var id = sessionStorage.getItem("forumtype");
            axios.post('vForum/queryforumbytype', "id=" + id)
                .then(function (response) {
                    _this.mainlist = response.data.data;
                })
                .catch(function (error) {
                    _this.$notify.error({
                        title: '错误',
                        position: 'bottom-right',
                        message: '所有文章加载出错！'
                    });
                });
        },
        getnewforum() {
            let _this = this;
            var id = sessionStorage.getItem("forumtype");
            axios.post('tForum/querynewtop', "id=" + id)
                .then(function (response) {
                    _this.newforumlist = response.data.data;
                })
                .catch(function (error) {
                    _this.$notify.error({
                        title: '错误',
                        position: 'bottom-right',
                        message: '最新文章加载出错！'
                    });
                });
        },
        getTop5() {
            let _this = this;
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
            let _this = this;
            if (key == "999") {
                window.location.href = "/index.html";
            } else {
                sessionStorage.setItem("forumtype", key);
                _this.activeIndex = sessionStorage.getItem("forumtype");
                _this.getAllForum();
                _this.getnewforum();
            }
        },
        toforuminfo(forumid) {
            sessionStorage.setItem("forumid", forumid);
            window.location.href = "foruminfo.html";
        }
    },
})