let numero = Number(prompt("Ingresa un numero"));
let operacion = numero % 2;
if(operacion == 0){
    alert("el numero es par")
}else{alert("el numero es impar")}

let cadena = prompt("Ingresa una oracion");

let resultado = "La cadena \""+cadena+"\" ";

  if(cadena == cadena.toUpperCase()) {
    resultado += " está formada sólo por mayúsculas";
  }
  else if(cadena == cadena.toLowerCase()) {
    resultado += " está formada sólo por minúsculas";
  }
  else {
    resultado += " está formada por mayúsculas y minúsculas";
  }

console.log(resultado)