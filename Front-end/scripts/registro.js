const URL_API="https://ferreteria-ecommerce-backend.herokuapp.com/api/v1/cliente/guardarCliente"

const cedula=document.getElementById("cedula")
const nombre=document.getElementById("nombre")
const apellidos=document.getElementById("apellidos")
const numero_celular=document.getElementById("numero_celular")
const direccion_pedido=document.getElementById("direccion_pedio")
const correo=document.getElementById("correo_2")
const contrasenia=document.getElementById("contrasenia_2")

function getDataForm(e){
    e.preventDefault()
    const form=e.target
    const cliente={
        cedula:form.cedula.value,
        nombre:form.nombre.value,
        apellidos:form.apellidos.value,
        numero_celular:form.numero_celular.value,
        direccion_pedido:form.direccion_pedido.value,
        correo:form.correo_2.value,
        contrasenia:form.contrasenia_2.value
    }
    // console.log(form.cedula.value)
    //console.log(cliente)
    sendDataCreate(cliente)

    clearInputs(form)
}

async function sendDataCreate (cliente) {
    // Enviar petición
    const resp = await fetch(URL_API, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(cliente)
    })
    const text = await resp.text()
    alert(text)
  }

  function clearInputs (form) {
    form.cedula.value=""
    form.nombre.value = ""
    form.apellidos.value = ""
    form.numero_celular.value = ""
    form.direccion_pedido.value=""
    form.correo_2.value = ""
    form.contrasenia_2.value = ""
  }
  