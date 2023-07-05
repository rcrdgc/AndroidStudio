import kotlin.random.Random
import kotlin.Array

/** CERTIFICADO DE PROFESIONALIDAD (IFCD0112). **/
/** Este documento contiene la parte formativa de POO. **/
/** La parte práctica son 3 aplicaciones móviles con Kotlin en Android Studio. (Son privadas). **/


// Cambiar mainX() por main() para ejecutar cada ejercicio.


/* Diseñar un programa que pida el año de tu nacimiento y te diga tu edad el próximo año. */

fun main0() {
    println("Dime el año de tu nacimiento")
    var year = readLine()?.toInt()

    var actualYear = 2022
    var age = actualYear - year!!
    var ageNextYear = age++

    println("El próximo año tendrás $ageNextYear años")
}



/* Diseñar un programa que pida un número real al usuario -por teclado- y a continuación lo muestre. */

fun main1() {
    println("Ingresa un número")
    var numero = readLine()

    println("El número que has escrito es $numero")
}



/* Un frutero necesita calcular los beneficios anuales que obtiene de la venta de
manzanas y peras. Por este motivo, es necesario diseñar una aplicación que solicite las ventas
(en kilos) de cada semestre para cada fruta. La aplicación mostrará el importe total sabiendo
que el precio del kilo de manzanas está fijado en 2,35€ y el kilo de peras en 1,95€.
Una vez entendidos todos los puntos anteriores trata de convertir los siguien-
tes pasos a código Kotlin.*
- PASO 1: Preguntar cuantos números piensa decirme (llamar a esta cantidad A).
- PASO 2: Usar la letra S para referirme a la suma de los números que voy a empezar a pedir. S valdrá inicialmente 0.
- PASO 3: Pedir un número (lo llamaré N)
- PASO 4: Sumar N a los números que ya había sumado antes ( S = S + N)
- Repetir A veces los pasos 3 y 4.
- PASO 5: Calcular media = S/A
- PASO 6: Comunicar el resultado de los cálculos */

// Con Operador !!
fun main2() {
    //Manzanas:
    println("Ingresa los kg de manzanas")
    var manzanas = readLine()?.toInt()

    var precioKgManzanas = manzanas!! * 2.35
    println("El precio/Kg de manzanas en un semestre es: $precioKgManzanas")

    var precioKgManzanasAno = (manzanas!! * 2.35) * 2
    println("El precio/Kg de manzanas en un años es: $precioKgManzanasAno")

    //Peras:
    println("Ingresa los kg de peras")
    var peras = readLine()?.toInt()

    var preciokgPeras = peras!! * 1.95
    println("El precio/Kg de peras en un semestre es $preciokgPeras")

    var precioKgPerasAno = (peras!! * 1.95) * 2
    println("El precio/Kg de peras en un años es: $precioKgPerasAno")

    //Total:
    var beneficioTotalAno = precioKgManzanasAno + precioKgPerasAno
    println("El beneficio total en un año es: $beneficioTotalAno")
}


// Con operador Elvis:
fun main3() {
    //Manzanas:
    println("Ingresa los kg de manzanas")
    var manzanas = readLine()?.toInt() ?: 0
    var precioKgManzanas = manzanas * 2.35
    println("El precio/Kg de manzanas en un semestre es: $precioKgManzanas")
    var precioKgManzanasAno = (manzanas!! * 2.35) * 2
    println("El precio/Kg de manzanas en un años es: $precioKgManzanasAno")

    //Peras:
    println("Ingresa los kg de peras")
    var peras = readLine()?.toInt() ?: 0
    var preciokgPeras = peras * 1.95
    println("El precio/Kg de peras en un semestre es $preciokgPeras")
    var precioKgPerasAno = (peras!! * 1.95) * 2
    println("El precio/Kg de peras en un años es: $precioKgPerasAno")

    //Total:
    var beneficioTotalAno = precioKgManzanasAno + precioKgPerasAno
    println("El beneficio total en un año es: $beneficioTotalAno")
}



/* 1. Tenemos las siguientes dimensiones de un cubo largo=15, ancho=23, alto=12. Mostrar su volumen por consola.*/

fun main4() {
    val largo: Int = 15
    val ancho: Int = 23
    val alto: Int = 12
    var volumen = largo * ancho * alto
    print("El volumen del cubo es $volumen m³")
}



/* 2.Calcular la energía cinética de un objeto. Si la masa es m = 12 kg y la velocidad es v= 3 m/s, imprime el resultado con solo 2 decimales,
la fórmula de la energía cinética es: Ec= 1/2 * m * v² */

//Sin Pow
fun main5() {
    val masa: Int = 12
    val velodiad: Int = 3
    val resultado = (12 * (3 * 3)) / 2
    print("La Energía Cinética es: $resultado ")
}

//Con Pow:
fun main6() {
    val masa: Double = 12.0
    val velocidad: Double = 3.0
    val elevado = Math.pow(velocidad, 2.0)
    val resultado = (masa * elevado) / 2
    print("La Energía Cinética es: $resultado")
}

// Con Pow:
fun main7() {
    val masa = 12
    val velocidad = 3
    val exponente = 2
    val elevado = Math.pow(velocidad.toDouble(), exponente.toDouble())
    val resultado = (masa * elevado) / 2
    print("La Energía Cinética es: $resultado")
}



/* 3. ¿Qué tipos variables utilizarías para los siguientes valores?
Ejemplo: Si tenemos 1 usamos una variable de tipo Int. */

//a. 1495970192837664L = Long
//b. 12.5 = Double
//c. true = Boolean
//d. 90 = Int
//e. “No tengo trono ni reina, ni nadie que me comprenda, pero sigo siendo el rey” = String
//f. 6.626070040 = Double
//g. 8.8f = Float



/* 4. Definir una variable con el valor 50 que representa el lado de un cuadrado, en otras
dos variables almacenar la superficie y el perímetro del cuadrado.
Mostrar la superficie y el perímetro por la consola */
fun main8() {
    val lado = 50
    val superficie = lado * lado
    val perimetro = lado + lado + lado + lado
    print("La superficie es $superficie y el perímetro es $perimetro")
}



/* 5. Definir tres valores y cargar por asignación los pesos de tres personas con valores
Float. Calcula el promedio de pesos de las personas y muéstralo por consola. */

fun main9() {
    var num1 = 50.5f
    var num2 = 60.75f
    var num3 = 70.25f
    val promedio = ((num1 + num2 + num3) / 3)
    print("El peso promedio es: $promedio")
}



/* 6. Supongamos que monetizas tu aplicación en Internet y debes calcular el costo
promedio para 180 clics, donde los clics tienen los siguientes costos:
• Los primeros 20 clics = $0.80 cada uno
• Los siguientes 60 clics = $0.30 cada uno
• Los siguientes 100 clics = $0.25 cada uno
Calcula el costo total de los 180 clics y sácalo por consola. Calcúlalo de manera que
debas incluir el IVA aparte, donde el IVA es 16% del total, es decir, deberás calcular
total + IVA, imprime el resultado con dos decimales. Ejemplo: Si tu total es de
$100.00, el total + IVA es $116.00. */

fun main10() {
    var veinteClics = (0.80 * 20)
    var sesentaClics = (0.30 * 60)
    var cienClics = (0.25 * 100)
    var costoTotal = veinteClics + sesentaClics + cienClics
    println("Costo Total: $costoTotal")

    var costoIva = (0.16 * costoTotal) + costoTotal
    println("Costo con IVA= $costoIva")
}



/* 1. Escribe un programa en el que se ingresen por consola 2 número enteros, haga las
operaciones de resta y división, y saque por pantalla los resultados. */

fun main11() {
    println("Escribe primer número entero: ")
    var num1 = readLine()?.toInt()

    println("Escribe segundo número entero: ")
    var num2 = readLine()?.toInt()

    var resta = num1!! - num2!!
    var multiplicacion = num1!! * num2!!
    println("La resta da como resultado : $resta, y la multiplicación: $multiplicacion ")
}

//

fun main12() {
    println("Escribe primer número entero: ")
    var num1 = readLine()!!.toInt()

    println("Escribe segundo número entero: ")
    var num2 = readLine()!!.toInt()

    var resta = num1 - num2
    var multiplicacion = num1 * num2
    println("La resta da como resultado : $resta, y la multiplicación: $multiplicacion ")
}



/* 2. Realiza un programa en el que se ingresen 4 valores numéricos tipo float y saca por
consola su suma y su promedio. */

fun main13() {
    println("Escribe primer número decimal: ")
    var num1 = readLine()?.toFloat()

    println("Escribe segundo número decimal: ")
    var num2 = readLine()?.toFloat()

    var suma = num1!! + num2!!
    var promedio = suma / 2
    println("La suma da como resultado : $suma, y el promedio: $promedio ")
}

//

fun main14() {
    println("Escribe primer número decimal: ")
    var num1 = readLine()!!.toFloat()

    println("Escribe segundo número decimal: ")
    var num2 = readLine()!!.toFloat()

    var suma = num1 + num2
    var promedio = suma / 2
    println("La suma da como resultado : $suma, y el promedio: $promedio ")
}



/* 3. Realiza un programa en el que se solicite el ingreso de 3 notas de un alumno por
consola, si el promedio de las notas es mayor o igual a 7 mostrar un mensaje de
“Enhorabuena, has promocionado!”. */

fun main15() {
    println("Escribe primera nota: ")
    var num1 = readLine()?.toFloat()

    println("Escribe segunda nota: ")
    var num2 = readLine()?.toFloat()

    println("Escribe tercera nota: ")
    var num3 = readLine()?.toFloat()

    var promedio = (num1!! + num2!! + num3!!) / 3

    if (promedio >= 7) {
        println("Enhorabuena, has promocionado!")
    } else {
        print("Enhorabuena, tu nota es: $promedio")
    }

}

//

fun main16() { //16

    println("Escribe primera nota: ")
    var num1 = readLine()!!.toFloat()

    println("Escribe segunda nota: ")
    var num2 = readLine()!!.toFloat()

    println("Escribe tercera nota: ")
    var num3 = readLine()!!.toFloat()

    var promedio = (num1 + num2 + num3) / 3

    if (promedio >= 7) {
        println("Enhorabuena, has promocionado!")
    } else {
        print("Enhorabuena, tu nota es: $promedio")
    }
}



/* 4. Crea un programa en el que se solicite el ingreso de un número entero comprendido
entre 1 y 99, y a continuación se muestre un mensaje indicando si el número tiene 1
o 2 dígitos. */

fun main17() {

    println("Ingresa un número entero entre 1 y 99: ")
    var num = readLine()?.toInt()

    if (num in 1..9) {
        print("1 dígito")
    } else if (num in 10..99) {
        print("2 dígitos")
    } else print("mas dígitos")
}

//

fun main18() {
    println("Ingresa un número entero entre 1 y 99: ")
    var num = readLine()!!.toInt()

    if (num in 1..9) {
        print("1 dígito")
    } else if (num in 10..99) {
        print("2 dígitos")
    } else print("mas dígitos")
}



/* 5. Crea un procedimiento en el que ingreses por teclado un valor entero. A continuación,
crea otra variable en la que si el valor ingresado es par obtenga el cuadrado del valor
y en caso de que sea impar calcule el cubo.
Muestra un mensaje por consola en el que se indique si se calcula el cuadrado o el
cubo y saca su valor. */

fun main19() {
    println("Ingresa un número entero: ")
    var num = readLine()!!.toInt()

    var cuadrado = Math.pow(num.toDouble(), 2.0).toInt()
    var cubo = num * num * num

    if (num % 2 == 0) {
        print("El número es par, su cuadrado es: $cuadrado")
    } else print("El número es impar, su cubo es: $cubo")
}

//

fun main20() {

    println("Ingresa un número entero: ")
    var num = readLine()!!.toInt()
    var cuadrado = Math.pow(num.toDouble(), 2.0).toInt()
    var cubo = num!! * num!! * num!!

    if (num % 2 == 0) {
        print("El número es par, su cuadrado es: $cuadrado")
    } else print("El número es impar, su cuadrado es: $cubo")

}


/******************** CONDICIONALES ********************/

/* 1. Escribe un programa en el que se ingresen por consola 3 número enteros, y que  muestre por pantalla el mayor de ellos. */

fun main21() {
    println("Ingresa un número entero: ")
    var num1 = readLine()!!.toInt()

    println("Ingresa un número entero: ")
    var num2 = readLine()!!.toInt()

    println("Ingresa un número entero: ")
    var num3 = readLine()!!.toInt()

    var maximo = maxOf(num1, num2, num3)
    println(maximo)
}

//

fun main22() { //22
    println("Ingresa un número entero: ")
    var num1 = readLine()!!.toInt()

    println("Ingresa un número entero: ")
    var num2 = readLine()!!.toInt()

    println("Ingresa un número entero: ")
    var num3 = readLine()!!.toInt()

    if (num1 >= num2 && num1 >= num3) {
        println("$num1 es el número mas alto.")
    } else if (num2 >= num1 && num2 >= num3) {
        println("$num2 es el número mas alto.")
    } else println("$num3 es el número mas alto.")
}



/* 2. Realiza un programa en el que se ingresen 1 valor numéricos y muestre un mensaje  que indique si el número es positivo, nulo o negativo. */

fun main23() {
    println("Ingresa un número entero: ")
    var num = readLine()!!.toInt()

    if (num < 0.0) {
        println("$num es un número negativo.")
    } else if (num > 0.0) {
        println("$num es un número positivo.")
    } else
        println("$num es 0.")
}



/* 3. Realiza un programa en el que se permita cargar un número entero positivo de hasta  3 dígitos y muestre un mensaje indicando si tiene 1, 2 o 3 dígitos.
En el caso de no  cumplir ninguna de las condiciones mostrar un mensaje de error.*/

fun main25() {
    println("Ingresa un número entero de hasta 3 dígitos: ")
    var num = readLine()!!.toInt()

    if (num in 1..9) {
        println("$num tiene 1 dígito.")
    } else if (num in 10..99) {
        println("$num tiene 2 dígitos.")
    } else if (num in 100..999) {
        println("$num tiene 3 o mas dígitos.")
    } else print("error")
}



/* 4. Se pide realizar un programa para evaluar el nivel de los empleados de una empresa.
Para ello debes introducir por consola la cantidad total de preguntas que se realizaron  y la cantidad de preguntas que contesta correctamente el empleado,
y a continuación,  muestre un mensaje informe del nivel del mismo según el porcentaje de respuestas  correctas que ha obtenido sabiendo que :
a. Nivel máximo: Porcentaje >= 90%.
b. Nivel medio: Porcentaje >= 75% y <90%.
c. Nivel regular: Porcentaje >= 50% y <75%.
d. Nivel por debajo de lo esperado: Porcentaje < 50%. */

fun main26() {
    println("Ingresa la cantidad total de preguntas : ")
    var total = readLine()!!.toInt()

    println("Ingresa la cantidad total de preguntas  correctas: ")
    var correctas = readLine()!!.toInt()

    var resultado = (correctas * 100) / total  //regla de tres //resultado=%

    if (resultado >= 90) {
        print("Nivel máximo")
    } else if (resultado >= 75 && resultado < 90) {
        print("Nivel medio")
    } else if (resultado >= 50 && resultado < 75) {
        print("Nivel regular.")
    } else if (resultado < 50) {
        print("Nivel bajo")
    }
}

//

fun main27() {
    println("Ingresa la cantidad total de preguntas : ")
    var total = readLine()!!.toInt()

    println("Ingresa la cantidad total de preguntas  correctas: ")
    var num2 = readLine()!!.toInt()

    var resultado = (num2 * 100) / total

    if (resultado >= 90) {
        print("Nivel máximo")
    } else if (resultado >= 75 && resultado < 90) {
        print("Nivel medio")
    } else if (resultado >= 50 && resultado < 75) {
        print("Nivel regular.")
    } else if (resultado < 50) {
        print("Nivel bajo")
    }
}



/******************** CONDICIONAL CON OPERADORES LÓGICOS ********************/

/* 1. Escribe un programa en el que insertes una fecha cualquiera para verificar si dicha  fecha corresponde con Navidad.
(Importante: La carga de una fecha se hace por partes, ingresamos las variables día, mes y año). */

fun main28() {
    println("Ingrese un dia:")
    val numDia: Int = readLine()!!.toInt()

    println("Ingrese un número de mes:")
    val mes: Int = readLine()!!.toInt()

    println("Ingrese un año:")
    val año: Int = readLine()!!.toInt()

    if (numDia == 25 && mes == 12) {
        println("Es Navidad!")
    } else println("No es navidad")
}

//

fun main29() {
    println("Ingresa el día: ")
    var dia = readLine()!!.toInt()

    println("Ingresa un mes: ")
    var mes = readLine()!!.toInt()

    println("Ingresa un año: ")
    var año = readLine()!!.toInt()

    if (dia == 25 && mes == 12) {
        print("Es navidad!")
    } else print("No es navidad")
}



/* 2. Realiza un programa en el que se ingresen por consola 3 valor numéricos, si todos  son iguales calcular el cubo del número y mostrarlo. */

fun main30() {

    println("Ingrese un valor:")
    val num1 = readLine()!!.toInt()

    println("Ingrese un valor:")
    val num2 = readLine()!!.toInt()

    println("Ingrese un valor:")
    val num3 = readLine()!!.toInt()

    var cubo = (num1 * num2 * num1)

    if (num1 == num2 && num2 == num3) {
        print(cubo)
    }
}



/* 3. Realiza un programa en el que se ingrese por consola 3 números, si todos los valores  ingresados son menores a 10, imprimir el mensaje "Todos los números son menores  de diez". */

fun main31() {
    println("Ingrese un valor:")
    val num1 = readLine()!!.toInt()

    println("Ingrese un valor:")
    val num2 = readLine()!!.toInt()

    println("Ingrese un valor:")
    val num3 = readLine()!!.toInt()

    if (num1 < 10 && num2 < 10 && num3 < 10) {
        print("Todos los números son menores de diez")
    } else print("No todos los números son menores  de diez")
}



/* 4. Realiza un programa en el que se ingrese por consola 3 números, si al menos uno de los valores ingresados es menor a 10, imprimir el mensaje "Alguno de los números es menor de diez". */

fun main32() {
    println("Ingrese un valor:")
    val num1 = readLine()!!.toInt()

    println("Ingrese un valor:")
    val num2 = readLine()!!.toInt()

    println("Ingrese un valor:")
    val num3 = readLine()!!.toInt()

    if (num1 < 10 || num2 < 10 || num3 < 10) {
        print("Alguno de los números es menores de diez")
    } else print("Todos los números son mayores que diez")
}



/* 5. Escribir un programa que pida ingresar la coordenada de un punto en el plano, es  decir dos valores enteros x e y (distintos a cero).
Posteriormente imprimir en  consola en que cuadrante se ubica dicho punto.
a. 1º Cuadrante si x > 0 e y > 0
b. 2º Cuadrante si x < 0 e y > 0
c. 3º Cuadrante si x < 0 e y < 0
d. 4º Cuadrante si x > 0 e y < 0 */

fun main33() {
    println("Ingrese un valor:")
    val x = readLine()!!.toInt()

    println("Ingrese un valor:")
    val y = readLine()!!.toInt()

    if (x > 0 && y > 0) {
        print("1º Cuadrante")
    } else if (x < 0 && y > 0) {
        print("2º Cuadrante")
    } else if (x < 0 && y < 0) {
        print("3º Cuadrante")
    } else if (x > 0 && y < 0) {
        print("4º Cuadrante")
    } else print("No se pueden introducir valores con valor 0")
}



/******************** WHILE ********************/

/* Realizar un programa que imprima en pantalla los números del 1 al 100. */

fun main34() {
    var x = 1

    while (x <= 100) {
        println(x)
        x++
    }
}


/* Escribir un programa que solicite la carga de un valor positivo y nos muestre desde 1 hasta el valor ingresado de uno en uno.
Ejemplo: Si ingresamos 30 se debe mostrar en pantalla los números del 1 al 30.*/

fun main35() {
    println("Ingrese un numero: ")
    var valor = readLine()!!.toInt()

    var x = 1

    while (x <= valor) {
        println(x)
        x++
    }
}



/* Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre posteriormente
la suma de los valores ingresados y su promedio. */

fun main36() {

    var x = 1
    var suma = 0
    var promedio = 0

    while (x <= 10) {
        println("Inserte valores: ")
        var valor = readLine()!!.toInt()

        suma = suma + valor
        promedio = suma / 10
        x++
    }

    println("La suma es $suma")
    println("El promedio es $promedio")
}



/* Una planta que fabrica perfiles de hierro posee un lote de n piezas.
Confeccionar un programa que pida ingresar por teclado la cantidad de piezas a procesar y
luego ingrese la longitud de cada perfil; sabiendo que la pieza cuya longitud esté comprendida en el rango de 1.20 y 1.30 son aptas.
Imprimir por pantalla la cantidad de piezas aptas que hay en el lote.
 */

fun main37() {
    var x = 0
    var cantidad = 0

    println("Cuantas piezas para procesar?")
    var piezas = readLine()!!.toInt()

    while (x <= piezas) {
        println("Ingrese la medida de la pieza: ")
        var medida = readLine()!!.toDouble()
        if (medida >= 1.20 && medida <= 1.30) cantidad = cantidad + 1
        x++
    }

    println("El numero de piezas validas es $cantidad")
}



/* 1. Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe
cuántos tienen notas mayores o iguales a 7 y cuántos menores. */

fun main38() {
    var x = 1
    var nota = 0
    var notaMayorIgualSiete = 0
    var notaMenorSiete = 0

    while (x <= 10) {
        println("Ingrese 10 notas")
        var nota = readLine()!!.toInt()

        if (nota >= 7) {
            notaMayorIgualSiete++
        } else notaMenorSiete++
        x++
    }

    println("Las notas mayores o iguales que 7 son: $notaMayorIgualSiete")
    println("Las notas menores que 7 son: $notaMenorSiete")
}



/* 2. Se ingresan un conjunto de n alturas de personas por teclado (n se ingresa por
teclado). Mostrar la altura promedio de las personas. */

fun main39() {
    var x = 1
    var sumaAlturas = 0.0

    println("Personas a medir: ")
    var PersonasAMedir = readLine()!!.toInt()

    while (x <= PersonasAMedir) {
        println("Ingrese la altura:")
        var altura = readLine()!!.toDouble()

        sumaAlturas = sumaAlturas + altura
        x++
    }

    var promedio = sumaAlturas / PersonasAMedir

    println("La altura total es: $sumaAlturas")
    println("El promedio es $promedio")
}



/* 3. En una empresa trabajan n empleados cuyos sueldos oscilan entre €1000 y €3500,
realizar un programa que lea los sueldos que cobra cada empleado e informe cuántos
empleados cobran entre €1000 y €1800 y cuántos cobran más de €2500. Además, el
programa deberá informar el importe que gasta la empresa en sueldos al personal. */

fun main40() {
    var x = 1
    var sueldoTotal = 0.0
    var sueldosBajos = 0.0
    var sueldosAltos = 0.0

    println("Ingrese número empleados: ")
    var numeroEmpleados = readLine()!!.toInt()

    while (x <= numeroEmpleados) {
        println("Ingrese sueldo del empleado: ")
        var sueldoEmpleado = readLine()!!.toDouble()

        sueldoTotal = sueldoTotal + sueldoEmpleado

        if (sueldoEmpleado >= 1000 && sueldoEmpleado <= 1800) {
            sueldosBajos = sueldosBajos + 1
        } else if (sueldoEmpleado >= 2500 && sueldoEmpleado <= 3500) {
            sueldosAltos = sueldosAltos + 1
        }
        x++
    }

    print("El número de sueldos altos es: $sueldosAltos")
    print("El número de sueldos bajos es: $sueldosBajos")
    print("El número de sueldos totales es: $sueldoTotal")
}



/* 1. Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 – 44 -...
(No se ingresan valores por teclado). */

fun main41() {
    var x = 0
    var y = 0

    while (x <= 24) {
        y = y + 11
        println(y)
        x++
    }
}



/* 2. Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla la serie 8 -
16 – 24.... (No se ingresan valores por teclado). */

fun main42() {
    var x = 8

    while (x <= 500) {
        println(x)
        x = x + 8
    }
}



/* 3. Realizar un programa que permita cargar dos listas de 5 valores cada una. Informar
con un mensaje cual de las dos listas tiene un valor acumulado mayor (mensajes
"Lista 1 mayor", "Lista 2 mayor", "Listas iguales")
Tener en cuenta que puede haber dos o más estructuras repetitivas en un algoritmo.
(Pista: Para cargar cada lista fíjate en el ejemplo 3 visto en clase: Desarrollar un
programa que permita la carga de 10 valores por teclado y nos muestre
posteriormente la suma de los valores ingresados y su promedio.) */ //2bucles, 2while, 2listas

fun main43() {
    var x = 0
    var lista1 = 0
    var lista2 = 0

    while (x < 5) {
        println("Ingrese sueldo del empleado: ")
        var sueldo = readLine()!!.toInt()

        lista1 = lista1 + sueldo
        x++
    }

    x = 0 //Ponemos el valor a cero para poder ejecutar el siguiente while

    while (x < 5) {
        println("Ingrese sueldo del empleado: ")
        var sueldo = readLine()!!.toInt()

        lista2 = lista2 + sueldo

        x++
    }

    if (lista1 > lista2) {
        println("Lista 1 es mayor $lista1")
    } else if (lista2 > lista1) {
        println("Lista 2 es mayor $lista2")
    } else print("Son iguales")
}



/* 4. Desarrollar un programa que permita cargar n números enteros y luego nos
informe cuántos valores fueron pares y cuántos impares.
(Pista: Emplear el operador "%" en la condición de la estructura condicional:
if (valor % 2 == 0) //Si el if se verifica verdadero luego es par.) */

fun main44() {
    var x = 1
    var pares = 0
    var impares = 0

    println("Escribe la cantidad de números: ")
    var cantidadNumeros = readLine()!!.toInt()

    while (x <= cantidadNumeros) {
        print("Ingrese un número:")
        var num = readLine()!!.toInt()

        if (num % 2 == 0) {
            pares = pares + 1
        } else impares = impares + 1

        x++
    }

    println("Cantidad de pares: $pares")
    println("Cantidad de impares: $impares")
}



/******************** DO-WHILE ********************/

/* Escribir un programa que solicite la carga de un número entre 0 y 999, y nos muestre un mensaje de
cuantos dígitos tiene el mismo. Finalizar el programa cuando insertemos el valor 0. */

fun main45() {
    do {
        println("Ingresa un valor entre 0 y 999: ")
        var valor = readLine()!!.toInt()

        if (valor < 10) {
            println("El número tiene 1 dígito")
        } else if (valor < 100) {
            println("El número tiene 2 dígitos")
        } else print("El número tiene 3 o mas dígitos")

    } while (valor != 0)
}



/* Escribe un programa que solicite la carga de los numeros por teclado y obten su promedio.
Finalizar la de valores cuando se cargue el valor 0 */

fun main46() {
    var acumuladorValor = 0
    var contadorValor = 0

    do {
        println("Ingresa un valor:")
        var valor = readLine()!!.toInt()

        acumuladorValor = acumuladorValor + valor

        contadorValor++

    } while (valor != 0)

    val promedio = acumuladorValor / contadorValor
    println("El promedio: $promedio")
}



/* Se debe informar de lo siguiente:
1. Cuantas piezas tiene un peso entre 9.8 y 10.2 kg
2. Cantidad de piezas procesadas */

fun main47() {
    var cantidad1 = 0
    var cantidad2 = 0
    var cantidad3 = 0
    var total = cantidad1 + cantidad2 + cantidad3

    do {
        println("Ingresa el peso de la pieza: ")
        var peso = readLine()!!.toDouble()

        if (peso >= 9.8 && peso <= 10.2) {
            cantidad1 = cantidad1 + 1
        } else if (peso > 10.2) {
            cantidad2 = cantidad2 + 1
        } else if (peso > 0 && peso < 9.8) {
            cantidad3 = cantidad3 + 1
        }

    } while (peso != 0.0)

    println("Cantidad peso > 9.8 && peso < 10.2: $cantidad1")
    println("Cantidad peso > 10.2 : $cantidad2")
    println("Cantidad peso > 00 && peso < 9.8: $cantidad3")
    println("Cantiadad total: $total")
}



/* 1. Realizar un programa que acumule (sume) valores ingresados por teclado hasta
ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga). A
continuación, imprimir el valor acumulado e informar si dicho valor es cero, mayor
a cero o menor a cero. */

fun main48() {
    var valor = 0
    var acumuladorValor = 0

    do {
        println("Ingresa un valor")
        valor = readLine()!!.toInt()

        if (valor != 9999)

            acumuladorValor = acumuladorValor + valor

    } while (valor != 9999)

    println("El valor acumulado es $acumuladorValor")

    if (acumuladorValor == 0) {
        println("El valor es cero")
    } else if (acumuladorValor > 0) {
        println("El valor es mayor a cero")
    } else if (acumuladorValor < 0) {
        println("El valor es menor a cero")
    }
}



/* 2. En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada
cuenta corriente se conoce: número de cuenta y el ingreso. El ingreso de datos
debe finalizar al ingresar un valor negativo en el número de cuenta.
Se pide confeccionar un programa que lea los datos de las cuentas corrientes e
informe:
a) De cada cuenta: número de cuenta y estado del ingreso realizado, sabiendo que
el estado puede ser:
• “Ingreso” si el ingreso es > 0.
• “Pago” si el ingreso es < 0.
• “Nulo” si el ingreso es = 0.
b) La suma total de los ingresos.*/

fun main49() {
    var acumuladorSaldo = 0.0

    do {
        println("Ingresa un número de cuenta: ")
        val cuenta = readLine()!!.toInt()

        if (cuenta >= 0) {
            print("Ingresa saldo: ")
            var saldo = readLine()!!.toDouble()

            if (saldo > 0) {
                println("Ingreso")
            } else if (saldo < 0) {
                println("Pago")
            } else println("Nulo")

            acumuladorSaldo = acumuladorSaldo + saldo
        }

    } while (cuenta >= 0) // Do esto mientras la cuenta sea mayor o igual a cero. Si es inferior printea:
    println("Total de saldos Acreedores: $acumuladorSaldo") // Si el nº de cuenta es negativo: finaliza.
}



/* 1. Escribe un programa que simule una hucha. El programa solicitará primero una cantidad, que será la cantidad de dinero que queremos ahorrar.
 A continuación, el programa solicitará una y otra vez las cantidades que se irán ahorrando, hasta que el total ahorrado iguale o supere al objetivo. */

fun main50() {
    var acumuladorValor = 0

    println("Ingresa una cantidad a ahorrar: ")
    var maximo = readLine()!!.toInt()

    while (acumuladorValor <= maximo) {

        println("Ingresa dinero")
        var dinero = readLine()!!.toInt()

        acumuladorValor = acumuladorValor + dinero

        if (acumuladorValor >= maximo)
            println("El valor acumulado es $acumuladorValor")
    }
}



/* 2. Escribe un programa que pida primero dos números enteros (mínimo y máximo) y que después pida números enteros situados entre ellos.
El programa terminará cuando se escriba un número que no esté comprendido entre los dos valores iniciales.
El programa termina escribiendo la cantidad de números escritos. */

