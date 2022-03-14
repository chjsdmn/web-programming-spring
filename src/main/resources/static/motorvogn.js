$(() => {
    //即页面刷新后，table就出现在这里
    carList();
    fetchMotor();
    //not sure about why two buttens have to put inside ready function......
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
        else{
            console.log("Wrong input");
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

const carList = () => {
    $.get("/api/carList", carList => {
        formaterMerke(carList);
    })
}

const fetchMotor = () => {
    $.get("/api/hentMotor", list => {
        formatList(list);
    } )
}

const formaterMerke = carList => {

    let ut = "<select id='merke' class='form-control'>" +
        "<option disabled selected value>Velg merke</option>";

    //注意这里是如何将重复的merke排除在外的！！每次不同就重置变量
    let merke = "";

    for(let car of carList){
        if(car.merke !== merke){
            merke = car.merke;
            ut += `<option>${merke}</option>`;
        }
    }

    ut += "</select>";

    $("#merkeList").html(ut);

    //要用.change()来call type的下来菜单！！！！
    $("#merke").change(() => {
        formaterType(carList);
    })
}

const formaterType = carList => {

    let ut = "<select id='type' class='form-control'>" +
        "<option disabled selected value>Velg type</option>";

    let valgtMerke = $("#merke").val();

    for(let car of carList){
        if(car.merke === valgtMerke){
            ut += `<option>${car.type}</option>`;
        }
    }

    ut += "</select>";

    $("#typeList").html(ut);
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
    else if (motorvogn.merke === null) return false;
    else return motorvogn.type !== null;
}