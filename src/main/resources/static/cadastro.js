function cadastrarTarefa() {
    let tarefa = $("#tarefa").val();
    let data = $("#data").val();
    $.ajax({
        url: "/cadastrar",
        method: "post",
        data: {
            tarefa: tarefa,
            data: data
        },
        success: function(data) {
            $("#activity-container").append(data);
        },
        error: function() {
            alert("deu ruim");
        }
    });
}
$("#btSalvar").click(cadastrarTarefa);

function removertarefa(element) {
    let id = element.dataset.codigo;

    // Confirmação antes de excluir
    if (confirm('Tem certeza que deseja excluir esta tarefa?')) {
        $.ajax({
            url: "/empty",
            method: "post",
            data: {
                id: id
            },
            success: function(response) {

                $("#a" + id).remove();
            },
            error: function() {
                alert("Erro ao excluir a tarefa");
            }
        });
    }
}
