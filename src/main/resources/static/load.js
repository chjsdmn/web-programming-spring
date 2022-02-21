$(function (){
    $("#load").click(function(){
        const url = "/load";
        //load即将含有valuta的arraylist加载，这里用post的方法，post方法可以有两个参数，第二个参数为post方法的执行状态，成功则返回success
        $.post(url,function (data, status){
            console.log(status);  //success
            if(status === "success"){
                alert("Valutaene er lastet");
            }
            else {
                alert("Valutaene er ikke lastet");
            }
        })
    })
})