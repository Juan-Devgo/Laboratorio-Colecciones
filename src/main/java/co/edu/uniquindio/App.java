package co.edu.uniquindio;

import co.edu.uniquindio.Puntos.Diecisiete.Agenda;
import co.edu.uniquindio.Puntos.catorce.Mensajeria;
import co.edu.uniquindio.Puntos.cuatro.Prioridad;
import co.edu.uniquindio.Puntos.cuatro.Tarea;
import co.edu.uniquindio.Puntos.dieciseis.ProductosComprados;
import co.edu.uniquindio.Puntos.diez.Edificio;
import co.edu.uniquindio.Puntos.doce.ListaEstudiantes;
import co.edu.uniquindio.Puntos.nueve.HistorialPaginas;
import co.edu.uniquindio.Puntos.ocho.Editor;
import co.edu.uniquindio.Puntos.once.ListaMusica;
import co.edu.uniquindio.Puntos.quince.DirectorioTelefonico;
import co.edu.uniquindio.Puntos.seis.Tienda;
import co.edu.uniquindio.Puntos.siete.Banco;
import co.edu.uniquindio.Puntos.trece.Hospital;
import co.edu.uniquindio.Puntos.trece.Paciente;
import co.edu.uniquindio.Puntos.trece.Urgencia;
import co.edu.uniquindio.Puntos.tres.*;
import co.edu.uniquindio.Puntos.uno.*;
import co.edu.uniquindio.Puntos.dos.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

/**
 *
 *
 */
public class App {
    public static void main(String[] args) {
        probarPuntoUno();
        probarPuntoDos();
        probarPuntoTres();
        probarPuntoCuatro();
        mainCinco();
        probarPuntoSeis();
        probarPuntoSiete();
        probarPuntoOcho();
        probarPuntoNueve();
        probarPuntoDiez();
        probarPuntoOnce();
        probarPuntoDoce();
        probarPuntotrece();
        probarPuntoCatorce();
        probarPuntoQuince();
        probarPuntoDieciseis();
        probarPuntoDiecisiete();

    }

    public static void probarPuntoUno() {
        Producto producto1 = new Producto("Keloggs", "Cereal de maíz", 25000F, "1111111111");
        Producto producto2 = new Producto("Lentejas", "Provenientes del tolima", 10000F, "2222222222");

        Empresa empresa = new Empresa();
        empresa.agregarProducto(producto1);
        empresa.agregarProducto(producto2);


        Optional<Producto> productoBuscado = empresa.buscarProducto(producto1.getId());

        productoBuscado.ifPresent(producto -> System.out.println(producto.getDescripcion()));
    }

    public static void probarPuntoDos() {
        PilaGenerica numeros = new PilaGenerica();

        numeros.push(1);
        numeros.push(2);
        numeros.push(3);
        numeros.push(4);
        numeros.push(5);

        numeros.push("Manzana");
        numeros.push("Pera");
        numeros.push("Papaya");

        System.out.println(numeros);

    }

    public static void probarPuntoTres() {
        Lista lista = new Lista();

        lista.add(3);
        lista.add(4);
        lista.add("Manzana");
        lista.add("mango");
        lista.add(new Lista());

        lista.add(3);
        lista.add(4);
        lista.add("Manzana");
        lista.add("Mango");
        lista.add(new Lista());

        System.out.println(lista);
    }

    public static void probarPuntoCuatro() {

        Queue<Tarea> colaTareas = new PriorityQueue<>();

        Tarea tarea1 = new Tarea("Laboratorio 1 Esctructura de datos", "Taller de 17 puntos", Prioridad.MUY_ALTA);
        Tarea tarea2 = new Tarea("Laboratorio 2 Esctructura de datos", "Taller de 17 puntos", Prioridad.BAJA);
        Tarea tarea3 = new Tarea("Laboratorio 3 Esctructura de datos", "Taller de 17 puntos", Prioridad.MUY_ALTA);
        Tarea tarea4 = new Tarea("Laboratorio 4 Esctructura de datos", "Taller de 17 puntos", Prioridad.MEDIA);
        Tarea tarea5 = new Tarea("Laboratorio 5 Esctructura de datos", "Para hoy", Prioridad.MUY_ALTA);
        Tarea tarea6 = new Tarea("Laboratorio 6 Esctructura de datos", "Taller de 17 puntos", Prioridad.ALTA);

        colaTareas.add(tarea1);
        colaTareas.add(tarea4);
        colaTareas.add(tarea2);
        colaTareas.add(tarea5);
        colaTareas.add(tarea3);
        colaTareas.add(tarea6);

        while (!colaTareas.isEmpty()) {
            System.out.println(colaTareas.poll().getPrioridad());
        }
    }

