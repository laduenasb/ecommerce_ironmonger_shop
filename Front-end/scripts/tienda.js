

async function obtener_productos (uri_productos,categoria) {
    // Enviar petición de tipo Get
    const productos_resp = await fetch(uri_productos+categoria)
    //console.log(resp)
    const productos_json = await productos_resp.json()
    //console.log(productos_json)
    return productos_json
  }


function mostrar_productos(productos,id_categoria) {
    const categoria=document.getElementById(id_categoria)
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
    //console.log(div_productos)
    categoria.innerHTML+=div_productos
}

function preview_products(productos){
    const preview=document.getElementById("preview-products")
    let div_preview=``
    for(let kk=0;kk<productos.length;kk++){
        div_preview+=`
        <div class="preview active" data-target="p-${productos[kk].producto_id}">
            <i class="fas fa-times" aria-hidden="false"></i>
            <img src="/img/logo.png" alt="">
            <h3>${productos[kk].nombre}</h3>
            <p>${productos[kk].descripcion}</p>
            <div class="precio">$${productos[kk].precio}</div>
            <div class="botones">
                <a href="#" class="comprar">Comprar</a>
                <a href="#" class="carro">Añadir al carro</a>
            </div>
        </div>
        `
    }
    // console.log(div_preview)
    preview.innerHTML+=div_preview
}



async function main(){
    let uri_productos="http://localhost:8083/api/v1/producto/encontrarProductosPorCategoria/"
    const productos_1= await obtener_productos(uri_productos,"Pinturas")
    const productos_2= await obtener_productos(uri_productos,"Herramientas-Maquinaria")
    mostrar_productos(productos_1,"pinturas")
    mostrar_productos(productos_2,"herramientas-maquinaria")
    preview_products(productos_1)
    preview_products(productos_2)
}

main()

