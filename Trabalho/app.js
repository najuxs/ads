// Adiciona um ouvinte de evento ao formulário de login para capturar o evento de submissão
document.getElementById("loginForm").addEventListener("submit", function(event) {
    // Impede o comportamento padrão de envio do formulário (evita o recarregamento da página)
    event.preventDefault();

    // Obtém os valores inseridos pelo usuário nos campos de nome de usuário e senha
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    // Seleciona o elemento onde as mensagens de sucesso ou erro serão exibidas
    const message = document.getElementById("message");

    // Verifica se o nome de usuário e a senha estão corretos (hardcoded como "admin" e "1234")
    if (username === "admin" && password === "1234") {
        // Se as credenciais estiverem corretas, altera a cor da mensagem para verde e exibe uma mensagem de sucesso
        message.style.color = "green";
        message.textContent = "Login bem-sucedido!";

        // Aguarda 1 segundo e redireciona para a página 'view.html'
        setTimeout(() => {
            window.location.href = "view.html";
        }, 1000);
    } else {
        // Se as credenciais estiverem incorretas, altera a cor da mensagem para vermelho e exibe uma mensagem de erro
        message.style.color = "red";
        message.textContent = "Usuário ou senha incorretos.";

        // Aguarda 1 segundo e redireciona para a página 'index.html' (página de login)
        setTimeout(() => {
            window.location.href = "index.html";
        }, 1000);
    }
});
