function cadastro(user) {
  $.ajax({
      method: 'POST',
      url: `./CadastroAvalicao`,
      data: user,
      success : function(responseText) {
              if(responseText == "Não usuario cadastrado"){
                  alertMessage("Usuario não cadastrado");
              } else {
                  alertMessage("Usuario cadastrado");
                  setTimeout(() => {
                      clearForm();
                  }, 2000);
              }
          }
  });
}

function salvaForm() {
    let user = new Object();
    $('#form-cadastroAvaliacao').submit(e => {
      e.preventDefault();
      user.clientesCad = $('#selectCli').val();
      user.referencia = $("#datepicker").val();
      alertMessage("tes: " + user.clientesCad);
      cadastro(user);
    });
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
      format: 'mm/yyyy'
  });
}
$(document).ready(function(){
  date();
  $('select').formSelect();
  salvaForm();
  });