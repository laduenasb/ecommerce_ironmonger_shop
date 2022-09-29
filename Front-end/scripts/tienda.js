

async function obtener_productos (uri_productos) {
    // Enviar petición de tipo Get
    const productos_resp = await fetch(uri_productos)
    //console.log(resp)
    const productos_json = await productos_resp.json()
    console.log(productos_json)
    return productos_json
  }


function mostrar_productos(productos) {
    const herramientas_maquinaria=document.getElementById("herramientas-maquinaria")
    let div_productos=``
    for(let kk=0;kk<productos.length;kk++){
        div_productos+=`
            <div class="producto" data-name="p-${productos[kk].producto_id}">
                <img src="/img/logo.png" alt="">
                <h3>${productos[kk].nombre}</h3>
                <div class="precio">$${productos[kk].precio}</div>
            </div>
        `
    }
    herramientas_maquinaria.innerHTML+=div_productos
}



async function main(){
    const uri_productos="http://localhost:8083/api/v1/producto/obtenerProductos"
    const productos= await obtener_productos(uri_productos)
    mostrar_productos(productos)
}

main()

