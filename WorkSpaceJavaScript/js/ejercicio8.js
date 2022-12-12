window.onload = function() {
    let info1 = document.getElementById("informacion1");
    let info3 = document.getElementById("informacion2")
  
    // Numero de enlaces de la pagina
    let enlaces = document.getElementsByTagName("a");
    info1.innerHTML = "Numero de enlaces = "+enlaces.length;
  

    // Direccion del ultimo enlace
    var mensaje = "El ultimo enlace apunta a: "+enlaces[enlaces.length-1].href;
    info1.innerHTML = info1.innerHTML + "<br/>" +  "<br/>" +mensaje;

    // Numero de parrafos de la pagina
    let parrafos = document.getElementsByTagName("p");
    info3.innerHTML = "Numero de parrafos = "+parrafos.length;

    //crear Parrafo
    function agregar(){
        var parrafo = document.createElement("p");
        var texto = document.createTextNode("parrafo de prueba");
        elemento.appendChild(texto);
        var nuevoElemento = document.getElementById("nuevoElemento");
        nuevoElemento.appendChild(parrafo);
        nuevoElemento.innerHTML = nuevoElemento.innerHTML + parrafo;
    }


  
}