    public static void mainCinco() {
        HashMap<Producto, String> productos1 = new HashMap<>();
        LinkedHashMap<Producto, String> productos2 = new LinkedHashMap<>();
        TreeMap<Producto, String> productos3 = new TreeMap<>();

        Producto producto1 = new Producto("Keloggs", "Cereal", 25000F, "1111111111");
        Producto producto2 = new Producto("Lentejas", "Provenientes del tolima", 10000F,
                "2222222222");
        Producto producto3 = new Producto("Queso Parmesano", "Queso parmesano rallado gourmet 1Kg",
                50000F, "3333333333");

        /**
         *
         *              HashMap                                      LinkedHashMap
         *
         *  El  HashMap  usa  una  tabla Hash para    El LinkedHashMap usa una tabla Hash y nodos
         *  guardar los datos, es decir, en vez de    enlazados que apuntan de un elemento a otro.
         *  un &iacute;ndice para acceder a la estructura    Estos nodos se ordenar&aacute;n por insersi&oacute;n.
         *  de  datos como  estamos  acostumbrados,
         *  utiliza una llave &uacute;nica para acceder a
         *  cada elemento.
         *
         */

        productos1.put(producto1, producto1.getId());
        productos2.put(producto2, producto2.getId());
        productos1.put(producto2, producto2.getId());
        productos2.put(producto1, producto1.getId());
        productos1.put(producto3, producto3.getId());
        productos2.put(producto3, producto3.getId());

        /**
         *
         *                TreeMap
         *
         *  TreeMap,  por  otro  lado,  organizará los
         *  elementos en forma de árbol binario. Estos
         *  a su vez se organizarán de  forma  natural
         *  (con el primer  elemento en la cabeza  del
         *  árbol)  si es  posible. El árbol tenderá a
         *  mantener el  balance,  es  decir, no  hará
         *  caminos largos sino todos lo  más  iguales
         *  posible.
         */

        productos3.put(producto2, producto2.getId());
        productos3.put(producto1, producto1.getId());
        productos3.put(producto3, producto3.getId());

        System.out.println(productos1);
        System.out.println(productos2);
        System.out.println(productos3);

        /**
         * Como podemos ver en el el output, el HashMap recorrerá los elementos en desorden, el LinkedHashMap
         * recorrerá los elementos con orden de insersión y el TreeMap recorrerá los elementos por orden natural.
         */
    }

    private static void probarPuntoSeis() {
        Tienda tienda = new Tienda();

        Producto producto1 = new Producto("Keloggs", "Cereal", 25000F, "1111111111");
        Producto producto2 = new Producto("Lentejas", "Provenientes del tolima", 10000F,
                "2222222222");
        Producto producto3 = new Producto("Queso Parmesano", "Queso parmesano rallado gourmet 1Kg",
                50000F, "3333333333");


        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);

