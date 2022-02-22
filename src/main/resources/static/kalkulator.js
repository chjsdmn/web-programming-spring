$(() => {
    function sjekk(tall1S, tall2S){
        let tall1 = Number(tall1S);
        let tall2 = Number(tall2S);
        if(isNaN(tall1) || isNaN(tall2)){
            $("#ut").html("Må skriv inn taller");
            return false;
        }
        return true;
    }
    $("#pluss").click(() => {
        let tall1S = $("#tall1").val();
        let tall2S = $("#tall2").val();
        if(!sjekk(tall1S, tall2S)) return;
        $.get("/pluss?tall1S="+tall1S+"&tall2S="+tall2S, data => {
            $("#ut").html(data);
        })
    })

    $("#minus").click(() => {
        let tall1S = $("#tall1").val();
        let tall2S = $("#tall2").val();
        if(!sjekk(tall1S, tall2S)) return;
        $.get("/minus?tall1S="+tall1S+"&tall2S="+tall2S, data => {
            $("#ut").html(data);
        })
    })

    $("#mulit").click(() => {
        let tall1S = $("#tall1").val();
        let tall2S = $("#tall2").val();
        if(!sjekk(tall1S, tall2S)) return;
        $.get("/multi?tall1S="+tall1S+"&tall2S="+tall2S, data => {
            $("#ut").html(data);
        })
    })

    $("#dele").click(() => {
        let tall1S = $("#tall1").val();
        let tall2S = $("#tall2").val();
        if(!sjekk(tall1S, tall2S)) return;
        $.get("/dele?tall1S="+tall1S+"&tall2S="+tall2S, data => {
            $("#ut").html(data);
        })
    })
})