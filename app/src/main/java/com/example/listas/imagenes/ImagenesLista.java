package com.example.listas.imagenes;

import java.util.ArrayList;

//Creamos la clase para poder crear los objetos necesarios.
public class ImagenesLista {

    //Creamos un arraylist del tipo objeto ImagenesLista para guardar sus intancias.
    public ArrayList<ImagenesLista> listaImagenes = new ArrayList<>();

    //Declaramos los atributos necesarios para poder hacer el constructor y los atributos de los objetos.
    private String nombre;
    private String descripcion;
    private String urlImagen;

    //Metdodos get para los atributos.
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    //Constructor vacio para poder instanciarlo sin parametros.
    public ImagenesLista() {

    }

    //Constructor con los parametros para construir los objetos y sus atributos asociados.
    public ImagenesLista(String nombre, String descripcion, String urlImagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
    }

    //Creamos una funcion del arraylist que nos regresa el arraylist y sus objetos guardados.
    public ArrayList<ImagenesLista> getListaImagenes() {


        //Creamos los objetos a guardar en el arraylist.
        ImagenesLista imagen1 = new ImagenesLista("Guernica", "Guernica se considera uno de los cuadros más importantes de la carrera del pintor Pablo Picasso y del siglo XX, tanto por su carácter político como por su estilo, una mezcla de elementos cubistas y expresionistas que lo tornan único.",
                "https://cdn.culturagenial.com/es/imagenes/guernica-picasso-cke.jpg");

        ImagenesLista imagen2 = new ImagenesLista("La Gran Ola", "La ola de Kanagawa es la imagen congelada de un país medieval y anclado en la tradición en el que lo mantenía el bakufu o shogunato todavía en el siglo XIX. Pero ese Japón alérgico a cualquier cambio o evolución estaba en sus últimos estertores antes de que, en 1868, el emperador Meiji recuperada el poder que los shogunes habían arrebatado a sus ancestros.",
                "https://historia-arte.com/_/eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpbSI6WyJcL2FydHdvcmtcL2ltYWdlRmlsZVwvZ3JlYXRfd2F2ZV9vZmZfa2FuYWdhd2EyLmpwZyIsInJlc2l6ZSwxNTAwfGZvcm1hdCx3ZWJwIl19.Kh4LtRTopvdxBKdpdNHUZxLp1DhMouM9hENFiUAdNEU.webp");

        ImagenesLista imagen3 = new ImagenesLista("La Noche Estrellada", "Van Gogh miraba por la ventana del sanatorio de Saint-Rémy. Ya no tenía el lóbulo de su oreja y se sentía cada vez más acosado por las alucinaciones.Cuando miraba los cipreses del jardín, éstos parecían vibrar. Cuando miraba al cielo nocturno, las estrellas parecían estar vivas. Eso es lo que captó en este lienzo que es hoy uno de los más famosos de la historia del arte.",
                "https://i0.wp.com/culturacolectiva.com/wp-content/uploads/2023/02/KUFCDXCONRDCHFF5Z4XVP6DZKM.jpg?resize=1024%2C555&ssl=1");

        ImagenesLista imagen4 = new ImagenesLista("El bufón Stańczyk", "La obra de Matejko captura la tristeza y la preocupación de Stańczyk en un momento crítico de la historia de Polonia. A través de la expresión facial y la postura del personaje, la pintura transmite una sensación de descontento y pesar.",
                "https://historia-arte.com/_/eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpbSI6WyJcL2FydHdvcmtcL2ltYWdlRmlsZVwvNWNmMjRkMmM0ZmMwYi5qcGciLCJyZXNpemUsMTUwMHxmb3JtYXQsd2VicCJdfQ.3PI6EwjeSNsAtLXWfbiHNqScafl8rREPTEJA1d8R_MA.webp");

        ImagenesLista imagen5 = new ImagenesLista("La Gioconda", "La obra retrata a una mujer con una enigmática sonrisa y una mirada penetrante. La figura femenina está posicionada en un paisaje sugerido, con montañas y un río a lo lejos. La Gioconda se destaca por su composición equilibrada, su realismo detallado y el uso magistral de la técnica del sfumato, que crea una transición suave entre los colores y las formas.",
                "https://historia-arte.com/_/eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpbSI6WyJcL2FydHdvcmtcL2ltYWdlRmlsZVwvNWVmYzdmNTNlYWFkYy5qcGciLCJyZXNpemUsMTUwMHxmb3JtYXQsd2VicCJdfQ.MxUPAr4uYZC6eP6dwxXoHK-B6kMv7egWMPi0KwNvV_o.webp");


        //Agregamos los objetos al arraylist.
        listaImagenes.add(imagen1);
        listaImagenes.add(imagen2);
        listaImagenes.add(imagen3);
        listaImagenes.add(imagen4);
        listaImagenes.add(imagen5);

        return listaImagenes;
    }
}

