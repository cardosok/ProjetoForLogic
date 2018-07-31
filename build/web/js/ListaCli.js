let clientes = [];

function getAllPublications() {
    $.ajax({
        method: 'GET',
        url: `./ListaClientes`,
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
    console.log('clientes encontrados --> length: ' + data.length);
    if (!data) return;

    clientes = data ? data : [];

    listaClientes(clientes);
}

function errorMessage(err) {
    alertMessage('Erro ao buscas publicações.' + err);
}

function listaClientes(clientes) {
    
    console.log('entrei no lista ' + clientes.nomeCliente);
    $('#selectCli').html('');
   $('#selectCli').formSelect().destroy;
    if (clientes.length == 0) {
        $('#selectCli').append(alertMessage("Não tem clientes cadastrados"));
    } else {
        
        $('#selectCli').find('option').remove();
        clientes.forEach(function(clientes){
            console.log('entrei no lista ' + clientes.nomeCliente);   
             $('<option>').val(clientes.nomeCliente).text(clientes.nomeCliente).appendTo('#selectCli');
        });
    }
}


$(document).ready(function() {
     $('#selectCli').formSelect();
        getAllPublications();
    //    listCardPublications(publications);
});
