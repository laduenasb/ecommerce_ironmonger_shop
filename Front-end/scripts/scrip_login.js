const email = document.getElementById('correo_1')
const password = document.getElementById('contrasenia_1')
const button = document.getElementById('boton')

async function obtener_cliente (uri_cliente,correo) {
    // Enviar petición de tipo Get
    const cliente_resp = await fetch(uri_cliente+correo)
    //console.log(resp)
    const cliente_json = await cliente_resp.json()
    //console.log(cliente_json)
    return cliente_json
  }

button.addEventListener('click', (e) => {
    e.preventDefault();
    const data = {
        email: email.value,
        password: password.value
    }
    let uri_cliente="https://ferreteria-ecommerce-backend.herokuapp.com/api/v1/cliente/obtenerClientePorCorreo/"
    const cliente= obtener_cliente(uri_cliente,data.email)
    console.log(cliente)
})

