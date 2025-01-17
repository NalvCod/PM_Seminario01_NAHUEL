package com.seminario01.nahuelejs
import kotlin.math.pow

fun main() {
    var listanums = intArrayOf(2, 3, 10, 5, 6)
    println("\nEj1:")
    ej1(listanums)

    println("\nEj2:")
    ej2(listanums)

    println("\nEj3:")
    ej3(2f)

    println("\nEj4:")
    ej4("ana")

    println("\nEj5:")
    ej5("patata", 't')

    println("\nEj6:")
    ej6("pielapipi", "pi")

    println("\nEj7: ")
    ej7("Hola que tal")

    println("\nEj8: ")
    ej8(245)

    println("\nEj9: ")
    ej9(84, 70)

    println("\nEj 10: ")
    ej10(5)

    println("\nEj 11: ")
    ej11(100, 441)

    println("\nEj 14: ")
    ej14(6)

    println("\nEj 16: ")
    ej16(intArrayOf(2, 5, 6, 10))
    println()

    println("\nEj 17: ")
    ej17(intArrayOf(2, 5, 6, 10))

    println("\nEj 18: ")
    ej19("patata")

    println("\nEj20 ");
    ej20(3)

    println("\nEj21 ")
    ej21("hola")

    println("\nEj22 ")
    ej22(6)

    println("\nEj23")
    var esArmstrong = ej23(153)
    print(esArmstrong)
    println()

    println("\nEj24 ");
    val matriz: Array<Array<Int>> = arrayOf(
        arrayOf(1, 20, 3),
        arrayOf(8, 5, 2),
        arrayOf(7, 15, 9)
    )
    ej24(matriz)

    println("\nEj25 ");
    ej25(matriz)

    println("\nEj26 ");
    val listaPalabras: Array<String> = arrayOf("patata", "pierna", "abuela")
    ej26(listaPalabras)

    println("\nEj27 ");
    ej27(listaPalabras)

    println("\nEj28 ");
    ej28("patata")

    println("\nEj29 ");
    ej29("amor", "roma")

    println("\nEj30");
    ej30(3)

    println("\nEj31 ");
    val listaNums = listOf(1, 5, 10, 2, 3)
    ej31(listaNums)

    println("\nEj32 ");
    val clave = listOf(1, 2, 3, 4)
    val valor = listOf("Uno", "Dos", "Tres", "Cuatro")
    ej32(clave, valor)

    println("\nEj33 ");
    ej33(5)
    println()

    println("\nEj34 ");
    ej34("apple")

    println("\nEj35 ");
    val lista = intArrayOf(2, 4, 7, 8, 9, 0)
    val listaAscendente = ej35(lista, "asc")
    val listaDescendente = ej35(lista, "desc")

    println("Lista ascendente:")
    for (num in listaAscendente) print("$num ")
    println("\nLista descendente:")
    for (num in listaDescendente) print("$num ")
}

fun ej1(lista: IntArray): Int {
    /*Ejercicio 1. Crea una función que obtenga el número máximo de una lista de números*/
    var max = lista[0]

    for (num in lista) {
        if (num > max) {
            max = num;
        }
    }
    println(max)
    return max;
}

fun ej2(lista: IntArray) {
    /*Ejercicio 2. Crea una función que obtenga la sumatoria de una lista de números*/
    var sumatoria = 0
    for (i in 0..lista.size - 1) {
        sumatoria += lista[i]
    }
    println(sumatoria)
}

fun ej3(distanciaMillas: Float) {
    /*Ejercicio 3. Crea una función que dada una distancia en millas calcule su correspondiente en kms*/
    var res = distanciaMillas * 1.60934
    println(res)
}

fun ej4(cadenaTexto: String) {
    /*Ejercicio 4. Crea una función que determine si una cadena de texto es un palíndromo. */
    val aux = cadenaTexto.reversed()
    if (aux.equals(cadenaTexto)) println("ES PELINDROMO")


}