        System.out.println(tienda.listarProductosAlfabeticamente());
        System.out.println(tienda.listarProductosPrecio());

    }

    private static void probarPuntoSiete() {
        Banco banco = new Banco();

        banco.agregarClienteACola("Hernán");
        banco.agregarClienteACola("Luisa");
        banco.agregarClienteACola("Anna");
        banco.agregarClienteACola("Juan");
        banco.agregarClienteACola("Maria");

        System.out.println(banco.atenderPrimerCLiente());

        banco.agregarClienteACabeza("Angie");

        System.out.println(banco.atenderPrimerCLiente());
    }

    private static void probarPuntoOcho() {
        Editor editor = new Editor();
        editor.aniadirCambio("En la línea 4:\"¡Hola Mundo!\"");
        editor.aniadirCambio("En la línea 5:\"¡Hola Mundo!\"");
        editor.aniadirCambio("En la línea 6:\"¡Hola Mundo!\"");
        editor.aniadirCambio("En la línea 7:\"¡Cuándo voy a acabar el taller!\"");

        editor.deshacerCambio();

        System.out.println(editor.getCambios());
    }

    private static void probarPuntoNueve() {
        HistorialPaginas historialPaginas = new HistorialPaginas();

        historialPaginas.agregarPagina("www.uniquindio.edu.co");
        historialPaginas.agregarPagina("www.uniquindio.edu.co/ServiciosEnLinea");
        historialPaginas.agregarPagina("www.uniquindio.edu.co/ServiciosEnLinea/IniciarSesion");
        historialPaginas.agregarPagina("www.uniquindio.edu.co/ServiciosEnLinea/IniciarSesion/Error");
        historialPaginas.agregarPagina("www.uniquindio.edu.co/ServiciosEnLinea/IniciarSesion/Error");
        historialPaginas.agregarPagina("www.uniquindio.edu.co/ServiciosEnLinea/IniciarSesion/Error");
        historialPaginas.agregarPagina("www.uniquindio.edu.co/ServiciosEnLinea/IniciarSesion/AccesoCorrecto");
        historialPaginas.agregarPagina("www.uniquindio.edu.co/ServiciosEnLinea/IniciarSesion/SAC");

        System.out.println(historialPaginas.getPaginaActual());

        historialPaginas.devolverPagina();
        historialPaginas.devolverPagina();
        historialPaginas.devolverPagina();
        historialPaginas.devolverPagina();

        System.out.println(historialPaginas.getPaginaActual());


    }

    private static void probarPuntoDiez() {
        Edificio edificio = new Edificio();

        edificio.agregarEmpleado("Juan");
        edificio.agregarEmpleado("Maria");
        edificio.agregarEmpleado("Anna");

        edificio.agregarEmpleado("Juan");
        edificio.agregarEmpleado("Maria");
        edificio.agregarEmpleado("Anna");

        System.out.println(edificio.getEmpleados());

        System.out.println(edificio.verificarID("Juan"));
        System.out.println(edificio.verificarID("Pedro"));
    }

    private static void probarPuntoOnce() {
        ListaMusica musica = new ListaMusica();

        musica.agregarCancion("Iron Man");
        musica.agregarCancion("512");
        musica.agregarCancion("In My Darkest Hour");
        musica.agregarCancion("Holy Wars");
        musica.agregarCancion("Cowboys From Hell");

        System.out.println(musica.getCanciones());
    }

    private static void probarPuntoDoce() {
        ListaEstudiantes estudiantes = new ListaEstudiantes();

        estudiantes.agregarEstudiante("JuanSe");
        estudiantes.agregarEstudiante("AngieC");
        estudiantes.agregarEstudiante("AngieK");
        estudiantes.agregarEstudiante("Celeste");
        estudiantes.agregarEstudiante("Elkin");
        estudiantes.agregarEstudiante("David");

        System.out.println(estudiantes.getEstudiantes());
    }

    private static void probarPuntotrece() {
        Hospital hospital = new Hospital();

        Paciente paciente1 = new Paciente("Mario", "101090", Urgencia.NO_TAN_URGENTE);
        Paciente paciente2 = new Paciente("Jhan", "102090", Urgencia.NO_URGENTE);
        Paciente paciente3 = new Paciente("Juan Diego", "103090", Urgencia.URGENTE);

        hospital.agregarPaciente(paciente1); hospital.agregarPaciente(paciente2); hospital.agregarPaciente(paciente3);

        System.out.println(hospital.atenderPaciente());
    }

    private static void probarPuntoCatorce() {
        Mensajeria mensajeria = new Mensajeria();

        mensajeria.agregarMensaje("Hola");
        mensajeria.agregarMensaje("Holaa");
        mensajeria.agregarMensaje("como esta");
        mensajeria.agregarMensaje("bien");
        mensajeria.agregarMensaje("y uste");
        mensajeria.agregarMensaje("muy bien hombre");
        mensajeria.agregarMensaje("que bueno hermano");
        mensajeria.agregarMensaje("me alegra");
        mensajeria.agregarMensaje("a mi tambien");
        mensajeria.agregarMensaje("como cuenta la pelicula");
        mensajeria.agregarMensaje("así como la ve");
        mensajeria.agregarMensaje("ah bueno");
        mensajeria.agregarMensaje("listo pues");
        mensajeria.agregarMensaje("nos vemos pues hombre");
        mensajeria.agregarMensaje("buee");
        mensajeria.agregarMensaje("chao");
        mensajeria.agregarMensaje("chao");

        System.out.println(mensajeria.recuperarMensajes());
    }

    private static void probarPuntoQuince() {
        DirectorioTelefonico directorio = new DirectorioTelefonico();

        directorio.agregarContacto("Juan García", "312555");
        directorio.agregarContacto("Angie Grajales", "301954");
        directorio.agregarContacto("Elkin Bermudez", "333333");

        directorio.agregarContacto("Juan García", "312555");
        directorio.agregarContacto("Angie Grajales", "301954");
        directorio.agregarContacto("Elkin Bermudez", "333333");

        System.out.println(directorio.getContactos());
    }

    private static void probarPuntoDieciseis() {
        ProductosComprados productosComprados = new ProductosComprados();

        Producto producto1 = new Producto("Keloggs", "Cereal", 25000F, "1111111111");
        Producto producto2 = new Producto("Lentejas", "Provenientes del tolima", 10000F,
                "2222222222");
        Producto producto3 = new Producto("Queso Parmesano", "Queso parmesano rallado gourmet 1Kg",
                50000F, "3333333333");

        productosComprados.agregarProducto(producto2); productosComprados.agregarProducto(producto1);
        productosComprados.agregarProducto(producto3);

        System.out.println(productosComprados.calcularTotalProductos());
    }

    private static void probarPuntoDiecisiete() {
        Agenda agenda = new Agenda();

        agenda.agregarEvento(LocalDate.of(2026, Month.JANUARY, 18), "Cumpleaños Juan");
        agenda.agregarEvento(LocalDate.of(2025, Month.OCTOBER, 23), "Cumpleaños Angie");
        agenda.agregarEvento(LocalDate.of(2030, Month.DECEMBER, 31), "Apocalipsis");

        System.out.println(agenda.getEventos());
    }
}