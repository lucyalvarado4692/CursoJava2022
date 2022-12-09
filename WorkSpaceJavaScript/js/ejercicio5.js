
let letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B','N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];
let letraIngresadaPorUsuario = prompt("Ingresa la letra de tu dni:")
let numero = Number(prompt("Ingresa el numero de tu dni:"));
let dni = numero;
const cociente = 23
let result = dni % numero
console.log(result)
if(result < 0 || result > 99999999){
    alert("el número proporcionado no es válido")
}else{
    for(index = 0; index < letras.length; index ++){
        if(index == result){
        letraPorOperacion= letras[result]
        console.log(letraPorOperacion)
        if(!(letraIngresadaPorUsuario == letraPorOperacion)){
            alert("la letra que ha indicado no es correcta.")
        }else{
            alert("el número y la letra de DNI son correctos.")
        }
        }
    }
}


// for(index = 0; index <= result; index ++){
//     console.log("funciona el for")
//     if(index == result){
//         console.log(letras[result])
//     }