fun main51() {
    var contador = 0

    do {
        println("Escriba un número: ")
        val minimo = readLine()!!.toInt()

        println("Escriba un número mayor que $minimo: ")
        val maximo = readLine()!!.toInt()

        if (minimo >= maximo)
            println("$maximo no es mayor que $minimo. Inténtelo de nuevo.")
        else do {
            println("Escribe un número entre $minimo y $maximo")
            val medio = readLine()!!.toInt()

            if (medio in minimo..maximo)
                contador += 1
        } while (medio in minimo..maximo)
        println("la cantidad de numeros entre $minimo y $maximo escritos es $contador")

    } while (minimo >= maximo)
}



/* 3. Escribir un programa en el que ingreses un número por consola y determine si es capicúa o no. */

fun main52() {
    var invertido = 0
    var digito = 0
    var aux = 0 // aux es un valor modificado: (a -> aux -> b)

    println("Ingrese un numero: ")
    var num = readLine()!!.toInt()

    aux = num

    while (aux > 0) {
        digito = aux % 10
        invertido = invertido * 10 + digito
        aux = aux / 10
    }
    if (num == invertido) {
        println("El numero es capicua")
    } else {
        println("El numero no es capicua")
    }
}



/******************** RANGOS ********************/

var rangoNumeros = 1..9     //var rangoNumeross: IntRange = 1..9
var rangoLetras = "a".."z"



/* 1. Escribir un número y que te indique si está en un rango de valores*/
fun main53() {
    println("Inserte un número: ")
    var num = readLine()!!.toInt()

    var numero1a9 = 1..9

    if (num in numero1a9) {
        println("El número esta entre 1 y 9")
    } else if (num !in numero1a9) {
        println("El número no está entre 1 y 9")
    }
}



/******************** FOR ********************/

/* Realizar un proyecto que imprima por pantalla los números entre 1 y 100 */

fun main54() {
    for (n in 1..100)
        println(n)
}



/* Realiza un programa que permita la carga de 10 valores por consola y nos muestre posteriormente la suma de los valores y su promedio */

fun main55() {
    var suma = 0

    for (x in 1..10) {
        println("Ingrese un número: ")
        var num = readLine()!!.toInt()

        suma = suma + num
    }
    println("La suma de valores es: $suma")

    var promedio = suma / 10

    println("El promedio es: $promedio")
}



/* Realiza un programa que permita la carga de x valores por consola y nos muestre posteriormente la suma de los valores y su promedio */

fun main56() {
    var suma = 0

    print("Cantidad valores quieres ingresar: ")
    var cantidad = readLine()!!.toInt()

    for (x in 1..cantidad) {
        println("Ingrese un número: ")
        var num = readLine()!!.toInt()

        suma = suma + num
    }
    println("La suma de valores es: $suma")

    var promedio = suma / cantidad

    println("El promedio es: $promedio")
}



/* Escribir un programa que cuente cuantos mútiplos de 3, 5 y 9 hay en el rango de 1 a 1000 */

fun main57() {
    var multiplo3 = 0
    var multiplo5 = 0
    var multiplo9 = 0

    for (x in 1..1000) {
        if (x % 3 == 0) {
            multiplo3 = multiplo3 + 1
        } else if (x % 5 == 0) {
            multiplo5 = multiplo5 + 1
        } else if (x % 9 == 0) {
            multiplo9 = multiplo9 + 1
        }
    }

    println("Los múltiplos de 3 son: $multiplo3")
    println("Los múltiplos de 5 son: $multiplo5")
    println("Los múltiplos de 9 son: $multiplo9")
}



/* Para que reciba valores comprendidos en el rango de 2 en 2 */

fun main58() {
    for (x in 0..10 step 2)
        println(x)
}


/* Para que haga el recorrido inverso */

fun main59() {
    for (x in 10 downTo 1)
        println(x)
}



/* Para que haga el recorrido inverso de 2 en 2 */

fun main60() {
    for (x in 10 downTo 1 step 2)
        println(x)
}



/* Con texto */
fun main61() {
    var texto = "hola"

    for (i in texto) {
        println(i)
    }
}



/******************** FOR Y EXPRESIONES DE RANGO ********************/

/* 1. Crea un programa que muestre la tabla de multiplicar del 5 (del 5 al 50) */

fun main62() {
    for (x in 1..10) {
        println("$x * 5 = " + 5 * x)
    }

}

// Opción 2
fun main062() {

    for (x in 1..50 step 5) {
        println("$x * 5 = " + 5 * x)
    }
}



/* 2. Realizar un programa que lea n pares de datos, cada par de datos corresponde a la
medida de la base y la altura de un triángulo. El programa deberá informar:
a) Para cada triángulo informar por consola de la medida de su base, su altura y
su superficie (la superficie se calcula multiplicando la base por la altura y
dividiendo por dos).
b) La cantidad de triángulos cuya superficie es mayor a 12. */

fun main63() {
    var contador = 0

    print("Cuántos vas a calcular: ")
    var num = readLine()!!.toInt()


    for (x in 1..num) {
        print("Ingrese la base: ")
        var base = readLine()!!.toInt()

        print("Ingrese la altura: ")
        var altura = readLine()!!.toInt()

        var superficie = (base * altura) / 2


        if (superficie > 12) {
            contador = contador + 1
        }
    }
    println("Hay $contador mayores de 12")
}



/* 3. Desarrollar un programa que solicite la carga de 10 números e imprima la suma de
los últimos 5 valores ingresados. */

fun main64() {
    var suma = 0

    for (x in 1..10) {

        println("Ingrese el valor $x: ")
        var valor = readLine()!!.toInt()

        if (x > 4) {
            suma = suma + valor
        }

    }
    println("La suma de los últimos 5 valores es $suma")
}



/*4. Realizar un programa que permita ingresar un valor del 1 al 10 y nos muestre la
tabla de multiplicar del mismo (los primeros 12 términos)
Ejemplo: Si ingresó 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36. */

fun main65() {
    println("Introduce un número entero: ")
    var n = readLine()!!.toInt()

    println("Tabla del $n")

    for (x in 1..12)

        println("$n * $x =" + n * x)
}



/*1. Realizar un programa que lea los lados de n triángulos, e informar:
a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales),
isósceles (dos lados iguales), o escaleno (ningún lado igual)
b) Cantidad de triángulos de cada tipo. */

fun main66() {
    var equilatero = 0
    var isosceles = 0
    var escaleno = 0

    println("Ingresa la cantidad de triángulos: ")
    var cantidad = readLine()!!.toInt()

    for (x in 1..cantidad) {
        println("Ingresa el lado 1: ")
        var lado1 = readLine()!!.toInt()

        println("Ingresa el lado 2: ")
        var lado2 = readLine()!!.toInt()

        println("Ingresa el lado 3: ")
        var lado3 = readLine()!!.toInt()

        if (lado1 == lado2 && lado1 == lado3) {
            println("Es un triángulo equilátero.")
            equilatero = equilatero + 1

        } else if (lado1 == lado2 && lado1 == lado3 || lado2 == lado3) {
            println("Es un triángulo isósceles")
            isosceles = isosceles + 1

        } else println("Es un triángulo escaleno.")
        escaleno = escaleno + 1
    }

    println("La cantidad de triángulos equiláteros es: $equilatero")
    println("La cantidad de triángulos isósceles es: $isosceles")
    println("La cantidad de triángulos escalenos es: $escaleno")
}



/* 2. Realiza un programa que permita la carga de 10 valores enteros por consola. Se
desea conocer:
a) La cantidad de valores ingresados negativos.
b) La cantidad de valores ingresados positivos.
c) La cantidad de múltiplos de 15.
d) La cantidad de los números ingresados que son pares. */

fun main67() {
    var negativo = 0
    var positivo = 0
    var multiplo15 = 0
    var par = 0

    for (x in 1..10) {

        println("Ingresa $x de 10 valores enteros: ")
        var entrada = readLine()!!.toInt()

        if (entrada < 0) {
            println("Numero negativo")
            negativo = negativo + 1
        }

        if (entrada > 0) {
            println("Número positivo")
            positivo = positivo + 1
        }

        if (entrada % 15 == 0) {
            println("Número múltiplo de 15")
            multiplo15 = multiplo15 + 1
        }

        if (entrada % 2 == 0) {
            println("Número par")
            par = par + 1
        }
    }

    println("La cantidad de números negativos es: $negativo")
    println("La cantidad de números positivos es: $positivo")
    println("La cantidad de números múltiplos de 15 es: $multiplo15")
    println("La cantidad de números pares es $par")
}



/* 3. Escribe un programa que imprima por pantalla los 100 primeros números de la
sucesión de Fibonacci. */

fun main68() {
    var primNumero = 1.0
    var seguNumero = 1.0
    var resulNumero = 0.0

    for (x in 0..100) {
        primNumero = seguNumero
        seguNumero = resulNumero
        resulNumero = primNumero + seguNumero

        var num3 = resulNumero.toString()

        if ("$num3".endsWith(".0")) {
            num3 = "$num3".replace(".0", "")
        }
        println("$num3")
    }
}


/******************** WHEN ********************/

/* 2. Realiza un programa que permita la carga de 10 valores enteros por consola. Se
desea conocer:
a) La cantidad de valores ingresados negativos.
b) La cantidad de valores ingresados positivos.
c) La cantidad de múltiplos de 15.
d) La cantidad de los números ingresados que son pares. */

fun main69() {
    var negativo = 0
    var positivo = 0
    var multiplo15 = 0
    var par = 0

    for (x in 1..10) {

        println("Ingresa $x de 10 valores enteros: ")
        var entrada = readLine()!!.toInt()

        when { //No funcionaría porque hemos utilizado if anidados. Si fuese con else if si funcionaría.
            (entrada < 0) -> {
                println("Valor negativo")
                negativo + 1
            }

            (entrada > 0) -> {
                println("Valor positivo")
                positivo + 1
            }

            (entrada % 15 == 0) -> {
                println("Valor múltiplo de 15")
                multiplo15 + 1
            }

            (entrada % 2 == 0) -> {
                println("Número par")
                par + 1
            }
        }


    }

    println("La cantidad de números negativos es: $negativo")
    println("La cantidad de números positivos es: $positivo")
    println("La cantidad de números múltiplos de 15 es: $multiplo15")
    println("La cantidad de números pares es $par")
}



/* Escribir un programa que cuente cuantos mútiplos de 3, 5 y 9 hay en el rango de 1 a 1000 */

fun main70() {
    var multiplo3 = 0
    var multiplo5 = 0
    var multiplo9 = 0

    for (x in 1..1000) {
        when {
            x % 9 == 0 -> (multiplo9++)
            x % 5 == 0 -> (multiplo5++)
            x % 3 == 0 -> (multiplo3++)
        }
    }

    println("Los múltiplos de 3 son: $multiplo3")
    println("Los múltiplos de 5 son: $multiplo5")
    println("Los múltiplos de 9 son: $multiplo9")
}



/* Mostrar el sueldo de 4 empleados por consola, mostrando un mensaje que indique si el sueldo es alto, medio o bajo.
sueldo alto -> >5000, sueldo medio <= 5000 y >2000 y sueldo bajo <= 2000.
Que sume el acumulado de sueldos altos medios y bajos y los saque por pantalla*/

fun main71() {
    var alto = 0
    var medio = 0
    var bajo = 0

    for (x in 1..4) { //4 repeticiones

        println("Ingrese el sueldo del empleado:")
        var sueldo = readLine()!!.toInt()

        when {
            sueldo > 5000 -> {
                println("Sueldo alto")
                alto = alto + 1
            }
            sueldo in 2000..5000 -> {
                println("Sueldo medio")
                medio = medio + 1
            }
            sueldo <= 2000 -> {
                println("Sueldo bajo")
                bajo = bajo + 1
            }
        }
    }

    println("La cantidad de sueldos altos es: $alto")
    println("La cantidad de sueldos medios es: $medio")
    println("La cantidad de sueldos bajos es: $bajo")
}



/* Mostrar el sueldo de 4 empleados por consola, mostrando un mensaje que indique si sueldo es alto medio o bajo.
Sueldo alto -> >5000, sueldo medio <= 5000 y >2000 y sueldo bajo <2000.
Sume el acumulado de sueldos altos y lo saque por pantalla. */

fun main72() {
    var total = 0

    for (x in 1..4) { //4 repeticiones

        println("Ingrese sueldo:")
        val sueldo = readLine()!!.toInt()

        total += when {
            sueldo > 5000 -> {
                println("Sueldo alto.")
                sueldo
            }
            sueldo > 2000 -> {
                println("Sueldo medio.")
                0
            }
            else -> {
                println("Sueldo bajo.")
                0
            }
        }
    }

    println("La suma de sueldos altos es: $total")
}



/* 1. Crea un programa en el que se ingrese un número entero, y a continuación muestre
si el número es positivo, nulo o negativo. */

fun main73() {
    println("Ingrese un número entero: ")
    var num = readLine()!!.toInt()

    when {
        num > 0 -> println("Número positivo")
        num == 0 -> println("Número nulo")
        num < 0 -> println("Número negativo")
    }
}



/* 2. Realizar un programa en el que se plantee una estructura que se repita 3 veces y
dentro de la misma se carguen 3 valores enteros. Finalmente saca por pantalla el
acumulado del mayor valor de cada lista de 3 valores. */


fun main74() {
    var contador = 0

    for (x in 1..3) {

        println("Ingresa valor número 1 del bloque $x: ")
        var num1 = readLine()!!.toInt()

        println("Ingresa valor número 2 del bloque $x : ")
        var num2 = readLine()!!.toInt()

        println("Ingresa valor número 3 del bloque $x : ")
        var num3 = readLine()!!.toInt()

        when {
            (num1 > num2 && num1 > num3) -> {
                println("$num1 es el mayor")
                contador = contador + num1
            }
            (num2 > num1 && num2 > num3) -> {
                println("$num2 es el mayor")
                contador = contador + num2
            }
            else -> {
                println("$num3 es el mayor")
                contador = contador + num3
            }
        }
    }
    println("El acumulado del bloque 1 es $contador")
}



/* 3. Realizar un programa que lea los lados de n triángulos, e informar:
a. De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales),
isósceles (dos lados iguales), o escaleno (ningún lado igual).
b. Cantidad de triángulos de cada tipo. */

fun main75() {
    var equilatero = 0
    var isosceles = 0
    var escaleno = 0

    println("Ingresa la cantidad de triángulos: ")
    var cantidad = readLine()!!.toInt()

    for (x in 1..cantidad) {

        println("Ingresa el lado 1: ")
        var lado1 = readLine()!!.toInt()

        println("Ingresa el lado 2: ")
        var lado2 = readLine()!!.toInt()

        println("Ingresa el lado 3: ")
        var lado3 = readLine()!!.toInt()

        when {
            (lado1 == lado2 && lado1 == lado3) -> {
                println("Es un triángulo equilátero.")
                equilatero = equilatero + 1
            }

            (lado1 == lado2 && lado1 == lado3 || lado2 == lado3) -> {
                println("Es un triángulo isósceles")
                isosceles = isosceles + 1
            }

            else -> {
                println("Es un triángulo escaleno.")
                escaleno = escaleno + 1
            }
        }

        println("La cantidad de triángulos equiláteros es: $equilatero")
        println("La cantidad de triángulos isósceles es: $isosceles")
        println("La cantidad de triángulos escalenos es: $escaleno")
    }
}



/* 4. Realizar un programa que permita cargar la cantidad de hijos de 5 familias y una vez
cargados muestre por pantalla cuantos tienen 0,1,2 o más hijos. */

fun main77() {
    var contador1 = 0
    var contador2 = 0
    var contador3 = 0
    var contador4 = 0

    for (x in 1..5) {

        println("Ingresa hijos de la familia $x: ")
        var hijos = readLine()!!.toInt()

        when (hijos) {

            0 -> {
                println("Tiene 0 hios")
                contador1++
            }
            1 -> {
                println("Tiene 1 hijo")
                contador2++
            }
            2 -> {
                println("Tiene 2 hijos")
                contador3++
            }
            else -> {
                println("Familia numerosa")
                contador4++
            }
        }
    }

    println("Cantidad de familia con 0 hijos: $contador1")
    println("Cantidad de familia con 1 hijos: $contador2")
    println("Cantidad de familia con 2 hijos: $contador3")
    println("Cantidad de familias numerosas: $contador4")

}



/* 5. Ingresar un valor entero positivo comprendido entre 1 y 10000. Imprimir un
mensaje indicando cuantos dígitos tiene. */

fun main78() {
    println("Ingrese un número entero entre 1 y 1000: ")
    var num = readLine()!!.toInt()

    when {

        (num in 0..9) -> {
            println("Tiene 1 dígito ")
        }
        (num in 10..99) -> {
            println("Tiene 2 dígitos")
        }
        (num in 100..1000) -> {
            println("Tiene 3 dígitos")
        }
        else -> println("Tiene mas de 3 dígitos")
    }
}



/* 6. Ingresar 10 valores enteros por teclado. Contar cuantos de dichos valores ingresados
fueron cero y cuantos 1,5 o 10. */

fun main79() {
    var contador1 = 0
    var contador2 = 0

    for (x in 1..10) {

        println("Ingrese un número entero entre 1 y 10: ")
        var num = readLine()!!.toInt()

        when {

            (num == 0) -> {
                contador1++
            }
            (num in 1..10) -> {
                contador2++
            }
        }
    }

    println("La cantidad de ceros son: $contador1")
    println("La cantidad de valores entre 1 y 10 son: $contador2 ")
}


/******************** FUNCIONES ********************/

/* Ejempo 1*/
fun main81() { //81
    for (x in 1..2) {
        hola()
        suma()
    }
}

fun main80() { //80
    hola()
    suma()
}

fun hola() {
    println("Hola!")
}

fun suma() {
    var a = 1
    var b = 2
    var c = a + b
    println("1 + 2 = $c ")
}



/* 1. Desarrollar un programa con dos funciones. La primer solicite el ingreso de un
entero y muestre el cuadrado de dicho valor. La segunda que solicite la carga de dos
valores y muestre el producto de los mismos. Llamar desde la main a ambas
funciones. */

fun main82() {
    cuadrado()
    producto()
}

fun cuadrado() {
    println("Escribe un número entero")
    var entero = readLine()!!.toDouble()

    var cuadrado = Math.pow(entero, 2.0)
    println(cuadrado.toInt())
}

fun producto() {
    println("Escribe un número entero")
    var num1 = readLine()!!.toInt()

    println("Escribe un número entero")
    var num2 = readLine()!!.toInt()

    var producto = (num1 * num2)
    println("El producto es: $producto")
}



/* 2. Desarrollar una función que solicite la carga de tres valores y muestre el menor.
Desde la función main del programa llamar 2 veces a dicha función, realiza esta
parte utilizando y sin utilizar una estructura repetitiva. */

fun main83() {
    for (x in 1..2) {
        numeroMenor()
    }
}


fun numeroMenor() {
    println("Escribe el primer número entero:")
    var num1 = readLine()!!.toInt()

    println("Escribe el segundo número entero:")
    var num2 = readLine()!!.toInt()

    println("Escribe el tercer número entero:")
    var num3 = readLine()!!.toInt()

    if (num1 < num2 || num1 < num3) {
        println("El número menor es $num1")
    } else if (num2 < num1 || num2 < num3) {
        println("El número menor es $num2")
    } else if (num3 < num1 || num3 < num2) {
        println("El número menor es $num3")
    } else println("Son iguales")
}



/* Ejemplo de funciones con parametros */
fun main84() { //84
    mostrarMensaje("Esto es una prueba", 2)
    mostrarMensaje("Seguimos con la prueba", 0)
    mostrarMensaje("La prueba ha terminado", 0)
    mostrarMensaje("Esto es una prueba", 3)
}

fun mostrarMensaje(mensaje: String, codigo: Int) {
    println("*************")
    println(mensaje)

    var suma = codigo + codigo

    println(suma)

    println("*************")
}



/* Crea una función que reciba 3 enteros y muestre el mayor de ellos. */

fun mayor(valor1: Int, valor2: Int, valor3: Int) {
    println("El numero mayor es: ")
    when {
        valor1 > valor2 && valor1 > valor3 -> println(valor1)
        valor2 > valor3 -> println(valor2)
        else -> println(valor3)
    }
}

fun main85() {
    println("Ingrese el primer el valor")
    var v1 = readLine()!!.toInt()
    println("Ingrese el primer el valor")
    var v2 = readLine()!!.toInt()
    println("Ingrese el primer el valor")
    var v3 = readLine()!!.toInt()

    mayor(v1, v2, v3)
}



/* 1. En la función main solicitar que se ingrese una contraseña dos veces por consola
(1. “Ingresa la contraseña” ; 2. “Repite el ingreso de la contraseña”).
Desarrollar una función que reciba dos String como parametros y muestre un
mensaje si las dos contraseñas ingresadas son iguales o si son distintas. */

fun main86() {
    println("Ingrese la primera contraseña: ")
    var pass1 = readLine()!!

    println("Ingrese la segunda contraseña: ")
    var pass2 = readLine()!!//86

    contraseña(pass1, pass2)
}

fun contraseña(valor1: String, valor2: String) {
    if (valor1 == valor2) {
        println("Son iguales")
    } else println("Son distintas.")
}



/* 2. Escribe una función que reciba tres enteros como parámetros y los muestre
ordenados de menor a mayor (*). En la función main solicitar la carga de 3 enteros
por consola y proceder a llamar a la primera función definida.
* Para ello lo que tienes que hacer es realizar un when donde establezcas que
número es el mayor y según eso ordenar con if el orden de impresión por
consola y repetir el proceso 3 veces por ser 3 valores, por ejemplo, si estableces
que el valor 1 es el mayor: */

fun main87() { //87
    numeroMayor()
}

fun numeroMayor() {
    println("Ingrese entero número 1: ")
    var num1 = readLine()!!.toInt()

    println("Ingrese entero número 2: ")
    var num2 = readLine()!!.toInt()

    println("Ingrese entero número 3: ")
    var num3 = readLine()!!.toInt()


    when {
        num1 < num2 && num1 < num3 -> {
            if (num2 < num3) {
                println("$num1 $num2 $num3 ")
            } else println("$num1 $num3 $num2 ")
        }

        num2 < num1 && num2 < num3 -> {
            if (num1 < num3) {
                println("$num2 $num1 $num3 ")
            } else println("$num2 $num3 $num1 ")
        }

        num3 < num2 && num3 < num1 -> {
            if (num2 < num1) {
                println("$num3 $num2 $num1 ")
            } else println("$num3 $num1 $num2 ")
        }
    }
}



/* Crea dos funciones, una para calcular el perímetro de un cuadrado y otra para calcular el área del cuadrado,
 ambos resultados los debe mostrar por pantalla.

En la función main debes ingresar el lado del cuadrado por consola y
crear un procedimiento que me pregunte si quiero calcular y mostrar su perímetro
o su superficie (PISTA: Se realiza con When).
 */

fun main88() {
    println("Ingrese el lado del cuadrado: ")
    var entrada = readLine()!!.toInt()


    println("¿Quieres calcular y mostrar su perímetro? si/no")
    var respuesta1 = readLine()!!.toString()

    when {
        respuesta1 == "si" -> perimetro(entrada)
        respuesta1 == "no" -> println(":)")
    }


    println("¿Quieres calcular y mostrar su superficie? si/no")
    var respuesta2 = readLine()!!.toString()

    when {
        respuesta2 == "si" -> area(entrada)
        respuesta1 == "no" -> println(":)")
    }
}


fun perimetro(lado: Int) {
    var perimetro = 4 * lado
    println("El perimetro del cuadrado de $lado es $perimetro")
}


fun area(lado: Int) {
    var area = lado * lado
    println("El resultado del area es $area")
}


/** RETURN (POSICIÓN/VALOR) */

/* Calcular la superficie con RETURN */

fun main89() {
    println("Promedio es: ${promedio1(4, 5, 6)}")
}


fun promedio1(valor1: Int, valor2: Int, valor3: Int): Int {
    val promedio = (valor1 + valor2 + valor3) / 3
    return promedio
}


/* Calcular mayor valor */

fun main90() {
    println("Ingrese el primer valor")
    var v1 = readLine()!!.toInt()

    println("Ingrese el segundo valor")
    var v2 = readLine()!!.toInt()

    println("El mayor valor es ${mayorValor(v1, v2)}")
}


fun mayorValor(valor1: Int, valor2: Int): Int {
    if (valor1 > valor2)
        return valor1
    else return valor2
}



/* 1. Elaborar una función que reciba tres valores enteros como parámetro y nos retorne
el valor promedio de los mismos. Ingresar los valores por consola en la función
main y sacar por consola el resultado del promedio. */

fun main91() {
    println("Ingresa el primer valor entero:")
    var num1 = readLine()!!.toInt()

    println("Ingresa el primer valor entero:")
    var num2 = readLine()!!.toInt()

    println("Ingresa el primer valor entero:")
    var num3 = readLine()!!.toInt()

    println("El promedio es ${promedio(num1, num2, num3)} ")

}

fun promedio(valor1: Int, valor2: Int, valor3: Int): Int {
    var promedio = (valor1 + valor2 + valor3) / 3
    return promedio
}



/* 2. Elaborar una función que nos retorne el perímetro de un cuadrado pasando como
parámetros el valor del lado. */

fun main92() {
    println("Ingresa el primer valor del lado:")
    var num = readLine()!!.toInt()

    println("El perímetro del cuadrado es ${perimetroCuadrado1(num)}")
}

fun perimetroCuadrado1(num: Int): Int {
    var perimetro = (num * 4)
    return perimetro
}



/* 3. Confeccionar una función que calcule el perímetro de un triángulo y lo retorne,
la  función recibe como parámetros los valores de los tres lados:

fun perimetro(lado1: Int, lado2: Int, lado3: Int): Int {

En la función main del programa cargar los lados de dos triángulos y luego  mostrar cual de los dos tiene un perímetro mayor.
 */

//De esta forma no cumpliríamos el último paso: "y luego  mostrar cual de los dos tiene un perímetro mayor."

fun main93() {
    for (x in 1..2) {
        println("Ingresa el primer lado del triángulo $x:")
        var num1 = readLine()!!.toInt()

        println("Ingresa el segundo lado del triángulo $x:")
        var num2 = readLine()!!.toInt()

        println("Ingresa el tercer lado del triándulo $x:")
        var num3 = readLine()!!.toInt()


        println(
                "El resultado del perímetro del triángulo es ${
                    perimetroTriangulo(
                            num1,
                            num2,
                            num3
                    )
                }"
        )
    }
}

fun perimetroTriangulo(num1: Int, num2: Int, num3: Int): Int {
    var perimetroTriangulo = (num1 + num2 + num3)
    return perimetroTriangulo
}



/* 3. Confeccionar una función que calcule el perímetro de un triángulo y lo retorne,
la  función recibe como parámetros los valores de los tres lados:
fun perimetro(lado1: Int, lado2: Int, lado3: Int): Int {
En la función main del programa cargar los lados de dos triángulos y luego  mostrar cual de los dos tiene un perímetro mayor.
 */

fun main94() {
    //Triángulo 1
    println("Ingresa el primer lado del triángulo 1:")
    var lado1 = readLine()!!.toInt()

    println("Ingresa el segundo lado del triángulo 1:")
    var lado2 = readLine()!!.toInt()

    println("Ingresa el tercer lado del triándulo 1:")
    var lado3 = readLine()!!.toInt()


    //Triángulo 2
    println("Ingresa el primer lado del triángulo 2:")
    var lado4 = readLine()!!.toInt()

    println("Ingresa el segundo lado del triángulo 2:")
    var lado5 = readLine()!!.toInt()

    println("Ingresa el tercer lado del triándulo 2:")
    var lado6 = readLine()!!.toInt()


    //Comparación
    when {
        perTriangulo(lado1, lado2, lado3) > perTriangulo(lado4, lado5, lado6) -> {
            println("El triangulo 1 es mayor que el triangulo 2 y su perimetro es : ${perTriangulo(lado1, lado2, lado3)}")
        }

        perTriangulo(lado1, lado2, lado3) < perTriangulo(lado4, lado5, lado6) -> {
            println("El triángulo 2 es mayor que el triangulo 1 y su perimetro es: ${perTriangulo(lado4, lado5, lado6)}")
        }

        perTriangulo(lado1, lado2, lado3) == perTriangulo(lado4, lado5, lado6) -> {
            println("El triángulo 1 es igual que triángulo 2 y su perimetro es: ${perTriangulo(lado1, lado2, lado3)}")
        }
    }
}

fun perTriangulo(valor1: Int, valor2: Int, valor3: Int): Int {

    var perimetroTriangulo = (valor1 + valor2 + valor3)
    return perimetroTriangulo
}


/*Ejemplo de return */

fun main95() {
    var valor1 = 1
    var valor2 = 2

    println("El mayor entre $valor1 y $valor2 es ${valorMayor(valor1, valor2)}")
}

fun valorMayor(v1: Int, v2: Int) = if (v1 > v2) v1 else v2



/* 1. Elaborar una función que reciba tres enteros y nos retorne el valor promedio de los
mismos. */

fun main96() {
    println("Inserta 3 valores")
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    var num3 = readLine()!!.toInt()

    println("El promedio de los 3 números es: ${promedio2(num1, num2, num3)}")
}

fun promedio2(valor1: Int, valor2: Int, valor3: Int) = (valor1 + valor2 + valor3) / 3



/* 2. Elaborar una función que nos retorne el perímetro de un cuadrado pasando como
parámetros el valor del lado. */

fun main97() {
    println("Inserta la longitud del lado: ")
    var lado = readLine()!!.toInt()

    println("El perimetro del cuadrado es ${perimetroCuadrado(lado)}")
}

fun perimetroCuadrado(valor1: Int) = (valor1 * 4)



/* 3. Confeccionar una función que calcule la superficie de un rectángulo y la retorne, la
función recibe como parámetros los valores de dos de sus lados:
fun Superficie(lado1: Int,lado2: Int)
En la función main del programa debe cargar los lados de dos rectángulos y
luego mostrar cual de los dos tiene una superficie mayor. */

fun main98() {
    //Rectángulo 1
    println("Ingresa el primer lado del triángulo 1:")
    var lado1 = readLine()!!.toInt()

    println("Ingresa el segundo lado del triángulo 1:")
    var lado2 = readLine()!!.toInt()


    //Rectángulo 2
    println("Ingresa el primer lado del triángulo 2:")
    var lado3 = readLine()!!.toInt()

    println("Ingresa el segundo lado del triángulo 2:")
    var lado4 = readLine()!!.toInt()


    //Comparación
    when {
        supRectangulo(lado1, lado2) > supRectangulo(lado3, lado4) -> {
            println(
                    "El rectángulo 1 es mayor que el rectángulo 2 y su superficie es : ${
                        supRectangulo(
                                lado1,
                                lado2
                        )
                    }"
            )
        }

        supRectangulo(lado1, lado2) < supRectangulo(lado3, lado4) -> {
            println(
                    "El rectángulo 2 es mayor que el rectángulo 1 y su superficie es: ${
                        supRectangulo(
                                lado3,
                                lado4
                        )
                    }"
            )
        }

        supRectangulo(lado1, lado2) == supRectangulo(lado3, lado4) -> {
            println(
                    "El rectángulo 1 es igual que rectángulo 2 y su perimetro es: ${
                        supRectangulo(
                                lado1,
                                lado2
                        )
                    }"
            )
        }
    }
}

fun supRectangulo(valor1: Int, valor2: Int) = valor1 * valor2



