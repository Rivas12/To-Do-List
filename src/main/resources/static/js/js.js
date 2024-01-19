// Aguarda o documento HTML ser completamente carregado antes de executar o código
$(document).ready(function() {

    // Quando o elemento com o id 'add-task-bottom' é clicado
    $("#add-task-bottom").click(function() {
        // Altera a visibilidade do formulário com o id 'form-add-task' usando slideToggle
        $("#form-add-task").slideToggle("fast");
    });

    // Quando o formulário com o id 'form-principal' é submetido
    $('#form-principal').submit(function (event) {
        // Impede o envio padrão do formulário
        event.preventDefault();

        // Coleta os dados do formulário
        var dadosDoFormulario = {
            membro_nome: $('#membro_nome').val(),
            membro_avatar: $('#membro_avatar').val(),
            task_nome: $('#task_nome').val(),
            prioridade: $('#prioridade').val(),
        };

        // Enviar dados via AJAX (método POST)
        $.ajax({
            url: '/salvar',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(dadosDoFormulario),
            success: function (data) {
                // Recarrega a página após o sucesso da requisição AJAX
                location.reload();
            },
            error: function (error) {
                // Exibe mensagem de erro no console se houver algum problema
                console.error('Erro ao enviar dados:', error);
            }
        });
    });

});

// Função para marcar uma tarefa como concluída
function taskDone(id){
    // Enviar dados via AJAX (método DELETE)
    $.ajax({
        url: '/deletar/' + id,
        type: 'DELETE',
        contentType: 'application/json',
        success: function (data) {
            // Exibe mensagem de sucesso no console
            console.log('Dados deletados:');
            // Recarrega a página após o sucesso da requisição AJAX
            location.reload();
        },
        error: function (error) {
            // Exibe mensagem de erro no console se houver algum problema
            console.log('Erro ao enviar dados:', error);
        }
    });
}