fun ej5(cadenaTexto: String, letra: Char) {
    /*Ejercicio 5. Crea una función que cuenta cuántas veces aparece una letra en un texto. */
    var contador = 0;

    for (caracter in cadenaTexto) {
        if (caracter == letra) {
            contador++
        }
    }
    println(contador)
}

fun ej6(cadenaTexto: String, subcadena: String) {
    /*Ejercicio 6. Crea una función que cuenta cuántas veces aparece una subcadena en un texto. */
    var esCadena = false
    var contador = 0

    for (i in 0 until cadenaTexto.length) {
        if (cadenaTexto[i] == (subcadena[0])) {
            for (j in 1 until subcadena.length) {
                if (subcadena[j] == cadenaTexto[j]) {
                    esCadena = true;
                }
                if (esCadena) {
                    contador++;
                }
            }
        }
    }
    println(contador)
}


fun ej7(texto: String) {
    /*Ejercicio 7. Crea una función que pone en mayúscula la primera letra de cada palabra de un texto */
    var aux: String = texto[0].toString()


    for (i in 0..texto.length - 1) {
        if (texto[i].equals(' ')) {
            aux += " " + texto[i + 1].uppercaseChar()
        } else {
            if (i != 0 && texto[i - 1] != ' ') {
                aux += texto[i]
            }
        }
    }
    println(aux)
}


fun ej8(num: Int) {
    /*Ejercicio 8. Crea una función que sume los dígitos de un número. Ejemplo: sumaDigitos(245) = 2 + 4 + 5 = 11*/
    var aux = num
    var suma = 0


    while (aux != 0) {
        suma += aux % 10
        aux /= 10
    }
    println("La suma es " + suma)
}


fun ej9(num1: Int, num2: Int): Int {
    /*Ejercicio 9. Crea una función que calcule el máximo común divisor de dos números naturales*/


    var mayor = 0
    var mcd = 0


    if (num1 >= num2) mayor = num1
    else {
        mayor = num2
    }


    for (i in 1..mayor) {
        var res1 = num1 % i
        var res2 = num2 % i


        if (res1 == 0 && res2 == 0) {
            mcd = i
        }
    }
    println("El MCD es: " + mcd)
    return mcd
}

fun ej10(n: Int) {
    /*Ejercicio 10. Crea una función que calcule el término n-ésimo de la sucesión de Finbonacci. */
    var cont = 0
    var sucesion = IntArray(n + 1)


    for (i in 0..n) {
        if (i == 0) sucesion[i] = 0
        if (i == 1) sucesion[i] = 1
        if (i > 1) {
            sucesion[i] = sucesion[i - 2] + sucesion[i - 1]
            cont++
        }
    }
    println("El valor " + n + "-esimo de la sucesión es: " + sucesion[n])
}


fun ej11(num1: Int, num2: Int): Boolean {
    /*Ejercicio 11. Crea una función que determine si dos números son primos relativos.*/
    var res = ej9(num1, num2)
    var esPrimoRelativo = false
    if (res == 1) esPrimoRelativo = true


    return esPrimoRelativo
}


fun ej12(num: Int): Boolean {
    /*Ejercicio 12. Crea una función que determine si un número dado es capicúa*/
    var numAux = num.toString()
    var numReves = num.toString().reversed()
    var esCapicua = false


    if (numAux == numReves) {
        esCapicua = true
    }
    return esCapicua
}


fun ej13() {
    /*Ejercicio 13. Crea una función que dada una cadena de texto con formato Emmet
    devuelva su correspondiente etiqueta HTML, teniendo en cuenta sólo los atributos
    de clase e id.*/
}


fun ej14(num: Int) {
    /*Ejercicio 14. Crea una función que dado un número n imprima el siguiente ‘mosaico’*/


    for (i in 1..num) {
        var cont = i;
        if (i == 1) println(1)
        println()
        while (cont > 0) {
            print(i);
            cont--
        }
    }
}


