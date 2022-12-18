/* EJERCITACION 9


5- si se selecciona el radiobutton “Descuento 5%” se le debe mostrar un mensaje al usuario indicándole
que la opción seleccionada es la mas indicada.
*/

function validacion() {
  //validar que ha seleccionado una provincia
  if (document.getElementById("provincias").value == "selecciona") {
    alert("Debe seleccionar una provincia");
    return false;
  }

  //validar que seleccione fecha
  if (
    isNaN(parseInt(document.getElementById("dia").value)) ||
    document.getElementById("dia").value > 31
  ) {
    alert("el campo día debe ser un número válido del mes ");
    return false;
  }

  if (
    isNaN(parseInt(document.getElementById("anio").value)) ||
    document.getElementById("anio").value > 2023
  ) {
    alert("el campo año debe ser un número válido");
    return false;
  }

  //validar que el campo nombre sea obligatorio
  nombre = document.getElementById("nombre");
  if (nombre.value == "") {
    alert("El campo Nombre esta vacio");
    return false;
  }

  //validar que el campo precio sea obligatorio
  precio = document.getElementById("precio");

  if (precio.value == "") {
    alert("El campo precio esta vacio");
    return false;
  }

  //validar que elprecio sea mayor de 120

  if (precio.value < 120) {
    alert("El campo precio debe ser mayor a 120");
    return false;
  }

  //Si se selecciona un impuesto menor a 16, debe avisársele al usuario que esta seleccionando un impuesto bajo.

  if (tasas.value < 16) {
    alert("Está seleccionando un impuesto bajo");
    return false;
  } else {
    return true;
  }
}
