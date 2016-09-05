
package gestionbiblioteca;


public class Libro {
    
    private String titulo;
    private String autor;
    private int anyo;
    private String editorial; 
    private String isbn;
    
    Libro (String ISBN){
        isbn = ISBN;
        titulo = "";
        autor = "";
        anyo = 0;
        editorial = "";
        isbn = "";
        
    }
    
    Libro (String titulo_, String autor_, int anyo_, String editorial_, String isbn_){
        titulo = titulo_;
        autor = autor_;
        anyo = anyo_;
        editorial = editorial_;
        isbn = isbn_;
        
    }
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo_){
        titulo = titulo_;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor_){
        autor = autor_;
    }
    public int getAnyo(){
        return anyo;
    }
    public void setAnyo(int anyo_){
        anyo = anyo_;
    }
    public String getEditorial(){
        return editorial;
    }
    public void setEditorial(String editorial_){
        editorial = editorial_;
    }
    public String getIsbn(){
        return isbn;
    }
    @Override
    public String toString(){
        String cadenaLibro = titulo+";"+autor+";"+editorial+";"+anyo+";"+isbn+";";
        return cadenaLibro;
    }
    
}
