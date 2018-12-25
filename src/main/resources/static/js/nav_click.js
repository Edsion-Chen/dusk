function loginOut() {
    $.ajax({
        url:"/login/loginout",
        success:function () {
            window.location.href= "http://localhost:1120/index.html";
        },error:function () {
            alert("请重试");
        }
    })
}