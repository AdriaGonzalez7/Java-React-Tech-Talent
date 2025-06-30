// Cambiar el color de los elementos con clase destacado a rojo
let paragraphs2 = document.getElementsByClassName('destacado');
for (let i = 0; i < paragraphs2.length; i++) {
  paragraphs2[i].style.color = 'red';
}

// Aumentar el tamaño de letra de los elementos con clase titulo

let titles = document.getElementsByClassName('titulo');
for (let i = 0; i < titles.length; i++) {
  titles[i].style.fontSize = '2em';
}

// Oculatar elementos
let hiddenElements = document.getElementsByClassName('ocultar');
for (let i = 0; i < hiddenElements.length; i++) {
  hiddenElements[i].style.display = 'none';
}