fun ej15(array1: IntArray, array2: IntArray): BooleanArray {
    /*Ejercicio 15. Crear una función que reciba dos arrays de enteros y devuelva un array de booleanos
    que determine si los elementos, uno a uno, de ambos arrays son iguales */
    var max = 0
    var min = 0


    if (array1.size >= array2.size) {
        max = array1.size
        min = array2.size
    } else max = array2.size


    var arrayBooleanos = BooleanArray(max)


    for (i in 0..min - 1) {
        if (array1[i] == array2[i]) {
            arrayBooleanos[i] = true
        } else arrayBooleanos[i] = false
    }


    for (i in min..max - 1) {
        arrayBooleanos[i] = false
    }


    return arrayBooleanos
}


fun ej16(listaNums: IntArray): Int {
    /*Ejercicio 16: Crea una función que calcule el producto de todos los elementos en
    una lista de números.*/
    var res = 1
    var longitud = listaNums.size


    for (i in 0..longitud - 1) {
        res *= listaNums[i]
    }
    println(res)
    return res
}


fun ej17(listaNums: IntArray): IntArray {
    /*Ejercicio 17: Crea una función que dada una lista de números, devuelva una nueva
    lista con solo los números pares.*/
    var contador = 0
    var listaPar = IntArray(listaNums.size)

    for (i in 0..listaNums.size - 1) {
        if (listaNums[i] % 2 == 0) {
            listaPar[contador] = listaNums[i]
            println(listaPar[contador])
            contador++
        }
    }
    return listaPar.copyOfRange(0, contador)
}


fun ej18(numero: Int): Boolean {
    /*Ejercicio 18: Crea una función que determine si un número es primo.*/
    var esPrimo = true
    var cont = 2

    while (esPrimo && cont < numero / 2) {
        if (numero % cont == 0) {
            esPrimo = false
            break
        }
        cont++
    }
    return esPrimo
}


fun ej19(texto: String) {
    /*Ejercicio 19: Crea una función que, dada una cadena de texto, elimine todas las
 vocales de la cadena*/
    var aux = ""

    for (i in 0..texto.length - 1) {
        if (texto[i].lowercaseChar() == 'a' ||
            texto[i].lowercaseChar() == 'e' ||
            texto[i].lowercaseChar() == 'i' ||
            texto[i].lowercaseChar() == 'o' ||
            texto[i].lowercaseChar() == 'u'
        ) {

        } else {
            aux += texto[i]
        }
    }
    println(aux)
}

fun ej20(numero: Int): Int {
    /*Ejercicio 20: Crea una función que calcule el factorial de un número*/
    var res = 1

    for (i in 1..numero) {
        res *= i
    }
    println(res)
    return res
}


fun ej21(texto: String) {
    /*Ejercicio 21: Crea una función que invierta una cadena de texto. Por ejemplo, "hola" debería convertirse en
 "aloh".*/
    var cadenaReves = ""

    for (i in texto.length - 1 downTo 0) {
        cadenaReves += texto[i].toString()
    }
    println(cadenaReves)
}


fun ej22(numero: Int): Boolean {
    /*Ejercicio 22: Crea una función que, dado un número, devuelva True si es un número perfecto (la suma de
 sus divisores propios positivos es igual al número), o False en caso contrario.*/
    var esPerfecto = false
    var divisores = 0


    for (i in 1..numero / 2) {
        if (numero % i == 0) {
            divisores += i
        }
    }
    println(divisores)

    if (divisores == numero) {
        esPerfecto = true
    }
    println(esPerfecto)
    return esPerfecto
}