/* 4. Confeccionar una función que le enviemos como parámetro un String y nos retorne
la cantidad de caracteres que tiene.
En la función main solicitar la carga de dos nombres por teclado y llamar a la función dos veces.
Imprimir en la main cual de las dos palabras tiene más caracteres. */

fun main99() {
    println("Escribe primera palabra: ")
    var palabra1 = readLine()!!.toString()

    println("Escribe segunda palabra: ")
    var palabra2 = readLine()!!.toString()

    println("La longitud de $palabra1 es: ${longitudPalabra(palabra1)}")
    println("La longitud de $palabra2 es: ${longitudPalabra(palabra2)}")

    when {
        longitudPalabra(palabra1) > longitudPalabra(palabra2) ->
            println("$palabra1 Es mayor.")

        longitudPalabra(palabra2) > longitudPalabra(palabra1) ->
            println("$palabra2 Es mayor.")

        longitudPalabra(palabra1) == longitudPalabra(palabra2) ->
            println("$palabra1 y $palabra2 Son iguales.")
    }
}

fun longitudPalabra(valor1: String) = valor1.length


/******************** FUNCIONES CON UNA ÚNICA EXPRESIÓN ********************/

fun main100() {
    println("${suma(15, 26)}")
    println("${suma(15, 26, 1, 2)}")
    println("${suma(valor1 = 16, valor2 = 16, valor5 = 20)}")

}

//Que valor3, valor4, valor 5 tenga por defecto el valor 0
fun suma(valor1: Int, valor2: Int, valor3: Int = 0, valor4: Int = 0, valor5: Int = 9) =
        valor1 + valor2 + valor3 + valor4 + valor5


/******************** FUNCIONES ANIDADAS ********************/

fun main101() {
    muestraMayor()
}

fun muestraMayor() {
    fun mayor(valor1: Int, valor2: Int) = if (valor1 > valor2) valor1 else valor2

    //for (x in 1..5)
    println("Inserte los dos valores: ")
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    println("El mayor de los valores insertados es ${mayor(num1, num2)}")

}



/* Confeccionar una función que permita ingresar 10 valores por teclado y contar cuántos son pares y cuántos impares */

fun main102() {
    calculoParImpar()
}

fun calculoParImpar() {
    fun par(valor1: Int) = valor1 % 2 == 0

    var contPar = 0
    var contImpar = 0

    for (x in 1..10) {

        println("Inserte un número")
        val num1 = readLine()!!.toInt()

        if (par(num1)) contPar++
        else contImpar++
    }

    println("La cantidad de números pares es $contPar y de impares $contImpar")
}


/******************** ARRAYS ********************/

var mesesDelAno = arrayOf("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio")

fun main103() {
    println(mesesDelAno[0]) //Devuelve: Enero
    println("El mes del año es ${mesesDelAno[1]}") //Devuelve: Febrero
    println(mesesDelAno.size) //Para saber el tamaño
}


/* Se desea guardar los sueldos de 5 empleados. A continuación mediante un índice del array, obten todos los sueldos ingresados por pantalla */

fun main104() { //103

    var sueldos = IntArray(5)

    for (x in 0..sueldos.size - 1) {
        println("Ingrese sueldo: ")
        sueldos[x] = readLine()!!.toInt()
    }

    for (x in 0..sueldos.size - 1) {
        println(sueldos[x])
    }
}


/******************** TIPOS DE DATOS EN ARRAYS ********************/

var botellas = IntArray(5)
var sueldos = FloatArray(4)
var alturas = LongArray(6)
var distancias = DoubleArray(8)
var veradero = BooleanArray(4)
var piso = CharArray(4)


/* Crear un array en el que insertes las alturas de 5 personas, el tipo de array es Float.
A continuación saca por pantalla la suma de las 5 alturas */

fun main105() {
    var alturas = FloatArray(5)

    for (x in 0..alturas.size - 1) {
        println("Ingrese altura: ")
        alturas[x] = readLine()!!.toFloat()
    }

    println("La suma total de alturas es: ${alturas.sum()}")
}



/* Crear un array en el que insertes las alturas de 5 personas, el tipo de array es Float.
A continuación saca por pantalla la suma de las 5 alturas */

fun main106() {
    var alturas = FloatArray(5)
    var sumaAlturas = 0f

    for (x in 0..alturas.size - 1) {
        println("Ingrese altura $x de 5:")
        alturas[x] = readLine()!!.toFloat()
        sumaAlturas = sumaAlturas + alturas[x]
    }

    println("La suma total de alturas es sumaAlturas")
}



/* Obtener el promedio de alturas y hacer un condicional en el que indique que cantidad de personas son mas altas y mas bajas que el promedio */

fun main107() {
    var alturas = FloatArray(5)

    for (x in 0..alturas.size - 1) {
        println("Ingrese altura: ")
        alturas[x] = readLine()!!.toFloat()
    }

    println("La suma total de alturas es: ${alturas.sum()}")

    //

    var promedio = (alturas.sum() / alturas.size)

    var alto = 0
    var bajo = 0

    for (x in 0..alturas.size - 1) {
        if (alturas[x] < promedio)
            alto++
        else
            bajo++
    }
    println("Su promedio es ${(alturas.sum() / alturas.size)}")
    println("La cantidad de personas altas es: $alto")
    println("La cantidad de personas bajas es: $bajo")
}



/* Desarrollar un programa que permita ingresar un Array de 8 elementos enteros, y saque por pantalla:
1. El valor acumulado de todos los elementos.
2. El valor acumulado de los elementos que sean mayores a 36.
3. Cantidad de valores mayores a 50. */

fun main108() {
    var valor = IntArray(8)

    for (x in 0..valor.size - 1) {
        println("Ingrese el valor número $x: ")
        valor[x] = readLine()!!.toInt()
    }

    var acumulado = 0
    var acumuladoMayor36 = 0
    var acumuladoMayor50 = 0

    for (x in 0..valor.size - 1) {

        acumulado = acumulado + valor[x]

        if (valor[x] > 36) {
            acumuladoMayor36 = acumuladoMayor36 + valor[x]
        }
        if (valor[x] > 50) {
            acumuladoMayor50++
        }
    }

    println("La suma total de valores es: $acumulado")
    println("Mayores a 36 :$acumuladoMayor36")
    println("Mayores a 50: $acumuladoMayor50")
}



/* Obtener primer valor y último valor de un array */

fun main109() {
    val numeros = IntArray(3)

    for (x in numeros.indices) { //Esto es igual a for(i in 0 .. numeros.size-1)
        println("Ingrese numero: ")
        numeros[x] = readLine()!!.toInt()
    }

    println("Imprime todos los componentes del Array")
    for (y in numeros)
        println(y)

    println("Primera componente del array ${numeros.first()}")
    println("Última componente del array ${numeros.last()}")
}


/******************** CLASES ********************/

/* Saber si una persona es mayor o menor de edad */
fun main115() {
    val persona1: Persona1 = Persona1()
    val persona2: Persona2 = Persona2()

    persona1.inicializar("Juan", 12)
    persona1.imprimir()
    persona1.esMayorEdad()

    persona2.inicializar("Ricardo", 30)
    persona2.imprimir()
    persona2.esMayorEdad()
}


class Persona1 {

    var nombre: String = ""
    var edad: Int = 0

    fun inicializar(nombre: String, edad: Int) {
        this.nombre = nombre //con this inicializamos
        this.edad = edad
    }

    fun imprimir() {
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else println("No es mayor de edad $nombre")
        println("")//Línea en blanco
    }
}

class Persona2 {

    var nombre: String = ""
    var edad: Int = 0

    fun inicializar(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }

    fun imprimir() {
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else println("No es mayor de edad $nombre")
    }
}



/* Saber si un triángulo es equilátero, y el mayor de sus lados. */

fun main116() {
    val triangulo1: Triangulo1 = Triangulo1()

    triangulo1.inicializar()
    triangulo1.ladoMayor()
    triangulo1.equilatero()
}

private class Triangulo1 {

    var lado1 = 0
    var lado2 = 0
    var lado3 = 0

    fun inicializar() {
        println("Ingrese el lado 1 del triángulo: ")
        lado1 = readLine()!!.toInt()

        println("Ingrese el lado 2 del triángulo: ")
        lado2 = readLine()!!.toInt()

        println("Ingrese el lado 3 del triángulo: ")
        lado3 = readLine()!!.toInt()
    }

    fun ladoMayor() {
        if (lado1 > lado2 && lado1 > lado3) {
            println("El lado mayor es $lado1")
        } else if (lado2 > lado1 && lado2 > lado3) {
            println("El lado mayor es $lado2")
        } else println("El lado mayor es $lado3")
    }

    fun equilatero() {
        if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
            println("Es un triángulo equilátero")
        } else println("No es un triángulo equilátero")
    }
}



/* Crear una clase llamada Alumno que tenga como propiedades su nombre y su nota.
A continuación definir los siguitentes metodos que la conforman:
- Método para inicializar las propiedades por consola.
- Método para imprimir las propiedades.
- Método en el que muestre si el alumno esta suspenso (0-4), aprobado (5-6), notable (6-8) y sobresaliente (9-10). */

fun main117() {
    var alumno1 = Alumno1()

    alumno1.inicializar()
    alumno1.imprimir()
    alumno1.evaluar()
}

class Alumno1 {
    var nombre = ""
    var nota: Float = 0.0f


    fun inicializar() {
        println("Ingrese el nombre del alumno: ")
        nombre = readLine()!!.toString()

        println("Ingrese la nota del alumno: ")
        nota = readLine()!!.toFloat()
    }

    fun imprimir() {
        println("Nombre: $nombre y tiene una nota de $nota")
    }

    fun evaluar() {
        if (nota < 5) {
            println("Está suspenso")
        } else if (nota < 7) {
            println("Está aprobado")
        } else if (nota < 9) {
            println("Es notable")
        } else if (nota < 11) {
            println("Es sobresaliente")
        } else println("Nota incorrecta")
    }
}



/******************** CONSTRUCTORES ********************/

/* Crear una clase llamada Alumno que tenga como propiedades su nombre y su nota.
A continuación definir los siguitentes metodos que la conforman:
- Método para inicializar las propiedades por consola.
- Método para imprimir las propiedades.
- Método en el que muestre si el alumno esta suspenso (0-4), aprobado (5-6), notable (6-8) y sobresaliente (9-10). */

fun main118() {
    var alumno2 = Alumno2("Ricardo", 6.0f)

    alumno2.inicializar()
    alumno2.imprimir()
    alumno2.evaluar()
}

class Alumno2 constructor(var nombre: String = "", var nota: Float = 0.0f) {

    fun inicializar() {
        println("Ingrese el nombre del alumno: ")
        nombre = readLine()!!.toString()

        println("Ingrese la nota del alumno: ")
        nota = readLine()!!.toFloat()
    }

    fun imprimir() {
        println("Nombre: $nombre y tiene una nota de $nota")
    }

    fun evaluar() {
        if (nota < 5) {
            println("Está suspenso")
        } else if (nota < 7) {
            println("Está aprobado")
        } else if (nota < 9) {
            println("Es notable")
        } else if (nota < 11) {
            println("Es sobresaliente")
        } else println("Nota incorrecta")
    }
}



/*Un constructor es un método que se ejecuta inicialmente y en forma automática.
- Es el primer método que se ejecuta.
- Se ejecuta de forma automática.
- Se ejecuta una única vez.
- Tiene por objetivo inicializar propiedades.
Una clase puede tener varios constructores pero solo uno es el principal. */
//Insertando datos desde consola

fun main119() {
    var triangulo3 = Triangulo3()

    triangulo3.ladoMayor()
}

class Triangulo3 constructor(var lado1: Int, var lado2: Int, var lado3: Int) {

    constructor() : this(0, 0, 0) {
        println("Ingrese el lado 1 del triángulo: ")
        lado1 = readLine()!!.toInt()

        println("Ingrese el lado 2 del triángulo: ")
        lado2 = readLine()!!.toInt()

        println("Ingrese el lado 3 del triángulo: ")
        lado3 = readLine()!!.toInt()
    }

    fun ladoMayor() {
        if (lado1 > lado2 && lado1 > lado3) {
            println("El lado mayor es $lado1")
        } else if (lado2 > lado1 && lado2 > lado3) {
            println("El lado mayor es $lado2")
        } else println("El lado mayor es $lado3")
    }
}



/* CONSTRUCTOR: Saber si una persona es mayor o menor de edad  */

//Insertando datos desde código
fun main120() {
    var persona4: Persona4 = Persona4("Ricardo", 12)

    persona4.imprimir()
    persona4.esMayorEdad()
}


class Persona4 constructor(var nombre: String, var edad: Int) {

    fun imprimir() {
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else println("No es mayor de edad $nombre")
        println("")
    }
}



/* Insertando datos desde consola y desde código */
fun main121() { //121
    val alumno1 = Alumno() //Los datos del alumno los pide por consola
    alumno1.imprimir()
    alumno1.nota()

    val alumno2 = Alumno("Pepe", 0)// Los datos del alumno los insertas en el codigo
    alumno2.imprimir()
    alumno2.nota()
}

class Alumno constructor(var nombre: String, var nota: Int) {

    constructor() : this("", 0) {
        print("Ingrese el nombre del alumno:")
        nombre = readLine()!!.toString()

        print("Ingrese su nota:")
        nota = readLine()!!.toInt()
    }

    fun imprimir() {
        println("Alumno: $nombre tiene una nota de $nota")
    }

    fun nota() {
        when (nota) {
            in 0..4 -> println("Suspenso")
            in 5..6 -> println("Aprobado")
            in 6..7 -> println("Bien")
            in 7..9 -> println("Notable")
            in 9..10 -> println("Sobresaliente")
        }
    }
}



/* Crea una clase en la que cargues 2 números enteros y posteriormente llame a los
métodos de suma y producto. */

fun main122() {
    var calculo1 = Calculo()

    calculo1.cargar()
}

class Calculo(var num1: Int = 0, var num2: Int = 0) {

    fun cargar() {
        println("Introduzca el primer número: ")
        num1 = readLine()!!.toInt()

        println("Introduzca el segundo número: ")
        num2 = readLine()!!.toInt()

        suma()
        producto()
    }

    fun suma() {
        var suma = num1 + num2
        println("La suma es: $suma")
    }

    fun producto() {
        var producto = num1 * num2
        println("El producto es: $producto")
    }
}



/* Sin constructor:
 Crear una clase llamada Hijos, que tenga como propiedad un array de tamaño 5,
  que me permita almacenar las edades de 5 hijos (val edades = IntArray(5)).
- Definir un método donde se carguen las edades por consola.
- Definir otro método que calcule e imprima el de mayor edad.
- Define otro método que que sume todas las edades de los hijos y lo imprima.
Definir que en el método de carga se llame a los otros dos métodos mayor edad y suma edades. */

fun main123() {
    var hijos = Hijos()

    hijos.cargarArray()
}

class Hijos() {

    var arrayEdades = IntArray(5)

    fun cargarArray() {
        for (x in arrayEdades.indices) {

            println("Ingrese edad $x de 5:")
            arrayEdades[x] = readLine()!!.toInt()
        }

        mayorEdad(arrayEdades)
        sumarEdades(arrayEdades)
    }

    fun mayorEdad(arrayEdades: IntArray) {
        println("El máximo de edades es: ${arrayEdades.maxOrNull()} ")
    }

    fun sumarEdades(arrayEdades: IntArray) {
        println("La suma de edades es: ${arrayEdades.sum()} ")
    }
}

fun main124() {
    var hijos1 = Hijos1()
    hijos1.cargarArray()
}


class Hijos1() {

    var edades: IntArray = IntArray(5)

    fun cargarArray() {
        for (x in edades.indices) {
            println("Ingrese edad  número $x: ")
            edades[x] = readLine()!!.toInt()
        }

        mayorEdad()
        sumaEdadesArray()
    }


    fun mayorEdad() {
        var valorMaximo = edades.maxOrNull()!!
        println("El máximo valor de los elementos es ${edades.maxOrNull()} ")
    }

    fun sumaEdadesArray() {
        var sumaArray = edades.sum()
        println("La suma de todas las edades del array es:$sumaArray")
    }
}



/* 1. Crea una clase llamada Reloj, que almacene la siguiente información:

* Marca, modelo, precio, stock, esDigital  Serán atributos (propiedades) con los tipos de datos más
 oportunos para cada caso.

* Crea dos objetos de esta clase y asígnale respectivamente a sus atributos, los siguientes valores:

- “Casio”, “X-300”, 100 euros, 10 unidades, Si

-  “Rolex”, “J-5000”, 400 euros, 5 unidades, No

Una vez asignado sus valores muestra por pantalla la suma de sus precios. */

fun main125() {
    var reloj = Reloj()

    var reloj1 = Reloj("Casio", "X-300", 100, 10, true)
    var reloj2 = Reloj("Rolex", "J-5000", 400, 5, false)

    var suma = (reloj1.precio + reloj2.precio)
    println("La suma es: $suma")

}

class Reloj constructor(var marca: String = "", var modelo: String = "", var precio: Int = 0, var stock: Int = 0, var esDigital: Boolean = true) {
}



/* 2. Construye una clase que represente un Rectángulo. Debe tener dos atributos de tipo float, uno
para almacenar la base y otro para almacenar la altura.

* Define dos métodos, uno que devuelva el perímetro (2*altura + 2*base) y otro que devuelva el área
del rectángulo (base*altura).
* Una vez definida la clase crea ahora en el programa un CONSTRUCTOR para insertar la base y la altura
por consola. Muestra por pantalla su perímetro y área.*/
//Está hecho sin constructor. Funciona con cargar()

fun main126() {
    var rectangulo = Rectangulo()

    rectangulo.cargar()
    rectangulo.perimetro()
    rectangulo.area()
}

class Rectangulo() {

    var base: Float = 0.0f
    var altura: Float = 0.0f

    fun cargar() {
        println("Ingrese la base: ")
        base = readLine()!!.toFloat()

        println("Ingrese la altura: ")
        altura = readLine()!!.toFloat()
    }

    fun perimetro() {
        var perimetro = (2 * base + 2 * altura)
        println("El perímetro es $perimetro")
    }

    fun area() {
        var area = (base * altura)
        println("El area es $area")
    }

}



/* 3. Crear una clase Vehículo con los siguientes atributos con los tipos de datos más oportunos:
Atributos: marca, modelo, precio
Crea dos objetos de esta clase mediante carga y asígnales los siguientes valores:
“Seat”, “Ibiza”, 11500
“Yamaha”, “MT-03”, 6000
Crea un método que muestre en pantalla sus valores.
Crea un método que devuelva el precio de los vehículos con el IVA añadido y lo muestre por pantalla. */
//Entrada por código:

fun main127() {
    var vehiculo = Vehiculo()

    var coche1 = Vehiculo("Seat", "Ibiza", 11500)
    var coche2 = Vehiculo("Yamaha", "MT-03", 6000)

    coche1.imprimir()
    coche2.imprimir()

    coche1.precio()
    coche2.precio()
}

class Vehiculo constructor(var marca: String = "", var modelo: String = "", var precio: Int = 0) {

    fun imprimir() {
        println("El vehículo es de la marca: $marca, modelo: $modelo, precio: $precio")
    }

    fun precio() {
        println("El vehículo de la marca: $marca tiene un precio con IVA de: ${(precio * 0.21) + precio}")
    }
}



/* 4. Crea una clase que sea CuentaBancaria que tenga como atributos el nombre y el saldo cuenta de
un cliente (crea los atributos con los tipos de datos más oportunos).

    Crea un método que sea ingresar dinero en el saldo de la cuenta.
    Crea un método que sea retirar dinero en el saldo de la cuenta.
    Crea un método que muestre en pantalla el saldo final de la cuenta.

Ten en cuenta que el saldo inicial de la cuenta debe ser 0. */
//Entrada por código:

fun main128() {
    val cliente1 = CuentaBancaria("Martin", 0f)
    cliente1.ingresar(500f)
    cliente1.ingresar(900f)
    cliente1.retirar(455.5f)
    cliente1.imprimir()
}

class CuentaBancaria(var nombre: String, var saldo: Float) {

    fun ingresar(cantidad: Float) {
        saldo += cantidad
    }

    fun retirar(cantidad: Float) {
        saldo -= cantidad
    }

    fun imprimir() {
        println("El saldo de la cuenta es $saldo")
    }
}



/* Tenemos las clases Cliente y Banco.
La clase Cliente tiene como atributos:
- nombre del cliente
- sueldo

La clase cliente tiene como métodos:
- ingresar()
- retirar()
- imprimir()

La clase Banco tiene como atributos
- 3 objetos de la clase cliente (3 clientes)

La clase Banco tiene como métodos:
- operar()      (controlar los ingresos, retirada e impresión del cliente)
- saldoTotal()  (el saldo total de todos sus clientes) */

fun main129() {
    val banco = Banco()
    banco.operar()
    banco.saldototal()
}

class Cliente(var nombre: String, var saldo: Float) {

    fun ingresar(cantidad: Float) {
        saldo = saldo + cantidad
    }

    fun retirar(cantidad: Float) {
        saldo = saldo - cantidad
    }

    fun imprimir() {
        println("El saldo de la cuenta es $saldo")
    }
}

class Banco() {

    var cliente1 = Cliente("Juan", 0f)
    var cliente2 = Cliente("Marcos", 0f)
    var cliente3 = Cliente("Pepolo", 0f)

    fun operar() {
        cliente1.ingresar(300f)
        cliente2.ingresar(500f)
        cliente3.ingresar(200f)
        cliente1.retirar(100f)
        cliente3.imprimir()
    }

    fun saldototal() {
        var saldoTotal = cliente1.saldo + cliente2.saldo + cliente3.saldo
        println("El saldo total del banco es $saldoTotal")
    }
}



/* Plantear un programa que tenga una clase Club y otra clase Socio.
La clase Socio debe tener los siguientes atributos:
- Nombre
- Antigüedad en el club (en años).
La clase Club debe tener como atributos:
- 3 objetos de la clase Socio.
La clase Club debe tener un método que calcule el socio de mayor antigüedad añadido. */

fun main130() {
    var club = Club()
    club.mayorAnos()
    club.mayorAntiguedad()
}


class Socio(var nombre: String, var antiguedad: Int) {
}


class Club {

    var socio1 = Socio("Ricardo", 3)
    var socio2 = Socio("Pepe", 5)
    var socio3 = Socio("Manolo", 7)
    var maximo = 0

    fun mayorAnos() {
        maximo = maxOf(socio1.antiguedad, socio2.antiguedad, socio3.antiguedad)
    }


    fun mayorAntiguedad() {
        if (socio1.antiguedad > socio2.antiguedad && socio1.antiguedad > socio3.antiguedad) {
            println("El socio ${socio1.nombre} es el de mayor antigüedad con $maximo años .")
        } else if (socio2.antiguedad > socio1.antiguedad && socio2.antiguedad > socio3.antiguedad) {
            println("El socio ${socio2.nombre} es el de mayor antigüedad con $maximo años.")
        } else if (socio3.antiguedad > socio1.antiguedad && socio3.antiguedad > socio2.antiguedad) {
            println("El socio ${socio3.nombre} es el de mayor antigüedad con $maximo años.")
        } else if (socio1.antiguedad == socio2.antiguedad && socio2.antiguedad == socio3.antiguedad) {
            println("Los socios tienen la misma antigüedad.")
        } else println("Error")
    }
}



/* Plantear un programa que permita jugar a los dados.
El juego consiste en tirar 2 dados y en el momento que se obtenga el mismo valor ganas.

Las clases a crear son Dados y JuegoDados.

Los atributos y métodos de cada clase son:
Dado
Atributo
valor
Métodos
tirar
imprimir

JuegoDados
Atributos
2 Dado (2 objetos de la clase Dado)
Métodos
jugar

Para el método tirar empleariamos: var valorRandom = Random.nextInt(1,6)
Para el método jugar de la clase JuegoDados, debemos pedir que se tire cada dado
y se debe verificar si los dos valores son iguales
*/

fun main131() {
    var juegoDados = JuegoDados()
    juegoDados.jugar()
}


class Dado(var valor: Int = 0) {

    fun tirar() {
        valor = Random.nextInt(1, 6)
    }

    fun imprimir() {
        println("El valor obtenido es: $valor.")
    }

}


class JuegoDados() {

    var dado1 = Dado()
    var dado2 = Dado()

    fun jugar() {
        dado1.tirar()
        dado1.imprimir()
        dado2.tirar()
        dado2.imprimir()

        if (dado1.valor > dado2.valor) {
            println("El dado número 1 es mayor.")
        } else if (dado2.valor > dado1.valor) {
            println("El dado número 2 es mayor.")
        } else println("Son iguales.")
    }
}



/******************** ENCAPSULACIÓN ********************/

/* Ejemplo de funciones privadas */

fun main132() {
    var operacion1 = Operacion()
    operacion1.cargar()
    //operacion1.suma()       //es privado
    //operacion1.producto()   //es privado
}


class Operacion() {

    private var valor1 = 0
    private var valor2 = 0

    fun cargar() {
        println("Ingrese el primer valor: ")
        valor1 = readLine()!!.toInt()

        println("Ingrese el segundo valor: ")
        valor2 = readLine()!!.toInt()
    }

    private fun suma() {
        var suma = valor1 + valor2
        println("La suma es $suma")
    }

    private fun producto() {
        var producto = valor1 * valor2
        println("El producto es $producto")
    }
}



/* Realizar 2 métodos privados que calculen el valor maximo y minimo del Array, y se ejecuten en el bloque init. */

fun main133() {
    var array = Array<Any>()
}


class Array<T>() {

    private var array = IntArray(5)

    init {
        cargar()
        maximo()
        minimo()
    }

    private fun cargar() {
        for (i in array.indices) {
            array[i] = Random.nextInt(1, 10)
        }
        for (x in array) println(x)
    }

    private fun maximo() {
        var maximo = array.maxOrNull()!!
        println("El máximo valor del array es $maximo ")
    }

    private fun minimo() {
        var minimo = array.minOrNull()!!
        println("El mínimo valor del array es $minimo ")
    }
}



/******************** DATA CLASS Y ENUM CLASS ********************/

data class Articulo(var codigo: Int, var descripcion: String, var precio: Float)

fun main134() {
    val articulo1 = Articulo(1,"patatas",34f)
    val articulo2 = Articulo(1,"manzanas",24f)

    println(articulo1)  //Imprime codigo, descripcion, precio. Si fuese un "class Articulo" daría error, y tendrías que poner Articulo.codigo, Articulo.descripcion, Articulo.precio para asi imprimir todo.
    println(articulo2)  //Imprime codigo, descripcion, precio.

    //Cuando printeamos un objeto(Este contiene 1 Int, 1 String, 1 Float) el tipo de dato que devuelve es un String. Lo que hace el Android es convertilo a String con .toString

    val cambioPrecio = articulo1

    cambioPrecio.precio = 100f  //Permite modificar las propiedadades de un objeto. Fíjate que estamos modificando una constante val.
    println(articulo1)          //En vez de 34 ahora el valor es 100.

    var articulo3 = articulo1.copy() //Copia el objeto articulo1 y lo guarda en articulo3

    println(articulo1)
    println(articulo3)

    if(articulo1 == articulo3) {
        println("Son iguales $articulo1 y $articulo3")
    } else println("Son distintos $articulo1 y $articulo3")
}



/*Sobreescribir el método toString() con el override: */

fun main135() {
    var persona1 = Person("Juan", 22)
    var persona2 = Person("Ana",59)

    println(persona1).toString()
    println(persona2)
}

data class Person(var nombre: String, var edad: Int) {

    override fun toString():String {
        return "$nombre, $edad"
    }
}



/* Ejercicio para hacerle override al primer ejemplo anterior:  */

fun main136() {
    val articulo1 = Articulos(1, "patatas", 34f)
    val articulo2 = Articulos(1, "manzanas", 24f)

    println(articulo1).toString()
    println(articulo2)
}

data class Articulos(var codigo: Int, var descripcion: String, var precio: Float) {

    override fun toString(): String {
        return "$codigo, $descripcion, $precio"
    }
}



/* Definir una ENUM CLASS con 5 países de Europa y que tenga como propiedad su población
Imprimir la cantidad de habitantes que tiene cada país */

fun main137() {
    var habitantesEspana = PaisesEuropa1.España.habitantes

    println("España tiene una cantidad de $habitantesEspana habitantes")
}

enum class PaisesEuropa1(val habitantes:Int) {

    España(100000000), Portugal(200000000), Francia(300000000), Alemania(400000000), Inglaterra(500000000);
}



/* Desarrolla un programa en el que saque 5 cartas aleatorias con 5 valores aleatorios. */

fun main138() {
    for(i in 1..5) {

        var carta = AccionCarta().sacarCarta()
    }
}

enum class Carta() {

    TREBOLES, DIAMANTES, PICAS, CORAZONES
}

class AccionCarta() {

    var cartaAleatoria = Carta.CORAZONES
    var valorAleatorio = 0

    fun sacarCarta() {
        cartaAleatoria = Carta.values().random() //String Random //Con values() lo convertimos en array.
        valorAleatorio = Random.nextInt(1,12) //Int Random
        println(imprimir())
    }

    fun imprimir():String {
        return "Tu carta $cartaAleatoria tiene el valor $valorAleatorio"
    }
}



/******************** CLASES NESTED & INNER ********************/

fun main139() {
    //Clase Anidada Nested:
    val myNestedClass = MyNestedAndInnerClass.NestedClass()
    val suma = myNestedClass.suma(2,5)
    println("La suma es $suma")

    val myNestedClass1 = MyNestedAndInnerClass.NestedClass().suma(2,5)
    println("La suma es $myNestedClass1")

    val myInnerClass = MyNestedAndInnerClass().InnerClass().sum0(4)
    println("La suma es $myInnerClass")
}

class MyNestedAndInnerClass {

    private val uno = 1

    private fun retornaUno(): Int {
        return uno
    }

    class NestedClass {

        fun suma(num1: Int, num2: Int):Int {
            return num1 + num2
        }
    }

    inner class InnerClass {

        fun sum0(numero: Int): Int {
            return numero + uno
        }
    }
}



//Clases anidadas - Nested classes
//Clases internas - Inner classes
// Estos conceptos hacen referencia a que una clase pueden contener clases dentro de ella
// Nos permite crear un código más seguro, eficiente y estructurado
// para empezar crearemos una clase que se llame ClaseAnidadaEInterna (boton derecho...)

fun main140() {
    //Llamar a clase anidada
    val claseAnidada = ClaseAnidadaEInterna.ClaseAnidada() //Para instanciarla debemos llamar a la primera clase y luego .la clase anidada y abrimos y cerramos paréntesis.
    val suma = claseAnidada.sum(4,4)
    println("El resultado de nuestra suma es $suma")

    //Llamar a clase interna
    val claseInterna = ClaseAnidadaEInterna().ClaseInterna()
    val suma2 = claseInterna.sum(2,4)
    println("El resultado de nuestra suma 2 es $suma2")
}

class ClaseAnidadaEInterna {
    // Clase Anidada (Nested Class)
    // Está contenida dentro de otra clase. Favorece el encapsulamiento y no puede acceder a los miembros de la clase externa.
    // Para crearla solamanete hay que crear una clase dentro de otra clase ya existente.

    private val uno = 1

    class ClaseAnidada {
        fun sum(num1:Int, num2:Int):Int{
            return num1 + num2 //+ uno
        }
    }

    inner class ClaseInterna {
        fun sum(num1:Int, num2:Int):Int{
            return num1 + num2 + uno
        }
    }
}



