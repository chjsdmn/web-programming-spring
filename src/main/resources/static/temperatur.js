$(() => {
    $("#visTemp").click(() => {
        let maned = $("#maned").val();
        $.get("/temp?maned="+maned, temp => {
            if(temp !== 0){
                $("#ut").html("Gjennomsnitt temperatur til " + maned + " er " + temp + "C");
            }
            else {
                $("#ut").html("Du har oppgitt ugyldig måned.");
            }

        })
    })
})