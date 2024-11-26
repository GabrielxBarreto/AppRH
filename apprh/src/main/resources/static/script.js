document.getElementById('formVaga').addEventListener('submit', function(event) {
    const titulo = document.getElementById('titulo').value;
    const descricao = document.getElementById('descricao').value;
    const salario = document.getElementById('salario').value;

    if (!titulo || !descricao || !salario) {
        event.preventDefault();
        alert("Por favor, preencha todos os campos.");
    }
});

document.getElementById('formCandidato').addEventListener('submit', function(event) {
    const nomeCandidato = document.getElementById('nomeCandidato').value;
    const rg = document.getElementById('rg').value;

    if (!nomeCandidato || !rg) {
        event.preventDefault();
        alert("Por favor, preencha todos os campos.");
    }
});
