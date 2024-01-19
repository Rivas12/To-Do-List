$( document ).ready(function() {

    $("input").attr("autocomplete", "off");

    $("#add-task-bottom").click(function() {
        $("#form-add-task").slideToggle("fast");
    });

    $('#form-principal').submit(function (event) {
        event.preventDefault(); // Impede o envio padrão do formulário

        // Coleta os dados do formulário
        var dadosDoFormulario = {
            membro_nome: $('#membro_nome').val(),
            membro_avatar: $('#membro_avatar').val(),
            task_nome: $('#task_nome').val(),
            prioridade: $('#prioridade').val(),
        };

        // Enviar dados via AJAX
        $.ajax({
            url: '/salvar',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(dadosDoFormulario),
            success: function (data) {
                location.reload()
            },
            error: function (error) {
                console.error('Erro ao enviar dados:', error);
            }
        });
    });

    changeAvatar()


});

// Função para marcar uma tarefa como concluída
function taskDone(id){
    // Enviar dados via AJAX (DELETE)
    $.ajax({
        url: '/deletar/' + id,
        type: 'DELETE',
        contentType: 'application/json',
        success: function (data) {
            console.log('Dados deletados:');
            location.reload()
        },
        error: function (error) {
            console.log('Erro ao enviar dados:', error);
        }
    });
}

// Função para alterar dinamicamente o avatar
function changeAvatar() {
    // Gera um número aleatório entre 1 e 11
    var numeroSorteado = Math.floor(Math.random() * 20) + 1;

    // Constrói a URL do novo avatar com base no número sorteado
    var novaUrlAvatar = "http://localhost:8080/avatares/png/" + numeroSorteado + ".png";

    // Atualiza o atributo 'src' da imagem com o id 'avatarMembro'
    $("#avatarMembro").attr("src", novaUrlAvatar);

    $("#membro_avatar").val(numeroSorteado)
}