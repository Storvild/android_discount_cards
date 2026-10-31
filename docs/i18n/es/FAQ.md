🏠 **[Descripción principal (README)](README.md)** | 📖 **[Guía de usuario](USER_GUID.md)**

# ❓ Preguntas frecuentes (FAQ) — DiscountCards

## 📌 Preguntas generales

**¿Qué es DiscountCards?**  
Es una aplicación para Android ligera y rápida para almacenar, escanear y utilizar tarjetas de fidelización y de descuento. Reemplaza las carteras físicas llenas de tarjetas, permitiéndote mostrar al instante el código de barras en la caja directamente desde la pantalla de tu smartphone.

**¿La aplicación es gratuita?**  
Sí, el proyecto es totalmente gratuito y se distribuye con código fuente abierto (Open Source) bajo la licencia MIT. Puedes descargar la versión actual del APK en la sección de [GitHub Releases](https://github.com/Storvild/android_discount_cards/releases).

**¿Hay anuncios o rastreadores en la aplicación?**  
No. La aplicación es totalmente autónoma, no contiene anuncios y no utiliza ningún rastreador analítico o de seguimiento.

**¿Funciona la aplicación sin Internet?**  
Sí, es una **aplicación totalmente sin conexión**. En su manifiesto ni siquiera está presente el permiso `android.permission.INTERNET`. Todos los datos se almacenan únicamente en tu dispositivo, lo que garantiza el funcionamiento incluso en zonas sin red (por ejemplo, en los sótanos de hipermercados).

---

## 🔒 Seguridad y privacidad

**¿Dónde se guardan mis datos?**  
Todos los datos (tarjetas, ajustes, estadísticas) se almacenan localmente en la base de datos de tu dispositivo. Ninguna información se envía a servidores de terceros.

**¿Qué permisos solicita la aplicación?**  
La aplicación solo requiere un permiso, y se solicita **únicamente en el momento de su uso**:
- `android.permission.CAMERA`: necesario exclusivamente para escanear tarjetas físicas a través de la cámara. Si añades tarjetas manualmente o desde la galería, este permiso no será necesario.

---

## 💳 Uso y funciones

**¿Cómo añadir una nueva tarjeta?**  
Hay tres formas:
1. **Manualmente:** introducir el nombre de la tienda, el número de tarjeta y seleccionar el formato del código de barras.
2. **Escaneo:** pulsar el botón en la sección "Número de tarjeta" con el icono de código QR y apuntar la cámara a la tarjeta física (utilizando ML Kit para un reconocimiento rápido).
3. **Desde archivo:** pulsar el botón en la sección "Número de tarjeta" y seleccionar una imagen guardada del código de barras desde la galería o el gestor de archivos.

**¿Qué formatos de código de barras son compatibles?**  
La aplicación genera y reconoce: `QR_CODE`, `CODE_128`, `EAN_13`, `EAN_8`, `UPC_A`, `CODE_39`, `PDF_417`, `AZTEC`. También existe el modo `PHONE` para tarjetas donde el descuento se aplica simplemente por el número de teléfono (se muestra en texto grande, sin generar código de barras).

**¿Qué hacer si el código de barras no se lee bien? ¿Cómo hacer que el cajero lea fácilmente el código de barras de la pantalla?**  
- Pulsa sobre el código de barras en la tarjeta: se abrirá **a pantalla completa** con el brillo máximo, fondo blanco y se girará automáticamente 90° (en orientación vertical) para un escaneo perfecto.
- En los ajustes se puede activar «Mostrar brillo en la tarjeta» para regular el brillo con un deslizador directamente en la pantalla de la tarjeta.
- También puedes pulsar el botón **«Compartir imagen del código de barras»** para enviar una imagen PNG del código de barras con márgenes blancos a una aplicación de mensajería (por ejemplo, si compras algo a través de un mensajero o un amigo).

**¿Cómo acelerar la aplicación en un dispositivo con menos prestaciones?**  
En los ajustes, activa el **«Modo de lista compacta»**. Esto desactivará el renderizado de códigos de barras y números de tarjeta en la pantalla principal, reduciendo a la mitad la altura de los elementos de la lista y acelerando considerablemente la carga y el desplazamiento.

**¿Se pueden añadir notas o un código CVC a la tarjeta?**  
Sí, al editar una tarjeta puedes añadir una nota arbitraria, así como un campo para el código CVC/CVV (por ejemplo, para canjear puntos de bonificación).

---

## 💾 Copia de seguridad y transferencia de datos

**¿Cómo crear una copia de seguridad de las tarjetas?**  
Ve a Ajustes → Exportar. Puedes guardar todos los datos en formato **JSON** (estructura de datos completa, recomendado) o **CSV** (tabla cómoda para ver en Excel).

**¿Cómo transferir las tarjetas a un nuevo teléfono?**  
1. En el dispositivo antiguo, exporta las tarjetas a un archivo (JSON o CSV).
2. Transfiere este archivo al nuevo dispositivo (vía Bluetooth, mensajería, nube o USB).
3. En el nuevo dispositivo, abre el archivo a través del gestor de archivos. La aplicación interceptará automáticamente la acción y te propondrá importar las tarjetas.

**¿Qué significan los modos de importación?**  
- **Combinar (MERGE):** añade las tarjetas del archivo a las que ya existen en la aplicación.
- **Sobrescribir (OVERWRITE):** elimina por completo todas las tarjetas actuales y las reemplaza con los datos del archivo.
- *Si coinciden las tarjetas* (por número y nombre), puedes elegir una estrategia: actualizar las existentes, añadirlas como nuevos duplicados u omitirlas.

---

## 🧩 Widgets y organización

**¿Se puede mostrar una tarjeta sin abrir la aplicación?**  
Sí. Añade el widget de DiscountCards a la pantalla de inicio. Soporta tamaños de 1×1 a 5×5, muestra el código de barras y el nombre de la tienda, y al pulsar abre instantáneamente la tarjeta completa.

**¿Cómo mantener el orden si hay demasiadas tarjetas?**  
- Utiliza **Favoritos** (⭐️) para las tarjetas de uso frecuente para que aparezcan más arriba en la lista.
- Utiliza el **Archivo**: mueve allí las tarjetas en desuso o caducadas. Desaparecerán de la lista principal, de la búsqueda y de la exportación, pero no se eliminarán definitivamente. Siempre se pueden restaurar.
- Elimina la tarjeta si estás seguro de que ya no la necesitarás.

**¿Se puede personalizar la apariencia de las tarjetas?**  
Sí. Para cada tarjeta puedes seleccionar un icono de categoría, un color de la paleta o definir un código HEX preciso (`#RRGGBB`). También se admiten los temas claro, oscuro y del sistema.

---

## 🛠 Solución de problemas

**El escáner de la caja no lee el código de barras de mi pantalla. ¿Qué hago?**  
1. Asegúrate de haber seleccionado correctamente el **formato del código de barras** al crear la tarjeta (por ejemplo, para la mayoría de las tarjetas de supermercado es `EAN_13`).
2. Utiliza el modo de pantalla completa del código de barras (pulsa sobre él en la tarjeta) para garantizar el 100% de brillo y fondo blanco.
3. Limpia la pantalla de huellas dactilares y manchas de grasa.

**La aplicación no puede escanear mi tarjeta física con la cámara.**  
- Asegúrate de haber concedido a la aplicación acceso a la cámara (se solicita al pulsar por primera vez el botón del escáner).
- Proporciona buena iluminación y mantén la cámara paralela al código de barras a una distancia de 10 a 20 cm.
- Si el código de barras está dañado o la cámara no puede leerlo, utiliza la función **«Seleccionar desde archivo»**, habiendo fotografiado previamente la tarjeta con la cámara estándar del teléfono.

**¿Cómo cambiar el idioma de la aplicación?**  
En los ajustes de la aplicación hay una opción independiente de «Idioma». Puedes elegir uno de los 11 idiomas compatibles (Ruso, English, Deutsch, Français, Español, Português, 日本語, 简体中文, العربية, Türkçe, हिन्दी) independientemente del idioma del sistema de tu smartphone.

---

*Si no has encontrado respuesta a tu pregunta, puedes crear una nueva consulta en la sección de [Issues](https://github.com/Storvild/android_discount_cards/issues) del GitHub del proyecto.*
