package com.example.myapplication.Model;


public class Negocio {
    protected Integer id;
    protected String nombre;
    protected String sector;
    protected String descripcion;
    protected String telefono;
    protected String icono;
    protected String imagen;
    protected String archivo;
    protected Short precio;
    private String tipo;
    private Double lat;
    private Double lng;
    private Boolean domicilio;
    private String estrellas;
    protected short activo; //0=null, 1=Placeholder, 2=activo+gratis, 3=activo+premium

    public Negocio() {
    }

    public Negocio(int id, String nombre, String sector, String descripcion, String telefono,
                   String icono, String imagen, String tipo, Double lat, Double lng,
                   Boolean domicilio, short activo, String archivo, Short precio,  String estrellas) {
        this.id = id;
        this.nombre = nombre;
        this.sector = sector;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.icono = icono;
        this.imagen = imagen;
        this.archivo = archivo;
        this.precio = precio;
        this.tipo = tipo;
        this.domicilio = domicilio;
        this.lat = lat;
        this.lng = lng;
        this.activo = activo;
        this.estrellas = estrellas;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public int getiD() {
        return id;
    }

    public void setiD(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Short getPrecio() {
        return precio;
    }

    public void setPrecio(Short precio) {
        this.precio = precio;
    }

    public short getActivo() {
        return activo;
    }

    public void setActivo(short activo) {
        this.activo = activo;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Boolean getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Boolean domicilio) {
        this.domicilio = domicilio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(String estrellas) {
        this.estrellas = estrellas;
    }
}