/******************** HERENCIA ********************/

/*
Crea una clase Persona que contenga los siguientes atributos en su
constructor:
• DNI
• Nombre
• Apellidos
• Edad
En la clase escribir un método que compruebe si la persona es o no mayor
de edad.

Crea una segunda clase Empleado que contenga los mismos atributos que
la clase Persona y además contenga el atributo salarioBruto.
En esta clase escribir además del método para que compruebe si el
empleado es mayor de edad o no, añadir un método en el se obtenga el
salarioNeto (salarioNeto = salarioBruto – salarioBruto*0.12).
1) Realiza el ejercicio sin herencias.
2) Realiza el ejercicio de modo que la clase Empleado herede de la
clase Persona. */

//Con herencias
fun main162() {
    var persona1 = Persona0("33276644D","Pepolo","Domínguez",33)
    var empleado1 = Empleado0("33556455M","María","Gómez",23,1050.50)

    persona1.imprimir()
    persona1.mayorEdad()

    empleado1.imprimir()
}

//Superclase:
open class Persona0 constructor(var dni:String, var nombre:String, var apellidos:String, var edad:Int) {

    open fun mayorEdad():String {
        if(edad < 18) { println("Es menor de edad.")
        } else println("Es mayor de edad.")

        return edad.toString()
    }

    open fun imprimir() {
        println("$nombre $apellidos con dni $dni tiene $edad años.")
    }
}

//Empleado hereda de Persona:
open class Empleado0 constructor(dni:String, nombre:String, apellidos:String, edad:Int, var salarioBruto:Double): Persona0(dni,nombre,apellidos,edad) {

    override fun mayorEdad():String {
        if(edad < 18) {
            println("Es menor de edad")
        } else println("No es menor de edad")
        return edad.toString()
    }

    open fun salarioNeto():String {
        var salarioNeto = salarioBruto - (salarioBruto*0.12)

        return salarioNeto.toString()
    }

    override fun imprimir() {
        println("$nombre $apellidos con dni $dni tiene $edad años y tiene un salario neto de ${salarioNeto()}.")
    }
}




/*
Para gestionar una tienda de mascotas, define una clase padre/superclase llamada Mascota
con los siguientes atributos públicos en el constructor:
• nombre, numPatas, raza
• Define dos clases hijas/subclases/derivadas de Mascota, llamadas Perro y Loro. A la
clase Perro añádele un atributo público patita (Boolean) para saber si el perro sabe dar
la pata o no y a Loro añádele el atributo público habla (Boolean) para indicar si saben
hablar (aunque puedan no todos saben hablar).

En la función main() crea los siguientes objetos:
• Un perro llamado “Lucky” de raza “bóxer” que sabe dar la patita.
• Un loro llamado “Andresito” de raza “cacatúa” que, como tal, sabe hablar.
• Obviamente habrá́ que indicar correctamente el número de patas en ambos objetos (y
sabemos que ninguna mascota ha sufrido amputaciones)
Surge la necesidad de guardar el precio sin IVA de las mascotas. ¿En qué clase sería correcto
añadir este nuevo atributo?
• Define este atributo en la clase apropiada y en dicha clase define también un método
llamado “pvp()” que calcule y devuelva el precio con el IVA añadido.
• “Lucky” se vende por 380€ y “Andresito” por 110€, precios sin IVA.
• Muestra por pantalla el pvp de las dos mascotas.
Una vez hecho esto convierte todos los atributos de la clase Mascota a privados. Después de
haber hecho esto tendremos varios errores en la función main(). ¿Por qué? ¿A que se deben
los errores? ¿ Como los solucionarías?

En la case Mascota, sobrescribe el método:
override fun toString(): String {
return super.toString()
}

Es un método heredado de clase padre Object (clase de Kotlin, padre de todas las clases). Este
método se utiliza para devolver en formato String una representación de los valores de los
atributos de una clase. Por defecto lo único que hace es mostrar el nombre de la clase y su
referencia en memoria.
fun main() {
val perro1 = Perro("Lucky", 4, "Boxer", true, 380f)
println(perro1)
}
Haz que el método toString() devuelva un String, con todos los valores de los atributos de la
clase Mascota.
Nota: Si una clase tiene implementado el método toString(), es posible imprimir directamente
un objeto. Ejemplo, suponiendo que “p” es un objeto de tipo Perro: println(p); , pues realmente
lo que hará Kotlin automáticamente, será: println(p.toString());
• Queremos que el método “toString()” aparte de mostrar todos los datos, cuando el
objeto sea de tipo Perro nos indique si da la patita o no y si el objeto es de tipo Loro
nos indique si habla o no.

o Para lograrlo, tendremos que redefinir/sobrescribir adecuadamente el método
“toString()” en las clases Perro y Loro. No olvides colocar la palabra reservada
Override. Para ello, llama en primer lugar al método del padre con la palabra
reservada super para obtener los datos de la clase padre Mascota.
• Queremos saber el color de las mascotas, añade este atributo en la clase que
corresponda y modifica todos los constructores para inicializar dicho atributo.
o Modifica también el método “toString()” para que muestre ahora también el
color.
o Ajusta ahora la creación de los objetos en el programa. “Lucky” es marrón y
“Andresito” verde.
o Comprueba que se visualizan correctamente todos los datos. */

fun main163() {
    var perro1 = Perroo("Lucky", 4,"Boxer",380.0, "Marrón", true)
    var loro1 = Loroo("Andresito", 2, "cacatúa",110.0, "Verde", true)

    //perro1.verDatos()
    //loro1.verDatos()

    println(perro1.toString())
    println(loro1.toString())

    println("El precio del perro es ${perro1.pvp()}")
    println("El precio del loro es ${loro1.pvp()}")
}


//SUPERCLASE:
open class Mascota constructor(private var nombre:String, private var numPatas:Int, private var raza:String, private var precio:Double, private var color:String) {

    fun pvp():String {
        var pvp = precio + (precio*0.21)
        return pvp.toString()
    }

    override fun toString(): String {
        return "Nombre de la mascota: $nombre, nº de patas: $numPatas, raza: $raza, precio: $precio, pvp: ${pvp()}, color: $color,"
    }
}


//Clase Hija:
open class Perroo constructor(nombre:String, numPatas: Int, raza: String, precio:Double, color:String, public var patita:Boolean):Mascota(nombre, numPatas, raza, precio, color) {

    /* fun verDatos() {
         println("$nombre, $numPatas, $raza, $precio, $patita, ${pvp()}")
     } */

    override fun toString(): String {
        return "${super.toString()} da la patita: $patita."
    }
}

//Clase Hija:
open class Loroo constructor(nombre:String, numPatas: Int, raza: String, precio:Double, color: String, public var habla:Boolean):Mascota(nombre, numPatas, raza, precio, color) {

    /* fun verDatos() {
        println("$nombre, $numPatas, $raza, $precio, $habla, ${pvp()}")
    } */

    override fun toString(): String {
        return "${super.toString()} va a hablar: $habla"
    }
}



/* La facturación del agua, puede ser de 2 tipos, con los siguientes elementos comunes:
    • No factura
    • Fecha (guardarla como String)
    • DNI-Cliente
    • Precio metro cúbico
    • Metros cúbicos consumidos
    • Importe por consumo = metros cúbicos consumidos x precio metro cúbico
    • Importe por saneamiento (uso del alcantarillado)
    • Importe por residuales (depuración de agua)
    • Total factura = importe consumo + importe saneamiento + importe residuales.

El primer tipo de factura, corresponde a facturas para familias numerosas de tipo A,
y este caso el total es la suma del consumo, pero con un descuento fijo del 20% en los importes de saneamiento y residuales .

El segundo tipo de factura, corresponde a familias numerosas de tipo B, y en este caso el total es la suma del consumo, pero
tienen un descuento fijo del 75% en el importe de saneamiento y otro fijo del 50% en el importe de residuales.

Diseña las clases que estimes oportunas.

En el programa crea tres facturas:
una para un cliente normal,otra para familia numerosade tipo A y otra para familia numerosa de tipo B,
con los datos que estimes oportunos.
Muestra su importe final y chequea que el cálculo sea correcto en los tres casos. */

fun main164() {
    var facturaA = FamiliaNumerosaA(1,2022,"33445666D")
    var facturaB = FamiliaNumerosaB(2,2021,"22775666M")
    var facturaNormal = Factura(3,2020, "33569822N")

    facturaA.imprimir()
    facturaB.imprimir()
    facturaNormal.imprimir()
}


//SUPERCLASE:
open class Factura constructor(var numFactura:Int, var fecha:Int, var dniCliente:String) {

    var m3Precio: Double = 5.0
    var m3Consumidos: Double = 56.0
    var importeConsumo: Double = 3.0
    var importeSaneamiento: Double = 6.0
    var importeResidual: Double = 7.0
    var total: Double = 0.0


    open fun descuentoSaneamiento(): Double {
        var porcentajeDescuento = 0.0
        var descuento = importeSaneamiento - (importeSaneamiento * porcentajeDescuento)
        return descuento.toDouble()
    }

    open fun descuentoResidual(): Double {
        var porcentajeDescuento = 0.0
        var descuento = importeResidual - (importeResidual * porcentajeDescuento)
        return descuento.toDouble()
    }

    open fun total(): String {
        importeConsumo = m3Precio * m3Consumidos
        var descuentos = (descuentoResidual() + descuentoSaneamiento())
        var importeTotal = importeConsumo - descuentos
        total = importeTotal

        return importeTotal.toString()
    }

    open fun imprimir() {
        println("Factura Normal: nº factura: $numFactura, fecha: $fecha, dni Cliente: $dniCliente, importe total: ${total()} €")
    }
}

//subclase:
open class FamiliaNumerosaA(numFactura:Int, fecha:Int, dniCliente:String):Factura(numFactura, fecha, dniCliente) {

    override fun descuentoSaneamiento():Double {
        var porcentajeDescuento = 0.2
        var descuento = importeSaneamiento - (importeSaneamiento*porcentajeDescuento)
        return descuento.toDouble()
    }

    override fun descuentoResidual():Double {
        var porcentajeDescuento = 0.2
        var descuento = importeResidual - (importeResidual*porcentajeDescuento)
        return descuento.toDouble()
    }

    override fun total():String {
        importeConsumo = m3Precio * m3Consumidos
        var descuentos = (descuentoResidual() + descuentoSaneamiento())
        var importeTotal = importeConsumo - descuentos
        total = importeTotal

        return importeTotal.toString()
    }

    override fun imprimir() {
        println("Factura de una Familia Numerosa A: nº factura: $numFactura, fecha: $fecha, dni Cliente: $dniCliente, importe total: ${total()} €")
    }

}


//subclase:
open class FamiliaNumerosaB(numFactura:Int, fecha:Int, dniCliente:String):Factura(numFactura, fecha, dniCliente) {

    override fun descuentoSaneamiento():Double {
        var porcentajeDescuento = 0.75
        var descuento = importeSaneamiento - (importeSaneamiento*porcentajeDescuento)
        return descuento.toDouble()
    }

    override fun descuentoResidual():Double {
        var porcentajeDescuento = 0.5
        var descuento = importeResidual - (importeResidual*porcentajeDescuento)
        return descuento.toDouble()
    }

    override fun total():String {
        importeConsumo = m3Precio * m3Consumidos
        var descuentos = (descuentoResidual() + descuentoSaneamiento())
        var importeTotal = importeConsumo - descuentos
        total = importeTotal

        return importeTotal.toString()
    }

    override fun imprimir() {
        println("Factura de una Familia Numerosa B: nº factura: $numFactura, fecha: $fecha, dni Cliente: $dniCliente, importe total: ${total()} €")
    }
}



/* 1. Crear las clases (utilizando herencia) que sean necesarias para guardar los distintos tipos
de contratos de los empleados de una empresa. Para todos los contratos se necesita
saber:
• Numero de contrato, DNI, nombre, apellidos, salario bruto mensual, IRPF.
• Para cada tipo de contrato se quiere saber, además:

o Indefinido: Si las pagas extras están prorrateadas o no.
o Temporal: Meses de duración.
o Practicas: Titulación que cursa, meses de duración.

• Crea un método llamado “salarioNeto” donde corresponda para obtener el salario
neto (salario neto = salario bruto – salario bruto*IRPF) en todos los contratos.
• Crea adecuadamente el método llamado “toString()” en todas las clases, para
visualizar todos los datos de los contratos (incluyendo el salario neto).
En la función main() crea un objeto con todos los datos, por cada una de las clases hijas y
muestra sus valores por pantalla. */

fun main165() {
    var indefinido = Indefinido(1,"33445566D","Juan","Gómez",1050.79,200.0,"Si")
    var temporal = Temporal(2,"44556633E","Carlos","Lopez",990.50,190.0,12)
    var practicas = Practicas(3,"44772234D","Luís", "Costa", 1200.75,190.0,"FP", 24)

    var prueba = Contratoo(1,"33445566D","Juan","Gómez",1050.79,200.0)

    println(prueba)

    //println(indefinido.toString())
    //println(temporal.toString())
    //println(practicas.toString())
}


open class Contratoo constructor(var numContrato:Int, var dni:String, var nombre:String, var apellidos:String, var salarioBrutoMes:Double, var irpf:Double) {

    open fun salarioNeto(): Double {
        var salarioNeto = salarioBrutoMes - (salarioBrutoMes * irpf)
        return salarioNeto
    }

    override fun toString(): String {
        return "Número de contrato: $numContrato, dni: $dni, nombre: $nombre, apellidos: $apellidos, salario Bruto Mes: ${salarioNeto()}, irpf: $irpf"
    }
}


class Indefinidoo constructor(numContrato: Int, dni: String, nombre: String, apellidos: String, salarioBrutoMes: Double, irpf: Double, var pagasProrrateadas:String):Contratoo(numContrato,dni, nombre, apellidos, salarioBrutoMes, irpf) {

    fun pagasProrrateadas():String {
        if(pagasProrrateadas == "Si") println("tiene pagas prorrateadas")
        else ("no tiene pagas prorrateadas")
        return pagasProrrateadas.toString()
    }

    override fun toString(): String {
        return "${super.toString()} pagas prorrateadas: ${pagasProrrateadas()}."
    }
}


class Temporall constructor(numContrato: Int, dni: String, nombre: String, apellidos: String, salarioBrutoMes: Double, irpf: Double, var mesesDuracion:Int):Contratoo(numContrato,dni, nombre, apellidos, salarioBrutoMes, irpf) {

    override fun toString(): String {
        return "${super.toString()} meses duración: $mesesDuracion."
    }
}


class Practicass constructor(numContrato: Int, dni: String, nombre: String, apellidos: String, salarioBrutoMes: Double, irpf: Double, var mesesDuracion:Int, var titulacionQueCursa:String):Contratoo(numContrato,dni, nombre, apellidos, salarioBrutoMes, irpf) {

    override fun toString(): String {
        return "${super.toString()} meses duración: $mesesDuracion, titulación que cursa: $titulacionQueCursa."
    }
}



/* 2. En una tienda de informática se guarda información de distintos componentes de ordenador, de todos ellos es necesario saber:

• Referencia(valor alfanumérico), precio y marca

• De los discos duros nos interesa saber:
o Capacidad en TB, tipo bus de datos (IDE, Serial Ata2, ...)

• De las tarjetas gráficas:
o Modelo,MemoriaenMB,tipodebus

• Crea las clases necesarias para guardar la información de estos productos.

• Se necesita un método al que se le pueda enviar un porcentaje de descuento por
consola(Ej. 0.18) y me calcule el precio final del componente, tras aplicarle ese descuento.
o Fórmula:preciocondescuentoaplicado=precio–precio*descuento.
o Declaraelmétodo,enlaclasequecorresponda.

• Para poder hacer cambios de unidades, declara donde sea preciso un método que
reciba una cantidad dada en MB y me la devuelva transformada en a GB.

• Se decide que a las tarjetas gráficas no se les puede aplicar descuento, por lo tanto, el
método que calcula el precio final tras aplicar el descuento, para las tarjetas gráficas devolverá́ siempre el precio original del componente, sin descuento.

En la función main():
• Crea los objetos según los datos de los siguientes componentes:
o DiscoDuro:referencia:“HD1050”,marca:“WesternDigital”,precio:118,77€,
capacidad: 2TB, bus: SATA3.

o Tarjetagráfica:referencia:”TG0004”,marca:“ASUS”,precio:131,28€,
modelo: “GTX550”, memoria: 1024 MB, bus: “PCI Express”.
• Muestra el precio de los dos componentes
• Utilizando el método creado, muestra el precio aplicándole un descuento del 15% a los dos componentes. Chequea que a la tarjeta gráfica no se le aplica como queríamos el descuento.

• Muestra la capacidad de memoria de la tarjeta gráfica en GB. (haciendo uso del método que realiza este cálculo).
• Necesito guardar la información del siguiente componente:

o Pendrive:referencia:”USB1001”,marca:“SanDisk”,precio:18€,capacidad:16GB.
o Crea un objeto con la información anterior del pendrive,muestra su precio
con un descuento de 10%. */

fun main166() {
    var discoDuro1 = DiscoDuro("HD1050",100.00,"WesternDigital",2.0,"SATA3")
    var tarjetaGrafica1 = TarjetaGrafica("TG0004",131.28,"ASUS", "GTX550", 1024.0,"PCI Express")
    var pendrive1 = Pendrive("USB1001",18.0,"SanDisk", 16.0)

    println(discoDuro1)
    println(tarjetaGrafica1)
    println(pendrive1)
}


//SUPER
open class Componente constructor(var referencia:String, var precio:Double, var marca:String) {

    open fun descuento():Double{
        println("Ingrese un descuento para $marca: ")
        var descuento = readLine()!!.toDouble()

        var PrecioConDescuento = precio - ((precio * descuento) / 100)

        return PrecioConDescuento
    }

    open fun conversor():Double {
        var conversor = 1000
        return conversor.toDouble()
    }

    override fun toString():String {
        return "La Referencia: $referencia, Precio: $precio, Marca: $marca"
    }
}


//sub
class DiscoDuro constructor(referencia: String, precio: Double, marca: String, var capacidad:Double, var bus:String):Componente(referencia,precio,marca) {

    override fun conversor():Double { //Convertimos de Teras a GB
        var conversor = capacidad * 1000
        return conversor
    }

    override fun toString():String {
        return "Disco Duro / Referencia: $referencia, Precio: ${descuento()}, Marca: $marca, capacidad: ${conversor()} GB, bus: $bus"
    }
}


//sub
class TarjetaGrafica constructor(referencia: String, precio: Double, marca: String, var modelo:String, var memoria:Double, var bus:String):Componente(referencia,precio,marca) {

    override fun conversor():Double { //Convertimos de MB a GB
        var conversor = memoria / 1000
        return conversor
    }

    override fun toString():String {
        return "Tarjeta Gráfica / Referencia: $referencia, Precio: $precio, Marca: $marca, Modelo:$modelo, Memoria: ${conversor()} GB, Bus: $bus"
    }
}


//sub
class Pendrive constructor(referencia: String, precio: Double, marca: String, var capacidad: Double):Componente(referencia, precio, marca) {

    override fun toString(): String {
        return "Pendrive / Referencia: $referencia, Precio: ${descuento()}, Marca: $marca, capacidad: $capacidad GB"
    }
}



/*Una empresa se dedica a alquilar barcos. Un BARCO se caracteriza por su matrícula, su eslora
y manga en metros y año de fabricación. Se pretende diferenciar la información de algunos
tipos de barcos:

• Número de mástiles para Veleros
• Potencia en CV para Embarcaciones deportivas a motor
• Potencia en CV y número de camarotes para Yates de lujo
El precio por día base de un alquiler de un barco es un precio por día común para todas las
embarcaciones que se establece en 40€, modificado con los siguientes incrementos:
• Veleros: 10€ x no de mástiles
• Embarcaciones deportivas: 15€ x no CV
• Yates de lujo: (15€ x no CV ) + (5€ x número de camarotes).
Los datos de un ALQUILER son el DNI del cliente, días de alquiler y el BARCO alquilado. El
alquiler se calcula como:
• Días de alquiler x precio por día alquiler barco
Usando clases, atributos privados y constructores que inicialicen todos los atributos, registrar
los siguientes alquileres y mostrar su precio final
• Alquiler 1:
o DNI cliente: “12345678Y”
o 5 días de alquiler
o Barco alquilado:
§ Velero de 3 mástiles:
• Matrícula: “3GI1199”
• Eslora: 70 metros y manga: 12 metros
• Año fabricación: 1980

• Alquiler 2:
o DNI cliente: “27654376T”
o 6 días de alquiler
o Barco alquilado:
§ Embarcación deportiva de 10 CV:
• Matrícula: “9XP1188”
• Eslora: 30 metros y manga: 5 metros
• Año fabricación: 1990

• Alquiler 3:
o DNI cliente: “378641985H”
o 3 días de alquiler
o Barco alquilado:
§ Yate de lujo de 18 CV y 3 camarotes:
• Matrícula: “6TK2476”
• Eslora: 40 metros y manga:10 metros
• Año fabricación: 1995
• Verifica que los precios por alquiler obtenidos son correctos. */

fun main167() {
    var velero1 = Velero("3GI1199",70,12,1980,3)
    var deportivo1 = Deportivo("27654376T",30,5,1990,10)
    var yate1 = Yate("378641985H",40,10,1995,18,3)

    var alquilerVelero = Alquiler("33445566D",5, velero1)
    var alquilerDeportivo = Alquiler("22118877M",6, deportivo1)
    var alquilerYate = Alquiler("44557788N", 3, yate1)

    println(velero1)
    println(deportivo1)
    println(yate1)

    println("")

    println("$alquilerVelero tratándose de un Velero")
    println("$alquilerDeportivo tratándose de un Deportivo")
    println("$alquilerYate tratándose de un Yate")
}

//SUPERCLASE:
open class Barco constructor(private var matricula:String, private var eslora:Int, private var manga:Int, private var anoFabricacion:Int) {

    open fun precioDia():Int {
        var precio = 40
        return precio
    }

    override fun toString():String {
        return "El precio por día es de: ${precioDia()}€"
    }
}


//subclase:
class Velero constructor(matricula: String, eslora: Int, manga: Int, anoFabricacion: Int, private var mastil:Int):Barco(matricula, eslora, manga, anoFabricacion) {

    override fun precioDia():Int {
        return super.precioDia() + (mastil * 10)
    }

    override fun toString(): String {
        return super.toString() + (" tratándose de un Velero")
    }
}


//subclase:
class Deportivo constructor(matricula: String, eslora: Int, manga: Int, anoFabricacion: Int, private var potencia:Int):Barco(matricula, eslora, manga, anoFabricacion) {

    override fun precioDia():Int {
        return super.precioDia() + (potencia * 15)
    }

    override fun toString(): String {
        return super.toString() + (" tratándose de un barco Deportivo")
    }
}


//subclase:
class Yate constructor(matricula: String, eslora: Int, manga: Int, anoFabricacion: Int, private var potencia:Int, private var camarotes:Int):Barco(matricula, eslora, manga, anoFabricacion) {

    override fun precioDia():Int {
        return super.precioDia() + ((potencia * 15) + (5 * camarotes))
    }

    override fun toString():String {
        return super.toString() + (" tratándose de un Yate")
    }
}


//clase:
class Alquiler constructor(private var dni:String, private var diasAlquiler:Int, private var barco:Barco) {

    fun Alquiler():Int {
        var alquiler = diasAlquiler * (barco.precioDia())
        return alquiler
    }

    override fun toString():String {
        return("El precio del alquiler es de: ${Alquiler()}€")
    }
}



/* 1. En una aplicación de gestión de personal queremos manejar información acerca de
becarios, comerciales y dirección. La información que nos interesa de cada uno es la
siguiente:
• BECARIO:
o Nombre y Apellidos
o Fecha de Alta
o Departamento
o Salario (se inicializará a cero euros)
o Meses de prueba
• COMERCIAL:
o Nombre y Apellidos
o Fecha de Alta
o Departamento
o Salario
o Comisión
• DIRECCIÓN
o Nombre y Apellidos
o Fecha de Alta
o Departamento
o Salario
o Bonificación (es un porcentaje que aumenta su salario).

Para hacer informes necesitamos dos métodos, uno que muestre la información común:
Nombre, Apellidos, Fecha de Alta , Departamento, y salario,

y otro que muestre la información
particular: Meses de prueba, comisión y bonificación.

Define las clases necesarias utilizando los
conceptos de herencia. Todas las clases definen sus atributos como privados y todas las clases
tienen un constructor que inicializan todos sus atributos.

En el programa crea un array de 3 elementos y almacena en el mismo 1 objeto de tipo
BECARIO ,1 objeto de tipo COMERCIAL y 1 objeto de tipo DIRECCIÓN. Recorre el array
mostrando la información común y la particular de los objetos contenidos utilizando un solo
método. */

fun main0167() {
    val array: Array<Empleado> = arrayOf(
            Becario("Juan López Flores",2021,"Informática",1050.50,12),
            Comercial("María Gómez Fernández",2020,"I+D",1500.50,10.5),
            Direccion("Paco García Castro", 2019,"Informática",1600.50,0.2)
    )

    for(i in array) {
        println(i.toString())
    }
}

//SUPERCLASE:
open class Empleado constructor(private var nombreApellidos:String, private var fechaAlta:Int, private var departamento:String, private var salario:Double = 0.0) {

    override fun toString():String {
        return "Nombre y apellidos: $nombreApellidos, fecha de alta: $fechaAlta, departamento: $departamento, salario: $salario"
    }
}

//subclase:
class Becario constructor(nombreApellidos: String, fechaAlta: Int, departamento: String, salario: Double, private var mesesPrueba:Int):Empleado(nombreApellidos,fechaAlta,departamento,salario) {

    override fun toString(): String {
        return super.toString() + (", meses de prueba: $mesesPrueba")
    }
}

//subclase:
class Comercial constructor(nombreApellidos: String, fechaAlta: Int, departamento: String, salario: Double, private var comision:Double):Empleado(nombreApellidos,fechaAlta,departamento,salario) {

    override fun toString(): String {
        return super.toString() + (", comisión: $comision")
    }
}

//subclase:
class Direccion constructor(nombreApellidos: String, fechaAlta: Int, departamento: String, salario: Double, private var bonificacion:Double):Empleado(nombreApellidos,fechaAlta,departamento,salario) {

    override fun toString(): String {
        return super.toString() + (", bonificación: $bonificacion")
    }
}



/* 2. La empresa de telefonía móvil KKPhone tiene 2 tipos de TARIFAS. Tenemos que crear las
distintas clases para gestionar su facturación (todos los atributos serán privados y se
crearán los constructores que inicialicen todos sus atributos). La TARIFA BASE(no incluye
servicio de Internet) incluye:

• Precio por minuto
• Precio por SMS

La TARIFA INTERNET que incluye servicio de Internet, tiene a mayores:

• Cuota tarifa plana Internet (Precio fijo por el servicio de Internet)
• MBs máximos cuota Internet (MBs hasta donde cubre la tarifa plana)
• Precio por MB una vez superada la cuota

Las FACTURA incluyen:

• Una TARIFA
• Número de factura
• IVA (21%)
• DNI cliente
• Minutos consumidos
• Número SMS enviados
• MBs consumidos
• El total de la factura se calcula siguiendo estos pasos:
o Total_sin_IVA= minutos_consumidos x precio_por_minuto_TARIFA+
número_SMS_enviados x precio_por_SMS_TARIFA
o Si la TARIFA es de Internet , incrementaremos el total sin IVA:
§ Total_sin_IVA = Total_sin_IVA + cuota_tarifa_plana_Internet
§ Si se han superado los MBs máximos de cuota de Internet:
§ Total_sin_IVA = Total_sin_IVA + (MBS_consumidos -
MBs_máximos_cuota_Internet_TARIFA) x
precio_por_MB_una_vez_superada_la _cuota_TARIFA
§ Total final = total_sin_IVA x (1 + IVA)

En el programa calcula las siguientes facturaciones y muestra su total (chequea que el cálculo
sea correcto):

• Factura nº 1
o TARIFA BASE:
§ Precio por minuto = 8 céntimos minuto (0,08 €)
§ Precio por SMS = 35 céntimos (0,35 €) o DNI: “12345678Y”
o Minutos consumidos: 200
o SMS enviados: 10

• Factura nº 2
o TARIFA INTERNET:
§ Precio por minuto = 4 céntimos minuto (0,04 €)
§ Precio por SMS = 25 céntimos (0,25 €)
§ Cuota tarifa plana Internet (Precio fijo por el servicio de Internet) =
20€
§ MBs máximos cuota Internet (MBs hasta donde cubre la tarifa plana)=
600
§ Precio por MB una vez superada la cuota = 2,5 céntimos (0,025 €)
o DNI: “12345678Y”
o Minutos consumidos: 180
o SMS enviados: 2
o MBs consumidos: 700 MB */


fun main168() {
    var tarifaBase = TarifaBase(0.0, 0.0)
    var tarifaInternet = TarifaInternet(0.04,0.25,20.0,600.0,0.025)

    var factura1 = Facturaa(tarifaBase, 0.08, 0.35,1,0.21,"12345678Y",200,10,0)
    var factura2 = Facturaa(tarifaInternet, 0.04, 0.25, 2, 0.21, "12345678X", 180, 2, 700)

    println("El total sin Iva de la factura 1 es: ${factura1.totalSinIva()}€, y el Total con Iva es: ${factura1.totalConIva()}€")
    println("El total sin Iva de la factura 2 es: ${factura2.totalSinIva()}€, y el Total con Iva es: ${factura2.totalConIva()}€")
}

//SUPERCLASE:
open class TarifaBase constructor(private var precioMinuto:Double, private var precioSms:Double) {

    open fun precioMinuto():Double {
        return precioMinuto
    }

    open fun precioSms():Double {
        return precioSms
    }

    override fun toString():String {

        return("")
    }

}

//subclase:
class TarifaInternet constructor(precioMinuto: Double, precioSms: Double, private var cuotaTarifaPlana:Double, private var mbMaximos:Double, private var precioMb:Double):TarifaBase(precioMinuto,precioSms) {

    open fun cuotaTarifaPlana():Double {
        return cuotaTarifaPlana
    }

    open fun mbMaximos():Double {
        return mbMaximos
    }

    open fun precioMb(precio:Double):Double {
        return precioMb
    }
}

//clase:
class Facturaa constructor(var base:TarifaBase, precioMinuto: Double, precioSms: Double, private var numeroFactura:Int, private var iva:Double, private var dni:String, private var minutosConsumidos:Int, private var smsEnviados:Int, private var mbConsumidos:Int):TarifaBase(precioMinuto,precioSms) {

    var internet = TarifaInternet(0.0, 0.0, 0.0, 0.0, 0.0)
    var tarifa = TarifaInternet(0.0,0.0,0.0,0.0,0.0)

    open fun totalSinIva(): Double {
        var totalSinIva = (minutosConsumidos * precioMinuto() + smsEnviados * precioSms())
        return totalSinIva
    }

    open fun tarifaInternet0(): Double {
        var totalSinIva = totalSinIva() + (internet.cuotaTarifaPlana())
        return totalSinIva
    }

    open fun tarifaInternet():Double {
        if (tarifa == internet)
            return tarifaInternet0()
        else (internet.mbMaximos() > mbConsumidos)
        return totalSinIva() + (mbConsumidos - internet.mbMaximos()) * internet.precioMb(0.025)
    }

