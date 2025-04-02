document.getElementById("loginForm").addEventListener("submit", function(event) {
    event.preventDefault();

    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    const message = document.getElementById("message");

    if (username === "admin" && password === "1234") {
        message.style.color = "green";
        message.textContent = "Login bem-sucedido!";

        setTimeout(() => {
            window.location.href = "view.html";
        }, 1000);
    } else {
        message.style.color = "red";
        message.textContent = "Usuário ou senha incorretos.";

        setTimeout(() => {
            window.location.href = "index.html";
        }, 1000);
    }
});
