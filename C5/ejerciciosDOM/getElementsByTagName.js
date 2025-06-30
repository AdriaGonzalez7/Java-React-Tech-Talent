// Selecciona todos los elementos <h2>
let paragraphs = document.getElementsByTagName('p');
for (let i = 0; i < paragraphs.length; i++) {
    paragraphs[i].style.color = 'blue';
}

//mostrar por consola cuántas etiquetas <img> hay
let images = document.getElementsByTagName('img');
console.log(`Hay ${images.length} etiquetas <img> en el documento.`);

// Objetivo: cambiar el texto de cada <button> a "¡Clic aquí!"
let buttons = document.getElementsByTagName('button');
for (let i = 0; i < buttons.length; i++) {
  buttons[i].textContent = '¡Clic aquí!';
}
