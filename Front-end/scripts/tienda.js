

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

//////////////////////

function updatePage(productos,nombre_categoria) {
    const categorias=document.getElementById(nombre_categoria)
    for(let kk=0;kk<productos.length;kk++){
        categorias.innerHTML += `<div class="card m-3" style="width: 18rem;" id="${productos[kk].producto_id}">
                                            <img src="${productos[kk].imagen}" class="card-img-top" alt="...">
                                            <div class="card-body">
                                            <h5 class="card-title"><span class="bold"> ${productos[kk].nombre}<span></h5>
                                            <p class="card-text"><span class="bold"> Descripcion: </span>${productos[kk].descripcion}</p>
                                            <p class="card-text"><span class="bold">Precio: </span>${productos[kk].precio} </p>
				<div class="row">
<button type="button" class="btn btn-light" data-toggle="modal" data-target="#myModal${productos[kk].producto_id}">Ver mas</button>
<p></p>
<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#myModalConfirm${productos[kk].producto_id}" >Eliminar</button>
</div>
                                              <div class="d-flex justify-content-center mt-4">
                                            </div>
                                        </div>
                                                          <!-- Modal -->
                                        <div class="modal fade" id="myModal${productos[kk].producto_id}" role="dialog">
                                          <div class="modal-dialog">
                                          
                                            <!-- Modal content-->
                                            <div class="modal-content">
                                              <div class="modal-header">
                                                <h5 class="modal-title">Detalles</h5>
                                                
                                              </div>
                                              <div class="modal-body">
                          <p> <span class="bold">Nombre:</span> ${productos[kk].nombre}</p>
                          <p> <span class="bold">Descripcion:</span> ${productos[kk].descripcion}</p>
                          <p> <span class="bold">Precio:</span> $${productos[kk].precio}</p>
                          <p> <span class="bold">Sku:</span> ${productos[kk].sku}</p>  
                                                
                                              </div>
                                              <div class="modal-footer">
                    <button type="button" class="btn btn-warning" data-dismiss="modal">Close</button>
<button type="button" class="btn btn-success" data-toggle="modal" data-target="#myModalEditar${productos[kk].producto_id}" >Editar</button>
                                              </div>
                                            </div>
                                            
                                          </div>
                                        </div>

<div class="modal"  id="myModalEditar${productos[kk].producto_id}">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Editar producto</h5>
      </div>
      <div class="modal-body">
        <form>
          
                    <div class="form-group row">
            <label for="nombre${productos[kk].producto_id}" class="col-sm-2 col-form-label">Nombre</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="nombre${productos[kk].producto_id}" value="${productos[kk].nombre}" >
            </div>
          </div>

                    <div class="form-group row">
            <label for="categoria${productos[kk].producto_id}" class="col-sm-2 col-form-label">Categoria</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="categoria${productos[kk].producto_id}" value="${productos[kk].categoria.categoria_id}" >
            </div>
          </div>

					<div class="form-group row">
            <label for="precio${productos[kk].producto_id}" class="col-sm-2 col-form-label">Precio</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="precio${productos[kk].producto_id}" value="${productos[kk].precio}" >
            </div>
          </div>

					<div class="form-group row">
            <label for="imagen${productos[kk].producto_id}" class="col-sm-2 col-form-label">Imagen</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="imagen${productos[kk].producto_id}" value="${productos[kk].imagen}" >
            </div>
          </div>

					<div class="form-group row">
            <label for="peso${productos[kk].producto_id}" class="col-sm-2 col-form-label">Peso</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="peso${productos[kk].producto_id}" value="${productos[kk].peso}" >
            </div>
          </div>

					<div class="form-group row">
            <label for="descripcion${productos[kk].producto_id}" class="col-sm-2 col-form-label">Descripción</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="descripcion${productos[kk].producto_id}" value="${productos[kk].descripcion}" >
            </div>
          </div>

                    <div class="form-group row">
            <label for="miniatura${productos[kk].producto_id}" class="col-sm-2 col-form-label">Miniatura</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="miniatura${productos[kk].producto_id}" value="${productos[kk].miniatura}" >
            </div>
          </div>

                    <div class="form-group row">
            <label for="sku${productos[kk].producto_id}" class="col-sm-2 col-form-label">Sku</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="sku${productos[kk].producto_id}" value="${productos[kk].sku}" >
            </div>
          </div>

                    <div class="form-group row">
            <label for="stock${productos[kk].producto_id}" class="col-sm-2 col-form-label">Stock</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="stock${productos[kk].producto_id}" value="${productos[kk].stock}" >
            </div>
          </div>
					
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-warning" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-success" onclick="setNewInfoProducto('${productos[kk].producto_id}','categoria${productos[kk].producto_id}', 'precio${productos[kk].producto_id}', 'nombre${productos[kk].producto_id}', 'peso${productos[kk].producto_id}', 'descripcion${productos[kk].producto_id}', 'miniatura${productos[kk].producto_id}','imagen${productos[kk].producto_id}','sku${productos[kk].producto_id}','stock${productos[kk].producto_id}')">Editar</button>
				
      </div>
    </div>
  </div>
</div>

<div class="modal"  id="myModalConfirm${productos[kk].producto_id}">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Confirmación</h5>
        
      </div>
      <div class="modal-body">
        <p>¿Está seguro que quiere borrar el heroe?</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
        <button type="button" class="btn btn-danger" onclick="deleteProducto('${productos[kk].producto_id}')">Si</button>
				
      </div>
    </div>
  </div>
</div>
                                        `
      
    }
}


