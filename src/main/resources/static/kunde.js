$(() => {
    $("#registrer").click(() => {

        const kunde = {
            navn: $("#navn").val(),
            adresse: $("#adresse").val()
        }

        $.post("/lagrekunde", kunde, () => {

            henteAlleKunde();

            $("#navn").val("");
            $("#adresse").val("");
        })

        function henteAlleKunde() {

            $.get("/henteallekunde", (kundeList) => {
                formatKundeList(kundeList);
            })
        }


        function formatKundeList(kundeList){
            let ut = "<table class='table table-striped'>" +
                "<tr><th>Navn</th><th>Adresse</th></th>";

            for(let kunde of kundeList){
                ut += "<tr><td>" + kunde.navn +
                    "</td><td>" + kunde.adresse +
                    "</td></tr>"
            }

            $("#kundene").html(ut);
        }

        $("#slett").click(() => {
            $.post("/slett", (kundeList) => {
                henteAlleKunde(kundeList);
            })
        })

    })
})