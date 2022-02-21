$(function (){
    $("#beregn").click(function (){
        let sort = $("#sort").val();
        let verdi = $("#verdi").val();
        const belop = {
            valutaSort : sort,  //传参的名字一定要跟对象的属性一样！！！！！！！否则报错！！！！！！
            verdi : verdi
        }
        console.log(belop);
        const url = "/belop";
        $.get(url, belop, function (data){
            console.log(data);
            if(data !== 0.0){
                let ut = verdi + " " + sort + " blir " + data + " NOK.";
                $("#vis").html(ut);
            }
            else {
                $("#vis").html("Fant ikke valutasort.");
            }

        })
    })
})