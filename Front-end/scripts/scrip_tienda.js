let preveiwContainer = document.querySelector('.productos-preview');
let previewBox = preveiwContainer.querySelectorAll('.preview');

document.querySelectorAll('.contenedor-productos .producto').forEach(producto =>{
producto.onclick = () =>{
    // preveiwContainer.style.display = 'flex';
    let name = producto.getAttribute('data-name');
    previewBox.forEach(preview =>{
    let target = preview.getAttribute('data-target');
    if(name == target){
        preview.classList.add('active');
    }
    });
};
});

previewBox.forEach(close =>{
close.querySelector('.fa-times').onclick = () =>{
    close.classList.remove('active');
    preveiwContainer.style.display = 'none';
};
});


const liItem = document.querySelectorAll('ul li');
const catItem = document.querySelectorAll('.productos .contenedor');

liItem.forEach(li => {
    li.onclick = function() {
    //active
    liItem.forEach(li => {
        li.className = "";
    })
    li.className = "active";

    //Filter
    const value = li.textContent;
    catItem.forEach(contenedor => {
        contenedor.style.display = 'none';
        if (contenedor.getAttribute('data-filter') == value.toLowerCase()) {
            contenedor.style.display = 'flex';
        
        }
    })
    }
});