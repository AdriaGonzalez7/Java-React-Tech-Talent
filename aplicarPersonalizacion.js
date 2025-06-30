function aplicarPersonalizacion() {
    const texto = document.getElementById("inputTexto").value;
    const color = document.getElementById("inputColor").value;
    const fuente = document.getElementById("fuente").value;
    const estilo = document.getElementById("estilo").value;
    const tamanio = document.getElementById("tamanioFuente").value;

    const capaTexto = document.getElementById("textoPersonalizado");
    capaTexto.innerText = texto || "Tu texto aquí";
    capaTexto.style.color = color;
    capaTexto.style.fontFamily = fuente;
    capaTexto.style.fontSize = `${tamanio}px`;

    document.getElementById("previewTamanio").innerText = `${tamanio}px`;

    capaTexto.style.fontStyle = estilo.includes("italic")
      ? "italic"
      : "normal";
    capaTexto.style.fontWeight = estilo.includes("bold") ? "bold" : "normal";
  }

  let contadorTextos = 1;

  function agregarTexto() {
    const zona = document.querySelector(".producto-preview");

    const nuevoTexto = document.createElement("div");
    nuevoTexto.className = "texto-sobre-img";
    nuevoTexto.innerText = `Nuevo texto ${contadorTextos++}`;
    nuevoTexto.contentEditable = true;
    nuevoTexto.style.left = "50%";
    nuevoTexto.style.top = "50%";
    nuevoTexto.style.position = "absolute";
    nuevoTexto.style.cursor = "grab";

    zona.appendChild(nuevoTexto);

    hacerArrastrable(nuevoTexto);
  }

  function añadirAlCarrito() {
    const texto =
      document.getElementById("inputTexto").value || "Tu texto aquí";
    const color = document.getElementById("inputColor").value;
    const fuente = document.getElementById("fuente").value;
    const estilo = document.getElementById("estilo").value;

    // Creamos un objeto con los datos
    const diseñoPersonalizado = {
      producto: "Taza personalizada",
      texto,
      color,
      fuente,
      estilo,
    };

    localStorage.setItem("carritoTaza", JSON.stringify(diseñoPersonalizado));

    alert("¡Taza añadida al carrito!");
  }
  const texto = document.getElementById("textoPersonalizado");

  let isDragging = false;
  let offsetX, offsetY;

  texto.addEventListener("mousedown", function (e) {
    isDragging = true;
    const rect = texto.getBoundingClientRect();
    offsetX = e.clientX - rect.left;
    offsetY = e.clientY - rect.top;
    texto.style.cursor = "grabbing";
  });

  document.addEventListener("mousemove", function (e) {
    if (isDragging) {
      const contenedor = document.querySelector(".producto-preview");
      const contRect = contenedor.getBoundingClientRect();

      let left = e.clientX - contRect.left - offsetX;
      let top = e.clientY - contRect.top - offsetY;

      texto.style.left = `${left}px`;
      texto.style.top = `${top}px`;
    }
  });

  document.addEventListener("mouseup", function () {
    isDragging = false;
    texto.style.cursor = "grab";
  });
  function hacerArrastrable(elemento) {
    let isDragging = false;
    let offsetX, offsetY;

    elemento.addEventListener("mousedown", function (e) {
      isDragging = true;
      const rect = elemento.getBoundingClientRect();
      offsetX = e.clientX - rect.left;
      offsetY = e.clientY - rect.top;
      elemento.style.cursor = "grabbing";
    });

    document.addEventListener("mousemove", function (e) {
      if (isDragging) {
        const contenedor = document.querySelector(".producto-preview");
        const contRect = contenedor.getBoundingClientRect();

        let left = e.clientX - contRect.left - offsetX;
        let top = e.clientY - contRect.top - offsetY;

        elemento.style.left = `${left}px`;
        elemento.style.top = `${top}px`;
      }
    });

    document.addEventListener("mouseup", function () {
      isDragging = false;
      elemento.style.cursor = "grab";
    });
  }
  function agregarSticker(url) {
    const zona = document.querySelector(".producto-preview");

    const contenedor = document.createElement("div");
    contenedor.className = "redimensionable";

    const imagen = document.createElement("img");
    imagen.src = url;
    imagen.draggable = false; // para que el arrastre lo controle el contenedor

    contenedor.appendChild(imagen);
    zona.appendChild(contenedor);

    hacerArrastrable(contenedor);
    contenedor.addEventListener("dblclick", () => {
      contenedor.remove();
    });
  }

  function hacerArrastrable(elemento) {
    let isDragging = false;
    let offsetX, offsetY;

    elemento.addEventListener("mousedown", function (e) {
      if (e.target.tagName === "IMG") return; // evita mover si arrastra desde la imagen directamente
      isDragging = true;
      const rect = elemento.getBoundingClientRect();
      offsetX = e.clientX - rect.left;
      offsetY = e.clientY - rect.top;
      elemento.style.cursor = "grabbing";
    });

    document.addEventListener("mousemove", function (e) {
      if (isDragging) {
        const contenedor = document.querySelector(".producto-preview");
        const contRect = contenedor.getBoundingClientRect();

        let left = e.clientX - contRect.left - offsetX;
        let top = e.clientY - contRect.top - offsetY;

        elemento.style.left = `${left}px`;
        elemento.style.top = `${top}px`;
      }
    });

    document.addEventListener("mouseup", function () {
      isDragging = false;
      elemento.style.cursor = "grab";
    });
  }
  document
    .getElementById("tamanioFuente")
    .addEventListener("input", aplicarPersonalizacion);