fun ej23(num:Int):Boolean {
    /*Ejercicio 23: Crea una función que, dado un número entero, devuelva True si es un número Armstrong (un
 número que es igual a la suma de sus propios dígitos elevados a una potencia). Por ejemplo, 153 es un
 número Armstrong porque 1^3 + 5^3 + 3^3 = 153.*/

    val strNum = num.toString()
    val numberOfDigits = strNum.length
    var sum = 0

    for (char in strNum) {
        val digit = char.toString().toInt()
        sum += digit.toDouble().pow(numberOfDigits).toInt()
    }
    if (sum == num) return true
    else return false
}




fun ej24(matrizBi: Array<Array<Int>>): Int {
    /*Ejercicio 24: Crea una función que encuentre el número más grande en una matriz bidimensional
 (una lista de listas).*/
    var max = matrizBi[0][0]
    for (fila in matrizBi) {
        for (elemento in fila) {
            if (elemento > max) {
                max = elemento
            }
        }
    }
    println("El máximo es: "+max)
    return max
}


fun ej25(matriz: Array<Array<Int>>): Int {
    /*Ejercicio 25: Crea una función que encuentre el número más pequeño en una matriz
 bidimensional (una lista de listas).*/
    var min = matriz[0][0]

    for (i in 0..matriz.size - 1) {
        for (j in 0..matriz[i].size - 1) { //Fijarse en el segundo bucle, especificarel indice de la matriz
            if (min > matriz[i][j]) {
                min = matriz[i][j]
            }
        }
    }
    /*CON INDICES
    for (i in matriz.indices) {
            for (j in matriz[i].indices) {
                if (min > matriz[i][j]) {
                    min = matriz[i][j]
                }
            }
        }
     */
    println("El mínimo es $min")

    return min
}


fun ej26(listaPalabras: Array<String>): String {
    /*Ejercicio 26: Crea una función que, dada una lista de palabras, devuelva la palabra más larga*/
    var longi = listaPalabras[0].length
    var res = ""
    for (palabra in listaPalabras) {
        if (longi < palabra.length) {
            longi = palabra.length
            res = palabra
        }
    }
    println("La palabra más larga es $res")
    return res
}


fun ej27(lista: Array<String>): String {
    /*Ejercicio 27: Crea una función que, dada una lista de palabras, devuelva la palabra más corta.*/
    var contador = lista[0].length
    var aux = lista[0]

    for (i in 1..lista.size - 1) {
        if (lista[i].length < contador) {
            aux = lista[i]
            contador = lista[i].length
        }
    }
    println("La palabra más corta es: $aux")
    return aux
}


fun ej28(cadenaTexto: String): Boolean {
    /*Ejercicio 28: Crea una función que determine si una cadena de texto contiene solo
    caracteres alfabéticos (letras) y espacios en blanco.*/
    var esCorrecto = true

    for (caracter in cadenaTexto.lowercase()) {
        if (!(caracter in 'a'..'z' || caracter == ' ')) {//Puedo hacerme un rango
            esCorrecto = false
            return false //Puedo retornar  directamente un false para no iterar innecesariamente
        }
    }

    if(esCorrecto){
        println("Contiene solo caracteres alfabéticos y espacios en blanco")
    }else{
        println("Contiene otro tipo de caracteres")
    }
    return esCorrecto
}


fun ej29(cadena1: String, cadena2: String): Boolean {
    /*Ejercicio 29: Crea una función que determine si una cadena de texto es un
    anagrama de otra cadena. Dos palabras son anagramas si tienen las mismas letras,
    pero en un orden diferente.*/
    var esAnagrama = false

    if (cadena1.length == cadena2.length) {
        if (cadena1.toLowerCase().toCharArray().sorted() == cadena2.toLowerCase().toCharArray()
                .sorted()
        ){
            esAnagrama = true
            println("$cadena1 y $cadena2 son anagramas")
        }
    }
    if (!esAnagrama) println("$cadena1 y $cadena2 NO son anagramas")

        return esAnagrama
}