    open fun totalConIva():Double {
        var totalConIva = totalSinIva() * (1 + iva)
        return totalConIva
    }

    /* override fun toString(): String {
         return "El precio total sin iva de la cuota de Internet cuando no se ha superado los mbs máximos es: ${tarifaInternet()}€" +
                 "y "
     }*/
}



/******************** ARRAYS ********************/

fun main0168(){
    var nombreArray= arrayListOf<String>()

    nombreArray.add("Carlos")
    nombreArray.add("Juan")
    println(nombreArray)    //devuelve: [Carlos, Juan]

    nombreArray.add(0,"Pedro")
    println(nombreArray)    //devuelve: [Pedro, Carlos, Juan]

    nombreArray.remove("Pedro")
    nombreArray.removeAt(0)
    println(nombreArray)    //devuelve: [Juan]

    nombreArray.get(0)
    nombreArray.add("Jose")
    println(nombreArray)    //devuelve: [Juan, Jose]

    nombreArray.set(0,"Alfonso")
    println(nombreArray)    //devuelve: [Alfonso, Jose]

    for (i in nombreArray){
        println(i)          //devuelve: Alfonso, Jose
    }
}


/* EJERCICIO ARRAYLIST
Crea un programa que en el que puedas introducir números enteros por consola y los guarde en un Arraylist hasta que introduzcas un 0.
Para finalizar muestra por pantalla los números introducidos, su suma y su media. */

fun main169(){
    var numeros= arrayListOf<Int>()
    var n = 1

    while(n != 0){
        println("Introduce un número, (escribe el 0 para acabar): ")
        n = readLine()!!.toInt()
        if (n != 0)
            numeros.add(n)
    }
    println("Ha introducido ${numeros.size} números")
    println(numeros)

    var suma = 0
    for (i in numeros){
        suma += i
    }
    println("Suma: $suma")
    println("Media: ${suma/numeros.size}")
}



/******************** CLASES ABSTRACTAS ********************/

/*Una empresa se dedica a alquilar barcos. Un BARCO se caracteriza por su matrícula, su eslora
y manga en metros y año de fabricación. Se pretende diferenciar la información de algunos
tipos de barcos:

• Número de mástiles para Veleros
• Potencia en CV para Embarcaciones deportivas a motor
• Potencia en CV y número de camarotes para Yates de lujo
El precio por día base de un alquiler de un barco es un precio por día común para todas las
embarcaciones que se establece en 40€, modificado con los siguientes incrementos:
• Veleros: 10€ x no de mástiles
• Embarcaciones deportivas: 15€ x no CV
• Yates de lujo: (15€ x no CV ) + (5€ x número de camarotes).
Los datos de un ALQUILER son el DNI del cliente, días de alquiler y el BARCO alquilado. El
alquiler se calcula como:
• Días de alquiler x precio por día alquiler barco
Usando clases, atributos privados y constructores que inicialicen todos los atributos, registrar
los siguientes alquileres y mostrar su precio final
• Alquiler 1:
o DNI cliente: “12345678Y”
o 5 días de alquiler
o Barco alquilado:
§ Velero de 3 mástiles:
• Matrícula: “3GI1199”
• Eslora: 70 metros y manga: 12 metros
• Año fabricación: 1980

• Alquiler 2:
o DNI cliente: “27654376T”
o 6 días de alquiler
o Barco alquilado:
§ Embarcación deportiva de 10 CV:
• Matrícula: “9XP1188”
• Eslora: 30 metros y manga: 5 metros
• Año fabricación: 1990

• Alquiler 3:
o DNI cliente: “378641985H”
o 3 días de alquiler
o Barco alquilado:
§ Yate de lujo de 18 CV y 3 camarotes:
• Matrícula: “6TK2476”
• Eslora: 40 metros y manga:10 metros
• Año fabricación: 1995
• Verifica que los precios por alquiler obtenidos son correctos. */

fun main170() {
    var velero1 = Velero("3GI1199",70,12,1980,3)
    var deportivo1 = Deportivo("27654376T",30,5,1990,10)
    var yate1 = Yate("378641985H",40,10,1995,18,3)

    var alquilerVelero = Alquiler("33445566D",5, velero1)
    var alquilerDeportivo = Alquiler("22118877M",6, deportivo1)
    var alquilerYate = Alquiler("44557788N", 3, yate1)

    velero1.verDatos()
    deportivo1.verDatos()
    yate1.verDatos()

    println("")

    println("${alquilerVelero.verDatos()} tratándose de un velero")
    println("${alquilerDeportivo.verDatos()} tratándose de un deportivo")
    println("${alquilerYate.verDatos()} tratándose de un yate")
}

//SUPERCLASE:
abstract class Barco constructor(private var matricula:String, private var eslora:Int, private var manga:Int, private var anoFabricacion:Int) {

    open fun precioDia():Int {
        var precio = 40
        return precio
    }

    abstract fun verDatos()
}

//subclase:
class Velero constructor(matricula: String, eslora: Int, manga: Int, anoFabricacion: Int, private var mastil:Int):Barco(matricula, eslora, manga, anoFabricacion) {

    override fun precioDia():Int {
        return super.precioDia() + (mastil * 10)
    }

    override fun verDatos() {
        println("El precio por día de un velero es de: ${precioDia()}€")
    }
}

//subclase:
class Deportivo constructor(matricula: String, eslora: Int, manga: Int, anoFabricacion: Int, private var potencia:Int):Barco(matricula, eslora, manga, anoFabricacion) {

    override fun precioDia():Int {
        return super.precioDia() + (potencia * 15)
    }

    override fun verDatos() {
        println("El precio por día de un deportivo es de: ${precioDia()}€")
    }
}

//subclase:
class Yate constructor(matricula: String, eslora: Int, manga: Int, anoFabricacion: Int, private var potencia:Int, private var camarotes:Int):Barco(matricula, eslora, manga, anoFabricacion) {

    override fun precioDia():Int {
        return super.precioDia() + ((potencia * 15) + (5 * camarotes))
    }

    override fun verDatos() {
        println("El precio por día de un yate es de: ${precioDia()}€")
    }
}

//clase:
class Alquiler constructor(private var dni:String, private var diasAlquiler:Int, private var barco:Barco) {

    fun Alquiler():Int {
        var alquiler = diasAlquiler * (barco.precioDia())
        return alquiler
    }

    fun verDatos():String {
        return "El precio del alquiler es ${Alquiler()} €"
    }
}



/* 1. Diseña una clase Cuadrado con los siguientes miembros(los atributos serán
privados):
• lado
• área=lado^2
• perímetro=4*lado
Diseña una clase Rectángulo con los siguientes miembros(los atributos serán privados):
• base, altura
• área=base*altura
• perímetro=2*base + 2*altura
Si analizamos detenidamente las clases vemos que las dos tienen en común los
métodos área y perímetro. Para otras figuras ocurrirá lo mismo, y nos interesa que
todas tengan el mismo nombre de método para calcular el área y el perímetro pero
lógicamente siempre distinta implementación, por lo que deducimos que Cuadrado y
Rectángulo deberían heredar de una clase Padre llamada Figura con los siguientes
métodos:
• área y perímetro
Dado que en la clase Figura no se puede establecer el código de los métodos área y
perímetro, puesto que no tiene sentido en esta clase, habrá que declararlos como
abstractos (abstract) y consecuentemente la clase Figura deberá ser abstracta.
Crea ahora una clase llamada Círculo que herede de Figura. Completa el código de la
clase Círculo para que sea correcta y poder compilar el proyecto (área=PI*radio*radio
y perímetro=2*PI*radio).
• Crea los constructores en las clases para inicializar todos los atributos.
• En la función main():
o Crea tres objetos, un cuadrado, un rectángulo y un círculo. ¿Se podría
crear un objeto de Figura? ¿Por qué?
o Crea un array de 3 celdas de tipo Figura y guarda en el mismo los tres
objetos anteriormente creados.
o Recorre el array con un bucle for y muestra por pantalla las áreas y los
perímetros de todas las figuras.
o Sin haber hecho que las clases Cuadrado, Rectángulo y Círculo
heredasen de Figura, ¿podríamos asegurar que el código del punto
anterior funcionaría bien para cualquier tipo de figura almacenada en el
array?. La respuesta a esta pregunta es la ventaja del uso de clases
abstractas. */

fun main171() {
    var circulo = Circulo(5.5)
    var cuadrado = Cuadrado(3.0)
    var rectangulo = Rectangulo(6.0,4.0)

    val array: Array<Figura> = arrayOf(circulo, cuadrado, rectangulo)

    for (i in array) {
        println("El area del ${i.nombre()} es: ${i.area()}")
        println("El perimetro del ${i.nombre()} es: ${i.perimetro()}")
    }
}


abstract class Figura() {

    abstract fun area():Double

    abstract fun perimetro():Double

    abstract fun nombre():String //para que salga el nombre del círculo, cuadrado y rectángulo

}

class Circulo(private var radio:Double):Figura() {

    override fun area():Double {
        var pi = 3.1416
        var area = pi * radio * radio
        return area
    }

    override fun perimetro():Double {
        var pi = 3.1416
        var perimetro = 2 * pi * radio
        return perimetro
    }

    override fun nombre(): String {
        return "Circulo"
    }
}

class Cuadrado constructor(private var lado:Double):Figura() {

    override fun area():Double {
        var area = lado * lado
        return area
    }

    override fun perimetro():Double {
        var perimetro = lado * 4
        return perimetro
    }

    override fun nombre(): String {
        return "Cuadrado"
    }
}

class Rectangulo constructor(private var base:Double, private var altura:Double):Figura() {

    override fun area():Double {
        var area = base * altura
        return area
    }

    override fun perimetro():Double {
        var perimetro = (2*base) + (2*altura)
        return perimetro
    }

    override fun nombre(): String {
        return "Rectangulo"
    }
}



/* Haz un duplicado del proyecto anterior y transforma clase Figura en una interfaz ,
pero obliga igualmente al resto de las clases a implementar los métodos área y
perímetro */

//Con Interfaces
fun main172() {

    var circulo = Circulo(5.5)
    var cuadrado = Cuadrado(3.0)
    var rectangulo = Rectangulo(6.0,4.0)

    val array: Array<Figura> = arrayOf(circulo, cuadrado, rectangulo)

    for (i in array) {
        println("El area del ${i.nombre()} es: ${i.area()}")
        println("El perimetro del ${i.nombre()} es: ${i.perimetro()}")
    }
}


interface Figura {
    fun area():Double

    fun perimetro():Double

    fun nombre():String //para que salga el nombre del círculo, cuadrado y rectángulo
}


class Circulo(private var radio:Double):Figura {

    override fun area():Double {
        var pi = 3.1416
        var area = pi * radio * radio
        return area
    }

    override fun perimetro():Double {
        var pi = 3.1416
        var perimetro = 2 * pi * radio
        return perimetro
    }

    override fun nombre(): String {
        return "Circulo"
    }
}


class Cuadrado constructor(private var lado:Double):Figura {

    override fun area():Double {
        var area = lado * lado
        return area
    }

    override fun perimetro():Double {
        var perimetro = lado * 4
        return perimetro
    }

    override fun nombre(): String {
        return "Cuadrado"
    }
}


class Rectangulo constructor(private var base:Double, private var altura:Double):Figura {

    override fun area():Double {
        var area = base * altura
        return area
    }

    override fun perimetro():Double {
        var perimetro = (2*base) + (2*altura)
        return perimetro
    }

    override fun nombre(): String {
        return "Rectangulo"
    }
}



/* Estamos interesados en guardar información sobre los Animales que emiten sonidos característicos.
De los Animales, en general me interesa saber la siguiente información:
* Raza, sexo, número de patas
Crear un método llamado grito que me devuelva la onomatopeya del grito de
un animal específico: Ej.: Perro ”guau”
De los Perros a mayores me interesa saber:
* Si es o no un perro peligroso
* Si está o no adiestrado
Del Pato a mayores me interesa saber:
* Si tiene o no un plumaje exótico
En el futuro se prevé añadir más clases y todas deberán implementar obligatoriamente el método grito debidamente personalizado.
Diseña las clases oportunamente. Los constructores inicializarán todos los atributos de las clases. */

fun main173() {
    val perro = Perro1("Golden Retriever",false,true,"Epi")
    val pato = Pato1("Swedish Blue",true,"Paquito")

    val array= arrayOf(perro, pato)

    for (i in array) {
        println("${i.nombre()} de raza ${i.raza()} ${i.grito()} ${i.verDatos()}")
    }
}


abstract class Animales() {

    abstract fun grito():String
    abstract fun nombre():String
    abstract fun raza():String
    abstract fun verDatos():String
}


class Perro1(private var raza:String, private var peligroso:Boolean, var adiestrado:Boolean, var nombre:String): Animales() {

    override fun grito():String {
        var grito = "hace guau,"
        return grito
    }

    override fun nombre():String {
        return nombre
    }

    override fun raza():String {
        return raza
    }

    fun peligroso():String {
        if (peligroso == true) return ("es peligroso, ")
        else return ("no es peligroso,")
    }


    fun adiestrado():String {
        if (adiestrado == true) return ("está adiestrado.")
        else return ("no está adiestrado.")
    }

    override fun verDatos(): String {
        return "${peligroso()} ${adiestrado()}"
    }
}


class Pato1(private var raza:String, private var plumajeExotico:Boolean, private var nombre:String): Animales() {

    override fun grito():String {
        var grito = "hace cuak,"
        return  grito
    }

    override fun nombre():String {
        return nombre
    }

    override fun raza(): String {
        return raza
    }

    fun plumajeExotico():String {
        if (plumajeExotico == true) return("tiene plumaje exótico.")
        else return ("no tiene plumaje exótico.")
    }

    override fun verDatos(): String {
        return plumajeExotico()
    }
}



/* Añade al proyecto anterior una clase llamada Robot, como no tiene nada que ver
con la clase Animales no deberá heredar de ella, sin embargo queremos obligar a
que esta implemente el método grito también en esta clase. Haz los cambios
oportunos en el proyecto para exigir la implementación del mencionado método
en todas las clases del proyecto.
• Añade una celda más al array y guarda un objeto de tipo Robot.
• Recorre el array y muestra los gritos de cada objeto. */

fun main174() {
    var perro = Perro("Golden Retriever",false,true,"Epi")
    var pato = Pato("Swedish Blue",true,"Paquito")
    var robot = Robot("R2")

    val array = arrayOf(perro, pato, robot)

    for (i in array) {
        println("${i.nombre()} ${i.grito()} ${i.verDatos()}")
    }
}

abstract class Animal() {

    abstract fun raza():String
}


interface grito {

    fun nombre():String
    fun grito():String
    fun verDatos():String
}


class Perro(private var raza:String, private var peligroso:Boolean, var adiestrado:Boolean, var nombre:String):Animal(), grito {

    //ABSTRACT:
    override fun raza():String {
        return raza
    }

    //INTERFACE:
    override fun nombre():String {
        return nombre
    }

    override fun grito():String {
        var grito = "hace guau,"
        return grito
    }

    override fun verDatos(): String {
        return "${peligroso()} ${adiestrado()}"
    }

    //funciones:
    fun peligroso():String {
        if (peligroso == true) return ("es peligroso,")
        else return ("no es peligroso,")
    }

    fun adiestrado():String {
        if (adiestrado == true) return ("está adiestrado.")
        else return ("no está adiestrado.")
    }
}


class Pato(private var raza:String, private var plumajeExotico:Boolean, private var nombre:String):Animal(), grito {

    //ABSTRACT:
    override fun raza(): String {
        return raza
    }

    //INTERFACE:
    override fun nombre():String {
        return nombre
    }

    override fun grito():String {
        var grito = "hace cuak,"
        return  grito
    }

    override fun verDatos(): String {
        return plumajeExotico()
    }

    //funciones:
    fun plumajeExotico():String {
        if (plumajeExotico == true) return("tiene plumaje exótico.")
        else return ("no tiene plumaje exótico.")
    }
}


class Robot(private var nombre:String):grito {

    //INTERFACE:
    override fun nombre(): String {
        return nombre
    }

    override fun grito(): String {
        return "hace wiiiiii,"
    }

    override fun verDatos(): String {
        return "y es de nueva generación."
    }
}



/* Estamos interesados en guardar información sobre los Animales que emiten sonidos característicos.
De los Animales, en general me interesa saber la siguiente información:
* Raza, sexo, número de patas
Crear un método llamado grito que me devuelva la onomatopeya del grito de
un animal específico: Ej.: Perro ”guau”
De los Perros a mayores me interesa saber:
* Si es o no un perro peligroso
* Si está o no adiestrado
Del Pato a mayores me interesa saber:
* Si tiene o no un plumaje exótico
En el futuro se prevé añadir más clases y todas deberán implementar obligatoriamente el método grito debidamente personalizado.
Diseña las clases oportunamente. Los constructores inicializarán todos los atributos de las clases. */

/* Añade al proyecto anterior una clase llamada Robot, como no tiene nada que ver
con la clase Animales no deberá heredar de ella, sin embargo queremos obligar a
que esta implemente el método grito también en esta clase. Haz los cambios
oportunos en el proyecto para exigir la implementación del mencionado método
en todas las clases del proyecto.
• Añade una celda más al array y guarda un objeto de tipo Robot.
• Recorre el array y muestra los gritos de cada objeto. */

fun main175() {

    var perro = Perro("Golden","Macho",4,false,true)
    var pato = Pato("Azulon","Hembra",2,true)
    var robot = Robot("Walli")

    //println("El perro de raza ${perro.raza()} hace ${perro.grito()}")
    //println("El Pato de raza ${pato.raza()} hace ${pato.grito()}")
    //println("El robot hace ${robot.grito()}")

    var array = arrayOf(perro,pato,robot)

    for(i in array) {
        println("${i.raza()} hace ${i.grito()} ")
    }
}

abstract class Animal() {
    abstract fun raza():String
}

interface grito {

    fun grito():String
    fun raza():String

}

class Perro(private var raza:String, private var sexo:String, private var numPatas:Int, private var peligroso:Boolean, private var adiestrado:Boolean):Animal(), grito {

    override fun grito():String {
        return "guau"
    }

    override fun raza():String {
        return raza
    }
}


class Pato(private var raza:String, private var sexo:String, private var numPatas:Int, private var plumajeExotico:Boolean):Animal(), grito {

    override fun grito():String {
        return "cuack"
    }

    override fun raza():String {
        return raza
    }
}

class Robot(private var nombre:String): grito {

    override fun grito():String {
        return "wiiii"
    }

    override fun raza(): String {
        return "Robot"
    }
}



/******************** LISTAS ********************/

fun main176() {
    var lista1: List<Int> = List(5) {
        print("Ingrese un entero:")
        val valor = readLine()!!.toInt()
        valor
    }
    println(lista1)
}

var diasSemana = listOf<String>("Lunes","Martes", "Miercoles")



/******************** ENCAPSULACIÓN ********************/

/* Desarrolla una clase que tenga un atributo privado de tipo array de 5 enteros.
Utiliza el bloque init para llamar a un método privado que cargue valores aleatorios de 1 a 10 en el Array.*/

fun main177() {
    var array1 = Array()
}

class Array() {

    private var array = IntArray(5)

    init {
        cargar()
    }

    private fun cargar() {
        for (i in array.indices) {
            array[i] = Random.nextInt(1,10)
        }

        for (x in array) println(x)}
}



/******************** DATA CLASS Y ENUM CLASS ********************/

/* Cartas de la baraja Americana */

fun main178() {
    var cartaTreboles = Carta(TipoCarta.TREBOLES,5)
    println(cartaTreboles.imprimir())
}

enum class TipoCarta {

    TREBOLES, DIAMANTES, PICAS, CORAZONES
}

class Carta(val tipo: TipoCarta, val valor: Int) {

    fun imprimir():String {
        return("Tu carta es un $valor de $tipo")
    }
}



/* Desarrolla un programa en el que saque 5 cartas aleatorias con 5 valores aleatorios. */

fun main179() {
    for (i in 1 .. 5){
        val sacarCarta = Carta()
        println(sacarCarta.imprimir())
    }

    val carta1Impresion = Carta()
}

enum class TipoCarta {

    TREBOLES, DIAMANTES, PICAS, CORAZONES
}

class Carta() {

    fun palo(): TipoCarta {
        val palo = TipoCarta.values().random()
        return palo
    }

    fun valor(): Int {
        val valor = Random.nextInt(1, 12)
        return valor
    }

    fun imprimir(): String {
        return "Tu carta es un ${valor()} de ${palo()}"
    }
}



/* Definir una ENUM CLASS con 5 países de Europa y que tenga como propiedad su población
Imprimir la cantidad de habitantes que tiene cada país */

fun main180() {
    var paisesEuropa = PaisesEuropa.España.cantidadHabitantes()
    println(paisesEuropa)
}

enum class PaisesEuropa(val posicion:Int) {

    España(1), Portugal(2), Francia(3), Alemania(4), Inglaterra(5);

    fun cantidadHabitantes(): String {
        return when (this) {
            España -> "Tiene una población de cien millones de habitantes"
            Portugal -> "Tiene una población de dos cientos millones de habitantes"
            Francia -> "Tiene una población de tres cientos millones de habitantes"
            Alemania -> "Tiene una población de cuatro cientos millones de habitantes"
            Inglaterra -> "Tiene una población de cinco cientos millones de habitantes"
        }
    }
}



/* Las ENUM CLASS tienen como uso principal implementar enumeraciones type-safe (tipado seguro).
Significa que nosotros vamos a crear class que van a tomar valores que nosotros siempre vamos a saber con antelación. */

fun main181() {
    var userDirection = Direction.ESTE

    println("Direccion: $userDirection")
    println(userDirection)
    println(userDirection.name) //devuelve el nombre.
    println(userDirection.ordinal) //devuelve la posición.

    var arrayEnum = Direction.values() //Convertir clase Direction en Array (arrayEnum)
    for(i in arrayEnum) println(i)
}

enum class Direction {NORTE, SUR, ESTE, OESTE}



/* Las ENUM CLASS tienen como uso principal implementar enumeraciones type-safe (tipado seguro).
Significa que nosotros vamos a crear class que van a tomar valores que nosotros siempre vamos a saber con antelación. */

fun main182() {
    var direccionActual = Direction1.ESTE.description()

    println(direccionActual) //Devuelve: La dirección es ESTE
}

enum class Direction1 {NORTE, SUR, ESTE, OESTE;

    fun description(): String {
        return when (this) {
            NORTE -> "La dirección es Norte"
            SUR -> "La dirección es Sur"
            ESTE -> "La dirección es Este"
            OESTE -> "La dirección es Oeste"
        }
    }
}



/* Las ENUM CLASS tienen como uso principal implementar enumeraciones type-safe (tipado seguro).
Significa que nosotros vamos a crear class que van a tomar valores que nosotros siempre vamos a saber con antelación. */

fun main183() {
    var userDirection1 = Direction2.OESTE
    println(userDirection1.dir)
}

enum class Direction2(val dir: Int) {

    NORTE(1), SUR(-2), ESTE(1), OESTE(-1);

    fun description2(): String {
        return when (this) {
            NORTE -> "La dirección es Norte"
            SUR -> "La dirección es Sur"
            ESTE -> "La dirección es Este"
            OESTE -> "La dirección es Oeste"
        }
    }
}



/* Plantear un programa que tenga una clase Club y otra clase Socio.
La clase Socio debe tener los siguientes atributos:
- Nombre
- Antigüedad en el club (en años).
La clase Club debe tener como atributos:
- 3 objetos de la clase Socio.
La clase Club debe tener un método que calcule el socio de mayor antigüedad añadido. */

fun main184() {
    val socios = Club()
    socios.mayorAntiguedad()
}

class Socio(var nombre: String, var antiguedad: Int) {

    constructor(): this(" ", 0){
        println("Ingrese el nombre del socio")
        nombre = readLine()!!
        println("Ingrese la antigüedad del socio")
        antiguedad = readLine()!!.toInt()
    }
}

class Club(){

    val socio1 = Socio()
    val socio2 = Socio()
    val socio3 = Socio()

    fun mayorAntiguedad(){
        if (socio1.antiguedad > socio2.antiguedad && socio1.antiguedad > socio3.antiguedad) println("El sociode mayor antigüedad es ${socio1.nombre}")
        if (socio2.antiguedad > socio1.antiguedad && socio2.antiguedad > socio3.antiguedad) println("El sociode mayor antigüedad es ${socio2.nombre}")
        if (socio3.antiguedad > socio1.antiguedad && socio3.antiguedad > socio2.antiguedad) println("El sociode mayor antigüedad es ${socio3.nombre}")
    }
}



/******************** HERENCIA ********************/

/* 3. Plantea un ejercicio mediante herencias de clases para calcular el área de formas
geométricas. Debes partir de una clase que sea FormasGeometricas y definir dos
clases heredadas de esta (por ejemplo, circulo y cuadrado) */

fun main185() {
    val circulo = Circulo(5.0)
    circulo.area()

    val cuadrado = Cuadrado(6.0)
    cuadrado.area()
}

abstract class FormasGeometricas() {

    abstract fun area()
}

class Circulo(val radio:Double):FormasGeometricas() {

    override fun area() {
        val area:Double = Math.PI * radio*radio
        println("El area es $area")
    }
}

class Cuadrado(val lado:Double): FormasGeometricas() {

    override fun area() {
        val area:Double = lado*lado
        println("El area es $area")
    }
}



/* Estamos interesados en guardar información sobre los Animales que emiten sonidos característicos.
De los Animales, en general me interesa saber la siguiente información:
* Raza, sexo, número de patas
Crear un método llamado grito que me devuelva la onomatopeya del grito de
un animal específico: Ej.: Perro ”guau”
De los Perros a mayores me interesa saber:
* Si es o no un perro peligroso
* Si está o no adiestrado
Del Pato a mayores me interesa saber:
* Si tiene o no un plumaje exótico
En el futuro se prevé añadir más clases y todas deberán implementar obligatoriamente el método grito debidamente personalizado.
Diseña las clases oportunamente. Los constructores inicializarán todos los atributos de las clases. */

fun main186() {
    val perro1 = Perros("Border Collie", "Femenino", 4, false, true)
    perro1.grito()
    perro1.adiestrado()
    perro1.peligroso()

    val animales1 = arrayOf(Perros("Border Collie", "Femenino", 4, false, true),
            Pato("Rosado", "Masculino", 2, true))

    for(i in animales1)
        i.grito()
}

abstract class Animales (raza:String, sexo: String, numeroPatas: Int){
}

interface Grito {
    val grito: String
    fun grito()
}

class Perros(raza:String, sexo: String, numeroPatas: Int, val peligroso: Boolean, val adiestrado: Boolean ): Animales(raza, sexo, numeroPatas), Grito {

    override val grito: String
        get() = "guau"

    override fun grito() {
        println("El perro hace $grito")
    }

    fun peligroso() {
        if (peligroso == true) println("El perro es peligroso")
        else println("El perro no es peligroso")
    }

    fun adiestrado() {
        if (adiestrado == true) println("El perro está adiestrado")
        else println("El perro no está adiestrado")
    }
}

class Pato(raza:String, sexo: String, numeroPatas: Int, val plumajeExotico: Boolean): Animales(raza, sexo, numeroPatas), Grito {

    override val grito: String
        get() = "quack"

    override fun grito() {
        println("El pato hace $grito")
    }

    fun plumaje() {
        if (plumajeExotico == true) println("El pato tiene plumaje exótico")
        else println("El pato tiene plumaje exótico")
    }

}

class Gatos (raza:String, sexo: String, numeroPatas: Int): Animales(raza, sexo, numeroPatas), Grito {
    override val grito: String
        get() = "miau"

    override fun grito() {
        println("El gato hace $grito")
    }

}


/******************** ARRAYS ********************/

fun main187() {
    val personas: Array<Personn> = arrayOf(Personn("Paco", 25), Personn("Lucia", 16))

    for(i in personas)
        i.print()

    var cant = 0

    for(i in personas)
        if (i.mayorEdad())cant++

    println("La cantidad de personas mayores de 18 es $cant")

    personas[0].print()
    personas[1].print()
}

class Personn (val name: String, val age: Int){

    fun print () {
        println("El nombre es $name y tiene $age años")
    }

    fun mayorEdad(): Boolean {
        return age > 18
    }
}



/* Implementa dos métodos en la clase, una que le enviemos el Array y nos muestre todos sus componentes,
y otra que también reciba el Array de artículos y proceda a aumentar un 10% el precio de todos los productos.

Realiza el ejercicio empleando un Array con 3 elementos de tipo Artículo, por ejemplo pantalón, sudadera y camiseta. */
//+array
//+for

fun main188() {
    val array = arrayOf(
            Articul0(1,"Camiseta", 19.9f),
            Articul0(2, "Pantalon",24.90f),
            Articul0(3, "Sudadera", 35f) )

    for(i in array){
        i.imprimir()
        i.aumentarPrecio()
    }
}

class Articul0(val codigo: Int, val descripcion: String, var precio: Float) {

    fun imprimir(){
        println("El articulo $descripcion con codigo $codigo y precio $precio")
    }

    fun aumentarPrecio(){
        precio = precio + precio*0.1f
        println("El precio nuevo del articulo $codigo es $precio")
    }

}



/* 5.- Crea una clase “Artista” con los siguientes atributos privados: nombre, país,
año de nacimiento
• Crea un constructor que inicialice los 3 atributos
• Crea una función “edad()” que devuelva los años del artista.
• Crea un procedimiento “verDatos” que muestre los datos por pantalla

Crea una clase “Disco” con los siguientes atributos privados: título, objeto
Artista, año de lanzamiento, número de canciones
• Crea un constructor que inicialice título y artista.
• Crea una función “antigüedad()” que devuelva los años del disco.
• Crea un procedimiento “verDatos” que muestre los datos por pantalla
En la función main crea los objetos necesarios para guardar la siguiente
información:
o Artista: “Shakira”, País: “Colombia”, Año nacimiento: “1977”
o Disco de Shakira: “Sale el sol”, Año de lanzamiento: “2009”, 15 canciones.
o Utilizando el método “verDatos”, muestra los datos por pantalla. */

fun main189() {
    val artista1 = Artista("Shakira", "Colombia", 1977)
    val artista2 = Artista("Beyonce", "EEUU", 1985)
    val disco1 = Disco("Sale el sol", artista1, 2009, 15)
    val disco2 =Disco("Crazy in Love", Artista("Beyonce", "EEUU", 1985), 2008, 12)

    disco1.verDatoss()
    disco2.verDatoss()

}

class Artista (private var nombre: String, private var pais: String, private var anhoNacimiento: Int) {

    fun getNombre(): String {
        return nombre
    }

    fun getPais(): String {
        return pais
    }

    fun getAnhoNacimiento(): Int {
        return anhoNacimiento
    }

    fun edad(): Int {
        return 2022 - anhoNacimiento
    }

    fun verDatos() {
        println("Artista: $nombre")
        println("Pais: $pais")
        println("Año nacimiento: $anhoNacimiento")
        println("Edad: ${edad()}")
    }
}

class Disco (private var titulo: String, private var artista: Artista, private var anhoLanzamiento: Int, private var numCanciones: Int) {

    fun getTitulo(): String {
        return titulo
    }

    fun getArtista(): Artista {
        return artista
    }

    fun getAnhoLanzamiento(): Int {
        return anhoLanzamiento
    }

    fun getCanciones(): Int {
        return numCanciones
    }

    fun antiguedad(): Int {
        return 2022 - anhoLanzamiento
    }

