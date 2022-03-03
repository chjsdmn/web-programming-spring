$(() => {
    //即页面刷新后，table就出现在这里
    fetchMotor();

    $("#registrer").click(() => {
        const personner = $("#personnr");
        const navn = $("#navn");
        const adresse = $("#adresse");
        const kjennetegn = $("#kjennetegn");
        const merke = $("#merke");
        const type = $("#type");

        const motorvogn = {
            personner: personner.val(),
            navn: navn.val(),
            adresse: adresse.val(),
            kjennetegn: kjennetegn.val(),
            merke: merke.val(),
            type: type.val()
        }

        if(inputVal(motorvogn)){
            $.post("/api", motorvogn, () => {
                fetchMotor();
            })
            personner.val("");
            navn.val("");
            adresse.val("");
            kjennetegn.val("");
            merke.val("");
            type.val("");
        }
    })

    $("#slett").click(() => {
        let ok = confirm("Sikker på å slette alle?");
        if(ok){
            let jqXhr;
            let textStatus;
            $.ajax("/api", {
                type: "DELETE",
                success: () => fetchMotor(),
                error: (jqXhr, textStatus, errorMessage => console.log(errorMessage))
            })
        }
    })

})

const fetchMotor = () => {
    $.get("/api", list => {
        formatList(list);
    } )
}

const formatList = list => {
    let msg = "";
    if(list.length > 0){
        msg += "<table class='table table-striped'><tr><th>Personner</th><th>Navn</th><th>Adresse</th>" +
            "<th>Kjennetegn</th><th>Merke</th><th>type</th></tr>";

        for(let motorvogn of list){
            msg += `<tr><td>${motorvogn.personner}</td><td>${motorvogn.navn}</td><td>${motorvogn.adresse}</td>
            <td>${motorvogn.kjennetegn}</td><td>${motorvogn.merke}</td><td>${motorvogn.type}</td></tr>`;
        }

        msg += "</table>";
    }
    $("#list").html(msg);
}

const inputVal = motorvogn => {
    if (motorvogn.personner === "") return false;
    else if (motorvogn.navn === "") return false;
    else if (motorvogn.adresse === "") return false;
    else if (motorvogn.kjennetegn === "") return false;
    else if (motorvogn.merke === "") return false;
    else return motorvogn.type !== "";
}