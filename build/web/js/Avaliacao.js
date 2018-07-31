function salva(user) {
    $.ajax({
        method: 'POST',
        url: ``,
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
    $('#form-Avaliacao').submit(e => {
      e.preventDefault();
      user.nomeCliente = $('#nome-cliente').val();
      user.motivoNota = $('#motivo-nota').val();
      user.slider = $("#slider").val();
      alertMessage(user.nomeCliente);
      alertMessage(user.motivoNota);
      alertMessage(user.slider);
      //salva(user);
    });
  }
  
  function VerificarCampos() {
    if ($('#nome-cliente').val() !== '' && $('#motivo-nota').val() !== '') {
        $('#btn-salva').removeClass("disabled");
        $('#btn-salva').addClass('modal-close');
    } else {
        $('#btn-salva').addClass("disabled");
        $('#btn-salva').removeClass('modal-close');
    }
  }

  $(document).ready(function() {      
    $('.require').on('keyup select change', () => {
      VerificarCampos();
    });
    salvaForm();
  });