# Trabajo 38: Hashing
Para este trabajo tuvimos que crear un programa utilizando `java.security.MessageDigest` y `java.util.HexFormat` para crear una contraseña para tener que introducirla nuevamente para que nos pueda conceder el acceso, si escribimos una contraseña distinta a la que habíamos creado anteriormente, nos prohibirá el acceso.

---

### Código
Lo primero que tenemos que hacer ya dentro del main es crear la variable Scanner y abrir un try-catch para manejar la excepción que da nuestra otra variable de MessageDigest.

Ahora, introducimos la estructura del programa que es repetir las mismas línea de código con las variables de la contraseña, la variable que lee los bytes y el hex.

Por último, creamos un if-else con el cual se comparan las contraseñas que escribimos, si son iguales, nos concederá el acceso, pero, si son distintas, será denegado.

<img width="999" height="790" alt="Captura desde 2026-01-13 10-52-15" src="https://github.com/user-attachments/assets/78f7cea4-4cac-4401-8b00-ce7f4a48fcda" />

---

### Resultados
Al inicar el programa se verá esto:

<img width="308" height="258" alt="Captura desde 2026-01-13 09-55-09" src="https://github.com/user-attachments/assets/706f620c-0130-4448-a812-33cf23e075d8" />

Una vez introducida alguna contraseña, nos la pedirá de nuevo:

<img width="711" height="258" alt="Captura desde 2026-01-13 09-55-19" src="https://github.com/user-attachments/assets/8bf12d06-54ee-4608-a59a-636c6f69d550" />

Si la contraseña que volvemos a escribir es igual aparecerá así:

<img width="711" height="258" alt="Captura desde 2026-01-13 09-55-28" src="https://github.com/user-attachments/assets/a12e910c-ab92-44c6-996b-380755cf9a3a" />

Pero si es distinta nos saltará el siguiente mensaje:

<img width="711" height="258" alt="Captura desde 2026-01-13 09-56-00" src="https://github.com/user-attachments/assets/3a14afaf-d1ec-4242-9376-b705a23ca727" />
