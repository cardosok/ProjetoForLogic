function cadastro(user) {
  $.ajax({
      method: 'POST',
      url: `./CadastroCliente`,
      data: user,
      success : function(responseText) {
              if(responseText == "Não usuario cadastrado"){
                  alertMessage("Usuario não cadastrado");
              } else {
                  alertMessage("Usuario cadastrado");
                  setTimeout(() => {
                      //window.location.href = "./index.jsp";                      
                  }, 2000);
              }
          }
  });
}

function salvaForm() {
    let user = new Object();
  $('#form-cadastroCliente').submit(e => {
    e.preventDefault();
    user.nomeCliente = $('#nome-cliente').val();
    user.nomeContato = $('#nome-contato').val();
    user.dataIngresso = $("#datepicker").val();
    cadastro(user);
  });
}

function VerificarCampos() {
  if ($('#nome-cliente').val() !== '' && $('#nome-contato').val() !== '' && $('#datepicker').val() !== '') {
      $('#btn-cadastra').removeClass("disabled");
      $('#btn-cadastra').addClass('modal-close');
  } else {
      $('#btn-cadastra').addClass("disabled");
      $('#btn-cadastra').removeClass('modal-close');
  }
}
function date(){
    $('.datepicker').datepicker({
        weekdays: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado'],
        weekdaysAbbrev: ['D','S','T','Q','Q','S','S','D'],
        weekdaysShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'],
        months: ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro'],
        monthsShort: ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set','Out','Nov','Dez'],
        nextMonth: 'Próximo',
        previousMonth: 'Anterior',
        format: 'dd/mm/yyyy'
    });
}

$(document).ready(function() {
    date();   
  $('.require').on('keyup select change', () => {
    VerificarCampos();
  });
  salvaForm();
});