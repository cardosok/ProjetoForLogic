let resMes = [];

function pegaTodasAvaliacoes() {
    $.ajax({
        method: 'GET',
        url: `./BuscaResultados`,
        datatype:'json',
        headers:{
          Accept: "application/json; charset=utf-8",  
          "Content-Type" : "application/json; charset=utf-8"
        },
        success:function(res){
            var data = jQuery.parseJSON(res)
            successMessage(data);
        },
        error: errorMessage,
    });
}

function successMessage(data) {
    alertMessage('Ok');
    console.log('Publicações encontradas com sucesso --> length: ' + data.length);
    if (!data) return;

    resMes = data ? data : [];
    ListaAvaliacoes(resMes);
}


function errorMessage() {
    alertMessage('Erro ao buscas avaliações');
}

function ListaAvaliacoes(resMes) {
    $('#exibe-resultado').html('');
    if (resMes.length == 0) {
        $('#exibe-resultado').append(noPublications('stop_screen_share', 'Não foi encontrada avaliações'));
    } else {
        resMes.forEach((resMes) => {
            $('#exibe-resultado').append(insertInformationsCard(resMes));
            
        });
        verficaVal();
    }
}

function noPublications(icon, message) {
    alertMessage('nao achei publicacao');
    let html = `<div class="center-align blue-grey-text text-darken-2" style="margin: 200px 0;">
                    <i class="large material-icons" id="img-not-found">${icon}</i>
                    <h6>${message}</h6>
                </div>
                `;
    return html;
}

function insertInformationsCard(resMes) {
   alertMessage('Achei publicacao'); 
    let html = `
        <li class="collection-item grey lighten-3">
            <span class="title" id="title" name="title"><h5 class="blue-grey-text text-darken-4">${resMes.Mes_Ano_ref}</h5></span>
            <div class="grey lighten-4">
                <p class="text-bold margin-bottom-2" id="resultados" name="resultados">${resMes.cliParticiparam}</p>
                <p id = "color">${resMes.meta}</p>
            </div>
        </li>`;
    return html;
}
function verficaVal(){
    if(resMes.meta < 59.99){
        //$('#color').addClass('red-text');
       $('#color').addClass('card-panel red');
    }else if(resMes >= 60 && resMes.meta < 79.99){
        $('#color').addClass('yellow-text');
    }else{
        $('#color').addClass('green-text');
    }
}
$(document).ready(function() {
    pegaTodasAvaliacoes();
    ListaAvaliacoes(resMes);
    verficaVal();
});