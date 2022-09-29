const email = document.getElementById('correo_1')
const password = document.getElementById('contrasenia_1')
const button = document.getElementById('boton')

button.addEventListener('click', (e) => {
    e.preventDefault();
    const data = {
        email: email.value,
        password: password.value
    }

    console.log(data)
})