const API = 'https://superheroes-project-default-rtdb.firebaseio.com/heroes'

const getAll = async() => {
    const response = await fetch(API + '.json')
    const data = await response.json()
    globalData = data
    console.log(data)
    updatePage()
}

const getHeroe = async(id) => {
    const URL = `${API}/${id}.json`
    const response = await fetch(URL)
    const data = await response.json()
    console.log(data);
}

const getInfoProducto = ()=>{
    const uri_up_product="https://ferreteria-ecommerce-backend.herokuapp.com/api/v1/producto/guardarProducto"
	let producto = {
            categoria_id:document.getElementById("categoria_id").value,
            precio:document.getElementById("precio").value,
			nombre: document.getElementById('nombre').value,
			peso: document.getElementById('peso').value,
			descripcion: document.getElementById("descripcion").value,
			miniatura: document.getElementById('miniatura').value,
			imagen: document.getElementById('imagen').value,
			sku: document.getElementById("sku").value,
			stock: document.getElementById("stock").value
			}
    //console.log(producto)
	addProducto(uri_up_product,producto)
}

// const setNewInfoProducto = (categoria_id, precio, nombre, peso, descripcion, miniatura, imagen, sku, stock)=>{
const setNewInfoProducto = (prod_id,categoria_id,precio,nombre,peso,descripcion,miniatura,imagen,sku,stock)=>{
	let newProducto = {
        producto_id:prod_id,
        categoria_id:document.getElementById(categoria_id).value,
        precio:document.getElementById(precio).value,
        nombre: document.getElementById(nombre).value,
        peso: document.getElementById(peso).value,
        descripcion: document.getElementById(descripcion).value,
        miniatura: document.getElementById(miniatura).value,
        imagen: document.getElementById(imagen).value,
        sku: document.getElementById(sku).value,
        stock: document.getElementById(stock).value
        }
    //console.log(newProducto)
	updateProducto(newProducto)
}

const addProducto = async(uri_update_productos,producto) => {
    const response = await fetch(uri_update_productos, {
        method: 'POST',
        body: JSON.stringify(producto),
        headers: {
            'Content-Type': 'application/json'
        }
    })
    const data = await response.json()
		location.reload()
}

const updateProducto = async(producto) => {
    const up_producto="https://ferreteria-ecommerce-backend.herokuapp.com/api/v1/producto/actualizarProducto"
    const response = await fetch(up_producto, {
        method: 'PUT', // POST, PUT, DELETE
        body: JSON.stringify(producto),
        headers: {
            'Content-Type': 'application/json'
        }
    })
    const data = await response.json()
    location.reload()
}

const deleteProducto = async(producto_id) => {
    const uri_delete_producto="https://ferreteria-ecommerce-backend.herokuapp.com/api/v1/producto/eliminarProducto"
    const response = await fetch(`${uri_delete_producto}/${producto_id}`, {
        method: 'DELETE',
    })
    const data = await response.json();
	location.reload()
}

//////////////////////

async function main(){
    let uri_productos="https://ferreteria-ecommerce-backend.herokuapp.com/api/v1/producto/encontrarProductosPorCategoria/"
    const productos_1= await obtener_productos(uri_productos,"Pinturas")
    const productos_2= await obtener_productos(uri_productos,"Herramientas-Maquinaria")
    // mostrar_productos(productos_1,"pinturas")
    // mostrar_productos(productos_2,"herramientas-maquinaria")
    // preview_products(productos_1)
    // preview_products(productos_2)
    updatePage(productos_1,"pinturas")
    updatePage(productos_2,"herramientas-maquinaria")
}

main()