    fun verDatoss() {
        println("Disco: ")
        println("El titulo del disco es: $titulo")
        artista.verDatos()
        println("Año lanzamiento: $anhoLanzamiento")
        println("Numero canciones: $numCanciones")
        println("Antiguedad: ${antiguedad()}")

    }
}



/* 2.- Construir una clase Punto. El objetivo de esta clase es almacenar las
coordenadas x e y de un punto en un plano. La clase ha de tener los siguientes
atributos privados: x, y , nombre:

• Crea un constructor que inicialice las coordenadas del punto.
• Crea un método para asignarle un nombre al punto.
• Crea un segundo constructor que inicialice las coordenadas del punto y su nombre.
• Crea dos métodos, uno para desplazar(sumar un valor entero)
el punto alo largo del eje x (“desplazaX”) y otro para desplazar el punto a lo largo
del eje y (“desplazaY”).

• Crea un procedimiento “verPunto” que muestre la información del punto
en el formato: nombre(x,y).

En la función main:
• Crea el punto llamado “miPunto” con las coordenadas 10,40. Haciendo
uso del procedimiento anterior muestra los datos del punto en pantalla.
• Desplaza 5 unidades el punto en el eje x y vuelve a mostrar los datos del
punto en pantalla

Revisar documentación:
https://www.tutorialesprogramacionya.com/kotlinya/detalleconcepto.php?punto=
24&codigo=24&inicio=15 */

fun main190() {
    val punto1 = Punto(10, 4, "Mi Punto")
    punto1.verPunto()
    punto1.desplazaX(5)
    punto1.verPunto()
}

class Punto (private var x: Int, private var y: Int) {

    private var nombre: String = ""

    constructor( x: Int, y:Int, nombre: String ): this(0,0){
        this.x=x
        this.y=y
        this.nombre=nombre
    }

    fun desplazaX(cantidad: Int) {
        x=x+cantidad
    }

    fun desplazaY(cantidad: Int) {
        y=y+cantidad
    }

    fun verPunto() {
        println("$nombre($x,$y)")
    }

}



/* 3.- Crea la clase Círculo. Un Círculo se define por un punto y un radio.

Crea por lo tanto una clase Círculo con dos atributos privados: uno para almacenar un
objeto de tipo Punto y otro para almacenar el radio.

• Crea un constructor que inicialice el círculo dado un punto y un radio.
Crea una función que calcule el área del círculo (área=Pi*radio2, siendo
Pi una constante con valor: 3,14159).

• En el programa crea un círculo situado en el punto 10,20 y de radio 4,5.
Muestra su área. */


/* 4.- Abre el proyecto del ejercicio anterior, vamos a ampliar la clase Círculo.

• Añade una función que calcule la longitud de su circunferencia
(longitud=2*Pi*radio).

• Añade dos métodos “desplazaX” y “desplazaY”. El primero desplazará
un número de unidades dado el punto “x” del Círculo y el segundo
desplazará el punto “y”. Estos desplazamientos se efectuarán llamando
a los procedimientos respectivos del objeto “punto”.

• Crea un procedimiento llamado “verDatos” que muestre los datos del
círculo, es decir, el punto y el radio. Para mostrar los datos del punto usa
el procedimiento de mismo nombre del objeto punto.

• En La función main:
o Crea un círculo situado en el punto 20,30 y de radio 6 unidades.
o Muestra su longitud
o Desplaza el punto 10 unidades en el eje x
o Muestra los datos del círculo por pantalla
o Haz lo que sea necesario para cambiar el valor del radio del
círculo a 7,5.
o Muestra de nuevo los datos del círculo. */

fun main191() {
    val punto2 = Punto(10,20)
    val circulo1 = Circulo(punto2,4.5)
    println(circulo1.areaCirculo())
    val punto3 = Punto(20,30)
    val circulo2 = Circulo(punto3, 6.0)
    println(circulo2.longitudCirculo())
    punto3.desplazaX(10)
    circulo2.getRadio(7.5)
    println(circulo2.longitudCirculo())
}

class Punto (private var x: Int, private var y: Int) {

    private var nombre: String = ""

    constructor( x: Int, y:Int, nombre: String ): this(0,0)
    this.x=x
    this.y=y
    this.nombre=nombre


    fun desplazaX(cantidad: Int) {
        x=x+cantidad
    }

    fun desplazaY(cantidad: Int) {
        y=y+cantidad
    }

    fun verPunto() {
        println("$nombre($x,$y)")
    }
}

class Circulo (private var punto: Punto, private var radio: Double) {
    private val PI: Double = 3.14159

    fun areaCirculo(): Double {
        return PI*radio*radio
    }

    fun longitudCirculo(): Double {
        return 2*PI*radio
    }

    fun getRadio(radioNuevo: Double): Double {
        radio = radioNuevo
        return radioNuevo
    }
}



/* 1.- Crea una clase llamada Encuesta para almacenar los votos de una encuesta de dos posibles
respuestas (Ej. ¿Lee libros habitualmente?(S/N), ¿Quién es el mejor jugador de fútbol del
mundo, Leo Messi o Cristiano Ronaldo?). Sus atributos privados son:
• Pregunta, VotosA, VotosB
El constructor recibirá la pregunta a inicializar. Las variables de los votos VotosA y VotosB se
inicializarán en el constructor a cero, indicando con este valor que no se han emitido votos
hasta el momento para ninguna de las dos respuestas. La pregunta no puede cambiarse una
vez creada la encuesta y los votos se registran de uno en uno. Crea los siguientes métodos
para gestionar los datos de la encuesta:
• incA : Aumenta el número de votosA en 1
• incB: Aumenta el número de votosB en 1
• totalVotos: Devuelve la suma de los votos de las dos posibles respuestas.
• porcentajeA: Devuelve el porcentaje de votosA.
o (votosA/totalVotos)*100
• porcentajeB: Devuelve el porcentaje de votosB.
o (votosB/totalVotos)*100

Las funciones que calculan el porcentaje pueden fallar si se ejecutan cuando el número total
de votos es cero, puesto que se haría una división por cero. Obviamente si no existen votos los
porcentajes deben devolver cero y evitar la división. Añade esta corrección a dichas funciones
(PISTA: Emplea un condicional If).

• En la función main():
Crea un objeto de tipo Encuesta, muestra por pantalla los porcentajes de ambas respuestas.
Incrementa el número de veces que quieras los votos de las dos respuestas y muestra por
pantalla la pregunta, el total de votos, votas A, votos B y los porcentajes de ambas respuestas. */

fun main192() {
    val encuesta1 = Encuesta("¿Quién es el mejor jugador de fútbol del mundo, (A) Leo Messi o (B) Cristiano Ronaldo?")
    for(i in 1..20) encuesta1.incA()
    for(i in 1..15) encuesta1.incB()
    println(encuesta1.getPregunta())
    println("Votos A: ${encuesta1.getVotosA()}")
    println("Votos B: ${encuesta1.getVotosB()}")
    println("Votos totales: ${encuesta1.totalVotos()}")
    println("Porcentaje A: ${encuesta1.porcentajeA()} %")
    println("Porcentaje B: ${encuesta1.porcentajeB()} %")
}

class Encuesta(private var pregunta: String) {
    private var votosA: Int=0
    private var votosB: Int=0

    fun getPregunta() = pregunta

    fun getVotosA() = votosA

    fun getVotosB() = votosB
    fun incA() {
        votosA++
    }

    fun incB() {
        votosB++
    }

    fun totalVotos(): Int {
        return votosA+votosB
    }

    fun porcentajeA(): Float {
        if (totalVotos() == 0) return 0f
        else return votosA*100f/totalVotos()
    }

    fun porcentajeB(): Float {
        if (totalVotos() == 0) return 0f
        else return votosB*100f/totalVotos()
    }

}



/* 2.- Crea una clase Pelicula, con los siguientes miembros:
• Atributos privados: Título, director, duración(en minutos)
• Dos constructores, uno que inicializa sólo el título, y otro que inicializa todos los
parámetros
• Crea un método verDatos que muestre los datos de la película en pantalla. Dado que
el primer constructor sólo inicializa el título, se podrá crear un objeto Película sin
duración ni director, en caso de que no exista duración ni director, el método verDatos
lo indicará por pantalla.
En la función main():
• Utilizando el primer constructor, crea un objeto Película con el título: “War Horse”
• Crea un objeto Película con el título: “Gran Torino”, director: “Clint Eastwood”,
duración:119 minutos.
• Usando el método verDatos, muestra los datos de los dos objetos en pantalla.
• Añade al primer objeto el director “Steven Spielberg” y la duración: 146 minutos.
Muestra los datos por pantalla.
• Añade un nuevo atributo privado llamado puntuación, para almacenar una puntuación
para la película de 0 a 10 (con parte decimal). Se debe exigir que los valores para este
atributo, estén siempre comprendidos entre 0 y 10, en caso de que se intente asignar
un valor erróneo se mostrará un mensaje de error y no se establecerá dicho valor.
• Modifica el método verDatos para que muestre también la puntuación.

Parte 2 del ejercicio. Crea una nueva clase llamada Productora con los siguientes miembros:
• Nombre, Página Web
• Constructor que inicialice todos los parámetros
• Método verDatos que muestre los valores de sus atributos por pantalla.
• Ajusta ahora adecuadamente la clase Pelicula para que almacene obligatoriamente un
objeto de tipo Productora. Modifica también el método verDatos, para muestre
también los datos de la productora.
En la función main(), a los dos objetos creados anteriormente añádeles los datos de sus
productoras:
• Para “War Horse”: “Dreamworks Pictures”, http://www.dreamworksstudios.com/
• Para “Gran Torino”: “Warner Bros. Pictures”, http://www.warnerbros.com/
Comprueba que se visualizan todos los datos de PELÍCULA Y PRODUCTORA. */

fun main193() {

    var productora1 = Productora("Dreamworks Pictures", "http://www.dreamworksstudio.com")
    productora1.verDatos()

    var pelicula1 = Pelicula("War Horse", productora1,"Steven Spielberg", 152, 9.5)
    var pelicula2 = Pelicula("Gran Torino", Productora("Warner Bros", "www.warnerbros.com"))

    pelicula1.verDatos()
}

class Pelicula(private var titulo: String, var productora: Productora) {

    private var director: String = ""
    private var duracion: Int = 0
    private var puntuacion: Double = 0.0

    constructor(titulo: String,productora: Productora, director: String, duracion: Int, puntuacion: Double): this(titulo, productora){
        this.director=director
        this.duracion=duracion
        this.puntuacion=puntuacion
        this.productora=productora
    }

    fun verDatos() {
        println("Pelicula: ")
        println("Título: $titulo")
        if (duracion == 0) println("La película no tiene duración asignada")
        else println("La duracion de la pelicula es $duracion")
        if (director == "") println("La película no tiene director asignado")
        else println("Director: $director")
        if (puntuacion<0 && puntuacion>10) println("La puntuación no es correcta")
        else println("la puntuación de la película: $puntuacion")
        productora.verDatos()
    }

}

class Productora(private var nombre: String, private var paginaWeb: String){

    fun verDatos() {
        println("La productora es: ")
        println("Nombre: $nombre")
        println("Página Web: $paginaWeb")
    }
}



/* 1. Dados 4 números, es decir 4 valores. Crear una función que siempre me devuelva el valor mayor. */
fun main194() {
    val num1 = 100
    val num2 = 8
    val num3 = 47
    val num4 = 89

    fun calculaMayor(): Int {
        var maximo = num1
        if(num2>maximo) maximo = num2
        if(num3>maximo) maximo = num3
        if(num4>maximo) maximo = num4
        return maximo
    }

    println(calculaMayor())
}



/* 5.- Crea una clase “Artista” con los siguientes atributos privados: nombre, país,
año de nacimiento
• Crea un constructor que inicialice los 3 atributos
• Crea una función “edad()” que devuelva los años del artista.
• Crea un procedimiento “verDatos” que muestre los datos por pantalla

Crea una clase “Disco” con los siguientes atributos privados: título, objeto
Artista, año de lanzamiento, número de canciones
• Crea un constructor que inicialice título y artista.
• Crea una función “antigüedad()” que devuelva los años del disco.
• Crea un procedimiento “verDatos” que muestre los datos por pantalla
En la función main crea los objetos necesarios para guardar la siguiente
información:
o Artista: “Shakira”, País: “Colombia”, Año nacimiento: “1977”
o Disco de Shakira: “Sale el sol”, Año de lanzamiento: “2009”, 15 canciones.
o Utilizando el método “verDatos”, muestra los datos por pantalla. */

fun main195() {

    val artista1 = Artista("Shakira", "Colombia", 1977)
    val artista2 = Artista("Beyonce", "EEUU", 1985)
    val disco1 = Disco("Sale el sol", artista1, 2009, 15)
    val disco2 =Disco("Crazy in Love", Artista("Beyonce", "EEUU", 1985), 2008, 12)

    disco1.verDatos()
    artista1.verDatos()
    println("")
    disco2.verDatos()
    artista2.verDatos()

}
class Artista (private var nombre: String, private var pais: String, private var anhoNacimiento: Int) {

    fun getNombre(): String {
        return nombre
    }

    fun getPais(): String {
        return pais
    }

    fun getAnhoNacimiento(): Int {
        return anhoNacimiento
    }

    fun edad(): Int {
        return 2022 - anhoNacimiento
    }

    fun verDatos() {
        println("Artista: $nombre")
        println("Pais: $pais")
        println("Año nacimiento: $anhoNacimiento")
        println("Edad: ${edad()}")
    }
}

class Disco (private var titulo: String, private var artista: Artista, private var anhoLanzamiento: Int, private var numCanciones: Int) {

    fun getTitulo(): String {
        return titulo
    }

    fun getArtista(): Artista {
        return artista
    }

    fun getAnhoLanzamiento(): Int {
        return anhoLanzamiento
    }

    fun getCanciones(): Int {
        return numCanciones
    }

    fun antiguedad(): Int {
        return 2022 - anhoLanzamiento
    }

    fun verDatos() {
        println("El titulo del disco es: $titulo")
        println("Año lanzamiento: $anhoLanzamiento")
        println("Numero canciones: $numCanciones")
        println("Antiguedad: ${antiguedad()}")
    }
}



//Ejercicio 2
class Person (private var nombre: String, private var numero: Int){

    fun obtenNumero() = numero

    fun verDatos() {
        println("Nombre: $nombre")
        println("Numero: $numero")
    }
}

fun main196() {
    val persona1 = Person("Martin", 89)
    val persona2 = Person("Carlos", 12)
    val persona3 = Person("Juan", 99)
    val persona4 = Person("Matias",35)

    fun calcularMayor(): Person {
        var maximo = persona1
        if(persona2.obtenNumero()>maximo.obtenNumero()) maximo = persona2
        if(persona3.obtenNumero()>maximo.obtenNumero()) maximo = persona3
        if(persona4.obtenNumero()>maximo.obtenNumero()) maximo = persona4
        return maximo
    }

    calcularMayor().verDatos()

    //A partir de aqui es con Array
    val arrayPersonas = arrayOf(persona2,persona4, Person("Lourdes", 55))

    fun calculaMayor2(arrayList: Array<Person>): Person {
        var maximo = arrayPersonas[0]
        for(i in arrayPersonas.indices){
            if(arrayPersonas[i].obtenNumero()>maximo.obtenNumero()) maximo = arrayPersonas[i]
        }
        return maximo
    }

    calculaMayor2(arrayPersonas).verDatos()
}



/* HERENCIA */

class Persona (private val DNI: String, private val nombre: String, private val apellidos: String, private val edad: Int){

    fun mayorEdad(): Boolean {
        return edad>18
    }
}

class Empleado ( private val DNI: String, private val nombre: String, private val apellidos: String, private val edad: Int, private val salarioBruto: Double) {


    fun mayorEdad(): Boolean {
        return edad>18
    }

    fun salarioNeto(): Double {
        return salarioBruto - salarioBruto*0.12
    }

}

fun main197(){
    val persona1 = Persona("45863938F", "Ana", "vazquez", 34)
    val empleado1 = Empleado("73737373G", "Juan", "Fernandez", 32, 1450.0)

    println("La persona es mayor de edad: ${persona1.mayorEdad()}")
    println("El salario neto del empleado es ${empleado1.salarioNeto()}")
}


///

open class Persona (private val DNI: String,
                    private val nombre: String,
                    private val apellidos: String,
                    private val edad: Int){

    open fun mayorEdad(): Boolean {
        return edad>18
    }
}

class Empleado ( DNI: String,
                 nombre: String,
                 apellidos: String,
                 edad: Int,
                 private val salarioBruto: Double): Persona(DNI, nombre, apellidos,edad) {


    fun salarioNeto(): Double {
        return salarioBruto - salarioBruto*0.12
    }

}

fun main198(){
    val persona1 = Persona("45863938F", "Ana", "vazquez", 34)
    val empleado1 = Empleado("73737373G", "Juan", "Fernandez", 32, 1450.0)

    println("La persona es mayor de edad: ${persona1.mayorEdad()}")
    println("La persona es mayor de edad: ${empleado1.mayorEdad()}")
    println("El salario neto del empleado es ${empleado1.salarioNeto()}")
}



/*
Para gestionar una tienda de mascotas, define una clase padre/superclase llamada Mascota
con los siguientes atributos públicos en el constructor:
• nombre, numPatas, raza
• Define dos clases hijas/subclases/derivadas de Mascota, llamadas Perro y Loro. A la
clase Perro añádele un atributo público patita (Boolean) para saber si el perro sabe dar
la pata o no y a Loro añádele el atributo público habla (Boolean) para indicar si saben
hablar (aunque puedan no todos saben hablar).

En la función main() crea los siguientes objetos:
• Un perro llamado “Lucky” de raza “bóxer” que sabe dar la patita.
• Un loro llamado “Andresito” de raza “cacatúa” que, como tal, sabe hablar.
• Obviamente habrá́ que indicar correctamente el número de patas en ambos objetos (y
sabemos que ninguna mascota ha sufrido amputaciones)
Surge la necesidad de guardar el precio sin IVA de las mascotas. ¿En qué clase sería correcto
añadir este nuevo atributo?
• Define este atributo en la clase apropiada y en dicha clase define también un método
llamado “pvp()” que calcule y devuelva el precio con el IVA añadido.
• “Lucky” se vende por 380€ y “Andresito” por 110€, precios sin IVA.
• Muestra por pantalla el pvp de las dos mascotas.
Una vez hecho esto convierte todos los atributos de la clase Mascota a privados. Después de
haber hecho esto tendremos varios errores en la función main(). ¿Por qué? ¿A que se deben
los errores? ¿ Como los solucionarías?

En la case Mascota, sobrescribe el método:
override fun toString(): String {
return super.toString()
}

Es un método heredado de clase padre Object (clase de Kotlin, padre de todas las clases). Este
método se utiliza para devolver en formato String una representación de los valores de los
atributos de una clase. Por defecto lo único que hace es mostrar el nombre de la clase y su
referencia en memoria.
fun main() {
val perro1 = Perro("Lucky", 4, "Boxer", true, 380f)
println(perro1)
}
Haz que el método toString() devuelva un String, con todos los valores de los atributos de la
clase Mascota.
Nota: Si una clase tiene implementado el método toString(), es posible imprimir directamente
un objeto. Ejemplo, suponiendo que “p” es un objeto de tipo Perro: println(p); , pues realmente
lo que hará Kotlin automáticamente, será: println(p.toString());
• Queremos que el método “toString()” aparte de mostrar todos los datos, cuando el
objeto sea de tipo Perro nos indique si da la patita o no y si el objeto es de tipo Loro
nos indique si habla o no.

o Para lograrlo, tendremos que redefinir/sobrescribir adecuadamente el método
“toString()” en las clases Perro y Loro. No olvides colocar la palabra reservada
Override. Para ello, llama en primer lugar al método del padre con la palabra
reservada super para obtener los datos de la clase padre Mascota.
• Queremos saber el color de las mascotas, añade este atributo en la clase que
corresponda y modifica todos los constructores para inicializar dicho atributo.
o Modifica también el método “toString()” para que muestre ahora también el
color.
o Ajusta ahora la creación de los objetos en el programa. “Lucky” es marrón y
“Andresito” verde.
o Comprueba que se visualizan correctamente todos los datos. */

fun main199() {
    val perro1 = Perro("Lucky", 4, "Boxer", true, 380f, "marrón")
    val loro1 = Loro("Andresito", 2, "cacatúa", true, 110f, "verde")

    println(perro1)
    println(loro1)
}

open class Mascota(private val nombre: String, private val numPatas: Int, private val raza: String, private val precio:Float, private val color: String){

    open fun pvp(): Float{
        val IVA: Float = 21/100f
        return (precio + precio*IVA)
    }

    override fun toString(): String {
        return "El nombre de la mascota es $nombre, con $numPatas patas, de raza $raza, el color es $color y precio ${pvp()} €"
    }

}

class Perro(nombre: String, numPatas: Int, raza: String, val patita: Boolean, precio: Float, color: String): Mascota(nombre,numPatas,raza,precio, color){

    override fun toString(): String {
        if (patita==true) return "${super.toString()} y sabe dar la patita"
        else return "${super.toString()} y no sabe dar la patita"
    }

}

class Loro(nombre: String, numPatas: Int, raza: String, val habla: Boolean, precio: Float, color: String): Mascota(nombre,numPatas,raza,precio, color){

    override fun toString(): String {
        if (habla==true) return "${super.toString()} y sabe hablar"
        else return "${super.toString()} y no sabe hablar"
    }

}



/*
La facturación del agua, puede ser de 2 tipos, con los siguientes elementos comunes:
    • No factura
    • Fecha (guardarla como String)
    • DNI-Cliente
    • Precio metro cúbico
    • Metros cúbicos consumidos
    • Importe por consumo = metros cúbicos consumidos x precio metro cúbico
    • Importe por saneamiento (uso del alcantarillado)
    • Importe por residuales (depuración de agua)
    • Total factura = importe consumo + importe saneamiento + importe residuales.

El primer tipo de factura, corresponde a facturas para familias numerosas de tipo A,
y este caso el total es la suma del consumo, pero con un descuento fijo del 20% en los importes de saneamiento y residuales .

El segundo tipo de factura, corresponde a familias numerosas de tipo B, y en este caso el total es la suma del consumo, pero
tienen un descuento fijo del 75% en el importe de saneamiento y otro fijo del 50% en el importe de residuales.

Diseña las clases que estimes oportunas.

En el programa crea tres facturas:
una para un cliente normal,otra para familia numerosade tipo A y otra para familia numerosa de tipo B,
con los datos que estimes oportunos.
Muestra su importe final y chequea que el cálculo sea correcto en los tres casos. */

fun main200(){
    val facturaN = Factura(3426271, "01-03-2022", "45454545F", 5.2f, 2.1f)
    val facturaA = TipoA(3426271, "01-03-2022", "45454545F", 5.2f, 2.1f)
    println(facturaN)
    println(facturaA)
}

open class Factura(private val nFactura: Int,
                   private val fecha: String,
                   private val DNICliente: String,
                   private val precioMetroCubico: Float,
                   val metrosCubicosConsumidos: Float){

    fun importeConsumo (): Float {
        return metrosCubicosConsumidos*precioMetroCubico
    }

    open fun importeSaneamiento(): Float {
        return metrosCubicosConsumidos*5.5f
    }

    open fun importeResiduales(): Float{
        return metrosCubicosConsumidos*2.25f
    }

    override fun toString(): String {
        return "El importe final es: ${importeConsumo()+importeSaneamiento()+importeResiduales()} €"
    }

}

class TipoA(nFactura: Int,
            fecha: String,
            DNICliente: String,
            precioMetroCubico: Float,
            metrosCubicosConsumidos: Float): Factura(nFactura, fecha, DNICliente, precioMetroCubico, metrosCubicosConsumidos) {

    override fun importeSaneamiento(): Float {
        return (metrosCubicosConsumidos*5.5f) - (metrosCubicosConsumidos*0.2f)
    }

    override fun importeResiduales(): Float {
        return (metrosCubicosConsumidos*2.25f) - (metrosCubicosConsumidos*0.2f)
    }
}



/*2. En una tienda de informática se guarda información de distintos componentes de ordenador, de todos ellos es necesario saber:

• Referencia(valor alfanumérico), precio y marca

• De los discos duros nos interesa saber:
o Capacidad en TB, tipo bus de datos (IDE, Serial Ata2, ...)

• De las tarjetas gráficas:
o Modelo,MemoriaenMB,tipodebus

• Crea las clases necesarias para guardar la información de estos productos.

• Se necesita un método al que se le pueda enviar un porcentaje de descuento por
consola(Ej. 0.18) y me calcule el precio final del componente, tras aplicarle ese descuento.
o Fórmula:preciocondescuentoaplicado=precio–precio*descuento.
o Declaraelmétodo,enlaclasequecorresponda.

• Para poder hacer cambios de unidades, declara donde sea preciso un método que
reciba una cantidad dada en MB y me la devuelva transformada en a GB.

• Se decide que a las tarjetas gráficas no se les puede aplicar descuento, por lo tanto, el
método que calcula el precio final tras aplicar el descuento, para las tarjetas gráficas devolverá́ siempre el precio original del componente, sin descuento.

En la función main():
• Crea los objetos según los datos de los siguientes componentes:
o DiscoDuro:referencia:“HD1050”,marca:“WesternDigital”,precio:118,77€,
capacidad: 2TB, bus: SATA3.

o Tarjetagráfica:referencia:”TG0004”,marca:“ASUS”,precio:131,28€,
modelo: “GTX550”, memoria: 1024 MB, bus: “PCI Express”.
• Muestra el precio de los dos componentes
• Utilizando el método creado, muestra el precio aplicándole un descuento del 15% a los dos componentes. Chequea que a la tarjeta gráfica no se le aplica como queríamos el descuento.

• Muestra la capacidad de memoria de la tarjeta gráfica en GB. (haciendo uso del método que realiza este cálculo).
• Necesito guardar la información del siguiente componente:

o Pendrive:referencia:”USB1001”,marca:“SanDisk”,precio:18€,capacidad:16GB.
o Crea un objeto con la información anterior del pendrive,muestra su precio
con un descuento de 10%. */

open class Componentes(private val referencia: String,
                       private val precio: Float,
                       private val marca: String){

    open fun precioFinal(descuento: Float): Float {
        return precio-precio*descuento
    }
}

class discosDuros(referencia: String,
                  precio: Float,
                  marca: String,
                  private val capacidad: Int,
                  private val tipoBus: String): Componentes(referencia,precio,marca){

}

class tarjetaGrafica(referencia: String,
                     precio: Float,
                     marca: String,
                     private val modelo: String,
                     private val memoria: Double,
                     private val tipoBus: String): Componentes(referencia,precio,marca){

    private var precio: Float = precio

    fun cambioGB (): Double {
        return memoria*0.00097
    }

    override fun precioFinal(descuento: Float): Float {
        return precio
    }
}

fun main201() {
    val componente1 = discosDuros("HD1050", 118.17f, "WesternDigital", 2, "SATA3" )
    val componente2 = tarjetaGrafica("TG0004", 131.28f, "ASUS", "GTX550", 1024.0, "PCI Express")
    println("${componente1.precioFinal(0.15f)}")
    println("${componente2.cambioGB()}")
    println("${componente2.precioFinal(0.15f)}")
}



/******************** CLASES ABSTRACTAS ********************/

/*Una empresa se dedica a alquilar barcos. Un BARCO se caracteriza por su matrícula, su eslora
y manga en metros y año de fabricación. Se pretende diferenciar la información de algunos
tipos de barcos:

• Número de mástiles para Veleros
• Potencia en CV para Embarcaciones deportivas a motor
• Potencia en CV y número de camarotes para Yates de lujo
El precio por día base de un alquiler de un barco es un precio por día común para todas las
embarcaciones que se establece en 40€, modificado con los siguientes incrementos:
• Veleros: 10€ x no de mástiles
• Embarcaciones deportivas: 15€ x no CV
• Yates de lujo: (15€ x no CV ) + (5€ x número de camarotes).
Los datos de un ALQUILER son el DNI del cliente, días de alquiler y el BARCO alquilado. El
alquiler se calcula como:
• Días de alquiler x precio por día alquiler barco
Usando clases, atributos privados y constructores que inicialicen todos los atributos, registrar
los siguientes alquileres y mostrar su precio final
• Alquiler 1:
o DNI cliente: “12345678Y”
o 5 días de alquiler
o Barco alquilado:
§ Velero de 3 mástiles:
• Matrícula: “3GI1199”
• Eslora: 70 metros y manga: 12 metros
• Año fabricación: 1980

• Alquiler 2:
o DNI cliente: “27654376T”
o 6 días de alquiler
o Barco alquilado:
§ Embarcación deportiva de 10 CV:
• Matrícula: “9XP1188”
• Eslora: 30 metros y manga: 5 metros
• Año fabricación: 1990

• Alquiler 3:
o DNI cliente: “378641985H”
o 3 días de alquiler
o Barco alquilado:
§ Yate de lujo de 18 CV y 3 camarotes:
• Matrícula: “6TK2476”
• Eslora: 40 metros y manga:10 metros
• Año fabricación: 1995
• Verifica que los precios por alquiler obtenidos son correctos. */

interface PrecioExtra{
    fun precioExtra(): Double
}

abstract class Barco(private val matricula: String,
                     private val eslora: Int,
                     private val manga: Int,
                     private val anoFabricacion: Int){

    var precioBase = 40.0

    abstract fun precioPorDia(): Double


}

class Veleros(matricula: String,
              eslora: Int,
              manga: Int,
              anoFabricacion: Int,
              private val mastiles:Int): Barco(matricula, eslora, manga, anoFabricacion), PrecioExtra {

    override fun precioPorDia(): Double {
        return precioBase+(10.0*mastiles)
    }

    override fun precioExtra(): Double { //método implementado por la interface PrecioExtra
        return precioPorDia()+5.0
    }

}

class EmbarcacionDeportiva (matricula: String,
                            eslora: Int,
                            manga: Int,
                            anoFabricacion: Int,
                            private val CV:Int): Barco(matricula, eslora, manga, anoFabricacion){

    override fun precioPorDia(): Double {
        return precioBase+(15*CV)
    }

}

class Yates (matricula: String,
             eslora: Int,
             manga: Int,
             anoFabricacion: Int,
             private val CV:Int,
             private val camarotes: Int): Barco(matricula, eslora, manga, anoFabricacion){

    override fun precioPorDia(): Double {
        return precioBase+(15*CV)+(5*camarotes)
    }

}

class Alquiler(private val DNI: String,
               private val diasAlquiler: Int,
               private val barco: Barco){

    fun alquiler():Double {
        return diasAlquiler*barco.precioPorDia()
    }
}

fun main202() {
    val velero = Veleros("3GI1199", 70, 12, 1980,3)
    val alquiler1 = Alquiler("12345678Y", 5, velero)
    println("${alquiler1.alquiler()}")
}




/* BARCOS */

fun main203() {
    val velero = Veleros("3GI1199", 70, 12, 1980,3)
    val alquiler1 = Alquiler("12345678Y", 5, velero)
    println("${alquiler1.alquiler()}")
}


interface PrecioExtra{
    fun precioExtra(): Double
}


abstract class Barco(private val matricula: String, private val eslora: Int, private val manga: Int, private val anoFabricacion: Int){

    var precioBase = 40.0
    abstract fun precioPorDia(): Double
}

