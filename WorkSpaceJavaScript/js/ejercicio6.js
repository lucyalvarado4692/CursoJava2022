let numero = Number(prompt("Ingresa un numero"));
let j = numero;
let result = numero
for(index = 0; index < numero-1; index++){
    j--
    result *=j
}
console.log(result)