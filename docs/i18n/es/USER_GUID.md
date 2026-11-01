🏠 **[Descripción principal (README)](README.md)** | ❓ **[Preguntas frecuentes (FAQ)](FAQ.md)**

# 📖 Guía de usuario de DiscountCards

Bienvenido a **DiscountCards**: tu almacén de tarjetas de fidelización seguro, rápido y totalmente autónomo. Esta guía te ayudará a configurar la aplicación, añadir tarjetas y utilizarlas con la máxima eficiencia.

---

## 📥 Capítulo 1: Instalación y primer inicio

1. **Descarga**: Ve a la sección de [Releases en GitHub](https://github.com/Storvild/android_discount_cards/releases) y descarga el último archivo con la extensión `.apk` (por ejemplo, `discount_cards_v1.1 7.apk`).
2. **Instalación**: Abre el archivo descargado. Si el sistema solicita permiso, permite la instalación de aplicaciones de esta fuente (navegador o gestor de archivos) en los ajustes de Android.
3. **Primer inicio**: La aplicación se abrirá al instante. No requiere registro, creación de cuenta ni acceso a Internet.
4. **Permisos**: La primera vez que intentes escanear una tarjeta con la cámara, la aplicación solicitará acceso a la **Cámara**. Este permiso es opcional: puedes denegarlo si planeas añadir tarjetas manualmente o desde la galería.

---

## ➕ Capítulo 2: Añadir una nueva tarjeta

Pulsa el botón flotante **«+»** en la pantalla principal. También puedes pulsar en el menú "Añadir tarjeta...". Puedes utilizar tres métodos para añadir tarjetas (pulsando los iconos correspondientes junto al campo Código):

### Método A: Escaneo con la cámara (Recomendado)
1. Apunta la cámara del teléfono a la tarjeta física.
2. La aplicación reconocerá automáticamente el código de barras o código QR utilizando ML Kit.
3. Comprueba el número reconocido y pulsa «Guardar».

### Método B: Selección desde archivo / galería
1. Si ya tienes una foto del código de barras en la galería, elige esta opción.
2. Selecciona la imagen y la aplicación extraerá los datos de ella.

### Método C: Entrada manual
1. Introduce el **Nombre de la tienda** (por ejemplo, «Mercadona»).
2. Introduce el **Código de la tarjeta** (manualmente o copiándolo).
3. Selecciona el **Tipo de código** de la lista (por ejemplo, `EAN_13` para la mayoría de las tarjetas de supermercado, `QR_CODE` o `PHONE` si el descuento se aplica simplemente por número de teléfono).
4. *(Opcional)* Añade una nota o código CVC/CVV.
5. Pulsa «Guardar».

### 🚀 Añadido rápido y masivo de tarjetas
- **Escaneo masivo con cámara:** En el menú desplegable principal ("..."), selecciona **Herramientas → Escaneo masivo…**. La cámara se abrirá en modo de escaneo continuo.
- **Importación masiva desde imágenes:** En el menú, selecciona **Herramientas → Importación masiva desde imágenes…**. Selecciona varios archivos de la galería.

---

## 🛒 Capítulo 3: Uso de tarjetas en la caja

La aplicación ofrece varias formas cómodas de presentar la tarjeta sin buscar en los menús:

### 1. Método principal
- Abre la tarjeta deseada (utiliza la búsqueda si es necesario).
- Muestra el código de barras en la caja.

### 2. Modo de pantalla completa (Si hay problemas de lectura)
- Abre la tarjeta deseada.
- **Pulsa directamente sobre la imagen del código de barras**.
- Se ampliará a pantalla completa: el fondo se volverá blanco, el brillo de la pantalla aumentará automáticamente al 100% y, en orientación vertical, el código de barras girará 90° para una lectura ideal por el escáner del cajero.

### 3. Widget en la pantalla de inicio
- Abre la pantalla donde instalaste el widget con el código de barras y muéstralo en la caja.
- Consulta el Capítulo 8 para saber cómo añadir un widget.

### 4. Enviar código de barras (Compartir) si deseas que otra persona pueda mostrar la tarjeta en la caja.
- En la pantalla de detalles de la tarjeta, pulsa el botón **«Compartir imagen del código de barras»**.
- Selecciona la aplicación de mensajería o aplicación deseada. La imagen se enviará en formato PNG con márgenes blancos, lo que garantiza su escaneo con éxito por parte del destinatario.

---

## 🗂️ Capítulo 4: Gestión y organización de tarjetas

Cuando hay muchas tarjetas, las herramientas de organización vienen al rescate:

- **Búsqueda**: Utiliza la barra de búsqueda en la parte superior de la pantalla principal. La búsqueda funciona por nombre de tienda, número de tarjeta y notas.
- **Ordenación**: Pulsa el icono de ordenación para organizar las tarjetas por nombre, fecha de creación o frecuencia de uso.
- **Favoritos**: Pulsa el icono de estrella ⭐️ en la tarjeta para mover las tarjetas usadas con frecuencia al principio de la lista.
- **Menú contextual**: Mantén **pulsada** cualquier tarjeta de la lista para abrir rápidamente el menú «Editar» o «Eliminar».
- **Archivo**: Si una tarjeta está obsoleta pero no quieres eliminarla, abre sus detalles y pulsa «Mover al archivo». Las tarjetas archivadas están ocultas de la lista principal, de la búsqueda y de la exportación, pero se pueden restaurar en cualquier momento a través del menú «Archivo».

---

## 🎨 Capítulo 5: Personalización de la apariencia

Ve a **Ajustes** (icono de engranaje) para personalizar la aplicación:

- **Tema de diseño**: Selecciona el tema claro, oscuro o del sistema.
- **Modo de lista compacta**: Activa esta opción para ocultar los códigos de barras y los números de tarjeta en la pantalla principal. Esto reduce a la mitad la altura de las tarjetas y acelera significativamente el desplazamiento en cualquier dispositivo.
- **Brillo en la tarjeta**: Activa el deslizador de brillo directamente en la pantalla de la tarjeta para un ajuste rápido manual antes de escanear.
- **Idioma de la interfaz**: Selecciona uno de los 11 idiomas soportados independientemente del idioma de tu sistema.

*Al editar una tarjeta individual, también puedes asignarle un color único (mediante una paleta o código HEX, por ejemplo `#0EE8A5`) y un icono de categoría.*

---

## 💾 Capítulo 6: Copia de seguridad y transferencia de datos

Tus datos te pertenecen solo a ti. Crea copias de seguridad con regularidad.

### Exportar (Crear copia)
1. Ve al menú ("...") → **Herramientas → Exportar a archivo…**.
2. Selecciona el formato:
   - **JSON**: Formato completo con todos los detalles (colores, iconos, fechas, CVC, estado de archivo). Recomendado para transferir a otro dispositivo.
   - **CSV**: Formato de tabla (Nombre, Código, Tipo de código, CVC, Nota). Cómodo para ver en Excel.
3. Guarda el archivo en una carpeta conveniente o envíatelo directamente por mensajería/nube.

### Importar (Restaurar copia)
1. **Método automático**: Localiza el archivo `.json` o `.csv` guardado en el gestor de archivos y pulsa sobre él. Selecciona «Abrir con» → **DiscountCards**. La aplicación iniciará automáticamente el proceso de importación.
2. **Método manual**: Ve al menú ("...") → **Herramientas → Importar de archivo…** y selecciona el archivo manualmente.
3. **Selecciona el modo de importación**:
   - **Combinar (MERGE)**: Añade nuevas tarjetas a las existentes (recomendado).
   - **Sobrescribir (OVERWRITE)**: Elimina por completo las tarjetas actuales y las reemplaza con los datos del archivo.
4. **Si se detectan duplicados**, la aplicación propondrá una estrategia: actualizar existentes, añadir como nuevas u omitir.

---

## ⚠️ Capítulo 7: Solución de problemas frecuentes

| Problema | Solución |
| :--- | :--- |
| **La caja no lee el código de barras de la pantalla** | 1. Pulsa sobre el código de barras para el modo de pantalla completa (brillo máximo + fondo blanco).<br>2. Asegúrate de haber seleccionado el tipo de código correcto al crear la tarjeta (normalmente `EAN_13` o `CODE_128`).<br>3. Limpia la pantalla de huellas dactilares. |
| **La cámara no enfoca la tarjeta física** | Proporciona buena iluminación. Si la cámara no puede enfocar, toma una foto de la tarjeta con la cámara normal del teléfono y utiliza la función «Seleccionar desde archivo» en DiscountCards. |
| **La aplicación parece lenta con una gran cantidad de tarjetas** | Ve a Ajustes y activa **«Modo de lista compacta»**. Esto desactivará el renderizado de códigos de barras en la lista general y acelerará el rendimiento significativamente. |
| **No puedo encontrar el archivo importado** | Asegúrate de haber descargado el archivo en formato `.json` o `.csv`. Al importar, la aplicación reconoce automáticamente los separadores en CSV (coma, punto y coma o tabulación). |

---

## Capítulo 8: 🧩 Widgets en la pantalla de inicio

**¿Cómo añadir un widget a la pantalla de inicio del teléfono?**  
1. Mantén pulsado cualquier espacio vacío en la pantalla de inicio de tu smartphone.  
2. En el menú inferior que aparece, selecciona la opción **«Widgets»**.  
3. Desplázate por la lista de aplicaciones y busca **DiscountCards**.  
4. Mantén pulsado el icono del widget y, sin soltar el dedo, arrástralo a un espacio libre de la pantalla.  
5. Inmediatamente después de colocarlo, se abrirá la ventana de configuración: selecciona la tarjeta de descuento deseada de tu lista y pulsa «Hecho» (o «Guardar»).
6. En la configuración del widget hay una vista previa que muestra aproximadamente cómo se verá el widget en diferentes tamaños (la visualización real depende del modelo de teléfono). El tamaño real del widget no cambia por sí solo. También en la configuración puedes especificar si deseas mostrar el Nombre y el Código de barras.

**¿Cómo cambiar la tarjeta seleccionada o los ajustes del widget?**  
Tienes dos formas cómodas de hacerlo:  
- **A través del propio widget:** Pulsa el botón transparente de edición (arriba a la derecha en el propio widget). Esto abrirá un menú donde puedes seleccionar otra tarjeta o cambiar los parámetros de visualización.  
- **A través del menú de Android:** Mantén pulsado un widget ya colocado. En el menú emergente que aparece, pulsa **«Ajustes del widget»** (esto no funciona en todos los teléfonos).

**¿Cómo cambiar el tamaño del widget?**  
El widget de DiscountCards es adaptable y soporta tamaños desde **1×1 hasta 5×5** celdas. Para cambiar su tamaño:  
1. Mantén pulsado el widget en la pantalla de inicio.  
2. Cuando se resalte, aparecerán marcadores de estiramiento en sus bordes (normalmente puntos o líneas de contraste/azules).  
3. Arrastra estos marcadores en la dirección deseada para aumentar o reducir el área del widget.  
4. Suelta el dedo para fijar el nuevo tamaño.  
💡 *Consejo:* En el tamaño mínimo (1×1) solo se mostrará un icono compacto o un mini código de barras. Para aumentar el código de barras, puedes desactivar la opción de mostrar el Nombre en los ajustes. Para un escaneo cómodo en la caja, se recomienda utilizar un tamaño de **2×2** o superior, para que sean visibles el nombre de la tienda y un código de barras completo.

---

## 📬 Comentarios y soporte

La aplicación se desarrolla pensando en los usuarios. Si has encontrado un error, tienes una sugerencia de mejora o deseas añadir soporte para un nuevo formato de código de barras, por favor crea una solicitud en la sección de [Issues en GitHub](https://github.com/Storvild/android_discount_cards/issues).

*¡Gracias por elegir DiscountCards! Guarda tus descuentos de forma segura y cómoda.*