class Veleros(matricula: String, eslora: Int, manga: Int, anoFabricacion: Int, private val mastiles:Int): Barco(matricula, eslora, manga, anoFabricacion), PrecioExtra{

    override fun precioPorDia(): Double {
        return precioBase+(10.0*mastiles)
    }

    override fun precioExtra(): Double { //método implementado por la interface PrecioExtra
        return precioPorDia()+5.0
    }
}


class EmbarcacionDeportiva (matricula: String, eslora: Int, manga: Int, anoFabricacion: Int, private val CV:Int): Barco(matricula, eslora, manga, anoFabricacion){

    override fun precioPorDia(): Double {
        return precioBase+(15*CV)
    }
}


class Yates (matricula: String, eslora: Int, manga: Int, anoFabricacion: Int, private val CV:Int, private val camarotes: Int): Barco(matricula, eslora, manga, anoFabricacion){

    override fun precioPorDia(): Double {
        return precioBase+(15*CV)+(5*camarotes)
    }

}


class Alquiler(private val DNI: String, private val diasAlquiler: Int, private val barco: Barco){

    fun alquiler():Double {
        return diasAlquiler*barco.precioPorDia()
    }
}


/* BARCOS 2.0 */

/*Con interfaz alquilable */

interface Alquilable {
    fun precioPorDia(): Float // equivalente a abstract fun precioPorDia(): Float
}

class MotoDeAgua(private val CV: Int): Alquilable{

    val precioBase: Float = 25f

    override fun precioPorDia():Float {
        return precioBase+(5*CV)
    }

}

abstract class Barco(private val matricula: String,
                     private val eslora: Int,
                     private val manga: Int,
                     private val anoFabricacion: Int): Alquilable{
    // No es necesario implementar el método abstracto
    val precioBase = 40f

}

class Veleros(matricula: String,
              eslora: Int,
              manga: Int,
              anoFabricacion: Int,
              private val mastiles:Int): Barco(matricula, eslora, manga, anoFabricacion){

    override fun precioPorDia(): Float {
        return precioBase+(10f*mastiles)
    }

}

class EmbarcacionDeportiva (matricula: String,
                            eslora: Int,
                            manga: Int,
                            anoFabricacion: Int,
                            private val CV:Int): Barco(matricula, eslora, manga, anoFabricacion){

    override fun precioPorDia(): Float {
        return precioBase+(15*CV)
    }

}

class Yates (matricula: String,
             eslora: Int,
             manga: Int,
             anoFabricacion: Int,
             private val CV:Int,
             private val camarotes: Int): Barco(matricula, eslora, manga, anoFabricacion){

    override fun precioPorDia(): Float {
        return precioBase+(15*CV)+(5*camarotes)
    }

}

class Alquiler(private val DNI: String,
               private val diasAlquiler: Int,
               private val alquilable: Alquilable){

    fun alquiler():Float {
        return diasAlquiler*alquilable.precioPorDia()
    }
}

fun main204() {
    val velero = Veleros("3GI1199", 70, 12, 1980,3)
    val motoAgua = MotoDeAgua(100)
    println(velero.precioPorDia())
    println(motoAgua.precioPorDia())

    val alquiler1 = Alquiler("4646464", 5, velero)
    println(alquiler1.alquiler())
}



/* BARCOS 3.0 */

fun main205() {
    val velero = Veleros("3GI1199", 70, 12, 1980,3)
    val alquiler1 = Alquiler("12345678Y", 5, velero)
    println("${alquiler1.alquiler()}")
}


interface PrecioExtra{
    fun precioExtra(): Double
}


abstract class Barco(private val matricula: String, private val eslora: Int, private val manga: Int, private val anoFabricacion: Int){

    var precioBase = 40.0
    abstract fun precioPorDia(): Double
}

class Veleros(matricula: String, eslora: Int, manga: Int, anoFabricacion: Int, private val mastiles:Int): Barco(matricula, eslora, manga, anoFabricacion), PrecioExtra{

    override fun precioPorDia(): Double {
        return precioBase+(10.0*mastiles)
    }

    override fun precioExtra(): Double { //método implementado por la interface PrecioExtra
        return precioPorDia()+5.0
    }
}


class EmbarcacionDeportiva (matricula: String, eslora: Int, manga: Int, anoFabricacion: Int, private val CV:Int): Barco(matricula, eslora, manga, anoFabricacion){

    override fun precioPorDia(): Double {
        return precioBase+(15*CV)
    }
}


class Yates (matricula: String, eslora: Int, manga: Int, anoFabricacion: Int, private val CV:Int, private val camarotes: Int): Barco(matricula, eslora, manga, anoFabricacion){

    override fun precioPorDia(): Double {
        return precioBase+(15*CV)+(5*camarotes)
    }

}


class Alquiler(private val DNI: String, private val diasAlquiler: Int, private val barco: Barco){

    fun alquiler():Double {
        return diasAlquiler*barco.precioPorDia()
    }
}



/* BARCOS 2.0 */

interface Alquilable {
    fun precioPorDia(): Float // equivalente a abstract fun precioPorDia(): Float
}

class MotoDeAgua(private val CV: Int): Alquilable{

    val precioBase: Float = 25f

    override fun precioPorDia():Float {
        return precioBase+(5*CV)
    }

}


abstract class Barco(private val matricula: String,
                     private val eslora: Int,
                     private val manga: Int,
                     private val anoFabricacion: Int): Alquilable{
    // No es necesario implementar el método abstracto
    val precioBase = 40f

}

class Veleros(matricula: String,
              eslora: Int,
              manga: Int,
              anoFabricacion: Int,
              private val mastiles:Int): Barco(matricula, eslora, manga, anoFabricacion){

    override fun precioPorDia(): Float {
        return precioBase+(10f*mastiles)
    }

}
class EmbarcacionDeportiva (matricula: String,
                            eslora: Int,
                            manga: Int,
                            anoFabricacion: Int,
                            private val CV:Int): Barco(matricula, eslora, manga, anoFabricacion){

    override fun precioPorDia(): Float {
        return precioBase+(15*CV)
    }

}

class Yates (matricula: String,
             eslora: Int,
             manga: Int,
             anoFabricacion: Int,
             private val CV:Int,
             private val camarotes: Int): Barco(matricula, eslora, manga, anoFabricacion){

    override fun precioPorDia(): Float {
        return precioBase+(15*CV)+(5*camarotes)
    }

}

class Alquiler(private val DNI: String,
               private val diasAlquiler: Int,
               private val alquilable: Alquilable){

    fun alquiler():Float {
        return diasAlquiler*alquilable.precioPorDia()
    }
}

fun main206() {
    val velero = Veleros("3GI1199", 70, 12, 1980,3)
    val motoAgua = MotoDeAgua(100)
    println(velero.precioPorDia())
    println(motoAgua.precioPorDia())

    val alquiler1 = Alquiler("4646464", 5, velero)
    println(alquiler1.alquiler())
}



/* Estamos interesados en guardar información sobre los Animales que emiten sonidos característicos.
De los Animales, en general me interesa saber la siguiente información:
* Raza, sexo, número de patas
Crear un método llamado grito que me devuelva la onomatopeya del grito de
un animal específico: Ej.: Perro ”guau”
De los Perros a mayores me interesa saber:
* Si es o no un perro peligroso
* Si está o no adiestrado
Del Pato a mayores me interesa saber:
* Si tiene o no un plumaje exótico
En el futuro se prevé añadir más clases y todas deberán implementar obligatoriamente el método grito debidamente personalizado.
Diseña las clases oportunamente. Los constructores inicializarán todos los atributos de las clases. */

fun main207() {
    val perro1 = Perros("Border Collie", "Femenino", 4, false, true)
    perro1.grito()
    perro1.adiestrado()
    perro1.peligroso()

    val animales1 = arrayOf(Perros("Border Collie", "Femenino", 4, false, true),
            Pato("Rosado", "Masculino", 2, true))

    for(i in animales1)
        i.grito()
}

abstract class Animales (raza:String, sexo: String, numeroPatas: Int){
}

interface Grito {
    val grito: String
    fun grito()
}

class Perros(raza:String, sexo: String, numeroPatas: Int, val peligroso: Boolean, val adiestrado: Boolean ): Animales(raza, sexo, numeroPatas), Grito {

    override val grito: String
        get() = "guau"

    override fun grito() {
        println("El perro hace $grito")
    }

    fun peligroso() {
        if (peligroso == true) println("El perro es peligroso")
        else println("El perro no es peligroso")
    }

    fun adiestrado() {
        if (adiestrado == true) println("El perro está adiestrado")
        else println("El perro no está adiestrado")
    }
}

class Pato(raza:String, sexo: String, numeroPatas: Int, val plumajeExotico: Boolean): Animales(raza, sexo, numeroPatas), Grito {

    override val grito: String
        get() = "quack"

    override fun grito() {
        println("El pato hace $grito")
    }

    fun plumaje() {
        if (plumajeExotico == true) println("El pato tiene plumaje exótico")
        else println("El pato tiene plumaje exótico")
    }

}

class Gatos (raza:String, sexo: String, numeroPatas: Int): Animales(raza, sexo, numeroPatas), Grito {
    override val grito: String
        get() = "miau"

    override fun grito() {
        println("El gato hace $grito")
    }

}


/* Lista */

fun main208(){

    var listaArtistas = mutableListOf<Artista>()

    var juanes = Artista("Juanes", "Colombia", 1980)
    listaArtistas.add(Artista("Shakira", "Colombia", 1985))
    listaArtistas.add(juanes)

    for(i in listaArtistas){
        println(i.verDatos())
    }
}

class Artista (private var nombre: String, private var pais: String, private var anhoNacimiento: Int) {

    fun getNombre(): Int {
        return nombre.length
    }

    fun getPais(): String {
        return pais
    }

    fun getAnhoNacimiento(): Int {
        return anhoNacimiento
    }

    fun edad(): Int {
        return 2022 - anhoNacimiento
    }
    fun verDatos() {
        println("Artista: $nombre")
        println("Pais: $pais")
        println("Año nacimiento: $anhoNacimiento")
        println("Edad: ${edad()}")
    }
}


/* Lista */

enum class Semana (private val indice: Int, private val abreviatura: String){
    LUNES(1,"Lu"),
    MARTES(2, "Ma"),
    MIERCOLES(3, "Mier"),
    JUEVES(4, "Ju"),
    VIERNES(5, "Vi");

    fun abreviatura(): String {
        return when (this){
            LUNES -> LUNES.abreviatura
            MARTES -> MARTES.abreviatura
            else -> "False"
        }
    }

    override fun toString(): String {
        return "$indice, $abreviatura"
    }
}


class Mes (private val indice: Int, private val semana: Semana){

    fun diaSemana() : String {
        return when (semana){
            Semana.LUNES -> "Lunes"
            Semana.MARTES -> "Martes"
            else -> "Resto semana"
        }
    }

fun main209() {
    //println(Semana.JUEVES.abreviatura())

    var arraySemana = Semana.values()

    for (i in arraySemana)
        println(i.toString())

    val eneroLunes = Mes(1, Semana.LUNES)
}


/******************** CLASES ABSTRACTAS ********************/

/*Una empresa se dedica a alquilar barcos. Un BARCO se caracteriza por su matrícula, su eslora
y manga en metros y año de fabricación. Se pretende diferenciar la información de algunos
tipos de barcos:

• Número de mástiles para Veleros
• Potencia en CV para Embarcaciones deportivas a motor
• Potencia en CV y número de camarotes para Yates de lujo
El precio por día base de un alquiler de un barco es un precio por día común para todas las
embarcaciones que se establece en 40€, modificado con los siguientes incrementos:
• Veleros: 10€ x no de mástiles
• Embarcaciones deportivas: 15€ x no CV
• Yates de lujo: (15€ x no CV ) + (5€ x número de camarotes).
Los datos de un ALQUILER son el DNI del cliente, días de alquiler y el BARCO alquilado. El
alquiler se calcula como:
• Días de alquiler x precio por día alquiler barco
Usando clases, atributos privados y constructores que inicialicen todos los atributos, registrar
los siguientes alquileres y mostrar su precio final
• Alquiler 1:
o DNI cliente: “12345678Y”
o 5 días de alquiler
o Barco alquilado:
§ Velero de 3 mástiles:
• Matrícula: “3GI1199”
• Eslora: 70 metros y manga: 12 metros
• Año fabricación: 1980

• Alquiler 2:
o DNI cliente: “27654376T”
o 6 días de alquiler
o Barco alquilado:
§ Embarcación deportiva de 10 CV:
• Matrícula: “9XP1188”
• Eslora: 30 metros y manga: 5 metros
• Año fabricación: 1990

• Alquiler 3:
o DNI cliente: “378641985H”
o 3 días de alquiler
o Barco alquilado:
§ Yate de lujo de 18 CV y 3 camarotes:
• Matrícula: “6TK2476”
• Eslora: 40 metros y manga:10 metros
• Año fabricación: 1995
• Verifica que los precios por alquiler obtenidos son correctos. */

fun main210() {
    var velero1 = Velero("3GI1199",70,12,1980,3)
    var deportivo1 = Deportivo("27654376T",30,5,1990,10)
    var yate1 = Yate("378641985H",40,10,1995,18,3)

    var alquilerVelero = Alquiler("33445566D",5, velero1)
    var alquilerDeportivo = Alquiler("22118877M",6, deportivo1)
    var alquilerYate = Alquiler("44557788N", 3, yate1)

    velero1.verDatos()
    deportivo1.verDatos()
    yate1.verDatos()

    println("")

    println("${alquilerVelero.verDatos()} tratándose de un velero")
    println("${alquilerDeportivo.verDatos()} tratándose de un deportivo")
    println("${alquilerYate.verDatos()} tratándose de un yate")
}

//SUPERCLASE:
abstract class Barco constructor(private var matricula:String, private var eslora:Int, private var manga:Int, private var anoFabricacion:Int) {

    open fun precioDia():Int {
        var precio = 40
        return precio
    }

    abstract fun verDatos()
}


//subclase:
class Velero constructor(matricula: String, eslora: Int, manga: Int, anoFabricacion: Int, private var mastil:Int):Barco(matricula, eslora, manga, anoFabricacion) {

    override fun precioDia():Int {
        return super.precioDia() + (mastil * 10)
    }

    override fun verDatos() {
        println("El precio por día de un velero es de: ${precioDia()}€")
    }
}


//subclase:
class Deportivo constructor(matricula: String, eslora: Int, manga: Int, anoFabricacion: Int, private var potencia:Int):Barco(matricula, eslora, manga, anoFabricacion) {

    override fun precioDia():Int {
        return super.precioDia() + (potencia * 15)
    }

    override fun verDatos() {
        println("El precio por día de un deportivo es de: ${precioDia()}€")
    }
}


//subclase:
class Yate constructor(matricula: String, eslora: Int, manga: Int, anoFabricacion: Int, private var potencia:Int, private var camarotes:Int):Barco(matricula, eslora, manga, anoFabricacion) {

    override fun precioDia():Int {
        return super.precioDia() + ((potencia * 15) + (5 * camarotes))
    }

    override fun verDatos() {
        println("El precio por día de un yate es de: ${precioDia()}€")
    }
}


//clase:
class Alquiler constructor(private var dni:String, private var diasAlquiler:Int, private var barco:Barco) {

    fun Alquiler():Int {
        var alquiler = diasAlquiler * (barco.precioDia())
        return alquiler
    }

    fun verDatos():String {
        return "El precio del alquiler es ${Alquiler()} €"
    }
}



/* 1. Diseña una clase Cuadrado con los siguientes miembros(los atributos serán
privados):
• lado
• área=lado^2
• perímetro=4*lado
Diseña una clase Rectángulo con los siguientes miembros(los atributos serán privados):
• base, altura
• área=base*altura
• perímetro=2*base + 2*altura
Si analizamos detenidamente las clases vemos que las dos tienen en común los
métodos área y perímetro. Para otras figuras ocurrirá lo mismo, y nos interesa que
todas tengan el mismo nombre de método para calcular el área y el perímetro pero
lógicamente siempre distinta implementación, por lo que deducimos que Cuadrado y
Rectángulo deberían heredar de una clase Padre llamada Figura con los siguientes
métodos:
• área y perímetro
Dado que en la clase Figura no se puede establecer el código de los métodos área y
perímetro, puesto que no tiene sentido en esta clase, habrá que declararlos como
abstractos (abstract) y consecuentemente la clase Figura deberá ser abstracta.
Crea ahora una clase llamada Círculo que herede de Figura. Completa el código de la
clase Círculo para que sea correcta y poder compilar el proyecto (área=PI*radio*radio
y perímetro=2*PI*radio).
• Crea los constructores en las clases para inicializar todos los atributos.
• En la función main():
o Crea tres objetos, un cuadrado, un rectángulo y un círculo. ¿Se podría
crear un objeto de Figura? ¿Por qué?
o Crea un array de 3 celdas de tipo Figura y guarda en el mismo los tres
objetos anteriormente creados.
o Recorre el array con un bucle for y muestra por pantalla las áreas y los
perímetros de todas las figuras.
o Sin haber hecho que las clases Cuadrado, Rectángulo y Círculo
heredasen de Figura, ¿podríamos asegurar que el código del punto
anterior funcionaría bien para cualquier tipo de figura almacenada en el
array?. La respuesta a esta pregunta es la ventaja del uso de clases
abstractas. */

fun main211() {
    var circulo = Circulo(5.5)
    var cuadrado = Cuadrado(3.0)
    var rectangulo = Rectangulo(6.0,4.0)

    val array: Array<Figura> = arrayOf(circulo, cuadrado, rectangulo)

    for (i in array) {
        println("El area del ${i.nombre()} es: ${i.area()}")
        println("El perimetro del ${i.nombre()} es: ${i.perimetro()}")
    }
}


abstract class Figura() {

    abstract fun area():Double
    abstract fun perimetro():Double
    abstract fun nombre():String //para que salga el nombre del círculo, cuadrado y rectángulo

}

class Circulo(private var radio:Double):Figura() {

    override fun area():Double {
        var pi = 3.1416
        var area = pi * radio * radio
        return area
    }

    override fun perimetro():Double {
        var pi = 3.1416
        var perimetro = 2 * pi * radio
        return perimetro
    }

    override fun nombre(): String {
        return "Circulo"
    }
}

class Cuadrado constructor(private var lado:Double):Figura() {

    override fun area():Double {
        var area = lado * lado
        return area
    }

    override fun perimetro():Double {
        var perimetro = lado * 4
        return perimetro
    }

    override fun nombre(): String {
        return "Cuadrado"
    }
}

class Rectangulo constructor(private var base:Double, private var altura:Double):Figura() {

    override fun area():Double {
        var area = base * altura
        return area
    }

    override fun perimetro():Double {
        var perimetro = (2*base) + (2*altura)
        return perimetro
    }

    override fun nombre(): String {
        return "Rectangulo"
    }
}




/* Haz un duplicado del proyecto anterior y transforma clase Figura en una interfaz ,
pero obliga igualmente al resto de las clases a implementar los métodos área y
perímetro */
//Con Interfaces

fun main212() {
    var circulo = Circulo(5.5)
    var cuadrado = Cuadrado(3.0)
    var rectangulo = Rectangulo(6.0,4.0)

    val array: Array<Figura> = arrayOf(circulo, cuadrado, rectangulo)

    for (i in array) {
        println("El area del ${i.nombre()} es: ${i.area()}")
        println("El perimetro del ${i.nombre()} es: ${i.perimetro()}")
    }
}


interface Figura {
    fun area():Double
    fun perimetro():Double
    fun nombre():String //para que salga el nombre del círculo, cuadrado y rectángulo

}


class Circulo(private var radio:Double):Figura {

    override fun area():Double {
        var pi = 3.1416
        var area = pi * radio * radio
        return area
    }

    override fun perimetro():Double {
        var pi = 3.1416
        var perimetro = 2 * pi * radio
        return perimetro
    }

    override fun nombre(): String {
        return "Circulo"
    }
}


class Cuadrado constructor(private var lado:Double):Figura {

    override fun area():Double {
        var area = lado * lado
        return area
    }

    override fun perimetro():Double {
        var perimetro = lado * 4
        return perimetro
    }

    override fun nombre(): String {
        return "Cuadrado"
    }
}


class Rectangulo constructor(private var base:Double, private var altura:Double):Figura {

    override fun area():Double {
        var area = base * altura
        return area
    }

    override fun perimetro():Double {
        var perimetro = (2*base) + (2*altura)
        return perimetro
    }

    override fun nombre(): String {
        return "Rectangulo"
    }
}



/* Estamos interesados en guardar información sobre los Animales que emiten sonidos característicos.
De los Animales, en general me interesa saber la siguiente información:
* Raza, sexo, número de patas
Crear un método llamado grito que me devuelva la onomatopeya del grito de
un animal específico: Ej.: Perro ”guau”
De los Perros a mayores me interesa saber:
* Si es o no un perro peligroso
* Si está o no adiestrado
Del Pato a mayores me interesa saber:
* Si tiene o no un plumaje exótico
En el futuro se prevé añadir más clases y todas deberán implementar obligatoriamente el método grito debidamente personalizado.
Diseña las clases oportunamente. Los constructores inicializarán todos los atributos de las clases. */

fun main213() {
    val perro = Perro1("Golden Retriever",false,true,"Epi")
    val pato = Pato1("Swedish Blue",true,"Paquito")

    val array= arrayOf(perro, pato)

    for (i in array) {
        println("${i.nombre()} de raza ${i.raza()} ${i.grito()} ${i.verDatos()}")
    }
}


abstract class Animales() {

    abstract fun grito():String
    abstract fun nombre():String
    abstract fun raza():String
    abstract fun verDatos():String
}


class Perro1(private var raza:String, private var peligroso:Boolean, var adiestrado:Boolean, var nombre:String): Animales() {

    override fun grito():String {
        var grito = "hace guau,"

        return grito
    }

    override fun nombre():String {
        return nombre
    }

    override fun raza():String {
        return raza
    }

    fun peligroso():String {
        if (peligroso == true) return ("es peligroso, ")
        else return ("no es peligroso,")
    }

    fun adiestrado():String {
        if (adiestrado == true) return ("está adiestrado.")
        else return ("no está adiestrado.")
    }

    override fun verDatos(): String {
        return "${peligroso()} ${adiestrado()}"
    }
}


class Pato1(private var raza:String, private var plumajeExotico:Boolean, private var nombre:String): Animales() {

    override fun grito():String {
        var grito = "hace cuak,"
        return  grito
    }

    override fun nombre():String {
        return nombre
    }

    override fun raza(): String {
        return raza
    }

    fun plumajeExotico():String {
        if (plumajeExotico == true) return("tiene plumaje exótico.")
        else return ("no tiene plumaje exótico.")
    }

    override fun verDatos(): String {
        return plumajeExotico()
    }
}



/* Añade al proyecto anterior una clase llamada Robot, como no tiene nada que ver
con la clase Animales no deberá heredar de ella, sin embargo queremos obligar a
que esta implemente el método grito también en esta clase. Haz los cambios
oportunos en el proyecto para exigir la implementación del mencionado método
en todas las clases del proyecto.
• Añade una celda más al array y guarda un objeto de tipo Robot.
• Recorre el array y muestra los gritos de cada objeto. */

fun main214() {
    var perro = Perro("Golden Retriever",false,true,"Epi")
    var pato = Pato("Swedish Blue",true,"Paquito")
    var robot = Robot("R2")

    val array = arrayOf(perro, pato, robot)

    for (i in array) {
        println("${i.nombre()} ${i.grito()} ${i.verDatos()}")
    }
}

abstract class Animal() {

    abstract fun raza():String
}


interface grito {
    fun nombre():String
    fun grito():String
    fun verDatos():String
}


class Perro(private var raza:String, private var peligroso:Boolean, var adiestrado:Boolean, var nombre:String):Animal(), grito {

    //ABSTRACT:
    override fun raza():String {
        return raza
    }

    //INTERFACE:
    override fun nombre():String {
        return nombre
    }

    override fun grito():String {
        var grito = "hace guau,"
        return grito
    }

    override fun verDatos(): String {
        return "${peligroso()} ${adiestrado()}"
    }

    //funciones:
    fun peligroso():String {
        if (peligroso == true) return ("es peligroso,")
        else return ("no es peligroso,")
    }

    fun adiestrado():String {
        if (adiestrado == true) return ("está adiestrado.")
        else return ("no está adiestrado.")
    }
}


class Pato(private var raza:String, private var plumajeExotico:Boolean, private var nombre:String):Animal(), grito {

    //ABSTRACT:
    override fun raza(): String {
        return raza
    }

    //INTERFACE:
    override fun nombre():String {
        return nombre
    }

    override fun grito():String {
        var grito = "hace cuak,"
        return  grito
    }

    override fun verDatos(): String {
        return plumajeExotico()
    }

    //funciones:
    fun plumajeExotico():String {
        if (plumajeExotico == true) return("tiene plumaje exótico.")
        else return ("no tiene plumaje exótico.")
    }
}


class Robot(private var nombre:String):grito {

    //INTERFACE:
    override fun nombre(): String {
        return nombre
    }

    override fun grito(): String {
        return "hace wiiiiii,"
    }

    override fun verDatos(): String {
        return "y es de nueva generación."
    }
}



/* Estamos interesados en guardar información sobre los Animales que emiten sonidos característicos.
De los Animales, en general me interesa saber la siguiente información:
* Raza, sexo, número de patas
Crear un método llamado grito que me devuelva la onomatopeya del grito de
un animal específico: Ej.: Perro ”guau”
De los Perros a mayores me interesa saber:
* Si es o no un perro peligroso
* Si está o no adiestrado
Del Pato a mayores me interesa saber:
* Si tiene o no un plumaje exótico
En el futuro se prevé añadir más clases y todas deberán implementar obligatoriamente el método grito debidamente personalizado.
Diseña las clases oportunamente. Los constructores inicializarán todos los atributos de las clases. */

/* Añade al proyecto anterior una clase llamada Robot, como no tiene nada que ver
con la clase Animales no deberá heredar de ella, sin embargo queremos obligar a
que esta implemente el método grito también en esta clase. Haz los cambios
oportunos en el proyecto para exigir la implementación del mencionado método
en todas las clases del proyecto.
• Añade una celda más al array y guarda un objeto de tipo Robot.
• Recorre el array y muestra los gritos de cada objeto. */

fun main215() {

    var perro = Perro("Golden","Macho",4,false,true)
    var pato = Pato("Azulon","Hembra",2,true)
    var robot = Robot("Walli")

    //println("El perro de raza ${perro.raza()} hace ${perro.grito()}")
    //println("El Pato de raza ${pato.raza()} hace ${pato.grito()}")
    //println("El robot hace ${robot.grito()}")

    var array = arrayOf(perro,pato,robot)

    for(i in array) {
        println("${i.raza()} hace ${i.grito()} ")
    }
}

abstract class Animal() {
    abstract fun raza():String
}

interface grito {
    fun grito():String
    fun raza():String

}

class Perro(private var raza:String, private var sexo:String, private var numPatas:Int, private var peligroso:Boolean, private var adiestrado:Boolean):Animal(), grito {

    override fun grito():String {
        return "guau"
    }

    override fun raza():String {
        return raza
    }
}


class Pato(private var raza:String, private var sexo:String, private var numPatas:Int, private var plumajeExotico:Boolean):Animal(), grito {

    override fun grito():String {
        return "cuack"
    }

    override fun raza():String {
        return raza
    }
}

class Robot(private var nombre:String): grito {

    override fun grito():String {
        return "wiiii"
    }

    override fun raza(): String {
        return "Robot"
    }
}



/* Estamos interesados en guardar información sobre los Animales que emiten sonidos característicos.
De los Animales, en general me interesa saber la siguiente información:
* Raza, sexo, número de patas
Crear un método llamado grito que me devuelva la onomatopeya del grito de
un animal específico: Ej.: Perro ”guau”
De los Perros a mayores me interesa saber:
* Si es o no un perro peligroso
* Si está o no adiestrado
Del Pato a mayores me interesa saber:
* Si tiene o no un plumaje exótico
En el futuro se prevé añadir más clases y todas deberán implementar obligatoriamente el método grito debidamente personalizado.
Diseña las clases oportunamente. Los constructores inicializarán todos los atributos de las clases. */

/* Añade al proyecto anterior una clase llamada Robot, como no tiene nada que ver
con la clase Animales no deberá heredar de ella, sin embargo queremos obligar a
que esta implemente el método grito también en esta clase. Haz los cambios
oportunos en el proyecto para exigir la implementación del mencionado método
en todas las clases del proyecto.
• Añade una celda más al array y guarda un objeto de tipo Robot.
• Recorre el array y muestra los gritos de cada objeto. */

fun main216() {
    var perro = Perro("Golden","Macho",4,false,true)
    var pato = Pato("Azulon","Hembra",2,true)
    var robot = Robot("Walli")

    //println("El perro de raza ${perro.raza()} hace ${perro.grito()}")
    //println("El Pato de raza ${pato.raza()} hace ${pato.grito()}")
    //println("El robot hace ${robot.grito()}")

    var array = arrayOf(perro,pato,robot)

    for(i in array) {
        println("${i.raza()} hace ${i.grito()} ")
    }
}

abstract class Animal() {
    abstract fun raza():String
}

interface grito {
    fun grito():String
    fun raza():String
}

class Perro(private var raza:String, private var sexo:String, private var numPatas:Int, private var peligroso:Boolean, private var adiestrado:Boolean):Animal(), grito {

    override fun grito():String {
        return "guau"
    }

    override fun raza():String {
        return raza
    }
}


class Pato(private var raza:String, private var sexo:String, private var numPatas:Int, private var plumajeExotico:Boolean):Animal(), grito {

    override fun grito():String {
        return "cuack"
    }

    override fun raza():String {
        return raza
    }
}

class Robot(private var nombre:String): grito {

    override fun grito():String {
        return "wiiii"
    }

    override fun raza(): String {
        return "Robot"
    }
}



/******************** HERENCIA ********************/

/*
Crea una clase Persona que contenga los siguientes atributos en su
constructor:
• DNI
• Nombre
• Apellidos
• Edad
En la clase escribir un método que compruebe si la persona es o no mayor
de edad.

Crea una segunda clase Empleado que contenga los mismos atributos que
la clase Persona y además contenga el atributo salarioBruto.
En esta clase escribir además del método para que compruebe si el
empleado es mayor de edad o no, añadir un método en el se obtenga el
salarioNeto (salarioNeto = salarioBruto – salarioBruto*0.12).
1) Realiza el ejercicio sin herencias.
2) Realiza el ejercicio de modo que la clase Empleado herede de la
clase Persona. */

//Con herencias
fun main217() {
    var persona1 = Persona0("33276644D","Pepolo","Domínguez",33)
    var empleado1 = Empleado0("33556455M","María","Gómez",23,1050.50)

    persona1.imprimir()
    persona1.mayorEdad()
    empleado1.imprimir()
}

//Superclase:
open class Persona0 constructor(var dni:String, var nombre:String, var apellidos:String, var edad:Int) {

    open fun mayorEdad():String {
        if(edad < 18) { println("Es menor de edad.")
        } else println("Es mayor de edad.")

        return edad.toString()
    }

    open fun imprimir() {
        println("$nombre $apellidos con dni $dni tiene $edad años.")
    }
}

//Empleado hereda de Persona:
open class Empleado0 constructor(dni:String, nombre:String, apellidos:String, edad:Int, var salarioBruto:Double): Persona0(dni,nombre,apellidos,edad) {

