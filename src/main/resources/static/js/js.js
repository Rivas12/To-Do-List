$( document ).ready(function() {

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