new Vue({
    el: '#box',
    data: {
        headlist: [],
        activeIndex: '1',
        mainlist: [],
        newforumlist:[],
        restaurants: [],
        state: '',
        searchtext: ''
    },
    created: function () {
        this.getAllType();
        this.getTop5();
        this.getForumInfo();
        this.getnewforum();
        this.activeIndex = sessionStorage.getItem("forumtype");
    },
    methods: {
        search(){
            let _this=this;
            sessionStorage.setItem("strWhere",_this.searchtext );
            window.location.href="search.html";
        },
        /**
         * 获取文章内容
         */
        getForumInfo() {
            var testEditormdView2;
            $.get("tForum/selectOne?id="+sessionStorage.getItem("forumid"), function (markdown) {

                testEditormdView2 = editormd.markdownToHTML("test-editormd-view", {
                    markdown: markdown.mdtext, //+ "\r\n" + $("#append-test").text(),
                    //htmlDecode      : true,       // 开启 HTML 标签解析，为了安全性，默认不开启
                    htmlDecode: "style,script,iframe", // you can filter tags decode
                    //toc             : false,
                    tocm: true, // Using [TOCM]
                    //tocContainer    : "#custom-toc-container", // 自定义 ToC 容器层
                    //gfm             : false,
                    //tocDropdown     : true,
                    // markdownSourceCode : true, // 是否保留 Markdown 源码，即是否删除保存源码的 Textarea 标签
                    emoji: true,
                    taskList: true,
                    tex: true, // 默认不解析
                    flowChart: true, // 默认不解析
                    sequenceDiagram: true, // 默认不解析
                });

                //console.log("返回一个 jQuery 实例 =>", testEditormdView);

                // 获取Markdown源码
                //console.log(testEditormdView.getMarkdown());

                //alert(testEditormdView.getMarkdown());
            });
        },
        getnewforum(){
            let _this = this;
            var id;
            if (sessionStorage.getItem("forumtype")==null){
                id=1;
            }else {
                id=sessionStorage.getItem("forumtype");
            }
            axios.post('tForum/querynewtop',"id="+id)
                .then(function (response) {
                    _this.newforumlist = response.data.data;
                })
                .catch(function (error) {
                    _this.$notify.error({
                        title: '错误',
                        position: 'bottom-right',
                        message: '最新文章请求出错！'
                    });
                });
        },
        getAllType() {
            let _this = this;
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
                this.activeIndex = sessionStorage.getItem("forumtype");
                window.location.href="/forumlist.html";
            }
        },
    },
})