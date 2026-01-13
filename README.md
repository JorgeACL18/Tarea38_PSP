# Trabajo 38: Hashing
Para este trabajo tuvimos que crear un programa utilizando `java.security.MessageDigest` y `java.util.HexFormat` para crear una contraseña para tener que introducirla nuevamente para que nos pueda conceder el acceso, si escribimos una contraseña distinta a la que habíamos creado anteriormente, nos prohibirá el acceso.

---

### Código
Lo primero que tenemos que hacer ya dentro del main es crear la variable Scanner y abrir un try-catch para manejar la excepción que da nuestra otra variable de MessageDigest.

Ahora, introducimos la estructura del programa que es repetir las mismas línea de código con las variables de la contraseña, la variable que lee los bytes y el hex.

Por último, creamos un if-else con el cual se comparan las contraseñas que escribimos, si son iguales, nos concederá el acceso, pero, si son distintas, será denegado.

<img width="1000" height="729" alt="Captura desde 2026-01-13 09-54-39" src="https://github.com/user-attachments/assets/dee836d6-8c1f-4a8a-b1af-1e72cc756bb6" />
