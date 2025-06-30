
// Mostrar el valor del campo seleccionado (radio buttons)

function mostrarGenero(){
    let generos = document.getElementsByName('genero');
    for (let i = 0; i < generos.length; i++) {
        if (generos[i].checked) {
        console.log(`Género seleccionado: ${generos[i].value}`);
        break; 
        }
    }
}

// Contar cuantas casillas estan marcadas

function contarLenguajes(){
    let lenguaje = document.getElementsByName('lenguajes');
    for (let i = 0; i < lenguaje.length; i++) {
        if (lenguaje[i].checked) {
        console.log(`Género seleccionado: ${lenguaje[i].value}`);
        break; 
        }
    }
}

//Sumar valores numéricos de campos con el mismo nombre

function sumarNotas(){
    let notas = document.getElementsByName('nota');
    let suma = 0;
    for (let i = 0; i < notas.length; i++) {
        if (notas[i].value) {
            suma += parseFloat(notas[i].value);
        }
    }
    console.log(`Suma total de las notas: ${suma}`);
}