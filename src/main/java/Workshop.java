import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
       int c;
       c=a+b;
        return c;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        // TODO: Implementar el método para retornar el mayor de los tres números enteros.
        // Ejemplo: Si a = 3, b = 7, y c = 5, el resultado debería ser 7.
        int mayor;
        mayor=a;
        if(mayor<b)
        {
            mayor=b;
            if(mayor<c)
            {
                mayor=c;
            }
        }else
        {
            mayor=c;
        }
        return mayor;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite)
    {
        // TODO: Implementar el método para retornar la tabla de multiplicar del número dado.
        // Ejemplo: Si numero = 2 y limite = 5, el resultado debería ser [2, 4, 6, 8, 10].
       int []x = new int[limite];
       for(int i=0;i<limite;i++)
       {
           x[i]=numero*(i+1);
       }
        return x;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        // TODO: Implementar el método para calcular el factorial de un número entero.
        // Ejemplo: Si n = 5, el resultado debería ser 120.
        // Lanzar IllegalArgumentException si n es negativo.

       int c,d;
       c=1;
       d=1;
        while(d<=n)
        {
            c=c*d;
            d++;
        }


        return c;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        // TODO: Implementar el método para verificar si un número es primo.
        // Ejemplo: Si numero = 7, el resultado debería ser true.
        boolean primo=false;
        int i=0;
        for(int x=1;x<=numero;x++)
        {
            if(numero%x==0)
            {
                i++;
            }
        }
        if(i==2)
        {
            primo=true;
        }

        return primo;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        // TODO: Implementar el método para generar la serie de Fibonacci hasta el número n.
        // Ejemplo: Si n = 5, el resultado debería ser [0, 1, 1, 2, 3].
        // Lanzar IllegalArgumentException si n es negativo.
       int a,b,c;
       int []x=new int[n];
       a=0;
       b=1;
       c=0;
       for(int i=2;i<=n;i++)
       {
           c=a+b;
           a=b;
           b=c;
           x[i]=c;
       }

        return new int[0];

    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo)
    {
        // TODO: Implementar el método para sumar todos los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 15.
        int c,d=0;
        for(int i=0;i< arreglo.length;i++)
        {
                c=arreglo[i];
                d=d+c;

        }
        return d;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo)
    {
        // TODO: Implementar el método para calcular el promedio de los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        double promedio,suma=0;
        for(int i=0;i<arreglo.length;i++)
        {
                suma=suma+arreglo[i];
        }
        promedio=(suma/arreglo.length);
        return promedio;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo)
    {
        // TODO: Implementar el método para encontrar el elemento mayor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 5.
        int mayor,menor;
        mayor=arreglo[0];
        for(int i=0;i<arreglo.length;i++)
        {

            if(arreglo[i]>mayor)
                {
                    mayor=arreglo[i];
                }

        }
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo)
    {
        // TODO: Implementar el método para encontrar el elemento menor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 1.
        int menor;
        menor=arreglo[0];
        for(int i=0;i<arreglo.length;i++)
        {
                if(arreglo[i]<menor)
                {
                    menor=arreglo[i];
                }
        }
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        // TODO: Implementar el método para buscar un elemento en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y elemento = 3, el resultado debería ser true.
       boolean encontrar=true;
       for(int i=0;i<arreglo.length;i++)
       {
           if(arreglo[i]!=elemento)
           {
               encontrar=false;
           }
       }

        return encontrar;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo)
    {
        // TODO: Implementar el método para invertir un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser [5, 4, 3, 2, 1].
        int aux;
        for(int i=0;i<arreglo.length/2;i++)
        {
            aux=arreglo[i];
            arreglo[i]=arreglo[arreglo.length-1-i];
            arreglo[arreglo.length-1-i]=aux;
        }

        return arreglo ;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        // TODO: Implementar el método para ordenar un arreglo en orden ascendente.
        // Ejemplo: Si arreglo = [5, 4, 3, 2, 1], el resultado debería ser [1, 2, 3, 4, 5].
        int aux;
        for(int i=0;i<arreglo.length;i++)
        {
            for(int j = 0; j< arreglo.length -i -1; j++)
            {
                if(arreglo[j]>arreglo[j+1])
                {
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        return new int[0];
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        // TODO: Implementar el método para eliminar los duplicados de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 2, 3, 4, 4, 5], el resultado debería ser [1, 2, 3, 4, 5].
        int contador=0;
        for(int i=0;i<arreglo.length;i++)
        {
            if(arreglo[i]==arreglo[i+1])
            {
                contador++;
            }
        }
        for(int i=0;i<arreglo.length-contador;i++)
        {
            if(arreglo[i]==arreglo[i+1])
            {
                arreglo[i]=arreglo[i+1];
            }
        }

        return arreglo;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        // TODO: Implementar el método para combinar dos arreglos en uno solo.
        // Ejemplo: Si arreglo1 = [1, 2, 3, 4, 5] y arreglo2 = [6, 7, 8], el resultado debería ser [1, 2, 3, 4, 5, 6, 7, 8].
        return new int[0];
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        // TODO: Implementar el método para rotar un arreglo n posiciones.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y posiciones = 2, el resultado debería ser [3, 4, 5, 1, 2].
        return new int[0];
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        // TODO: Implementar el método para contar el número de caracteres en una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser 5.
       int caracter=0;
       for(int i=0;i<cadena.length();i++)
       {
           if(cadena.charAt(i) !=' ')
           {
               caracter++;
           }
       }

        return caracter;
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        // TODO: Implementar el método para invertir una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser "olleH".
       String invertir = "";
        for(int i=cadena.length()-1;i>=0;i--)
        {
            invertir=invertir+cadena.charAt(i);
        }

        return invertir;
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        // TODO: Implementar el método para verificar si una cadena es un palíndromo.
        // Ejemplo: Si cadena = "madam", el resultado debería ser true.
      boolean respuesta=true;
       cadena=cadena.replace(" ","").toLowerCase();
        for(int i=0;i<cadena.length();i++)
      {
          if(cadena.charAt(i)!=cadena.charAt(cadena.length()-1-i))
          {
             respuesta=false;
          }
          
      }

        return respuesta;
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        // TODO: Implementar el método para contar el número de palabras en una cadena.
        // Ejemplo: Si cadena = "Este es un test", el resultado debería ser 4.
            String []palabra= cadena.trim().split(" +");
        return palabra.length;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a mayúsculas.
        // Ejemplo: Si cadena = "hello", el resultado debería ser "HELLO".
        String mayuscula;
        mayuscula=cadena.toUpperCase();
        return mayuscula;
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a minúsculas.
        // Ejemplo: Si cadena = "HELLO", el resultado debería ser "hello".
        String minuscula;
        minuscula = cadena.toLowerCase();
        return minuscula;
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        // TODO: Implementar el método para reemplazar una subcadena en una cadena por otra subcadena.
        // Ejemplo: Si cadena = "Hello Java", antiguaSubcadena = "Java", y nuevaSubcadena = "world", el resultado debería ser "Hello world".
        return "";
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.
        return -1;
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        // TODO: Implementar el método para validar un correo electrónico.
        // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
        return false;
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        // TODO: Implementar el método para calcular el promedio de una lista de números.
        // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.


        return 0.0;
    }

    // Método que convierte un número en su representación binaria
    public int convertirABinario(int numero) {
        // TODO: Implementar el método para convertir un número en su representación binaria.
        // Ejemplo: Si numero = 10, el resultado debería ser "1010".
        int c = 0;
        while(numero>=2)
           {
               c=numero%2;
               numero=numero/2;
           }

        return c;
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        // TODO: Implementar el método para convertir un número en su representación hexadecimal.
        // Ejemplo: Si numero = 255, el resultado debería ser "FF".
        


        return "";
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
        // Las reglas del juego son:
        // - Piedra vence a Tijera y Lagarto
        // - Papel vence a Piedra y Spock
        // - Tijera vence a Papel y Lagarto
        // - Lagarto vence a Spock y Papel
        // - Spock vence a Tijera y Piedra


        // El método debe retornar un mensaje indicando el resultado del juego.
        // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.
        return "";
    }

    public String pptls2(String game[]) {
        //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
        return "";
    }

    public double areaCirculo(double radio) {
        double a;
        a=3.4*(radio*radio);
        return a;
    }

    public String zoodiac(int day, int month) {
        if(month==3 )
        {
            if(day<=20)
            {
                System.out.println( " su signo del zodiaco es Picis");
            } else
            {
                if(day>=21)
                {
                    System.out.println( " su signo del zodiaco es Aries");
                }
            }
        }
        if(month==4 )
        {
            if(day<=19)
            {
                System.out.println( " su signo del zodiaco es Aries");
            } else
            {
                if(day>=20)
                {
                    System.out.println( " su signo del zodiaco es Tauro");
                }
            }
        }
        if(month==5 )
        {
            if(day<=20)
            {
                System.out.println( " su signo del zodiaco es Tauro");
            } else
            {
                if(day>=21)
                {
                    System.out.println( " su signo del zodiaco es Géminis");
                }
            }
        }
        if(month==6 )
        {
            if(day<=20)
            {
                System.out.println( " su signo del zodiaco es Geminis");
            } else
            {
                if(day>=21)
                {
                    System.out.println( " su signo del zodiaco es Cancer");
                }
            }
        }
        if(month==7 )
        {
            if(day<=22)
            {
                System.out.println( " su signo del zodiaco es Cancer");
            } else
            {
                if(day>=23)
                {
                    System.out.println( " su signo del zodiaco es Leo");
                }
            }
        }
        if(month==8 )
        {
            if(day<=22)
            {
                System.out.println( " su signo del zodiaco es Leo");
            } else
            {
                if(day>=23)
                {
                    System.out.println( " su signo del zodiaco es Virgo");
                }
            }
        }
        if(month==9 )
        {
            if(day<=22)
            {
                System.out.println( " su signo del zodiaco es Virgo");
            } else
            {
                if(day>=23)
                {
                    System.out.println( " su signo del zodiaco es Libra");
                }
            }
        }
        if(month==10)
        {
            if(day<=22)
            {
                System.out.println( " su signo del zodiaco es libra");
            } else
            {
                if(day>=23)
                {
                    System.out.println( " su signo del zodiaco es Escorpio");
                }
            }
        }
        if(month==11)
        {
            if(day<=21)
            {
                System.out.println( " su signo del zodiaco es Escorpio");
            } else
            {
                if(day>=22)
                {
                    System.out.println( " su signo del zodiaco es Sagitario");
                }
            }
        }
        if(month==12 )
        {
            if(day<=21)
            {
                System.out.println( " su signo del zodiaco es Sagitario");
            } else
            {
                if(day>=22)
                {
                    System.out.println( " su signo del zodiaco es Capriconrnio");
                }
            }
        }
        if(month==1)
        {
            if(day<=19)
            {
                System.out.println( " su signo del zodiaco es Capricornio");
            } else
            {
                if(day>=20)
                {
                    System.out.println( " su signo del zodiaco es Acuario");
                }
            }
        }
        if(month==2)
        {
            if(day<=18)
            {
                System.out.println( " su signo del zodiaco es Acuario");
            } else
            {
                if(day>=19)
                {
                    System.out.println( " su signo del zodiaco es Picis");
                }
            }
        }
        return "";
    }


}

