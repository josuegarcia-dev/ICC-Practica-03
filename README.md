## ICC-Practica-03
# Practica 03
# 01 Referencias e inmutabilidad de String
En el primer println debe salir falso, esto ya que al usar el operador == esta apuntando a ddirecciones de memoria distintas.
En el segundo println debe salir verdadero ya que al concatenar "Ja"+"va" se crea un nuevo objeto y en el string pool ya existe un objeto   con ese contenido, por lo que solo apunta a esa direccion a la que tambien apunta a.
En el tercer println, debe dar falso ya que porque el operador += realiza la concatenación en tiempo de ejecución, creando un nuevo objeto  en lugar de reutilizar el objeto existente en el string pool.
En el cuarto println, debe dar verdadero ya que el metodo .equals(), compara directamente el contenido de ambos objetos.
En el quinto println debe decir "Java".
En el sexto println debe decir "Java 21"

# 02 Operaciones e índices en StringBuilder
Con una cadena inicial "ABCDE"
En sb.delete(1,4), elimina "BCD" ya que delete va desde la posicion inicial hasta una antes del final.
Con sb.insert(1,xyz), agrega xyz en la posicion 1. quedando AxyzE
Con sb.reverse(), le da la reversa a la cadena quedando EzyxA.
Con sb.replace(1, 4, "-"), remplaza los caracteres de la posicion 1 a 4 por "-", quedando E-A.
La salida en consola es:                                                                                                                        E-A                                                                                                                                        3                                                                                                                                          21
Como la capacidad por defecto es 16 y le sumamos los 5 de "ABCDE", queda una capacidad de 21.
Como la longitud de la cadena final es 3, imprime 3.

# 03 Referencias compartidas
En el primer println imprime "mundo".
En el segundo println imprime "mundo".
En el trecer println, imprime "Hola".
En el cuarto println, imprime verdadero ya que al compararlos con == solo importa que ambas variables apunten a la misma direccion en     memoria.
En el quinto println, tambien da verdadero ya que comparandolos con el metodo .equals(), busca que su contenido sea igual.
En el sexto println, da falso ya que se compara su contenido igualmente, en a es "mundo", mientras que en c es "Hola".
Heap          Stack
  a -------> "mundo"
  b ---^
  c -------> "Hola"
