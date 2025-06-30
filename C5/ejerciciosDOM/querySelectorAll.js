// Cambiar el color (el que más te guste) de todos los párrafos (<p>)
let paragraphs1 = document.querySelectorAll('p');
for (let i = 0; i < paragraphs1.length; i++) {
  paragraphs1[i].style.color = 'green';
}
// Mostrar por consola cuántas etiquetas <img> hay
let images1 = document.querySelectorAll('img');
console.log(`Hay ${images.length} etiquetas <img> en el documento.`);

// Objetivo: cambiar el texto de cada <button> a "¡No hagas click aqui!"
let buttons1 = document.querySelectorAll('button');
for (let i = 0; i < buttons.length; i++) {
  buttons[i].textContent = '¡No hagas click aqui!';
}