    override fun mayorEdad():String {
        if(edad < 18) {
            println("Es menor de edad")
        } else println("No es menor de edad")
        return edad.toString()
    }

    open fun salarioNeto():String {

        var salarioNeto = salarioBruto - (salarioBruto*0.12)

        return salarioNeto.toString()
    }

    override fun imprimir() {
        println("$nombre $apellidos con dni $dni tiene $edad años y tiene un salario neto de ${salarioNeto()}.")
    }
}



/* Para gestionar una tienda de mascotas, define una clase padre/superclase llamada Mascota
con los siguientes atributos públicos en el constructor:
• nombre, numPatas, raza
• Define dos clases hijas/subclases/derivadas de Mascota, llamadas Perro y Loro. A la
clase Perro añádele un atributo público patita (Boolean) para saber si el perro sabe dar
la pata o no y a Loro añádele el atributo público habla (Boolean) para indicar si saben
hablar (aunque puedan no todos saben hablar).

En la función main() crea los siguientes objetos:
• Un perro llamado “Lucky” de raza “bóxer” que sabe dar la patita.
• Un loro llamado “Andresito” de raza “cacatúa” que, como tal, sabe hablar.
• Obviamente habrá́ que indicar correctamente el número de patas en ambos objetos (y
sabemos que ninguna mascota ha sufrido amputaciones)
Surge la necesidad de guardar el precio sin IVA de las mascotas. ¿En qué clase sería correcto
añadir este nuevo atributo?
• Define este atributo en la clase apropiada y en dicha clase define también un método
llamado “pvp()” que calcule y devuelva el precio con el IVA añadido.
• “Lucky” se vende por 380€ y “Andresito” por 110€, precios sin IVA.
• Muestra por pantalla el pvp de las dos mascotas.
Una vez hecho esto convierte todos los atributos de la clase Mascota a privados. Después de
haber hecho esto tendremos varios errores en la función main(). ¿Por qué? ¿A que se deben
los errores? ¿ Como los solucionarías?

En la case Mascota, sobrescribe el método:
override fun toString(): String {
return super.toString()
}

Es un método heredado de clase padre Object (clase de Kotlin, padre de todas las clases). Este
método se utiliza para devolver en formato String una representación de los valores de los
atributos de una clase. Por defecto lo único que hace es mostrar el nombre de la clase y su
referencia en memoria.
fun main() {
val perro1 = Perro("Lucky", 4, "Boxer", true, 380f)
println(perro1)
}
Haz que el método toString() devuelva un String, con todos los valores de los atributos de la
clase Mascota.
Nota: Si una clase tiene implementado el método toString(), es posible imprimir directamente
un objeto. Ejemplo, suponiendo que “p” es un objeto de tipo Perro: println(p); , pues realmente
lo que hará Kotlin automáticamente, será: println(p.toString());
• Queremos que el método “toString()” aparte de mostrar todos los datos, cuando el
objeto sea de tipo Perro nos indique si da la patita o no y si el objeto es de tipo Loro
nos indique si habla o no.

o Para lograrlo, tendremos que redefinir/sobrescribir adecuadamente el método
“toString()” en las clases Perro y Loro. No olvides colocar la palabra reservada
Override. Para ello, llama en primer lugar al método del padre con la palabra
reservada super para obtener los datos de la clase padre Mascota.
• Queremos saber el color de las mascotas, añade este atributo en la clase que
corresponda y modifica todos los constructores para inicializar dicho atributo.
o Modifica también el método “toString()” para que muestre ahora también el
color.
o Ajusta ahora la creación de los objetos en el programa. “Lucky” es marrón y
“Andresito” verde.
o Comprueba que se visualizan correctamente todos los datos. */

fun main218() {
    var perro1 = Perroo("Lucky", 4,"Boxer",380.0, "Marrón", true)
    var loro1 = Loroo("Andresito", 2, "cacatúa",110.0, "Verde", true)

    //perro1.verDatos()
    //loro1.verDatos()

    println(perro1.toString())
    println(loro1.toString())

    println("El precio del perro es ${perro1.pvp()}")
    println("El precio del loro es ${loro1.pvp()}")
}


//SUPERCLASE:
open class Mascota constructor(private var nombre:String, private var numPatas:Int, private var raza:String, private var precio:Double, private var color:String) {

    fun pvp():String {
        var pvp = precio + (precio*0.21)

        return pvp.toString()
    }

    override fun toString(): String {
        return "Nombre de la mascota: $nombre, nº de patas: $numPatas, raza: $raza, precio: $precio, pvp: ${pvp()}, color: $color,"
    }
}


//Clase Hija:
open class Perroo constructor(nombre:String, numPatas: Int, raza: String, precio:Double, color:String, public var patita:Boolean):Mascota(nombre, numPatas, raza, precio, color) {

    /* fun verDatos() {
         println("$nombre, $numPatas, $raza, $precio, $patita, ${pvp()}")
     } */

    override fun toString(): String {
        return "${super.toString()} da la patita: $patita."
    }
}

//Clase Hija:
open class Loroo constructor(nombre:String, numPatas: Int, raza: String, precio:Double, color: String, public var habla:Boolean):Mascota(nombre, numPatas, raza, precio, color) {

    override fun toString(): String {
        return "${super.toString()} va a hablar: $habla"
    }
}



/* La facturación del agua, puede ser de 2 tipos, con los siguientes elementos comunes:
    • No factura
    • Fecha (guardarla como String)
    • DNI-Cliente
    • Precio metro cúbico
    • Metros cúbicos consumidos
    • Importe por consumo = metros cúbicos consumidos x precio metro cúbico
    • Importe por saneamiento (uso del alcantarillado)
    • Importe por residuales (depuración de agua)
    • Total factura = importe consumo + importe saneamiento + importe residuales.

El primer tipo de factura, corresponde a facturas para familias numerosas de tipo A,
y este caso el total es la suma del consumo, pero con un descuento fijo del 20% en los importes de saneamiento y residuales .

El segundo tipo de factura, corresponde a familias numerosas de tipo B, y en este caso el total es la suma del consumo, pero
tienen un descuento fijo del 75% en el importe de saneamiento y otro fijo del 50% en el importe de residuales.

Diseña las clases que estimes oportunas.

En el programa crea tres facturas:
una para un cliente normal,otra para familia numerosade tipo A y otra para familia numerosa de tipo B,
con los datos que estimes oportunos.
Muestra su importe final y chequea que el cálculo sea correcto en los tres casos. */

fun main219() {
    var facturaA = FamiliaNumerosaA(1,2022,"33445666D")
    var facturaB = FamiliaNumerosaB(2,2021,"22775666M")
    var facturaNormal = Factura(3,2020, "33569822N")

    facturaA.imprimir()
    facturaB.imprimir()
    facturaNormal.imprimir()
}


//SUPERCLASE:
open class Factura constructor(var numFactura:Int, var fecha:Int, var dniCliente:String) {
    var m3Precio: Double = 5.0
    var m3Consumidos: Double = 56.0
    var importeConsumo: Double = 3.0
    var importeSaneamiento: Double = 6.0
    var importeResidual: Double = 7.0
    var total: Double = 0.0

    open fun descuentoSaneamiento(): Double {
        var porcentajeDescuento = 0.0
        var descuento = importeSaneamiento - (importeSaneamiento * porcentajeDescuento)
        return descuento.toDouble()
    }

    open fun descuentoResidual(): Double {
        var porcentajeDescuento = 0.0
        var descuento = importeResidual - (importeResidual * porcentajeDescuento)
        return descuento.toDouble()
    }

    open fun total(): String {
        importeConsumo = m3Precio * m3Consumidos
        var descuentos = (descuentoResidual() + descuentoSaneamiento())
        var importeTotal = importeConsumo - descuentos
        total = importeTotal

        return importeTotal.toString()
    }

    open fun imprimir() {
        println("Factura Normal: nº factura: $numFactura, fecha: $fecha, dni Cliente: $dniCliente, importe total: ${total()} €")
    }
}

//subclase:
open class FamiliaNumerosaA(numFactura:Int, fecha:Int, dniCliente:String):Factura(numFactura, fecha, dniCliente) {

    override fun descuentoSaneamiento():Double {
        var porcentajeDescuento = 0.2
        var descuento = importeSaneamiento - (importeSaneamiento*porcentajeDescuento)
        return descuento.toDouble()
    }

    override fun descuentoResidual():Double {
        var porcentajeDescuento = 0.2
        var descuento = importeResidual - (importeResidual*porcentajeDescuento)
        return descuento.toDouble()
    }

    override fun total():String {
        importeConsumo = m3Precio * m3Consumidos
        var descuentos = (descuentoResidual() + descuentoSaneamiento())
        var importeTotal = importeConsumo - descuentos
        total = importeTotal

        return importeTotal.toString()
    }

    override fun imprimir() {
        println("Factura de una Familia Numerosa A: nº factura: $numFactura, fecha: $fecha, dni Cliente: $dniCliente, importe total: ${total()} €")
    }
}


//subclase:
open class FamiliaNumerosaB(numFactura:Int, fecha:Int, dniCliente:String):Factura(numFactura, fecha, dniCliente) {

    override fun descuentoSaneamiento():Double {
        var porcentajeDescuento = 0.75
        var descuento = importeSaneamiento - (importeSaneamiento*porcentajeDescuento)
        return descuento.toDouble()
    }

    override fun descuentoResidual():Double {
        var porcentajeDescuento = 0.5
        var descuento = importeResidual - (importeResidual*porcentajeDescuento)
        return descuento.toDouble()
    }

    override fun total():String {
        importeConsumo = m3Precio * m3Consumidos
        var descuentos = (descuentoResidual() + descuentoSaneamiento())
        var importeTotal = importeConsumo - descuentos
        total = importeTotal

        return importeTotal.toString()
    }

    override fun imprimir() {
        println("Factura de una Familia Numerosa B: nº factura: $numFactura, fecha: $fecha, dni Cliente: $dniCliente, importe total: ${total()} €")
    }
}



/* 1. Crear las clases (utilizando herencia) que sean necesarias para guardar los distintos tipos
de contratos de los empleados de una empresa. Para todos los contratos se necesita
saber:
• Numero de contrato, DNI, nombre, apellidos, salario bruto mensual, IRPF.
• Para cada tipo de contrato se quiere saber, además:

o Indefinido: Si las pagas extras están prorrateadas o no.
o Temporal: Meses de duración.
o Practicas: Titulación que cursa, meses de duración.

• Crea un método llamado “salarioNeto” donde corresponda para obtener el salario
neto (salario neto = salario bruto – salario bruto*IRPF) en todos los contratos.
• Crea adecuadamente el método llamado “toString()” en todas las clases, para
visualizar todos los datos de los contratos (incluyendo el salario neto).
En la función main() crea un objeto con todos los datos, por cada una de las clases hijas y
muestra sus valores por pantalla. */

fun main220() {
    var indefinido = Indefinido(1,"33445566D","Juan","Gómez",1050.79,200.0,"Si")
    var temporal = Temporal(2,"44556633E","Carlos","Lopez",990.50,190.0,12)
    var practicas = Practicas(3,"44772234D","Luís", "Costa", 1200.75,190.0,"FP", 24)

    var prueba = Contratoo(1,"33445566D","Juan","Gómez",1050.79,200.0)

    println(prueba)

    //println(indefinido.toString())
    //println(temporal.toString())
    //println(practicas.toString())
}


open class Contratoo constructor(var numContrato:Int, var dni:String, var nombre:String, var apellidos:String, var salarioBrutoMes:Double, var irpf:Double) {

    open fun salarioNeto(): Double {
        var salarioNeto = salarioBrutoMes - (salarioBrutoMes * irpf)
        return salarioNeto
    }

    override fun toString(): String {
        return "Número de contrato: $numContrato, dni: $dni, nombre: $nombre, apellidos: $apellidos, salario Bruto Mes: ${salarioNeto()}, irpf: $irpf"
    }
}


class Indefinidoo constructor(numContrato: Int, dni: String, nombre: String, apellidos: String, salarioBrutoMes: Double, irpf: Double, var pagasProrrateadas:String):Contratoo(numContrato,dni, nombre, apellidos, salarioBrutoMes, irpf) {

    fun pagasProrrateadas():String {
        if(pagasProrrateadas == "Si") println("tiene pagas prorrateadas")
        else ("no tiene pagas prorrateadas")
        return pagasProrrateadas.toString()
    }

    override fun toString(): String {
        return "${super.toString()} pagas prorrateadas: ${pagasProrrateadas()}."
    }
}


class Temporall constructor(numContrato: Int, dni: String, nombre: String, apellidos: String, salarioBrutoMes: Double, irpf: Double, var mesesDuracion:Int):Contratoo(numContrato,dni, nombre, apellidos, salarioBrutoMes, irpf) {

    override fun toString(): String {
        return "${super.toString()} meses duración: $mesesDuracion."
    }
}


class Practicass constructor(numContrato: Int, dni: String, nombre: String, apellidos: String, salarioBrutoMes: Double, irpf: Double, var mesesDuracion:Int, var titulacionQueCursa:String):Contratoo(numContrato,dni, nombre, apellidos, salarioBrutoMes, irpf) {

    override fun toString(): String {
        return "${super.toString()} meses duración: $mesesDuracion, titulación que cursa: $titulacionQueCursa."
    }
}



/* 2. En una tienda de informática se guarda información de distintos componentes de ordenador, de todos ellos es necesario saber:

• Referencia(valor alfanumérico), precio y marca

• De los discos duros nos interesa saber:
o Capacidad en TB, tipo bus de datos (IDE, Serial Ata2, ...)

• De las tarjetas gráficas:
o Modelo,MemoriaenMB,tipodebus

• Crea las clases necesarias para guardar la información de estos productos.

• Se necesita un método al que se le pueda enviar un porcentaje de descuento por
consola(Ej. 0.18) y me calcule el precio final del componente, tras aplicarle ese descuento.
o Fórmula:preciocondescuentoaplicado=precio–precio*descuento.
o Declaraelmétodo,enlaclasequecorresponda.

• Para poder hacer cambios de unidades, declara donde sea preciso un método que
reciba una cantidad dada en MB y me la devuelva transformada en a GB.

• Se decide que a las tarjetas gráficas no se les puede aplicar descuento, por lo tanto, el
método que calcula el precio final tras aplicar el descuento, para las tarjetas gráficas devolverá́ siempre el precio original del componente, sin descuento.

En la función main():
• Crea los objetos según los datos de los siguientes componentes:
o DiscoDuro:referencia:“HD1050”,marca:“WesternDigital”,precio:118,77€,
capacidad: 2TB, bus: SATA3.

o Tarjetagráfica:referencia:”TG0004”,marca:“ASUS”,precio:131,28€,
modelo: “GTX550”, memoria: 1024 MB, bus: “PCI Express”.
• Muestra el precio de los dos componentes
• Utilizando el método creado, muestra el precio aplicándole un descuento del 15% a los dos componentes. Chequea que a la tarjeta gráfica no se le aplica como queríamos el descuento.

• Muestra la capacidad de memoria de la tarjeta gráfica en GB. (haciendo uso del método que realiza este cálculo).
• Necesito guardar la información del siguiente componente:

o Pendrive:referencia:”USB1001”,marca:“SanDisk”,precio:18€,capacidad:16GB.
o Crea un objeto con la información anterior del pendrive,muestra su precio
con un descuento de 10%. */

fun main221() {
    var discoDuro1 = DiscoDuro("HD1050",100.00,"WesternDigital",2.0,"SATA3")
    var tarjetaGrafica1 = TarjetaGrafica("TG0004",131.28,"ASUS", "GTX550", 1024.0,"PCI Express")
    var pendrive1 = Pendrive("USB1001",18.0,"SanDisk", 16.0)

    println(discoDuro1)
    println(tarjetaGrafica1)
    println(pendrive1)
}


//SUPER
open class Componente constructor(var referencia:String, var precio:Double, var marca:String) {

    open fun descuento():Double{
        println("Ingrese un descuento para $marca: ")
        var descuento = readLine()!!.toDouble()

        var PrecioConDescuento = precio - ((precio * descuento) / 100)

        return PrecioConDescuento
    }

    open fun conversor():Double {
        var conversor = 1000
        return conversor.toDouble()
    }

    override fun toString():String {
        return "La Referencia: $referencia, Precio: $precio, Marca: $marca"
    }
}


//sub
class DiscoDuro constructor(referencia: String, precio: Double, marca: String, var capacidad:Double, var bus:String):Componente(referencia,precio,marca) {

    override fun conversor():Double { //Convertimos de Teras a GB
        var conversor = capacidad * 1000
        return conversor
    }

    /*override fun descuento(): Double {
        return super.descuento()
    }*/

    override fun toString():String {
        return "Disco Duro / Referencia: $referencia, Precio: ${descuento()}, Marca: $marca, capacidad: ${conversor()} GB, bus: $bus"
    }
}


//sub
class TarjetaGrafica constructor(referencia: String, precio: Double, marca: String, var modelo:String, var memoria:Double, var bus:String):Componente(referencia,precio,marca) {

    override fun conversor():Double { //Convertimos de MB a GB
        var conversor = memoria / 1000
        return conversor
    }

    override fun toString():String {
        return "Tarjeta Gráfica / Referencia: $referencia, Precio: $precio, Marca: $marca, Modelo:$modelo, Memoria: ${conversor()} GB, Bus: $bus"
    }
}


//sub
class Pendrive constructor(referencia: String, precio: Double, marca: String, var capacidad: Double):Componente(referencia, precio, marca) {

    override fun toString(): String {
        return "Pendrive / Referencia: $referencia, Precio: ${descuento()}, Marca: $marca, capacidad: $capacidad GB"
    }
}



/* Una empresa se dedica a alquilar barcos. Un BARCO se caracteriza por su matrícula, su eslora
y manga en metros y año de fabricación. Se pretende diferenciar la información de algunos
tipos de barcos:

• Número de mástiles para Veleros
• Potencia en CV para Embarcaciones deportivas a motor
• Potencia en CV y número de camarotes para Yates de lujo
El precio por día base de un alquiler de un barco es un precio por día común para todas las
embarcaciones que se establece en 40€, modificado con los siguientes incrementos:
• Veleros: 10€ x no de mástiles
• Embarcaciones deportivas: 15€ x no CV
• Yates de lujo: (15€ x no CV ) + (5€ x número de camarotes).
Los datos de un ALQUILER son el DNI del cliente, días de alquiler y el BARCO alquilado. El
alquiler se calcula como:
• Días de alquiler x precio por día alquiler barco
Usando clases, atributos privados y constructores que inicialicen todos los atributos, registrar
los siguientes alquileres y mostrar su precio final
• Alquiler 1:
o DNI cliente: “12345678Y”
o 5 días de alquiler
o Barco alquilado:
§ Velero de 3 mástiles:
• Matrícula: “3GI1199”
• Eslora: 70 metros y manga: 12 metros
• Año fabricación: 1980

• Alquiler 2:
o DNI cliente: “27654376T”
o 6 días de alquiler
o Barco alquilado:
§ Embarcación deportiva de 10 CV:
• Matrícula: “9XP1188”
• Eslora: 30 metros y manga: 5 metros
• Año fabricación: 1990

• Alquiler 3:
o DNI cliente: “378641985H”
o 3 días de alquiler
o Barco alquilado:
§ Yate de lujo de 18 CV y 3 camarotes:
• Matrícula: “6TK2476”
• Eslora: 40 metros y manga:10 metros
• Año fabricación: 1995
• Verifica que los precios por alquiler obtenidos son correctos. */

fun main222() {
    var velero1 = Velero("3GI1199",70,12,1980,3)
    var deportivo1 = Deportivo("27654376T",30,5,1990,10)
    var yate1 = Yate("378641985H",40,10,1995,18,3)

    var alquilerVelero = Alquiler("33445566D",5, velero1)
    var alquilerDeportivo = Alquiler("22118877M",6, deportivo1)
    var alquilerYate = Alquiler("44557788N", 3, yate1)

    println(velero1)
    println(deportivo1)
    println(yate1)

    println("")

    println("$alquilerVelero tratándose de un Velero")
    println("$alquilerDeportivo tratándose de un Deportivo")
    println("$alquilerYate tratándose de un Yate")
}

//SUPERCLASE:
open class Barco constructor(private var matricula:String, private var eslora:Int, private var manga:Int, private var anoFabricacion:Int) {

    open fun precioDia():Int {
        var precio = 40
        return precio
    }

    override fun toString():String {
        return "El precio por día es de: ${precioDia()}€"
    }
}


//subclase:
class Velero constructor(matricula: String, eslora: Int, manga: Int, anoFabricacion: Int, private var mastil:Int):Barco(matricula, eslora, manga, anoFabricacion) {

    override fun precioDia():Int {
        return super.precioDia() + (mastil * 10)
    }

    override fun toString(): String {
        return super.toString() + (" tratándose de un Velero")
    }
}


//subclase:
class Deportivo constructor(matricula: String, eslora: Int, manga: Int, anoFabricacion: Int, private var potencia:Int):Barco(matricula, eslora, manga, anoFabricacion) {

    override fun precioDia():Int {
        return super.precioDia() + (potencia * 15)
    }

    override fun toString(): String {
        return super.toString() + (" tratándose de un barco Deportivo")
    }
}


//subclase:
class Yate constructor(matricula: String, eslora: Int, manga: Int, anoFabricacion: Int, private var potencia:Int, private var camarotes:Int):Barco(matricula, eslora, manga, anoFabricacion) {

    override fun precioDia():Int {
        return super.precioDia() + ((potencia * 15) + (5 * camarotes))
    }

    override fun toString():String {
        return super.toString() + (" tratándose de un Yate")
    }
}


//clase:
class Alquiler constructor(private var dni:String, private var diasAlquiler:Int, private var barco:Barco) {

    fun Alquiler():Int {
        var alquiler = diasAlquiler * (barco.precioDia())
        return alquiler
    }

    override fun toString():String {
        return("El precio del alquiler es de: ${Alquiler()}€")
    }
}


/* 1. En una aplicación de gestión de personal queremos manejar información acerca de
becarios, comerciales y dirección. La información que nos interesa de cada uno es la
siguiente:
• BECARIO:
o Nombre y Apellidos
o Fecha de Alta
o Departamento
o Salario (se inicializará a cero euros)
o Meses de prueba
• COMERCIAL:
o Nombre y Apellidos
o Fecha de Alta
o Departamento
o Salario
o Comisión
• DIRECCIÓN
o Nombre y Apellidos
o Fecha de Alta
o Departamento
o Salario
o Bonificación (es un porcentaje que aumenta su salario).

Para hacer informes necesitamos dos métodos, uno que muestre la información común:
Nombre, Apellidos, Fecha de Alta , Departamento, y salario,

y otro que muestre la información
particular: Meses de prueba, comisión y bonificación.

Define las clases necesarias utilizando los
conceptos de herencia. Todas las clases definen sus atributos como privados y todas las clases
tienen un constructor que inicializan todos sus atributos.

En el programa crea un array de 3 elementos y almacena en el mismo 1 objeto de tipo
BECARIO ,1 objeto de tipo COMERCIAL y 1 objeto de tipo DIRECCIÓN. Recorre el array
mostrando la información común y la particular de los objetos contenidos utilizando un solo
método. */

fun main223() {
    val array: Array<Empleado> = arrayOf(
            Becario("Juan López Flores",2021,"Informática",1050.50,12),
            Comercial("María Gómez Fernández",2020,"I+D",1500.50,10.5),
            Direccion("Paco García Castro", 2019,"Informática",1600.50,0.2)
    )

    for(i in array) {
        println(i.toString())
    }
}


//SUPERCLASE:
open class Empleado constructor(private var nombreApellidos:String, private var fechaAlta:Int, private var departamento:String, private var salario:Double = 0.0) {

    override fun toString():String {
        return "Nombre y apellidos: $nombreApellidos, fecha de alta: $fechaAlta, departamento: $departamento, salario: $salario"
    }
}


//subclase:
class Becario constructor(nombreApellidos: String, fechaAlta: Int, departamento: String, salario: Double, private var mesesPrueba:Int):Empleado(nombreApellidos,fechaAlta,departamento,salario) {

    override fun toString(): String {
        return super.toString() + (", meses de prueba: $mesesPrueba")
    }
}


//subclase:
class Comercial constructor(nombreApellidos: String, fechaAlta: Int, departamento: String, salario: Double, private var comision:Double):Empleado(nombreApellidos,fechaAlta,departamento,salario) {

    override fun toString(): String {
        return super.toString() + (", comisión: $comision")
    }
}


//subclase:
class Direccion constructor(nombreApellidos: String, fechaAlta: Int, departamento: String, salario: Double, private var bonificacion:Double):Empleado(nombreApellidos,fechaAlta,departamento,salario) {

    override fun toString(): String {
        return super.toString() + (", bonificación: $bonificacion")
    }
}



/* 2. La empresa de telefonía móvil KKPhone tiene 2 tipos de TARIFAS. Tenemos que crear las
distintas clases para gestionar su facturación (todos los atributos serán privados y se
crearán los constructores que inicialicen todos sus atributos). La TARIFA BASE(no incluye
servicio de Internet) incluye:

• Precio por minuto
• Precio por SMS

La TARIFA INTERNET que incluye servicio de Internet, tiene a mayores:

• Cuota tarifa plana Internet (Precio fijo por el servicio de Internet)
• MBs máximos cuota Internet (MBs hasta donde cubre la tarifa plana)
• Precio por MB una vez superada la cuota

Las FACTURA incluyen:

• Una TARIFA
• Número de factura
• IVA (21%)
• DNI cliente
• Minutos consumidos
• Número SMS enviados
• MBs consumidos
• El total de la factura se calcula siguiendo estos pasos:
o Total_sin_IVA= minutos_consumidos x precio_por_minuto_TARIFA+
número_SMS_enviados x precio_por_SMS_TARIFA
o Si la TARIFA es de Internet , incrementaremos el total sin IVA:
§ Total_sin_IVA = Total_sin_IVA + cuota_tarifa_plana_Internet
§ Si se han superado los MBs máximos de cuota de Internet:
§ Total_sin_IVA = Total_sin_IVA + (MBS_consumidos -
MBs_máximos_cuota_Internet_TARIFA) x
precio_por_MB_una_vez_superada_la _cuota_TARIFA
§ Total final = total_sin_IVA x (1 + IVA)

En el programa calcula las siguientes facturaciones y muestra su total (chequea que el cálculo
sea correcto):

• Factura nº 1
o TARIFA BASE:
§ Precio por minuto = 8 céntimos minuto (0,08 €)
§ Precio por SMS = 35 céntimos (0,35 €) o DNI: “12345678Y”
o Minutos consumidos: 200
o SMS enviados: 10

• Factura nº 2
o TARIFA INTERNET:
§ Precio por minuto = 4 céntimos minuto (0,04 €)
§ Precio por SMS = 25 céntimos (0,25 €)
§ Cuota tarifa plana Internet (Precio fijo por el servicio de Internet) =
20€
§ MBs máximos cuota Internet (MBs hasta donde cubre la tarifa plana)=
600
§ Precio por MB una vez superada la cuota = 2,5 céntimos (0,025 €)
o DNI: “12345678Y”
o Minutos consumidos: 180
o SMS enviados: 2
o MBs consumidos: 700 MB */


fun main224() {
    var tarifaBase = TarifaBase(0.0, 0.0)
    var tarifaInternet = TarifaInternet(0.04,0.25,20.0,600.0,0.025)

    var factura1 = Facturaa(tarifaBase, 0.08, 0.35,1,0.21,"12345678Y",200,10,0)
    var factura2 = Facturaa(tarifaInternet, 0.04, 0.25, 2, 0.21, "12345678X", 180, 2, 700)

    println("El total sin Iva de la factura 1 es: ${factura1.totalSinIva()}€, y el Total con Iva es: ${factura1.totalConIva()}€")
    println("El total sin Iva de la factura 2 es: ${factura2.totalSinIva()}€, y el Total con Iva es: ${factura2.totalConIva()}€")
}


//SUPERCLASE:
open class TarifaBase constructor(private var precioMinuto:Double, private var precioSms:Double) {

    open fun precioMinuto():Double {
        return precioMinuto
    }

    open fun precioSms():Double {
        return precioSms
    }

    override fun toString():String {

        return("")
    }
}

//subclase:
class TarifaInternet constructor(precioMinuto: Double, precioSms: Double, private var cuotaTarifaPlana:Double, private var mbMaximos:Double, private var precioMb:Double):TarifaBase(precioMinuto,precioSms) {

    open fun cuotaTarifaPlana():Double {
        return cuotaTarifaPlana
    }

    open fun mbMaximos():Double {
        return mbMaximos
    }

    open fun precioMb(precio:Double):Double {
        return precioMb
    }
}

//clase:
class Facturaa constructor(var base:TarifaBase, precioMinuto: Double, precioSms: Double, private var numeroFactura:Int, private var iva:Double, private var dni:String, private var minutosConsumidos:Int, private var smsEnviados:Int, private var mbConsumidos:Int):TarifaBase(precioMinuto,precioSms) {

    var internet = TarifaInternet(0.0, 0.0, 0.0, 0.0, 0.0)
    var tarifa = TarifaInternet(0.0,0.0,0.0,0.0,0.0)

    open fun totalSinIva(): Double {
        var totalSinIva = (minutosConsumidos * precioMinuto() + smsEnviados * precioSms())
        return totalSinIva
    }

    open fun tarifaInternet0(): Double {
        var totalSinIva = totalSinIva() + (internet.cuotaTarifaPlana())
        return totalSinIva
    }

    open fun tarifaInternet():Double {
        if (tarifa == internet)
            return tarifaInternet0()
        else (internet.mbMaximos() > mbConsumidos)
        return totalSinIva() + (mbConsumidos - internet.mbMaximos()) * internet.precioMb(0.025)
    }

    open fun totalConIva():Double {
        var totalConIva = totalSinIva() * (1 + iva)
        return totalConIva
    }
}



/******************** ARRAYS ********************/

fun main225(){
    var nombreArray= arrayListOf<String>()

    nombreArray.add("Carlos")
    nombreArray.add("Juan")
    println(nombreArray)    //devuelve: [Carlos, Juan]

    nombreArray.add(0,"Pedro")
    println(nombreArray)    //devuelve: [Pedro, Carlos, Juan]

    nombreArray.remove("Pedro")
    nombreArray.removeAt(0)
    println(nombreArray)    //devuelve: [Juan]

    nombreArray.get(0)
    nombreArray.add("Jose")
    println(nombreArray)    //devuelve: [Juan, Jose]

    nombreArray.set(0,"Alfonso")
    println(nombreArray)    //devuelve: [Alfonso, Jose]

    for (i in nombreArray){
        println(i)          //devuelve: Alfonso, Jose
    }
}



/* Crea un programa que en el que puedas introducir números enteros por consola y los guarde en un Arraylist hasta que introduzcas un 0.
Para finalizar muestra por pantalla los números introducidos, su suma y su media. */

fun main226(){
    var numeros= arrayListOf<Int>()
    var n = 1

    while(n != 0){
        println("Introduce un número, (escribe el 0 para acabar): ")
        n = readLine()!!.toInt()
        if (n != 0)
            numeros.add(n)
    }
    println("Ha introducido ${numeros.size} números")
    println(numeros)

    var suma = 0
    for (i in numeros){
        suma += i
    }
    println("Suma: $suma")
    println("Media: ${suma/numeros.size}")
}

