const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmjobfi/",
            name: "ssmjobfi",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmjobfi/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "教资考前指导系统"
        } 
    }
}
export default base
