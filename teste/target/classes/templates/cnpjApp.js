function checkCNPJ(cnpj) {
    $.ajax({
        'url': `https://receitaws.com.br/v1/cnpj/` + cnpj.replace(/[^0-9]/g, ''),
        'type': "GET",
        'dataType': "jsonp",
        'success': function (data) {
            console.log(data)
            if (data.nome == undefined) {
                alert(data.status + ' ' + data.message)
                document.getElementById('razaosocial').value = '';
                document.getElementById('fantasia').value = '';
                document.getElementById('logradouro').value = '';
                document.getElementById('numero').value = '';
                document.getElementById('municipio').value = '';
                document.getElementById('uf').value = '';
            } else {
                document.getElementById('razaosocial').value = data.nome;
                document.getElementById('fantasia').value = data.fantasia;
                document.getElementById('logradouro').value = data.logradouro;
                document.getElementById('numero').value = data.numero;
                document.getElementById('municipio').value = data.municipio;
                document.getElementById('uf').value = data.uf;
            }

        }
    })
}

//03.561.845/0001-44