fun ej30(num: Int): Boolean {
    /*Ejercicio 30: Crea una función que, dado un número entero, devuelva True si es un
    número triangular (puede representarse como un triángulo equilátero de puntos), o
    False en caso contrario*/
    var esTriangular = false
    var n = 2
    var triangular = 0

    if (num < 0) return false

    while (triangular < num) {
        triangular = (n * (n + 1)) / 2
        if (triangular == num) esTriangular = true
        n++
    }
    println(esTriangular)//Manu sé que esto que hago es redundante pero es para tener todo el código aquí
    return esTriangular
}

fun ej31(nums: List<Int>): List<Int> {
    val listaDup = mutableListOf<Int>()

    for (numero in nums) {
        val numeroDuplicado = numero * 2
        listaDup.add(numeroDuplicado)
    }
    println(listaDup)

    return listaDup
}

fun ej32(clave: List<Int>, valor: List<String>): Map<Int, String> {
    /*Ejercicio 32: Crear un Diccionario a partir de Listas
    Escribe una función que tome dos listas, una lista de claves y otra lista de valores, y
    cree un diccionario utilizando mapOf para combinar las listas en un diccionario
    clave-valor. La función debe devolver el diccionario resultante.

    Sinceramente no sé ni si pide esto, no lo entiendo mucho, creo que es así???*/
    var diccionario: MutableMap<Int, String> = mutableMapOf()

    for (i in clave.indices) {
        diccionario.put(clave[i],valor[i])
    }
    println(diccionario)
    return diccionario
}

fun ej33(num: Int): IntArray {
    /*Ejercicio 33: Crea un programa se encargue de transformar un número decimal a binario
    sin utilizar funciones propias del lenguaje que lo hagan directamente.*/
    var aux = num
    var digitosBin = IntArray(32)
    var cont = 0

    while (aux > 0) {
        digitosBin[cont] = aux % 2
        aux = aux / 2
        cont++
    }
    print("El numero $num en binario es: ")
    var binarioFinal = IntArray(cont)
    for (i in 0 until cont) {
        binarioFinal[i] =  digitosBin[cont - 1 - i]
        print(binarioFinal[i])
    }
    return binarioFinal
}

fun ej34(texto:String):String{
    /*Ejercicio 34: Crea una función que sea capaz de encriptar y desencriptar texto
    utilizando el algoritmo de encriptación de Karaca (debes buscar información sobre él).
     */
        var textoSeparado = texto.reversed().split(' ')
        val vocales: Map<Char, Int> = mapOf(Pair('a', 0), Pair('e', 1), Pair('i', 2), Pair('o', 3), Pair('u', 4))
        var encriptado = ""

        for (palabra in textoSeparado){
            for(letra in palabra){
                if (vocales.containsKey(letra)){
                    for (vocal in vocales){
                        if(letra == vocal.key){
                            encriptado += vocal.value
                            break
                        }

                    }
                }else{
                    encriptado += letra
                }
            }
            encriptado +="aca "
        }


    println("El texto encriptado es: $encriptado")

    return encriptado
}


fun ej35(lista: IntArray, orden: String): IntArray {
    /* Ejercicio 35: Crea una función que ordene y retorne una matriz de números.
       La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro adicional
       "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor o de mayor a menor.
       No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
       */

    val listaNueva = lista.clone()
    val n = listaNueva.size

    if (orden.toLowerCase() == "asc") {
        for (i in 0 until n) {
            for (j in 0 until n - 1 - i) {
                if (listaNueva[j] > listaNueva[j + 1]) {
                    val aux = listaNueva[j]
                    listaNueva[j] = listaNueva[j + 1]
                    listaNueva[j + 1] = aux
                }
            }
        }
    } else if (orden.toLowerCase() == "desc") {
        for (i in 0 until n) {
            for (j in 0 until n - 1 - i) {
                if (listaNueva[j] < listaNueva[j + 1]) {
                    val aux = listaNueva[j]
                    listaNueva[j] = listaNueva[j + 1]
                    listaNueva[j + 1] = aux
                }
            }
        }
    }
    return listaNueva
}
